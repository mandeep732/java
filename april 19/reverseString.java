package april19.A;

public class reverseString {
	public static void main(String arg[]) {
		String str = "hello";
		char array[]= str.toCharArray();
		for(int i=0;i<array.length/2;i++) {
			char temp = array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		
		str = new String(array);
		System.out.println(str);
	}
}
