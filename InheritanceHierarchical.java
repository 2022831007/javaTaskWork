
class Employee{
    String name;
     String department;
    int id;
    Employee(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }
    void calculatePay(){
        System.out.println(this.name+" id of "+id+" of the departement "+department+" has a salary ");
    }
}

class FullTimeEmployee extends Employee{
    double FixedSalary;
    FullTimeEmployee(String name, int id, String department, double FixedSalary){
        super(name, id, department);
        this.FixedSalary=FixedSalary;
    }

    @Override
    void calculatePay() {
        System.out.println(this.name+" id of "+id+" of the departement "+department+" has a salary "+FixedSalary);
    }
}

class PartTimeEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(String name, int id, String department,double hourlyRate,int hoursWorked){
        super(name, id, department);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    

    @Override
    void calculatePay() {
        System.out.println(this.name+" id of "+id+" of the departement "+department+" has a salary "+hourlyRate*hoursWorked);
    }
        
}
class ContractEmployee extends Employee{
    String projectName;
    double contractAmount;
    ContractEmployee(String name, int id, String department,String projectName, double contractAmount){
        super(name, id, department);
        this.projectName=projectName;
        this.contractAmount= contractAmount;
    }
    void calculatePay() {
        System.out.println(this.name+" id of "+id +" of the  department  "+department+" has a contract amount of "+contractAmount+" for "+projectName);
    }
}

public class InheritanceHierarchical {
    public static void main(String[] args) {
        Employee em1 = new Employee("X", 2224, "CSE");
        PartTimeEmployee em2 = new PartTimeEmployee("y", 2345, "SWE",800,7);
        ContractEmployee em3 = new ContractEmployee("z", 3545, "EEE","robotic work",45000);
        
        em1.calculatePay();
        em2.calculatePay();
        em3.calculatePay();
}
}
