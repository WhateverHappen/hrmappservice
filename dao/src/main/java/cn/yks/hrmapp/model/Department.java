package cn.yks.hrmapp.model;

import java.io.Serializable;

/**
 * Created by thanatos on 2018/6/7.
 * <p>
 * 部门实体类
 */
public class Department implements Serializable {

    private static final long serialVersionUID = 8272974707519304128L;

    /**
     * 部门id
     */
    private Integer id;

    /**
     * 部门名称
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
