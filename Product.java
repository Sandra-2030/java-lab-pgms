class Student{
int pcode,price;
String pname;
void insertRecord(int r,String n,int s){
pcode=r;
price=s;
pname=n; 
}
void displayInformation()
{
System.out.println(pcode+" "+pname+" "+price);
}
}
class Product{
public static void main(String args[]){
int s;
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.insertRecord(115,"pen",2000);
s2.insertRecord(122,"scale",5000);
s3.insertRecord(130,"marker",6000);
s1.displayInformation();
s2.displayInformation();
s3.displayInformation();
if(s1.price<s2.price)
{
if(s1.price<s3.price)
{
s=s1.price;
}
else
{
s=s3.price;
}
}
else
{
if(s2.price<s3.price)
{
s=s2.price;
}
else
{
s=s3.price;
}
}
System.out.println(s+" is the smallest price");
}
}

