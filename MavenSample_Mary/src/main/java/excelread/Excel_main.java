package excelread;
import java.io.IOException;

public class Excel_main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String ab=ExcelRead_1.getStringData(3, 0);
		System.out.println(ab);
		String cd=ExcelRead_1.getIntegerData(3, 1);
		System.out.println(cd);

	}

}
