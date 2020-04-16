package april16.A;

public class Common_elements_in_2Arrays {
	public static void main(String arg[]) {
		int arr[]= {1,4,2,6,-1,10};
		int arr2[]= {3,4,-1,7,8};
		
		for(int n1:arr)
		{
			for(int n2:arr2)
			{
				if(n1==n2)
					System.out.println(n1);
			}
		}
	}
}
