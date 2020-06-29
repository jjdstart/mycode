package com.jjd.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class WebSiteFoctory {

    private Map<String, ConcreteWebSite> pool = new HashMap<>(16);

    //根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    //获取网站分类的总数 (池中有多少个网站类型)
    public int getWebSiteCount() {
        return pool.size();
    }
}
