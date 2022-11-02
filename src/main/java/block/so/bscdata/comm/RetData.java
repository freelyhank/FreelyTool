package block.so.bscdata.comm;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Hank Lee
 *
 * @param <T>
 */
@Setter
@Getter
public class RetData<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int code;
    private String msg;
    private T data;
    private int chainId;
    private int count;

    public RetData() {
    }

    public RetData(int code, String msg) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(null);
    }

    public RetData(int code, String msg, T data) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }

    public static RetData<Object> Instant(int code, String msg, Object data) {
        RetData<Object> RetData = new RetData<Object>();
        RetData.setCode(code);
        RetData.setMsg(msg);
        RetData.setData(data);
        return RetData;
    }

    public static RetData<String> Instant(int code, String msg) {
        RetData<String> RetData = new RetData<String>();
        RetData.setCode(code);
        RetData.setMsg(msg);
        RetData.setData(null);
        return RetData;
    }

    public static <T> RetData<T> Success(T data) {
        RetData<T> ret = new RetData<T>();
        ret.setCode(ErrCode.SUCCESS);
        ret.setMsg(null);
        ret.setData(data);
        return ret;
    }

    public static <T> RetData<T> Success(String msg, T data) {
        RetData<T> ret = new RetData<T>();
        ret.setCode(ErrCode.SUCCESS);
        ret.setMsg(msg);
        ret.setData(data);
        return ret;
    }

    public static <T> RetData<T> Fail(String msg, T data) {
        RetData<T> ret = new RetData<T>();
        ret.setCode(ErrCode.FAIL);
        ret.setMsg(msg);
        ret.setData(data);
        return ret;
    }
}
