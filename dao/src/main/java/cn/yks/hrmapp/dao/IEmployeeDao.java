package cn.yks.hrmapp.dao;

import cn.yks.hrmapp.model.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by thanatos on 2018/6/9.
 * <p>
 * 员工dao接口
 */
@Repository("employeeDao")
public interface IEmployeeDao {

    /**
     * 统计符合参数的员工数量
     *
     * @param params
     * @return
     */
    Integer countEmployee(Map<String, Object> params);

    /**
     * 批量查询员工信息
     *
     * @param employee
     * @return
     */
    List<Employee> selectEmployeeByPage(Employee employee);

    /**
     * 保存员工信息
     *
     * @param employee
     */
    void saveEmployee(@Param("employee")Employee employee);

    /**
     * 根据id删除员工信息
     *
     * @param id
     */
    void deleteEmployeeById(Integer id);

    /**
     * 根据id查询员工信息
     *
     * @param id
     */
    void selectEmployeeById(Integer id);

    /**
     * 更新员工信息
     *
     * @param employee
     */
    void updateEmployee(Employee employee);
}
