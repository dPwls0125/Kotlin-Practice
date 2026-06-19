package section4_코틀린에서의_OOP;

public class JavaPerson {

    private final String name;

    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isAdult(){
        return this.age >= 20;
    }
}
