public class Employee
{
 private double salary;
 private String name;
 public Employee(String name,double salary)
 {
     this.name=name;
     this.salary=salary;
 }
  public String getName()
  {
   return name;
  }
 public double getSalary()
 {
  return salary;
 }
 public static void main(String[]args)
 {
 Employee e1=new Employee( "Sabbir" ,66.6);
     System.out.println(e1.getName());
     System.out.println(e1.getSalary());
  }
 }