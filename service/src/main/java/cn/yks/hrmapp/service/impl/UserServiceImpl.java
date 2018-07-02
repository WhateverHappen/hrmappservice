package cn.yks.hrmapp.service.impl;

import cn.yks.hrmapp.dao.IUserDao;
import cn.yks.hrmapp.model.User;
import cn.yks.hrmapp.service.IUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/9.
 * <p>
 * 用户服务实体类
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User login(String loginName, String password) {
        return userDao.selectUserByLoginName(loginName, password);
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public List<User> findUser(User user, Integer currentPage, Integer pageSize) {
        //启用分页查询
        PageHelper.startPage(currentPage, pageSize);
        List<User> result = userDao.selectUserByPage(user);
        return result;
    }

    @Override
    public void removeUserById(Integer id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void modifyUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void addUser(User user) {
        userDao.saveUser(user);
    }
}
