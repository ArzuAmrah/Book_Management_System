package book;

public class Employee extends Person {

    private String position;
    private double salary;

    public Employee(String name, int age, String gender, String position, double salary) {
        super(name , age , gender);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}
