public class Main {
    public static void main(String[] args)throws InterruptedException {

        Thread mainThread = Thread.currentThread();

        TestThread thread1 = new TestThread("Thread1", mainThread);
        thread1.start();
        thread1.join();
        System.out.println("Main thread");
    }
}
