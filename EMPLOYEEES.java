
public class EMPLOYEEES {
    private  String Name;
    private  double Salary;
    public EMPLOYEEES (String name,double salary)
    {
        this.Name=name;
        this.Salary=salary;
    }
    public EMPLOYEEES(){
        this("",0);}
    public  String getName()
    {return  Name;}
    public  double getSalary()
    {return  Salary;}
    public void  raiseSalary(double byPercent)
    {
        Salary=Salary+Salary*(byPercent/100);
    }
}
