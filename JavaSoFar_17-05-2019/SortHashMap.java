import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Iterator;


class SortHashMap	{
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("B", 2);
		hm.put("D", 4);
		hm.put("E", 5);
		hm.put("c", 3);
		hm.put("A", 1);

		List list1 = SortHashMap.val(hm);
		Iterator it = list1.iterator();
		while (it.hasNext())	
			System.out.println("value: " + it.next());
	}

	public static List val(HashMap hm)	{
		Set set = hm.entrySet();
		ArrayList list2 = new ArrayList();

		for(Object obj: set)	{
			Map.Entry mapEntry = (Map.Entry)obj;
			list2.add(mapEntry.getValue());
		}

		Collections.sort(list2);
		return list2;
	}
}