public class TestThread extends Thread {

    Thread mainThread;
    public TestThread(String name, Thread mainThread) {
        super(name);
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        try {
            for (int i=0; i<3; i++){
                Thread.sleep(1000);
                System.out.println("Main thread sate: "+ mainThread.getState());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(getName() + " finished");
    }
}
