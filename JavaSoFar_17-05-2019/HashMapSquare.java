import java.util.*;

class HashMapSquare{
	public static void main(String... args)	{
		do{
				Scanner sc = new Scanner(System.in);
				SquareSetInMap ssm = new SquareSetInMap();
				System.out.println ("\nEnter the numbers you want to insert  ");
				int num =  sc.nextInt();
				int[] arr = new int[num];
				for(int i = 0; i < num; i++)
				{
					System.out.print("Enter the Number " + (i+1) + ": ");
					while (true) {
				        try {
				            	arr[i] = sc.nextInt();
				            	
				            break;
				        }
				        catch (InputMismatchException e) {

				        	System.out.print("Please Give the right Input: ");
				            sc.next();
						}
					}
				}

				HashMap<Integer, Integer> map = ssm.getMapOfSquares(arr);

				Set set = map.entrySet();

				for(Object obj: set)	{

					Map.Entry mapEntry = (Map.Entry)obj;
					System.out.println("[ " +mapEntry.getKey() + " : " + mapEntry.getValue() + " ]");

				}
		}while(true);
	}

	public static HashMap getMapOfSquares(int[] intArr)	{

		HashMap<Integer, Integer> hMap = new HashMap<>();

		for(int i: intArr){

			hMap.put(i, i*i);
		}
		return hMap;
	}
}