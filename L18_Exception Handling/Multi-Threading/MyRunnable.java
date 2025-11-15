class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface...");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj); // pass runnable object
        t1.start();
    }
}
