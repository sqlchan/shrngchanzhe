/**
 * Created by Administrator on 2017/6/10.
 */
public class ProducerConsumerTest {
    public static void main(String[]args){
        resource resource=new resource();
        new Thread(new producter1(resource)).start();
        new Thread(new cons(resource)).start();
    }
}

class resource{
    private int num=0;
    private boolean flag=false;

    public synchronized void create(){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println(Thread.currentThread().getName()+" 生产者 ： "+num);
        flag=true;
        notify();
    }
    public synchronized void destory(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" 消费者 ： "+num);
        flag=false;
        notify();
    }
}

class producter1 implements Runnable{
    private resource resource;
    public producter1(resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.create();
        }
    }
}

class cons implements Runnable{
    private resource resource;
    public cons(resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.destory();
        }
    }
}


