package lab7problem3;

public class Employee extends Member {
    String specialization, department;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("specialization: " + specialization);
        System.out.println("department: " + department);
    }
}
