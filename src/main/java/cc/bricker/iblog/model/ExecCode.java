package cc.bricker.iblog.model;

/**
 * @author bricker
 * @date 2020/5/27
 */
public enum ExecCode {
    /**
     * 成功
     */
    SUCCESS(0, "成功"),

    //****************API接口通用错误码*********************//

    INVAILD_REQUEST_METHOD(100, "非法的请求类型"),

    /**
     * 非法的参数格式
     */
    INVAILD_PARAMETER_FROMAT(101, "非法的参数格式"),

    /**
     * 缺少参数或者参数不合规时，进行调用
     */
    INVAILD_PARAMETER(102, "非法参数"),


    INVAILD_REQUEST_NOT_LOGIN(201, "未登录"),

    //****************API接口通用错误码*********************//

    //****************API接口业务相关错误码******************//

    /**
     * 用户登录失败
     */
    USER_LOGIN_FAILED(1001, "登录失败"),

    /**
     * 用户不存在
     */
    USER_NOT_EXIST(1002, "用户不存在"),

    /**
     * 未知错误
     */
    NONE(-1, "未知错误")
    ;

    private int code;

    private String msg;

    ExecCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
