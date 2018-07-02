package cn.yks.hrmapp.service.impl;

import cn.yks.hrmapp.dao.IEmployeeDao;
import cn.yks.hrmapp.model.Employee;
import cn.yks.hrmapp.service.IEmployeeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 * <p>
 * 员工信息实体类
 */
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    public List<Employee> findEmployee(Employee employee, Integer currentPage, Integer pageSize) {
        //启用分页查询
        PageHelper.startPage(currentPage, pageSize);
        List<Employee> result = employeeDao.selectEmployeeByPage(employee);
        return result;
    }

    @Override
    public void removeEmployeeById(Integer id) {
        employeeDao.deleteEmployeeById(id);
    }

    @Override
    public void findEmployeeById(Integer id) {
        employeeDao.selectEmployeeById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    @Override
    public void modifyEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

}
