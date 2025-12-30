package service;

public class MonitoringService extends Thread {
    public void run() {
        while (true) {
            System.out.println("Monitoring cloud resources...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
