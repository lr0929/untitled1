package cn.xinzhi;

import cm.xinzhi.MyThread;

public class Test {
    public static void main(String[] args) {
        MyThread MyThread = new MyThread();
        Thread t = new Thread(MyThread,"11");
        t.start();
    }
}
