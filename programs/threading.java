class NewThread extends Thread {
    public void run() {
        System.out.println("This is a new thread.");
    }
}

class NewRunnable implements Runnable {
    public void run() {
        System.out.println("This is a new runnable.");
    }
}

public class threading {
    public static void main(String[] args) {
        NewThread thread = new NewThread();
        thread.start();

        NewRunnable runnable = new NewRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}