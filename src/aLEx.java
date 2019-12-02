import java.util.ArrayList;
import java.util.Arrays;

public class aLEx {
	public static void freq(ArrayList<Integer> arrL){
		ArrayList<Integer> arrI = new ArrayList<Integer>();		
		int count = 1;
		for(int i = 0; i < arrL.size() ; i++) {	
			int cnt2 = 1;
			for(int j = i + 1; i < arrL.size() - 1 ; i++) {
				if(arrL.get(i).equals(arrL.get(j))) {
				cnt2++;				
				}
				
						
				
				
			}
		if(cnt2 > count) {
			count = cnt2;
			arrI.add(arrL.get(i));
			}
			if(cnt2 == count) {
				arrI.add(arrL.get(i));
			}
		}
		
		for(int i = 0; i < arrI.size(); i++) {
			System.out.println(arrI.get(i) + " de " + count + " ori");
		}
		
		
	}
		
	

}
