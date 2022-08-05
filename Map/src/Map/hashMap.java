package Map;

import java.util.Map;
import java.util.TreeMap;

public class hashMap {
	
	public static void main(String[] args) {
		
		String input="chaitanyap";
		
		Map<Character, Integer> map=new TreeMap<>();
		
		for(int i=0;i<input.length();i++)
		{
			if(map.containsKey(input.charAt(i)))
			{
				map.put(input.charAt(i), map.get(input.charAt(i))+1);
			}
			else
			{
				map.put(input.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> tempMap : map.entrySet() )
		{
			if(tempMap.getValue()==1)
			{
				System.out.println(tempMap.getKey());
			}
			else
			{
				continue;
			}
			
		}
		
		
	}

}
