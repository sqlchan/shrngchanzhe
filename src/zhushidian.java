import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/26.
 */
public class zhushidian {
    public static void main(String[]args){

    }
    public static ArrayList<ArrayList<Double>> getpoint(){
        ArrayList<ArrayList<Double>> points=new ArrayList<>();
        for(double i=-2;i<2;i+=0.2){
            for(double j=-2;j<2;j+=0.2){
                for(double k=0;k<2;k+=0.2){
                    if(i*i+j*j+k*k<4){
                        ArrayList<Double> point=new ArrayList<>();
                        point.add(i);
                        point.add(j);
                        point.add(k);

                        point.add(0.0);
                        point.add(0.0);
///////
                        point.add(Math.random()*10);
                        point.add(Math.random()*10);

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*10);

                        point.add(Math.random()*10);
                        point.add(Math.random()*(-10));

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*(-10));
//////
                        point.add(Math.random()*10);
                        point.add(Math.random()*10);

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*10);

                        point.add(Math.random()*10);
                        point.add(Math.random()*(-10));

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*(-10));
////////
                        point.add(Math.random()*10);
                        point.add(Math.random()*10);

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*10);

                        point.add(Math.random()*10);
                        point.add(Math.random()*(-10));

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*(-10));
/////
                        point.add(Math.random()*10);
                        point.add(Math.random()*10);

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*10);

                        point.add(Math.random()*10);
                        point.add(Math.random()*(-10));

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*(-10));
/////
                        point.add(Math.random()*10);
                        point.add(Math.random()*10);

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*10);

                        point.add(Math.random()*10);
                        point.add(Math.random()*(-10));

                        point.add(Math.random()*(-10));
                        point.add(Math.random()*(-10));

                        points.add(point);

                    }
                }
            }
        }

        return points;
    }

}
