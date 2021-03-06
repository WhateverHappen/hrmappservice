package cn.yks.hrmapp.model;

import java.io.Serializable;

/**
 * Created by thanatos on 2018/6/7.
 * <p>
 * 工作实体类
 */
public class Job implements Serializable {

    private static final long serialVersionUID = 8464351386753651918L;

    /**
     * 工作id
     */
    private Integer id;

    /**
     * 职位名称
     */
    private String name;

    /**
     * 详细描述
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
