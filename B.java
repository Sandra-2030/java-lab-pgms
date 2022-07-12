class A
{
public void display()
{
System.out.println("This is an example of Public access specifier");
}
}
class B
{
public static void main(String args[])
{
 A obj=new A ();
obj.display();
}
}

