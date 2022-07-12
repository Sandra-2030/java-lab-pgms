public class ComplexNumber[
	double real,img;
	Complexnumber(double r,double i){
		this.real=r;
		this.img=i;
	}
	public static ComplexNumber sum
	(Complexnumber c1,ComplexNumber c2)
	{
		ComplexNumber temp=new ComplexNumber (0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static void main(String args[])
	{
		ComplexNumber c1=new CopmplexNumber(5,5,4);
		ComplexNumber c2=new ComplexNumber(1.5,4.3);
		ComplexNumber temp=sum(c1,c2);
		System.out.println(temp);
	}
}
