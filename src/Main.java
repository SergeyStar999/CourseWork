import java.util.Arrays;

public class Main {
    private static EmployeeBook[] employees = new EmployeeBook[10];
    public static void main(String[] args) {
        EmployeeBook empl1 = new EmployeeBook("Григорий","Григорьевич","Егоров",1, 40000);
        EmployeeBook empl2 = new EmployeeBook("Василий","Тамонов","Андреевич",2, 60000);
        EmployeeBook empl3 = new EmployeeBook("Анатолий","Индюков","Сергеевич",3, 80000);
        EmployeeBook empl4 = new EmployeeBook("Дмитрий","Синёв","Дмитриевич",4, 100000);
        EmployeeBook empl5 = new EmployeeBook("Аднрей","Увалов","Андреевич",5, 150000);
        EmployeeBook empl6 = new EmployeeBook("Виктор","Кайдашов","Викторович",6, 125000);
        EmployeeBook empl7 = new EmployeeBook("Мария","Филлипова","Антонова",7, 185000);
        EmployeeBook empl8 = new EmployeeBook("Ольга","Мешалкина","Сергеевна",8, 240000);
        EmployeeBook empl9 = new EmployeeBook("Анастасия","Кук","Михайловна",9, 280000);
        EmployeeBook empl10 = new EmployeeBook("Семён","Слепаков","Михайлович",10, 300000);
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
        EmployeeBook[] empl = Arrays.copyOf(employees, 11);
        Arrays.stream(empl).forEach(System.out::println);
        System.out.println(empl.length);
    }
    public static void printEmployees() {
        for(EmployeeBook employeeBook : employees) {
            System.out.println(employeeBook);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (EmployeeBook employeeBook : employees) {
            sum += employeeBook.getSalary();
        }
        return sum;
    }
    public EmployeeBook employeeMinSalary() {
        EmployeeBook result = employees[0];
        int minSalary = employees[0].getSalary();
        for(EmployeeBook employeeBook : employees) {
            if(employeeBook.getSalary() < minSalary) {
                minSalary = employeeBook.getSalary();
                result = employeeBook;
            }
        }
        return result;
    }
    public EmployeeBook employeeMaxSalary() {
        EmployeeBook result = employees[0];
        int maxSalary = employees[0].getSalary();
        for(EmployeeBook employeeBook : employees) {
            if(employeeBook.getSalary() > maxSalary) {
                maxSalary = employeeBook.getSalary();
                result = employeeBook;
            }
        }
        return result;
    }
    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }
    public static void printFullNames() {
        for (EmployeeBook employeeBook : employees) {
            System.out.println(employeeBook.getFullName());
        }
    }
}