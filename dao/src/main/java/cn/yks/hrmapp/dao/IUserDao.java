package cn.yks.hrmapp.dao;

import cn.yks.hrmapp.model.Department;
import cn.yks.hrmapp.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by thanatos on 2018/6/7.
 * <p>
 * 用户dao接口
 */
@Repository("userDao")
public interface IUserDao {

    /**
     * 根据登录名和密码查找用户
     *
     * @param loginName
     * @param password
     * @return
     */
    User selectUserByLoginName(@Param("loginName") String loginName, @Param("password") String password);

    /**
     * 根据用户id查找用户
     *
     * @param id
     * @return
     */
    User selectUserById(Integer id);

    /**
     * 根据用户id删除用户
     *
     * @param id
     */
    void deleteUserById(Integer id);

    /**
     * 根据用户id更新用户
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * 用户批量查询
     *
     * @param user
     * @return
     */
    List<User> selectUserByPage(User user);

    /**
     * 查询符合条件的用户总数
     *
     * @param params
     * @return
     */
    Integer countUser(Map<String, Object> params);

    /**
     * 插入用户
     *
     * @param user
     */
    void saveUser(User user);

}
