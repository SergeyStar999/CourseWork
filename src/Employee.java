public class Employee {
    private static int counter = 5;
    private Integer id;
    private String name;
    private String lastName;
    private String fullName;
    private int department;
    private int salary;
    public Employee(String name, String lastName, String fullName, int department, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {return name;}
    public String getLastName() {return  lastName;}
    public  String getFullName() {return  fullName;}
    public  int getDepartment() {return department;}
    public Integer getId() {return this.id;}
    public int getSalary() {return salary;}
    public void setDepartment(byte department) {this.department = department;}
    public void setSalary(int salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "EmployeeBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
