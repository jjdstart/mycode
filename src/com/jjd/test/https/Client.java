package com.jjd.test.https;

/**
 * @author jjd
 * @date 2020-06-18
 */
public class Client {

    public static String url = "https://api2.100credit.cn/loan_strategy/v3/query";
    public static String param = "{\"jsonData\":\"51mDHUFNvWhhyST2wjhQaUUxVfg9KZ9J8TGoAUVYbv8rOie2SgZATPBSc9hs57BGgutdl2eh1ewxoz6yaqdldWZs4BEVj0uAaPe32WuAhXh5PDRbVfiifxSD8Wk1WXaRLrox6kj3EyBEQE0zjFWJziwlAEs063PbGdn1DsHgbONP6Y0b0BA7oeaNveHtICltTRzNJCeVPg1qiMbiEPSAApX1t-7aDCaqijkyLPAmL3Wy2WcBNx1wsGCWBSS0jW5qJjQz7ZYbl-MNUFaM9kRCWNyUGzr_0tFa94WP4A71fkDiejM7U2Ob9DNK9ZXeytKWbrARy_5viIi7p0Qb-WcHJL4aaKYDS6gmR-Cr0n9Plfg\",\n" +
            "\"apiCode\":\"3005729\",\n" +
            "\"appKey\":\"dff954b171a0e53f6b4aa0038aefb6ac\",\n" +
            "\"checkCode\":\"aa3f15a61da88114a39b4cef2d9bf07d\"}";

    public static void main(String[] args) throws Exception {
//        String res = HttpsUtils.doPost(url, param.replaceAll("\n", ""), "utf-8", 5000, 5000);
        String res = HttpsUtils.doPost(url, param.replaceAll("\n", ""));
        System.out.println(res);
    }
}
