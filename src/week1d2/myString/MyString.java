package week1d2.myString;

public class MyString {

    private char[] mas;

    MyString(char[] mas){
        this.mas = mas;
    }

    MyString(String str){
        mas = str.toCharArray();
    }

    public void concat(MyString other){
    	char[] chrArray = new char[mas.length + other.getMas().length];
    	System.arraycopy(mas, 0, chrArray, 0, mas.length);
    	System.arraycopy(other.getMas(), 0, chrArray, mas.length, other.getMas().length);
    	mas = chrArray;
    }

	public char[] getMas() {
		return mas;
	}
	
	public String getString(){
		return mas.toString();
	}
}
