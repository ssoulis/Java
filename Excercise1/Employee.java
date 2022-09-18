public abstract class Employee 
{
    private String name;
    private String afm;
    private long EmpID;
    private static int count=1;
    public Employee(String gname,String gafm)
    {
        this.EmpID=count++;
        this.name=gname;
        this.afm=gafm;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAfm(String nafm)
    {
        this.afm=nafm;
    }
    public String getAfm()
    {
        return this.afm;
    }
    public long getEmpID()
    {
        return this.EmpID;
    }
    public abstract int payment();
    public void printInfo()
    {
        System.out.println("Employee ID : " + this.EmpID);
        System.out.println("Employee name : " + this.name);
        System.out.println("Employee AFM : " + this.afm);
        System.out.println("Employee Payment : "+ this.payment() );
       
    }
    public static void ResetCounter()
    {
       Employee.count=1;
    }
}

          
         