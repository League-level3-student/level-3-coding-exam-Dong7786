import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		Object[] o1 = hashmap1.keySet().toArray();
		Object[] o2 = hashmap2.keySet().toArray();
		
		int equal = 0;
		for(int i = 0; i < hashmap1.size(); i++) {
			
			for(int h = 0; h < hashmap2.size(); h ++) {
				System.out.println(i+", "+h+ ", "+(hashmap2.size() -1));
				if(o1[i] == o2[h]) {
					
					if(hashmap1.get(o1[i]).equals(hashmap2.get(o2[h]))) {
						equal ++;
					}
					
					
				}
				
			}
		}
		
		return equal;
		
	}

	
}
