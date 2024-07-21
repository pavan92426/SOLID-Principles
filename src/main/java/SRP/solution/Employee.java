package SRP.solution;


public class Employee {

    private String fName;
    private String lName;
    private String email;
    private String idNum;
    private String empType;

    public int validateEmployeeType(){
        return new EmployeeValidation().employeeStatus(this);
    }

    public void data(){
        new EmployeeParser().marshalAndUnmarshall(this);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }
}
