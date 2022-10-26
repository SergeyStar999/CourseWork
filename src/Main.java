import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Employee empl1 = new Employee("Григорий","Григорьевич","Егоров",1, 40000);
        Employee empl2 = new Employee("Василий","Тамонов","Андреевич",2, 60000);
        Employee empl3 = new Employee("Анатолий","Индюков","Сергеевич",3, 80000);
        Employee empl4 = new Employee("Дмитрий","Синёв","Дмитриевич",4, 100000);
        Employee empl5 = new Employee("Аднрей","Увалов","Андреевич",5, 150000);
        Employee empl6 = new Employee("Виктор","Кайдашов","Викторович",6, 125000);
        Employee empl7 = new Employee("Мария","Филлипова","Антонова",7, 185000);
        Employee empl8 = new Employee("Ольга","Мешалкина","Сергеевна",8, 240000);
        Employee empl9 = new Employee("Анастасия","Кук","Михайловна",9, 280000);
        Employee empl10 = new Employee("Семён","Слепаков","Михайлович",10, 300000);
        employees[0] = empl1;
        employees[1] = empl2;
        employees[2] = empl3;
        employees[3] = empl4;
        employees[4] = empl5;
        employees[5] = empl6;
        employees[6] = empl7;
        employees[7] = empl8;
        employees[8] = empl9;
        employees[9] = empl10;
        Employee[] empl = (employees);
        Arrays.stream(empl).forEach(System.out::println);
        System.out.println(empl.length);
    }
    public static void printEmployees() {
        for(Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public Employee employeeMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for(Employee employee : employees) {
            if(employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
            }
        }
        return result;
    }
    public Employee employeeMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for(Employee employee : employees) {
            if(employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }
    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}