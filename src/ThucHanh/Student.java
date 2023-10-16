package ThucHanh;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean status;
    static int count = 1;

    public Student(String name, int age, boolean status) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public int getId() {
        return id;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
