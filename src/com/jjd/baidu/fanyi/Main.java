package com.jjd.baidu.fanyi;

/**
 * @author jjd
 * @date 2020-08-11
 */
public class Main {
    private static final String APP_ID = "20200811000539748";
    private static final String SECURITY_KEY = "DbjpXcPJGuyJ6dh_vGRR";

    public static void main(String[] args) {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);

        String query = "高度600米";
        System.out.println(api.getTransResult(query, "auto", "en"));
    }

}
