/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.sofa.action.test;

/**
 * @author zhaowang
 * @version : Echo.java, v 0.1 2022年08月19日 5:17 PM zhaowang
 */
public class Echo {

    public String echo(String echo) {
        if (echo == null) {
            return "";
        }
        return echo;
    }
}