class NonRepeat
{
	void nonRept(String str)
	{
		char []arr = str.toCharArray();
		int n = 0; 
		char c = 0;
		for(int i = 0; i < arr.length; i++)
		{
			n = 1;
			for(int j = 0; j < arr.length; j++)
			{
				if(i != j && arr[i] == arr[j])
				{
					n = 0;
				}
			}

			if(n == 1)
			{
				c = arr[i];
				break;
			}
		}

		System.out.println("  non repeating character is "+ c);
	}

	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		new NonRepeat().nonRept(str);
	}
}