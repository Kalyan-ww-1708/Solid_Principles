package Session1;

public class Employee{

    private String eid;
    private String empName;
    private String empAddress;
    private String contact;
    private String empType;


    public void save(){
        new EmployeeRepository().save(this);
    }
    public void calculateTax(){
        new TaxCalculator().calculateTax(this);
    }
    public String getEid() {
        return eid;
    }
    public void setEid(String eid) {
        this.eid = eid;
    }
    
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    

    public String getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getEmpType() {
        return empType;
    }
    public void setEmpType(String empType) {
        this.empType = empType;
    }
    public static void main(String[] args) {
        
    }
    
    
    
}