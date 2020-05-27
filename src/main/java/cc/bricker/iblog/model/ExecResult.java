package cc.bricker.iblog.model;

/**
 * @author bricker
 * @date 2020/5/27
 */
public class ExecResult<T> {

    /**
     * 执行状态码
     */
    private ExecCode code;

    private String details;

    private T obj;

    public ExecCode getCode() {
        return code;
    }

    public void setCode(ExecCode code) {
        this.code = code;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
