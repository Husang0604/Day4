
public class Employee {
    private String name;
    private String department;
    private int number;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return this.name + this.department;
    }

    Employee() {

    }

    Employee(String _name, String _department, int _number) {
        name = _name;
        department = _department;
        number = _number;
    }

    
}

