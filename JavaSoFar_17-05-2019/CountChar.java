import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class CountChar{
	

	public static HashMap countChar(char[] arr)	{
				HashMap<Character, Integer> hm = new HashMap();
						for(int i=0; i<arr.length; ++i)	{
							int newvalue;
								if(hm.get(Character.valueOf(arr[i])) == null)	{
									hm.put(Character.valueOf(arr[i]), 1);
							}
								else if((newvalue = hm.get(Character.valueOf(arr[i]))) > 0)	{
									hm.put(Character.valueOf(arr[i]), newvalue+1);
							}
						}
				return hm;
	}

	public static void main(String... args)	{
		System.out.print("Enter string: ");
		java.util.Scanner scan = new java.util.Scanner(System.in);

		HashMap<Character, Integer> hm = CountChar.countChar(scan.nextLine().toCharArray());
		Set set = hm.entrySet();

		for(Object obj: set)	{
			Map.Entry me = (Map.Entry)obj;
			System.out.println(me.getKey() + "=" + me.getValue());
		}
	}
}