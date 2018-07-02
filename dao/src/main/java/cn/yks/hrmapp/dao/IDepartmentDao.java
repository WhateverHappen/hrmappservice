package cn.yks.hrmapp.dao;

import cn.yks.hrmapp.model.Department;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by thanatos on 2018/6/8.
 * <p>
 * 部门dao接口
 */
@Repository("departmentDao")
public interface IDepartmentDao {

    /**
     * 部门分页查询
     *
     * @param department
     * @return
     */
    List<Department> selectDepartmentByPage(Department department);

    /**
     * 查询符合条件的部门总数
     *
     * @param params
     * @return
     */
    Integer countDepartment(Map<String, Object> params);

    /**
     * 选择所有部门
     *
     * @return
     */
    List<Department> selectAllDepartment();

    /**
     * 根据id查询部门信息
     *
     * @param id
     * @return
     */
    Department selectDepartmentById(Integer id);

    /**
     * 根据id删除部门
     *
     * @param id
     */
    void deleteDepartmentById(Integer id);

    /**
     * 插入部门信息
     *
     * @param department
     */
    void saveDepartment(Department department);

    /**
     * 更新部门信息
     *
     * @param department
     */
    void updateDepartment(Department department);
}
