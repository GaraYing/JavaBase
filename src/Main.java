import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        String s1 = "1234";

        String s2 = "1234";

        System.out.println(s2 == s1);
        long start = System.currentTimeMillis();
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(() -> System.out.println(12), 2000L, TimeUnit.MILLISECONDS);
        Object o = schedule.get();



        System.out.println("cost : " + (System.currentTimeMillis() - start));


        Thread.sleep(1000L);
        System.out.println(o);

        scheduledExecutorService.shutdown();
    }
}
