package cn.yks.hrmapp.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by thanatos on 2018/6/7.
 * <p>
 * 公告实体类
 */
public class Notice implements Serializable {

    private static final long serialVersionUID = 5493101953924427557L;

    /**
     * 公告id
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 建立时间
     */
    private Date createDate;

    /**
     * 公告发布人
     */
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
