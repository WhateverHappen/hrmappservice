package cn.yks.hrmapp.controller;

import cn.yks.hrmapp.model.User;
import cn.yks.hrmapp.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by thanatos on 2018/6/17.
 *
 * 用户请求controller
 */
@Controller
public class UserController {

    @Autowired
    IUserService userService;

    /**
     * 日志组件
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/login", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String login(HttpServletRequest request){
        LOGGER.info("===================login==============");
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");

        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);

        User resultUser = userService.login(loginName,password);

        if(resultUser!=null){
            HttpSession session = request.getSession();
            session.setAttribute("loginName",resultUser.getLoginName());
            session.setAttribute("memId",resultUser.getId());
        }
        return null;
    }
}
