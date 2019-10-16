package cm.xinzhi;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"这是一个线程");
        super.run();
    }
}
