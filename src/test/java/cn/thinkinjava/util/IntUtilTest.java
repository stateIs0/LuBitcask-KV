package cn.thinkinjava.util;

import org.junit.Assert;

/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-21-09:15
 */
public class IntUtilTest {

    @org.junit.Test
    public void intToBytes() {
        int a = 9;

        Assert.assertEquals(IntUtil.BytesToInt(IntUtil.IntToBytes(a)), a);
    }

    @org.junit.Test
    public void bytesToInt() {
    }
}