package cn.yks.hrmapp.constant;

/**
 * Created by thanatos on 2018/6/7.
 *
 * 公共常量类
 */
public class HrmConstant {

    private HrmConstant() {
    }

    /**
     * 用户信息表
     */
    public static final String USERTABLE = "user_info";

    /**
     * 部门信息表
     */
    public static final String DEPARTMENTTABLE = "dept_info";

    /**
     * 文件信息表
     */
    public static final String DOCUMENTTABLE = "document_info";

    /**
     * 员工信息表
     */
    public static final String EMPLOYEETABLE = "employee_info";

    /**
     * 工作信息表
     */
    public static final String JOBTABLE = "job_info";

    /**
     * 公告信息表
     */
    public static final String NOTICETABLE = "notice_info";

    /**
     * 登录
     */
    public static final String LOGIN = "loginForm";

    /**
     * 用户session对象
     */
    public static final String USER_SESSION = "user_session";

    /**
     * 默认每页4条数据
     */
    public static int PAGE_DEFAULT_SIZE = 4;
}
