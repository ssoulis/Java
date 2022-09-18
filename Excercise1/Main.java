public class Main 
{
    public static void main()
    { 
        Employee[] Emplist = new Employee[2];
        SalariedEmployee Emp1= new SalariedEmployee("Giorgos Vasiliou","72340002",3000);
        HourlyEmployee Emp2= new HourlyEmployee("Zenia Tsegkou","98145821",210,20);
        Emplist[0]=Emp1;
        Emplist[1]=Emp2;
        for(Employee x : Emplist)
        {
            x.printInfo();
            System.out.println();        }
        Employee.ResetCounter();
        Company C1 = new Company("TalentSA","1");
        C1.addEmployee(Emp1);
        C1.addEmployee(Emp2);
        System.out.println();
       System.out.println("Employees working for TalentSA : ");
       C1.getEmployeeNames();
    }
}