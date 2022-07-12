class Outer{
	void outerMethod(){
		System.out.println("inside outermethod");
		class Inner{
			void innerMethod()
			{
				System.out.println("innermethod");
			}
		}
		Inner y=new Inner();
		y.innerMethod();
		}
}
class MethodDemo{
	public static void main(String[] args){
	Outer x=new Outer();
	x.outerMethod();
	}
}


