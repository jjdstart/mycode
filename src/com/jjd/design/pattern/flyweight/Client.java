package com.jjd.design.pattern.flyweight;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFoctory webSiteFoctory = new WebSiteFoctory();
        WebSite webSite = webSiteFoctory.getWebSiteCategory("新闻");
        webSite.use(new User("tom"));

        WebSite webSite1 = webSiteFoctory.getWebSiteCategory("新闻");
        webSite1.use(new User("cat"));

        WebSite webSite2 = webSiteFoctory.getWebSiteCategory("军事");
        webSite2.use(new User("Jack"));

        System.out.println(webSiteFoctory.getWebSiteCount());

        Integer a = new Integer(127);
        Integer b = new Integer(127);
        Integer x = Integer.valueOf(127);
        System.out.println(a == b);//false
    }
}
