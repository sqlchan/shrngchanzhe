import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        String s=Integer.toBinaryString(a);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count++;
        }
        System.out.println(count);

    }

    public static void p(String a){
        StringBuilder sb=new StringBuilder(a);
        System.out.println(sb.reverse().toString());
    }

}
