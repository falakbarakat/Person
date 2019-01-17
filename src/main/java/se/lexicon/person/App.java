package se.lexicon.person;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
       Scanner sc=new Scanner(System.in);
       String scelection=" ";
       boolean kepplooping=true;
       Person currentPerson=null;
       Person[] people=new Person[3];
       people[0]=new Person(1,"ulf","Bengtonsson",36);
       people[1]=new Person(2,"Erik","Barakat",41);
       people[2]=new Person(3,"Niclass","Barakat",45);
       
       while(kepplooping) {
    	   System.out.println("\n---status---\n"+
                              people.length+
                              "of 3 people in the list\n"+
                              "current selected person"+
                            		 
                              "\n---menu---\n"+
                              "List=list current names of people in the list\n"+
                              "Pick=pick a person from list"+
                              "nfo=print information about selected person "+
                              "Quit=exit the program\n"+
                              "choose a selection:");
    	       String  selection=sc.nextLine();
    	           System.out.println();
    	       switch(selection.toLowerCase()) {
    	         case "list":
    	        	 listpeople(people);
    	        	 break;
    	         case "pick":
    	        	 currentPerson=pickPerson(people);
    	        	 break;
    	        case "info":
    	        	infoAboutPerson(currentPerson);
    	        	 break;
    	         case "quit":
    	        	 kepplooping=false;
    	        	 System.out.println("thanks");
    	        	 break;
    	        	 default:
    	        	 break ;
    	       }
    	       //end of while
       }
     //END OF MAIN  
    }       
    	     
         public static void listpeople(Person[]people) {
        	 for ( int i=0;i<people.length;i++) {
        		System.out.println((i+1)+": "+people[i]); 
        	 }
         }	 
         
         public static Person pickPerson(Person[]people) {
        	 Person person=null;
        	 boolean notAnyOnePicked=true;
        	 do {
        		 System.out.println(" list to pick from ");
        		 listpeople(people);
        		 System.out.println("please enter number");
        		 Scanner sc2=new Scanner(System.in);
        		 int pick=Integer.parseInt(sc2.nextLine());
        		      if (pick >= 1  && pick <=people.length) {
        			       notAnyOnePicked=false;
        			       person=people[pick-1];
        		      }
        		      else {
        			  System.out.println("not valid pick");
        		      }
        	 }    
        	  while(notAnyOnePicked);
                	       
          return person ;	  
        } 		 
       public static void infoAboutPerson(Person person){
        	
    	   if (person !=null) {
    		   person.information();
        	}
        	else {
        		System.out.println("you hav not picked any person ");
        	} 	
      
         }
       
                              
    }
       
          
    

