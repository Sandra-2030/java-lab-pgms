//prg:2
//prg:studentrecord
//date:21/3/2022
//programer name=Aleena manuvel
class Student{
int rollno;
String name;
void insertRecord(int r,String n){
rollno=r;
name=n;
}
void displayInformation()
{
System.out.println(rollno+" "+name);
}
}
class StudentRecord{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(111,"kaean");
s2.insertRecord(222,"arayan");
s1.displayInformation();
s2.displayInformation();
}
}


