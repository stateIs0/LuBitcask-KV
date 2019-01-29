package cn.thinkinjava.internal;

import org.junit.Test;

import cn.thinkinjava.model.Index;

import static org.junit.Assert.*;

/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-22-10:15
 */
public class RecoverTest {

    Recover recover = new Recover();
    StorageKernel storageKernel = StorageKernel.getInstance();
    @Test
    public void recoverIndexFile() {
        Recover.recoverIndexFile();
        for (int i = 0; i < 10999; i++) {
            System.out.println(storageKernel.get((i + "=hello").getBytes()));
        }
    }
}