package linkedlistPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class LinkedlistProgram {
	
	public static void main(String args[])
    {
        
		String ddmmyyyy1="28-02-2001";
		String ddmmyyyy2="30-07-1900";
		String ddmmyyyy3="28-02-2015";
		String ddmmyyyy4="02-01-2021";
		Date date1=null;
		try {
			date1 = new SimpleDateFormat("dd-MM-yyyy").parse(ddmmyyyy1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Date date2=null;
		try {
			date2 = new SimpleDateFormat("dd-MM-yyyy").parse(ddmmyyyy2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date3=null;
		try {
			date3 = new SimpleDateFormat("dd-MM-yyyy").parse(ddmmyyyy3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date4=null;
		try {
			date4 = new SimpleDateFormat("dd-MM-yyyy").parse(ddmmyyyy4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        LinkedList<Date> linkedlist
            = new LinkedList<Date>();
  
        // Adding elements to the linked list
        linkedlist.add(date1);
        linkedlist.add(date2);
        linkedlist.add(date3);
        linkedlist.add(date4);
        int i=linkedlist.size()-1;
        while(i>=0){
        	 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
        	    String strDate= formatter.format(linkedlist.get(i));  
            System.out.print("Your date of Birth is "+strDate + " ");
           int year=1900+linkedlist.get(i).getYear();  
            
            if(year%4==0)
            {
            	System.out.println("it was a leap year");
            }
            else
            {
            	System.out.println("It was not a leap year");
            }
            i--;    
        }
    }
	
}