class Demo{
	void show()
	{
		System.out.println("in show method of super class");
	}
}
class Anonymous{
	static Demo d=new Demo(){
		void show()
		{
			super.show();
			System.out.println("i am in anoymous class");
		}
	};
	public static void main(String[] args){
		d.show();
	}
}	
