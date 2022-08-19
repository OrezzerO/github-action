package com.alipay.sofa.action.test;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href=mailto:orezsilence@163.com>zhangchengxi</a>
 */
public class EchoTest {

    @Test
    public void echo() {
        String var = "var";
        Assert.assertEquals(var, new Echo().echo(var));
    }

    @Test
    public void mustFail() {
        String var = "var";
        Assert.assertEquals("", new Echo().echo(var));
    }
}