package week1d2.myString;

public class TestMyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString mystring1 = new MyString("123");
		char[] chr = {'4', '5', '6', '7'};
		MyString mystring2 = new MyString(chr);
		
		mystring1.concat(mystring2);
		char[] chrArray = mystring1.getMas();
		
		System.out.println("Test MyString.concat: " + (chrArray[2] == '3'));
	}

}
