import java.util.ArrayList;

public class Manager extends Employee {
    Manager(String _name, String _deparment, int _num) {
        setName(_name);
        setDepartment(_deparment);
        setNumber(_num);

    }

    public void addEmployee(ArrayList<Employee> myList, Employee name) {
        myList.add(name);
    }

    public String toString() {
        return this.getName();
    }
}