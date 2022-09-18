import java.util.*;
public class Company 
{
    private String name;
    private String afm;
    private ArrayList<Employee> myEmployees = new ArrayList<Employee>();
    public void addEmployee(Employee x)
    {
        myEmployees.add(x);
    }
    public Company(String aname,String aafm)
    {
        this.name=aname;
        this.afm=aafm;
    }
    public void getEmployeeNames()
    {
        for( Employee x : myEmployees)
        {
            System.out.println(x.getName());
        } 
    }
}