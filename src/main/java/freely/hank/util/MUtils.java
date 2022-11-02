package freely.hank.util;

import java.math.BigInteger;

import com.alibaba.fastjson2.JSONObject;

public class MUtils {

    /**
     * 16进制转10
     * 
     * @param item hex json
     * @return String
     */
    public static String t16to10(JSONObject item) {
        return new BigInteger(item.getString("hex").substring(2), 16).toString();
    }
}
