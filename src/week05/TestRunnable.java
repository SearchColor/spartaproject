package week05;

public class TestRunnable implements  Runnable{

    @Override
    public void run() {
        //Thread 에서 수행할 작업.
        for(int i=0 ; i<100; i ++ ){
            System.out.print('$');
        }
    }
}
