public class 
Person { 
private String lastname; 
private String firstname; 
private int age; 
private boolean married; 
private float salary; 
public static final int MALE= 0; 
public static final int FEMALE = 1; 
private int sex; 
public Person (String lastname, String firstname, int age, boolean married, float salary,int sex) { 
this.lastname = new String(lastname); 
this.firstname = new String(firstname); 
this.age = age; 
this.married = married; 
this.salary = salary; 
this.sex = sex;
} 
public String getLastName() { return lastname; } 
public void setLastName(String nln) {this.lastname=nln;}
public String getFirstName() { return firstname; } 
public void setFirstName(String nfn){this.firstname=nfn;}
public int getAge() { return age; } 
public void setAge(int new_age){this.age=new_age;}
public boolean isMarried() { return married; } 
public void setMarried(boolean new_married){this.married=new_married;}
public float getSalary() { return salary; } 
public void setSalary(float new_salary){this.salary=new_salary;}
public int getSex(){ return sex;}
public void setSex(int new_sex){this.sex=new_sex;}
public void printInfo()
{
System.out.print(getFirstName()+" "+getLastName()+" is " +getAge()+" year old"+getSex() +", gets a "+getSalary()    +" Euros salary and is"); 
if (isMarried() == false)  
System.out.print(" not"); 
System.out.println(" married.");  
} 
}