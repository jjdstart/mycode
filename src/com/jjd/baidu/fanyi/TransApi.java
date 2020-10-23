package com.jjd.baidu.fanyi;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author jjd
 * @date 2020-08-11
 */
public class TransApi {
    private static final String TRANS_API_HOST = "http://api.fanyi.baidu.com/api/trans/vip/translate";

    private String appid;
    private String securityKey;

    public TransApi(String appId, String securityKey) {
        this.appid = appid;
        this.securityKey = securityKey;
    }

    public String getTransResult(String query, String from, String to) {
        Map<String, String> params = buildParams(query, from, to);
        return HttpGet.get(TRANS_API_HOST, params);
    }

    private Map<String, String> buildParams(String query, String from, String to) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("q", query);
        paramMap.put("from", from);
        paramMap.put("to", to);
        paramMap.put("appid", appid);
        String salt = UUID.randomUUID().toString().replaceAll("-", "");
        paramMap.put("salt", salt);

        String s1 = appid + query + salt + securityKey;
        paramMap.put("sign", MD5.md5(s1));
        return paramMap;
    }
}
