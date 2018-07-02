package cn.yks.hrmapp.service;

import cn.yks.hrmapp.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 *
 * 部门信息接口类
 */
public interface IDepartmentService {

    /**
     * 批量查询部门信息
     *
     * @param department
     * @return
     */
    List<Department> findDepartment(Department department, Integer currentPage, Integer pageSize);

    /**
     * 查询所有部门信息
     *
     * @return
     */
    List<Department> findAllDepartment();

    /**
     * 根据id删除部门信息
     *
     * @param id
     */
    void removeDepartmentById(Integer id);

    /**
     * 添加部门信息
     *
     * @param department
     */
    void addDepartment(Department department);

    /**
     * 根据id查询部门信息
     *
     * @param id
     * @return
     */
    Department findDepartmentById(Integer id);

    /**
     * 更新部门信息
     *
     * @param department
     */
    void modifyDepartment(Department department);

}
