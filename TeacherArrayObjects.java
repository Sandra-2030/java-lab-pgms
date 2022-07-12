import java.util.Scanner;
class Employee
{
	int empid;
	String name;
	float salary;
	String address;
	Employee()
	{
	}
	Employee(int empid,String name,float salary,String address)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
}
class Teacher extends Employee
{
	String department,subject;
	Teacher(int empid,String name,float salary,String address,String department,String subject)
{
	super(empid,name,salary,address);
	this.department=department;
	this.subject=subject;
}
	public void display()
	{
		System.out.println("Teacher id :"+empid);
		System.out.println("Teacher name :"+name);
		 System.out.println("Teacher salary :"+salary);
		 System.out.println("Teacher address :"+address);
		 System.out.println("Teacher department :"+department);
		 System.out.println("Teacher subject :"+subject);
	}

}
public class TeacherArrayObjects
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of Teachers:");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println("Enter Teachers details one by one.. ");
		Teacher teacher[]=new Teacher[n];
		Scanner sc=new Scanner(System.in);
		int tid;
		String name;
		float salary;
		String address;
		String department;
		String subject;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+"teacher details ");
			System.out.println("Enter teacher id(integer): ");
			tid=sc.nextInt();
			 System.out.println("Enter teacher name: ");
                        name=sc.next();
			 System.out.println("Enter teacher salary: ");
                        salary=sc.nextFloat();
			 System.out.println("Enter teacher address: ");
                        address=sc.next();
			 System.out.println("Enter teacher department: ");
                        department=sc.next();
			 System.out.println("Enter teacher subject: ");
                        subject=sc.next();
			Teacher t=new Teacher(tid,name,salary,address,department,subject);
			teacher[i]=t;

		}
		System.out.println("Teachers are:");
		for(Teacher x:teacher){
			x.display();
			System.out.println("\n");
	}
	}
}
