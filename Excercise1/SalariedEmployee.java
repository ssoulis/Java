

public class SalariedEmployee extends Employee
{
    private int salary;
    public SalariedEmployee(String aname,String aafm,int salary)
    {
     super(aname,aafm);
     this.salary=salary;
    }
    public void setSalary(int newsalary)
    {
        this.salary=newsalary;
    }
    public int payment()
    {
        return this.salary;
        
    }
   
}
