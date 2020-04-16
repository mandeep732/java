package april16.A;

public class Common_Elements_in_String_2Array {
	public static void main(String arg[])
	{
		String arr1[]= {"ad","man","c","A"};
		String arr2[]= {"man","A","B"};
		
		for(String s1:arr1)
		{
			for(String s2:arr2)
			{
				if(s1.equals(s2))
					System.out.println(s1);
			}
		}
	}
}
