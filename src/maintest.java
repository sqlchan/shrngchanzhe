import java.util.HashMap;

public class maintest {
    public static void main(String[] args) {
        user uuu1=new user("l");
        user uuu2=new user("l");
//        if(uuu1.equals(uuu2))
//            System.out.println("uuu1=uuu2");
//        else
//            System.out.println("uuu1 != uuu2");
//
//        System.out.println("uuu1 hashcode is :"+uuu1.hashCode());
//        System.out.println("uuu2 hashcode is :"+uuu2.hashCode());
//        System.out.println(uuu1.equals(uuu2));

        HashMap<user,Integer> hashMap=new HashMap<>();
        for(int i=0;i<1000;i++){
            hashMap.put(uuu1,1);
        }

//        hashMap.put(uuu1,2);
//        hashMap.put(uuu1,3);
//        ArrayList<user> list=new ArrayList<>();
//        for(user u:hashMap.keySet()){
//            list.add(u);
//        }
//        user u1=list.get(0);
//        user u2=list.get(1);
//        user u3=list.get(2);
//        System.out.println(u1.equals(u2));
//        System.out.println(u1.equals(u3));
//        System.out.println(u2.equals(u3));
        System.out.println(hashMap.size());
    }
}