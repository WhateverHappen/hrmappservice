package cn.yks.hrmapp.service;

import cn.yks.hrmapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 * <p>
 * 员工信息接口类
 */
public interface IEmployeeService {

    /**
     * 批量查询员工信息
     *
     * @param employee
     * @return
     */
    List<Employee> findEmployee(Employee employee, Integer currentPage, Integer pageSize);

    /**
     * 根据id删除员工信息
     *
     * @param id
     */
    void removeEmployeeById(Integer id);

    /**
     * 根据id查询员工信息
     *
     * @param id
     */
    void findEmployeeById(Integer id);

    void addEmployee(Employee employee);

    void modifyEmployee(Employee employee);

}
