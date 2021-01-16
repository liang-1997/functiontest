import java.io.File;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        System.out.println("大爷这是马冬梅家吗");
        System.out.println("马什么梅");
        System.out.println("马冬梅啊");
    }
}
/*
*         MyThread3 t3=new MyThread3();
        t3.start();

        Runnable t1=new MyThread1();
        new Thread(t1).start();

        MyThread2 t2=new MyThread2();
        FutureTask<Object> futureTask = new FutureTask<>(t2);
        new Thread(futureTask).start();
* */
class MyThread3 extends Thread{

    public void run() {
       for(int i=0;i<500;i++){
           System.out.println("===================");
       }
    }
}
class MyThread1 implements Runnable{
    public void run(){
        for(int i=0;i<500;i++){
            System.out.println("-------------------");
        }
    }
}
class MyThread2 implements Callable{
    public Object call() throws Exception {
        for(int i=0;i<500;i++){
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
        }
        return "sum";
    }
}
