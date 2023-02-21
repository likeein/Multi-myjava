package chap11;

import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		//Integer [] arr = {5, 4, 2, 0, 1, 3};
		//ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(5, 4, 2, 0, 1, 3));
		System.out.println("list1 :" + list1);
		
		/*
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));*/

		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1,4)); 
		print(list1, list2);

		Collections.sort(list1, Collections.reverseOrder());	// list1�� list2�� �����Ѵ�.
		Collections.sort(list2, Collections.reverseOrder());	// Collections.sort(List l)
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));	
		print(list1, list2);
		
		//  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);

		/*
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);

		list2.set(3, "AA");
		print(list1, list2);

		*/
	} // main�� ��

	static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println();		
	}
} // class
