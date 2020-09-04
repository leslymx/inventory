package main;

public class Test {

    public double testing() throws InterruptedException {

        long initial = System.currentTimeMillis();
        Thread.sleep(2000);

        long end = System.currentTimeMillis();
        double time = (double) ((end - initial)/1000);

        System.out.println(time +" seconds");
        return time;
    }
}
