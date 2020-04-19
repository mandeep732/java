package april19.A;

public class secondHigest {
	public static void main(String arg[]) {
		int arr[]= {1,2,8,3,9,4};
		
		int h1=arr[0],h2=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>h2) {
				h2=arr[i];
				if(h2>h1)
				{
					int temp= h1;
					h1=h2;
					h2 =temp;
				}
			}
		}
		System.out.println(h1+" "+h2);
		
	}
}
