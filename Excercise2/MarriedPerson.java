public class MarriedPerson extends Person { private int children; 
public  MarriedPerson(String  lastname,  String  firstname,  int  age,  float salary,int sex, int children) { 
super(lastname, firstname, age,true, salary,sex); 
this.children = children; 
} 
public int getNoOfChildren() { return children; } 
public void printInfo()
{
    super.printInfo();
    System.out.print("and has "+ getNoOfChildren()+" children");
} 
public void setMarried(boolean marr)
{
    
}
public void setSalary(MarriedPerson spouse)
{
    if (spouse.getSex()!=this.getSex())
    {
        super.setSalary(super.getSalary()+spouse.getSalary());
    }
}
}