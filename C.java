import java.io.*;
public class C{
public static void main(String[]args)throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader reader= new BufferedReader(ir);
System.out.println("enter your name:");
String name=reader.readLine();
System.out.println("Your name is "+name);
}
}

