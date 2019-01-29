package cn.thinkinjava;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-21-09:56
 */
public class BitcaskDBTest {

    BitcaskDB db = BitcaskDB.load();


    @Test
    public void put() {
        db.put("hello", "world");
        Assert.assertEquals("world", db.get("hello"));
    }

    @Test
    public void del() {
    }

    @Test
    public void update() {
    }

    @Test
    public void get() {
    }
}