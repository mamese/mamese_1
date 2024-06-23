package accessSpecifiers;

public class Access_SpecifiersEx {
public void display1()
	{
		System.out.println("Public- Access specifier");
	}
private void display2()
{
System.out.println("Private- Access specifier");	
}
void display3()
{
System.out.println("Default- Access Specifier");	
}
protected void display4()
{
System.out.println("Protected- Access Specifier");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access_SpecifiersEx obj=new Access_SpecifiersEx();
obj.display1();
obj.display2();
obj.display3();
obj.display4();
	}

}
