import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class StergereDuplicari {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		String sir = input.nextLine();
		list1.add(sir);
		
		while(!list1.getLast().equals("STOP"))
		{
			sir = input.nextLine();
			list1.add(sir);
		}
		list1.removeLast();
		Iterator<String> it1 = list1.iterator();
		
		while(it1.hasNext())
		{
			String sir1 = it1.next();
			
			Iterator<String> it2 = list2.iterator();
			
			boolean seRepeta = false;
			
			while(it2.hasNext())
			{
				if(sir1.equals(it2.next()))
					seRepeta = true;
			}
			
			if(seRepeta==false)
				list2.add(sir1);
				
		}
		
		System.out.println(list1);
		System.out.println(list2); 

	}

}
