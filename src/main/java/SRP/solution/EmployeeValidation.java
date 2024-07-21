package SRP.solution;

public class EmployeeValidation {

    public int employeeStatus(Employee employee) {
        if(employee.getEmpType()=="FULL TIME"){
            return 100;
        } else if (employee.getEmpType() == "PART TIME"){
            return 50;
        }
        return 0;
    }
}
