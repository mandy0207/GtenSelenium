package javaBasics;

import java.util.ArrayList;

public class LearnBasics {

	public static void main(String[] args) {
		
		String name1= "Mandy";
		String name2= "Mandy";
		String name3= new String("Mandy");
		
		ArrayList<String> nameList= new ArrayList<String>();
		
		nameList.add(name1);
        nameList.add(name2);
    
     System.out.println(name1.equals(name2));
     System.out.println(name1==name2);
     System.out.println(name1==name3);
     System.out.println(name1.equals(name3));
	}

}
