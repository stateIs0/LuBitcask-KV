package cn.thinkinjava.internal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-21-09:42
 */
public class StorageKernelTest {

    StorageKernel storageKernel = StorageKernel.getInstance();

    @Test
    public void put() {

        for (int i = 0; i < 10999; i++) {

            storageKernel.put((i + "=hello").getBytes(),(i + "=world").getBytes());
            System.out.println(storageKernel.get((i + "=hello").getBytes()));

//            storageKernel.put("1234567890".getBytes(), "1234567890".getBytes());
//            System.out.println(storageKernel.get("1234567890".getBytes()));
//
//            storageKernel.put("qazwsxedc".getBytes(), "qazwsxedc".getBytes());
//            System.out.println(storageKernel.get("qazwsxedc".getBytes()));
        }
    }

    @Test
    public void get() {
        Recover.recoverIndexFile();
        for (int i = 0; i < 10; i++) {
            System.out.println(storageKernel.get((i + "=hello").getBytes()));
        }
    }

    @Test
    public void del() {
    }

    @Test
    public void update() {
    }
}