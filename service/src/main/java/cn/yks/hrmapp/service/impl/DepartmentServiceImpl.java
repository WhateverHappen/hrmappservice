package cn.yks.hrmapp.service.impl;

import cn.yks.hrmapp.dao.IDepartmentDao;
import cn.yks.hrmapp.model.Department;
import cn.yks.hrmapp.service.IDepartmentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 * <p>
 * 部门服务实体类
 */
@Service("departmentService")
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private IDepartmentDao departmentDao;

    @Override
    public List<Department> findDepartment(Department department, Integer currentPage, Integer pageSize) {
        //启用分页查询
        PageHelper.startPage(currentPage, pageSize);
        List<Department> result = departmentDao.selectDepartmentByPage(department);
        return result;
    }

    @Override
    public List<Department> findAllDepartment() {
        return departmentDao.selectAllDepartment();
    }

    @Override
    public void removeDepartmentById(Integer id) {
        departmentDao.deleteDepartmentById(id);
    }

    @Override
    public void addDepartment(Department department) {
        departmentDao.saveDepartment(department);
    }

    @Override
    public Department findDepartmentById(Integer id) {
        return departmentDao.selectDepartmentById(id);
    }

    @Override
    public void modifyDepartment(Department department) {
        departmentDao.updateDepartment(department);
    }
}
