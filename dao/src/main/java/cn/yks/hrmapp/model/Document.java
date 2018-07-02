package cn.yks.hrmapp.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by thanatos on 2018/6/7.
 */
public class Document implements Serializable {

    private static final long serialVersionUID = -8294816584312624635L;

    /**
     * 文件id
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件
     */
    private MultipartFile file;

    /**
     * 描述
     */
    private String remark;

    /**
     * 建立时间
     */
    private Date createDate;

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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
