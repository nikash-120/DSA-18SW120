class Employee
{
int salary;
int hour;
public void getInfo(int salary,int hour)
{
this.salary=salary;
System.out.println("Current salary and hour are" +salary + ":" +hour);
}
public void addSalary()
{
if (salary<500)
{
salary=salary+10;
System.out.println("Salary after bonus"+salary);
}
else
System.out.println("No bonus");
}
public void addWorkHourBonus()

{

if (hour<5)
{
this.hour=hour;
salary=salary+5;
System.out.println("Salary of less than 5 hours is:" +salary);
}

else

System.out.println("Not working more than 5 hours");

}

public static void main(String args[])
{
Employee obj=new Employee();
obj.getInfo(300,4);
obj.addSalary();
obj.addWorkHourBonus();
}
}