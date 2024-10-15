package week05.demon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i + "번째 demon");
            }
        };

        //demon은 우선순위가 낮다 -> 상대적으로 다른 쓰레드에 비해 리소스를 적게 할당받는다.
        //사용자 쓰레드의 작업이 끝나면 데몬 쓰레드는 자동으로 종료시켜버린다.
        Thread thread = new Thread(demon);
        thread.setDaemon(true);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + "번째 task");
        }
    }
}
