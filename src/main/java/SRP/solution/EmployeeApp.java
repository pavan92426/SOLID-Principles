package SRP.solution;

public class EmployeeApp {

    public static void main(String args[]) {

        Employee emp = new Employee();
        emp.setfName("Dan");
        emp.setlName("Fitz");
        emp.setEmail("Dan@email.com");
        emp.setEmpType("FULL TIME");
        emp.setIdNum("6546465");
        System.out.println(emp.validateEmployeeType());
        emp.data();
    }
}
