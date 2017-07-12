/**
 * Created by Administrator on 2017/6/10.
 */
public class PC {
    public static void main(String[]args ){

    }
}

class shared extends Thread{
    private boolean can=true;

    public synchronized void run(){
        while (!can){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        can=false;
        System.out.println("shared run");
        notify();
    }

}
