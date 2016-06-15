
public class TestCalculator {
	Calculator cal = new Calculator();
	
	public boolean testParser() {
		boolean pass = true;
		cal.x = 5.0;
		
		// Testing addition
		if (cal.x("12 + 5") == 17.0)
			System.out.println("[ OK ] Parser successfully adds");
		else {
			System.out.println("[ FAIL ] Parser fails to add");
			pass = false;
		}
			
		// Testing multiplication
		if (cal.x("12 x 5") == 60.0)
			System.out.println("[ OK ] Parser successfully multiplies");
		else {
			System.out.println("[ FAIL ] Parser fails to multiply");
			pass = false;
		}
		
		// Testing incorrect formatting
		if (cal.x("12 [ 3") == null)
			System.out.println("[ OK ] Parser returns null for operators which are not supported.");
		else {
			System.out.println("[ FAIL ] Parser does not return  null for operators which are not supported.");
			pass = false;
		}
		return pass;
	}
	
	public boolean testAdd() {
		boolean pass = true;
		// Testing positive addition
		cal.x = 2.0;
		if (cal.x((Double)5.0) == 7.0)
			System.out.println("[ OK ] Calculator adds positive numbers correctly");
		else {
			System.out.println("[ FAIL ] Calculator adds positive incorrectly");
			pass = false;
		}
		
		// Testing negative addition
		cal.x = -2.0;
		if (cal.x((Double)5.0) == 3.0)
			System.out.println("[ OK ] Calculator adds negative numbers correctly");
		else {
			System.out.println("[FAIL] Calculator adds negative numbers incorrectly");
			pass = false;
		}
		return pass;		
	}
	
	public boolean testMultiplication() {
		boolean pass = true;
		// Testing positive multiplication
		cal.x = 2.0;
		if (cal.x((double)5.0) == 10.0)
			System.out.println("[ OK ] Calculator multiplies positive numbers correctly");
		else {
			System.out.println("[FAIL] Calculator multiplies positive numbers incorrectly");
			pass = false;
		}
				
		// Testing negative multiplication
		cal.x = -2.0;
		if (cal.x((double)5.0) == -10.0)
			System.out.println("[ OK ] Calculator multiplies negative numbers correctly");
		else {
			System.out.println("[ FAIL ] Calculator multiplies negative numbers incorrectly");
			pass = false;
		}				
		return pass;
	}
}
