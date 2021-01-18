import java.io.File;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        System.out.println("大爷这是马冬梅家吗");
        System.out.println("马什么梅");
        System.out.println("马冬梅啊");
        System.out.println("我是分支");
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m == 0) return 0;
        int n = grid[0].length;
        int islands = 0;
        for(int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    islands ++;
                }
            }
        }
        return islands;
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
