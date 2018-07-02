package cn.yks.hrmapp.dao;

import cn.yks.hrmapp.model.Notice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by thanatos on 2018/6/9.
 * <p>
 * 公告dao接口
 */
@Repository("noticeDao")
public interface INoticeDao {

    /**
     * 批量查询公告
     *
     * @param notice
     * @return
     */
    List<Notice> seelctNoticeByPage(Notice notice);

    /**
     * 统计符合条件的公告数量
     *
     * @param params
     * @return
     */
    Integer countNotice(Map<String, Object> params);

    /**
     * 根据id选择公告信息
     *
     * @param id
     * @return
     */
    Notice selectNoticeById(Integer id);

    /**
     * 根据id删除公告信息
     *
     * @param id
     */
    void deleteNoticeById(Integer id);

    /**
     * 保存公告信息
     *
     * @param notice
     */
    void saveNotice(Notice notice);

    /**
     * 更新公告信息
     *
     * @param notice
     */
    void updateNotice(Notice notice);
}
