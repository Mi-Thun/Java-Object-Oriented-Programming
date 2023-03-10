package lab7problem3;

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        //Set manager attribute
        m1.name = "Mithun";
        m1.age = 20;
        m1.phoneNumber = 1521509030;
        m1.address = "Tangail";
        m1.salary = 45000;
        m1.department = "CSE";
        m1.specialization = "Java Expert";
        //Calling manager display method
        m1.displayManager();
        Employee e1 = new Employee();
        //Set employee attribute
        e1.name = "Kabir";
        e1.age = 21;
        e1.phoneNumber = 1639769081;
        e1.address = "Dhaka";
        e1.salary = 35000;
        e1.department = "CSE";
        e1.specialization = "Python Expert";
        //Calling manager display method
        e1.displayEmployee();
    }
}
