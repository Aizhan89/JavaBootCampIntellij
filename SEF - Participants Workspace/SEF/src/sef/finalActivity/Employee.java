public class Employee {
    private String name;
    private int age;
    private String job;
    private String company;
    private double salary;


    public Employee () {
        name = "";
        age = 0;
        job = "";
        company = "";
        salary = 0;
    }

    public Employee(String name, int age, String job, String company, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.company = company;
        this.salary = salary;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old" + " I work as" + job + " in " + company);
    }

}
