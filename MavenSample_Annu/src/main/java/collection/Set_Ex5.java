package collection;
import java.util.*;
public class Set_Ex5 {//addAll()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>obj=new LinkedHashSet();
obj.add(20);
obj.add(30);
System.out.println(obj);
List<Integer>obja=new ArrayList();
obja.add(100);
obja.add(50);
obja.add(150);
obj.addAll(obja);
System.out.println(obj);
	}

}
