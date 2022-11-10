
import java.util.Scanner;
public class EMPLOYEES_TEST {
    public static void main(String[] args) {
        double salary,byPercent;
        String Name;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name:");
        name=in.next();
        System.out.println("enter the salary:");
        salary=in.nextDouble();
        System.out.println("enter the  percent:");
        byPercent=in.nextDouble();
        EMPLOYEEES emp=new Employee(Name,salary);
        emp.raiseSalary(byPercent);
        System.out.println("the name is : "+emp.getName());
        System.out.println("and salary= "+emp.getSalary());
    }
}
