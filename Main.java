import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry", "highschool", 1);
        System.out.println(harry);
        Manager ej = new Manager("ej", "hakwon", 2);
        System.out.println(ej);

        ArrayList<Employee> myList = new ArrayList<Employee>();
        ej.addEmployee(myList, harry);

    }
}
