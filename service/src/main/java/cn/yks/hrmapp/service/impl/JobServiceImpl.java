package cn.yks.hrmapp.service.impl;

import cn.yks.hrmapp.dao.IJobDao;
import cn.yks.hrmapp.model.Job;
import cn.yks.hrmapp.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 * <p>
 * 工作信息实体类
 */
@Service("jobService")
public class JobServiceImpl implements IJobService {

    @Autowired
    private IJobDao jobDao;

    @Override
    public List<Job> findAllJob() {
        return jobDao.selectAllJob();
    }

    @Override
    public List<Job> findJob(Job job) {
        return jobDao.selectAllJob();
    }

    @Override
    public void removeJobById(Integer id) {
        jobDao.deleteJobById(id);
    }

    @Override
    public void addJob(Job job) {
        jobDao.saveJob(job);
    }

    @Override
    public Job findJobById(Integer id) {
        return jobDao.selectJobById(id);
    }

    @Override
    public void modifyJob(Job job) {
        jobDao.updateJob(job);
    }
}
