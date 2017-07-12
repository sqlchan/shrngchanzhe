import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Bigplate {
    private ArrayBlockingQueue<Object> blockingQueue=new ArrayBlockingQueue<Object>(1);
    public void putegg(Object egg){
        try {
            blockingQueue.put(egg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("put");
    }
    public Object getegg(){
        Object ee=null;
        try {
            ee=blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("get");
        return ee;
    }
    static class gete extends Thread{
        private Bigplate bigplate;

        public gete(Bigplate bigplate) {
            this.bigplate = bigplate;
        }
        public void run(){bigplate.getegg();}
    }
    static class pute extends Thread{
        private Bigplate bigplate;
        public Object o=new Object();

        public pute(Bigplate bigplate) {
            this.bigplate = bigplate;
        }
        public void run(){bigplate.putegg(o);}
    }

    public static void main(String[]args){
        Bigplate bigplate=new Bigplate();
        for(int i=0;i<20;i++){
            new Thread(new gete(bigplate)).start();
        }
        for(int i=0;i<20;i++){
            new Thread(new pute(bigplate)).start();
        }
    }
}