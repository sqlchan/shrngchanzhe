/**
 * Created by Administrator on 2017/7/11.
 */
public class user {
    private String name;

    public user(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean equals(user uu) {
        return this.name.equals(uu.name);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random()*100);
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\''+
                "hash='" + hashCode() + '\''
                +
                '}';
    }
}
