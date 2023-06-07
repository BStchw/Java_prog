package threadpool;

public class Main {
    public static void main(String[] args) throws notInstanceOfThreadPoolExecutorException {
        MyThreadPool pula = new MyThreadPool(4);
        Runnable task1 = () -> System.out.println("Zadanie 1");
        Runnable task2 = () -> System.out.println("Zadanie 2");
        Runnable task3 = () -> System.out.println("Zadanie 3");
        Runnable task4 = () -> System.out.println("Zadanie 4");

        pula.submit(task1);
        pula.submit(task2);
        pula.submit(task3);
        pula.submit(task4);

        pula.shutDown();

    }
}
