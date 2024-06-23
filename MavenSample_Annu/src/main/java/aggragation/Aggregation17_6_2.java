package aggragation;

public class Aggregation17_6_2 {
int num;
Aggration17_6 ag;
public Aggregation17_6_2(int num,Aggration17_6 ag)
{
this.num=num;
this.ag=ag;
}
public void show()
{
System.out.println(num);	
System.out.println(ag.name+" "+ag.color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggration17_6 obj= new Aggration17_6("Sana","Red");
		Aggregation17_6_2 obj2=new Aggregation17_6_2(7,obj);
		obj2.show();
	}

}
