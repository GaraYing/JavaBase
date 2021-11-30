import java.nio.ByteBuffer;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        // JVM分配内存
        ByteBuffer allocate= ByteBuffer.allocate(1024);
        // 操作系统分配内存,虚引用处理内存回收的问题
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);

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
