import java.util.*;

public class Calendar {
  
  public static void main(String[] args)
  {
    String location, priority, summary;
    int priorityNum;
    String sDate, sYear, sMonth, sDay;
    String eDate, eYear, eMonth, eDay; 
    String sTime, sHour, sMin; 
    String eTime, eHour, eMin;


    Scanner input = new Scanner(System.in);
	   try{
	    	
	    	System.out.print("Please Enter a start year: example 1997");
		    
		    sYear = input.nextLine();
		    
		    System.out.print("Please Enter a end year: example 1997");
		    
		    eYear = input.nextLine();
		    
		    System.out.print("Please Enter a start month in numbers: example 01 = January 02 = February");
		    
		    sMonth = input.nextLine();
		    
		    System.out.print("Please Enter a end month: example 01 = January 02 = February");
		    
		    eMonth = input.nextLine();
		    
		    System.out.println("Please Enter a start day in numbers: ");
		    
		    sDay = input.nextLine();
		    
		    System.out.println("Please Enter a end day in numbers: ");
		    
		    eDay = input.nextLine();
		    
		    System.out.println("Please Enter Event Location: ");
		    
		    location = input.nextLine();
		    
		    System.out.println("Please Enter a Summary of the Event: ");
		    
		    summary = input.nextLine();
		    
		    /*System.out.println("Please Enter Priority Number 1-9: 1 Being the most important and 9 being the least important ");
		    
		    priorityNum = input.nextInt();
		    input.nextLine();*/
		    
		    System.out.println("Please Enter a Start Hour 00-23 ");
		    
		    sHour = input.nextLine();
		    
		    System.out.println("Please Enter a End Hour 00-23 ");
		    
		    eHour = input.nextLine();
		    
		    System.out.println("Please Enter a Start Minute: 0 - 59 ");
		    
		    sMin = input.nextLine();
		    
		    System.out.println("Please Enter a End Minute: 0 - 59 ");
		    
		    eMin = input.nextLine();
		    
		    sDate = sYear + sMonth + sDay;
		    sTime = sHour + sMin;
		    
		    //System.out.println("You have Scheduled to " + summary + " at " + location + " from Year: " + sDate); 
		    //System.out.print(" to " + eDate + " with priority as " + priority);

		    
		    String sDateTime = "" + sYear + sMonth + sDay + "T" + sHour + sMin + "00";
		    String eDateTime = "" + eYear + eMonth + eDay + "T" + eHour + eMin + "00";
		    System.out.println(sDateTime);
		    
		    System.out.println(eDateTime);
		    
		    FileOutput outputFile = new FileOutput(location, summary, sDateTime, eDateTime);
		    outputFile.fo();
	    }catch(InputMismatchException ime){
	    	System.out.println("Wrong input: Entered letters when required of integers.");
	    }catch(NoSuchElementException nsee){
	    	System.out.println("Wrong input: Did not enter when required.");
	    }
      
  }

}
