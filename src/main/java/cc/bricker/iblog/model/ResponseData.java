package cc.bricker.iblog.model;

/**
 * 接口返回数据模型
 * @author bricker
 * @date 2020/5/27
 */
public class ResponseData {
    /**
     * 接口错误码
     */
    private int code;

    /**
     * 接口响应信息
     */
    private String msg;

    /**
     * RSA签名
     * 将请求中的AES密码+返回数据使用RSA算法进行签名
     * 调用者再使用发布的公钥进行验签
     */
    private String key;

    /**
     * 返回数据结构体
     */
    private Object data;

    public ResponseData() {
        this.code = ExecCode.SUCCESS.getCode();
        this.msg = ExecCode.SUCCESS.getMsg();
    }

    public ResponseData(ExecCode code) {
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public ResponseData(ExecCode code, String msg) {
        this.code = code.getCode();
        this.msg = msg;
    }

    public ResponseData(ExecCode code, Object data) {
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.data = data;
    }

    public ResponseData(ExecCode code, String key, Object data) {
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.key = key;
        this.data = data;
    }

    public ResponseData(ExecCode code, String msg, String key, Object data) {
        this.code = code.getCode();
        this.msg = msg;
        this.key = key;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCode(ExecCode code) {
        this.setCode(code.getCode());
        this.setMsg(code.getMsg());
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
