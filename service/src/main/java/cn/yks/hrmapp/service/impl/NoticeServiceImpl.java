package cn.yks.hrmapp.service.impl;

import cn.yks.hrmapp.dao.INoticeDao;
import cn.yks.hrmapp.model.Notice;
import cn.yks.hrmapp.service.INoticeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thanatos on 2018/6/10.
 * <p>
 * 公告实体类
 */
@Service("noticeService")
public class NoticeServiceImpl implements INoticeService {

    @Autowired
    private INoticeDao noticeDao;

    @Override
    public List<Notice> findNotice(Notice notice, Integer currentPage, Integer pageSize) {
        //启用分页查询
        PageHelper.startPage(currentPage, pageSize);
        List<Notice> result = noticeDao.seelctNoticeByPage(notice);
        return result;
    }

    @Override
    public Notice findNoticeById(Integer id) {
        return noticeDao.selectNoticeById(id);
    }

    @Override
    public void removeNoticeById(Integer id) {
        noticeDao.deleteNoticeById(id);
    }

    @Override
    public void addNotice(Notice notice) {
        noticeDao.saveNotice(notice);
    }

    @Override
    public void modifyNotice(Notice notice) {
        noticeDao.updateNotice(notice);
    }
}
