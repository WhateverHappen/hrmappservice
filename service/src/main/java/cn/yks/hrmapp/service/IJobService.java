package cn.yks.hrmapp.service;

import cn.yks.hrmapp.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 *
 * 工作服务接口类
 */
public interface IJobService {

    /**
     * 查询所有工作信息
     *
     * @return
     */
    List<Job> findAllJob();

    /**
     * 批量查询工作信息
     *
     * @param job
     * @return
     */
    List<Job> findJob(Job job);

    /**
     * 根据id移除工作信息
     *
     * @param id
     */
    void removeJobById(Integer id);

    /**
     * 添加工作信息
     *
     * @param job
     */
    void addJob(Job job);

    /**
     * 根据id查询工作信息
     *
     * @param id
     * @return
     */
    Job findJobById(Integer id);

    /**
     * 更新工作信息
     *
     * @param job
     */
    void modifyJob(Job job);
}
