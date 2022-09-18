

public class HourlyEmployee extends Employee
{
    private int hoursWorked;
    private int hourlyPayment;
    public HourlyEmployee(String gname,String gafm,int ghoursWorked,int ghourlyPayment)
    {
        super(gname,gafm);
        this.hoursWorked=ghoursWorked;
        this.hourlyPayment=ghourlyPayment;
    }
        
    public void setHoursWorked(int a)
    {
      this.hoursWorked=a;
    }
    public int getHoursWorked()
    {
        return this.hoursWorked;
    }
    public void setHourlyPayment(int b)
    {
        this.hourlyPayment=b;
    }
    public int getHourlyPayment()
    {
        return this.hourlyPayment;
    }
    public int payment()
    {
        return this.hoursWorked*this.hourlyPayment;
    }
    public void printInfo()
    {
        super.printInfo();
       System.out.println("Employee Zenia has worked for : " + this.getHoursWorked() + " hours for " + this.getHourlyPayment() + "  dollars per hour");

    }
}
