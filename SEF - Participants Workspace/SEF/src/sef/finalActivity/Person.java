
public class Person {
    private String name;
    private int age;

    public Person() {
        name = "";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.matches(".*\\d.*")) {
            throw new IllegalNameException("Name contains numbers");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }
}





