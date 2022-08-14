package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class Array {

	@Test
	public void Addall() {
		ArrayList<String> al = new ArrayList<>();
		al.add("abc");
		al.add("xyz");
		al.add("pqr");
		ArrayList<String> al2 = new ArrayList<>();
		al.add("fff");
		al.add("hhh");
		al.add("yyy");
		al.addAll(al2);
		System.out.println(al);
	}

	@Test
	public void Removell() {// common element remove

		ArrayList<String> al = new ArrayList<>();
		al.add("abc");
		al.add("xyz");
		al.add(null);
		al.add("pqr");
		al.add(null);

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("abc");
		al2.add("xyz");
		al2.add("yyy");
		// al.removeAll(al2);
		System.out.println(al);

		// o/p pqr
	}

	@Test
	public void retainAll() { // common element

		ArrayList<String> al = new ArrayList<>();
		al.add("abc");
		al.add("xyz");
		al.add("pqr");

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("abc");
		al2.add("xyz");
		al2.add("yyy");

		al.retainAll(al2);
		System.out.println(al);
		// o/p abc xyz
	}

	@Test
	public void duplicate() {

		ArrayList<String> al = new ArrayList<>();
		al.add("abc");
		al.add("abc");
		al.add("pqr");
		al.add("xyz");
		al.add("yyy");

		for (int i = 0; i < al.size(); i++) {
			String str = al.get(i);

			if (al.indexOf(str) == al.lastIndexOf(str)) {
				System.out.println(str);
			}
		}

	}

	@Test
	public void arraysAslist() {
		String arr[] = { "archana", "jadhav", "pawar" };
		List<String> list = Arrays.asList(arr);
		ArrayList<String> al = new ArrayList<>(list);
		ArrayList<Integer> al2 = new ArrayList<>();
		System.out.println(al);

	}

	@Test
	public void removeNameFromlist() {
		String arr[] = { "archana", "jadhav", "pawar", "archana", "archana" };

		List<String> list = Arrays.asList(arr);
		ArrayList<String> al = new ArrayList<>(list);
		int oriSize = al.size();
		// int index=al.indexOf("archana");
		// al.remove(index);
		while (al.contains("archana")) {
			int ind = al.indexOf("archana");
			al.remove(ind);

		}
		int newsize = al.size();
		System.out.println("occurance of archana in list " + (oriSize - newsize));
		System.out.println(al);

	}

	@Test
	public void removeAllNameFromlist() {
		String arr[] = { "archana", "jadhav", "pawar", "archana", "archana" };
		String arr2[] = { "archana" };

		ArrayList<String> newAl = new ArrayList<>(Arrays.asList(arr2));

		ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));

		al.removeAll(newAl);
		System.out.println(al);

	}

	@Test
	public void characterArray() {
		ArrayList<Character> alc = new ArrayList<>(Arrays.asList('a', 'B', 'c'));
		ArrayList<Character> al2 = new ArrayList<>();
		for (char ch : alc) {
			if (Character.isUpperCase(ch))

				System.out.println(ch);
		}

	}

	@Test
	public void hashSet() {

		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("a");
		System.out.println(hs.add("cbb"));
		hs.add("b");
		hs.add("A");
		System.out.println(hs.add("A"));
		System.out.println(hs);

		// Not work on index because it's not maintain insertion order

		for (String str : hs) {
			// hs.remove("A");
			// System.out.print(str);
		}

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String st = itr.next();
			if (st.startsWith("c"))
				itr.remove();

		}
		System.out.print("iterator " + hs + " ");
	}

	@Test
	public void linkHashSet() {
		// String str [] = {"archana","jadhav","pawar","archana","archana"};
		// LinkedHashSet<String> lHS= new LinkedHashSet<>(Arrays.asList(str));
		// System.out.println(lHS);
		//
		// char ch = 'D';
		// System.out.println((int)ch);
		//
		// char ch2 = 'd';
		// System.out.println((int)ch2);

		char ch = ' ';
		int space = ch;
		System.out.println(space);

		int a = 32;
		char ch1 = (char) a;
		System.out.println(ch1);

	}

	@Test
	public void hashMap() {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "archana");
		hm.put(2, "arch");
		hm.put(5, "archu");
		hm.put(3, "arc");

	}

	@Test
	public void hashMapFreqOfChar() {
		String str = "archanapawar";
		HashMap< Character,Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hm.containsKey(ch)) {
              int count = hm.get(ch);
               hm.put(ch,count+1);
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);

	}
	
	@Test
	public void hashMapFreqOfWord() {
		String str = "archana pawar archana pawar hi hello archana jadhav";
		String [] word = str.split(" ");
		HashMap< String,Integer> hm = new HashMap<>();
		for (int i = 0; i < word.length; i++) {
			String  strname = word[i];
			if (hm.containsKey(strname)) {
              int count = hm.get(strname);
               hm.put(strname,count+1);
			} else {
				hm.put(strname, 1);
			}
		}
		System.out.println(hm);

	}
	@Test
	public void hashMapFreqOfNum() {
		
		int [] num = {11,11,12,13,12,14,15,15,12,11,};
		HashMap< Integer,Integer> hm = new HashMap<>();
		for (int no : num) {			
			if (hm.containsKey(no)) {
              int count = hm.get(no);
               hm.put(no,count+1);
			} else {
				hm.put(no, 1);
			}
		}
		System.out.println(hm);

	}
	@Test
	public void hashMapIterateOne() {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "archana");
		hm.put(2, "arch");
		hm.put(5, "archu");
		hm.put(3, "arc");
		
		
	   Set<Integer> keys=hm.keySet();
	   for (Integer key : keys)
		    System.out.println(hm.get(key));	

	   //---------------------------------------------------;
	   
	   for (String val : hm.values())
		    System.out.println(val);	
	   
	}
	
	@Test
	public void hashMapIterateTwo() {
		Map<Integer,String> hm=new TreeMap<>();
		hm.put(1, "archana");
		hm.put(2, "arch");
		hm.put(5, "archu");
		hm.put(3, "arc");
		Set<Map.Entry<Integer, String>> ent = hm.entrySet();
		for (Map.Entry<Integer, String> entry : ent) {
			
			System.out.println(entry.getKey() +":"+entry.getValue());
		}		
	  
	   
	}
	@Test
	public void hashMapIterateThree() {
		Map<Integer,String> hm=new TreeMap<>();
		hm.put(1, "archana");
		hm.put(2, "arch");
		hm.put(5, "archu");
		hm.put(3, "arc");
		Iterator<Integer>itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			int val= itr.next();
			System.out.println(val);
		}		
		Iterator<String>itr2 = hm.values().iterator();
		while(itr2.hasNext()) {
			String val= itr2.next();
			System.out.println(val);
		}		
	   
	}
	
	@Test
	public void hashMapFreqOfNumSOX() {
		
		int [] num = {100,200,300,100,400,400,500,600,100,400,400};
		HashMap< Integer,Integer> hm = new HashMap<>();
		for (int no : num) {			
			if (hm.containsKey(no)) {
              int count = hm.get(no);
               hm.put(no,count+1);
			} else {
				hm.put(no, 1);
			}
		}		
		
		System.out.println(hm);
		
		int cnt = 0;
		for (int value : hm.values()) {
			cnt = cnt + (value / 2);
		}
		System.out.println(cnt);

	}
	
	@Test
	public void armStrongNo() {
		int n=153;int temp=0;int digit=0;int rem=0;int sum=0;
		while(temp>0){
			temp=temp/10;
			digit++;//3
			
		}
		temp=n;
		while(temp>0){
			rem=temp%10;
			//for(int i =0;i<digit;i++) {}
			//System.out.println(rem);
			sum+= (Math.pow(rem,digit));
			temp=temp/10;
		}
        if(n==sum)
		{			
		 System.out.println(sum + "is armstrong no program but not working properly");//B1
		 System.out.println(sum + "is armstrong no program but not working properly");//B1
        }
	}
	
}
