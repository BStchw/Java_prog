package threadpool;
import java.util.*;
import java.util.concurrent.*;

public class MyThreadPool {
    ExecutorService executor;
    MyThreadPool(int poolSize)  {
        this.executor = new ThreadPoolExecutor(poolSize, poolSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
    }

    public void submit(Runnable task) throws notInstanceOfThreadPoolExecutorException{
        if (executor instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
            int numberOfTasks = threadPoolExecutor.getQueue().size();
            int poolSize = threadPoolExecutor.getPoolSize();

            if (numberOfTasks < poolSize) {
                executor.execute(task);
            } else {
                executor.submit(task);
            }
        } else {
            throw new notInstanceOfThreadPoolExecutorException("Egzekutor nie jest instancją ThreadPoolExecutor");
        }
        }


    public void shutDown()   {
        executor.shutdown();
    }
}
