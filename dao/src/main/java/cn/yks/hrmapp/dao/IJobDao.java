package cn.yks.hrmapp.dao;

import cn.yks.hrmapp.model.Job;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by thanatos on 2018/6/9.
 * <p>
 * 工作dao接口
 */
@Repository("jobDao")
public interface IJobDao {
    /**
     * 根据id选择工作
     *
     * @param id
     * @return
     */
    Job selectJobById(Integer id);

    /**
     * 选择所有工作
     *
     * @return
     */
    List<Job> selectAllJob();

    /**
     * 根据参数计算工作数量
     *
     * @param params
     * @return
     */
    Integer countJob(Map<String, Object> params);

    /**
     * 根据id删除工作信息
     *
     * @param id
     */
    void deleteJobById(Integer id);

    /**
     * 保存工作信息
     *
     * @param job
     */
    void saveJob(Job job);

    /**
     * 更新工作信息
     *
     * @param job
     */
    void updateJob(Job job);
}
