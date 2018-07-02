package cn.yks.hrmapp.service;

import cn.yks.hrmapp.model.User;

import java.util.List;

/**
 * Created by thanatos on 2018/6/9.
 *
 * 用户服务接口类
 */
public interface IUserService {

    /**
     * 用户登录
     *
     * @param loginName 用户名
     * @param password 密码
     * @return
     */
    User login(String loginName, String password);

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 批量查询用户信息
     *
     * @param user
     * @return
     */
    List<User> findUser(User user, Integer currentPage, Integer pageSize);

    /**
     * 根据用户id移除用户
     *
     * @param id 用户id
     */
    void removeUserById(Integer id);

    /**
     * 修改用户信息
     *
     * @param user
     */
    void modifyUser(User user);

    /**
     * 添加用户
     *
     * @param user
     */
    void addUser(User user);
}
