import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> aLOI = new ArrayList<Integer>();
		aLOI.add(40);
		aLOI.add(0, 13);
		System.out.println(aLOI.size());
		int nr = 40;		
		System.out.println(aLOI.contains(Integer.valueOf(nr)));
		int nr2 = aLOI.get(0);
		System.out.println(nr2);
		aLOI.add(566);
		aLOI.indexOf(Integer.valueOf(nr2));
		aLOI.add(Integer.valueOf(nr));
		aLOI.lastIndexOf(40);
		aLOI.remove(1);
		aLOI.add(12);
		aLOI.remove(Integer.valueOf(nr));
		aLOI.clear();
		aLOI.add(444);
		aLOI.set(0, Integer.valueOf(nr2));
		aLOI.add(44);
		
		for (int i = 0; i < aLOI.size(); i++) {
			System.out.println(aLOI.get(i));
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(44, 32, 32, 55, 44, 230, 44, 100, 23, 100, 456));
		aLEx.freq(arr);
		



	}

}
