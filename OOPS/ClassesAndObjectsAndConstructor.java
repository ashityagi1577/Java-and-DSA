class Student {
    int id;
    String name;

    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

class Employee {
    int empId;
    String empName;

    
    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

public class ClassesAndObjectsAndConstructor {
    public static void main(String[] args) {

         
        Student s1 = new Student(101, "A");

    
        Employee e1 = new Employee(201, "B");


        s1.display();
        System.out.println();

        e1.display();
    }
}
