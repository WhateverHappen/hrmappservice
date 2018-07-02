package cn.yks.hrmapp.service;

import cn.yks.hrmapp.model.Notice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 *
 * 公告服务接口类
 */
public interface INoticeService {

    /**
     * 批量查询公告信息
     * @param notice
     * @return
     */
    List<Notice> findNotice(Notice notice, Integer currentPage, Integer pageSize);

    /**
     * 根据id查询公告信息
     * @param id
     * @return
     */
    Notice findNoticeById(Integer id);

    /**
     * 根据id移除公告信息
     * @param id
     */
    void removeNoticeById(Integer id);

    /**
     * 新增公告信息
     * @param notice
     */
    void addNotice(Notice notice);

    /**
     * 更新公告信息
     * @param notice
     */
    void modifyNotice(Notice notice);

}
