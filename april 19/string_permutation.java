package april19.A;

public class string_permutation {
	public static void main(String arg[]) {
		String str="DOG";
		
		permutations(str,0);
	}

	private static void permutations(String str, int pos) {
		int len = str.length();
		
		if(pos==len) {
			System.out.println(str);
			return;
		}
		for(int i=pos;i<len;i++)
		{
			str = swap(str,i,pos);
			permutations(str,pos+1);
			swap(str,i,pos);
		}
		
	}

	private static String swap(String str, int a, int b) {
		char array[]=str.toCharArray();
		char temp = array[a];
		array[a]=array[b];
		array[b]=temp;
		
		return new String(array);
	}
	
	
}
