package cc.bricker.iblog.model;

import javax.validation.Valid;

/**
 * 接口请求数据模型
 * 请求数据实例：{"key":"xxxx","data":{"xx":"xxx"....}}
 * @author bricker
 * @date 2020/5/27
 */
public class RequestData<T> {
    /**
     * AES算法密码
     * 调用发送由RSA算法加密后的值
     * 再有解析器统一解密
     */
    private String key;

    /**
     * 请求数据结构体
     */
    @Valid
    private T data;

    /**
     * 请求者
     * 一般后台管理系统的接口会用到
     */
    private String requester;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }
}
