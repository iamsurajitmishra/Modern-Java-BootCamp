package bootcamp.modern.java.lamda;
public class TheFirstCuteLamda {
    public static void main(String[] args) {

        // Anonymous class
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-1 Executed.");
            }
        });

        //lamda
        Thread t2 = new Thread(()-> System.out.println("Thread-2 executed."));

        // start thread
        t1.start();
        t2.start();
    }

}


