/**
 * Created by Administrator on 2017/6/10.
 */
public class PublicBox {
    private int apple=0;
    public synchronized void increase(){
        while (apple==5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        apple++;
        System.out.println("生产apple成功，总共 "+apple+" 个");
        notify();
    }
    public synchronized void decrease(){
        while (apple==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        apple--;
        System.out.println("消费apple成功，总共 "+apple+" 个");
        notify();
    }
    public static void main(String[] args){
        PublicBox box=new PublicBox();

        consumer con=new consumer(box);
        producter pro=new producter(box);

        Thread t1=new Thread(con);
        Thread t2=new Thread(pro);

        t1.start();
        t2.start();

    }
}

class producter implements Runnable{
    private PublicBox box;
    public producter(PublicBox box){
        this.box=box;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("pro "+i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            box.increase();
        }
    }
}

class consumer implements Runnable{
    private PublicBox box;
    public consumer(PublicBox box){
        this.box=box;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("con "+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            box.decrease();
        }
    }
}