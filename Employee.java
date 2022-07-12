class Student{
int empno,salary;
String name;
void insertRecord(int r,String n,int s){
empno=r;
salary=s;
name=n;
}
void displayInformation()
{
System.out.println(empno+" "+name+" "+salary);
}
}
class Employee{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.insertRecord(12,"aleena",2000);
s2.insertRecord(13,"liya",30000);
s3.insertRecord(14,"arya",4000);
s1.displayInformation();
s2.displayInformation();
s3.displayInformation();
}
}
