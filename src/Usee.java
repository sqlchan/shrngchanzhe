/**
 * Created by Administrator on 2017/7/2.
 */
public class Usee {
    private String name;
    private int age;

    public Usee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Usee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
