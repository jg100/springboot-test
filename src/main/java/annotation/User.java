package annotation;

public class User
{
    private String name;
    private int age;

    public User() {
        name = "Joel";
        age = 23;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
