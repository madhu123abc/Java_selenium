import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>mentors = Arrays.asList("Mukesh","Ravi","Raju","Rama");
		
		
		
				
		//Whenever you want quick list you use Arrays.asLIst Method
		//Another way is
		//System.out.println(mentors.get(0));
		List<String>mentorName =new ArrayList<>();
		mentorName.add("Mukesh");
		mentorName.add("Rajini");
		mentorName.add("Hari");
		mentorName.add("Ravi");
		System.out.println(mentorName.remove(1));
		System.out.println("&&&&&&&&");
		System.out.println(mentorName.remove("Ravi"));
		System.out.println(mentorName.contains("Mukesh"));
		System.out.println(mentorName.isEmpty());
		for(int i=0;i<mentorName.size();i++) {
			System.out.println(mentorName.get(i));
		}
		System.out.println("*******");
		//for each//
		for(String names :mentors)
		{
			System.out.println(names);
		}
		
		//System.out.println(mentorName.get(3));
		
	List<String>employeeNames =Arrays.asList("Dinesh","Madhavi","Adi","Rohan");
		System.out.println(employeeNames.get(0));
		
	
	
	
	       Iterator<String>  itr = employeeNames.iterator();
	              while(itr.hasNext()) {
	            	 String eNames =itr.next();
	            	 System.out.println(eNames);
	            	 
	              }
	
    List<Double>score	=Arrays.asList(89.5,78.4,79.3,67.2,56.1);
     System.out.println(score.get(1));
	   System.out.println(score); 
	   //How to add employeeNames in old List
	   mentorName.addAll(employeeNames);
	   System.out.println(mentorName);
	
	     //Iterator<Double>itr2 =score.iterator();{  
	    	// while(itr2.hasNext()) {
	    	//	Double s =itr2.next();
	    	//	System.out.println(s);
	    	// }
	    
	   List<String>mentorNames =new ArrayList<>();
		mentorNames.add("Ravi Raj");
		mentorNames.add("RajiniKanth");
		mentorNames.add("Harinadh");
		mentorNames.add("Ravikanth");
	   
	   Iterator<String>itr9 =mentorNames.iterator();{
		   while(itr9.hasNext()) {
			String l   =itr9.next();
			System.out.println(l);
		   }
	   }
	   mentorName.add("RaviRaj");
	   mentorName.add("RajiniKanth");
	   mentorName.add("Harinadh");
	   mentorName.add("Ravikanth");
	   System.out.println(mentorName);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    		 
	     }
	
	
	
	
	}
	
