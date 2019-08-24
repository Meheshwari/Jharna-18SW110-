
 1 +  import java.util.Scanner; 
 2 +  class InvalidAgeException extends Exception 
 3 +  { 
 4 +  	InvalidAgeException(String e) 
 5 +  	{ 
 6 +  	super(e); 
 7 +  	} 
 8 +  } 
 9 +  class VotingMachine 
 10 +  { 
 11 +  String names[]={"imran khan","nawaz sharif"}; 
 12 +  int votes[]=new int[2]; 
 13 +  		public void addCandidates(String names[]) 
 14 +  		{ 
 15 +  		names=names; 
 16 +  		} 
 17 +  		public void castVote(int voterAge,String name)throws InvalidAgeException 
 18 +  		{ 
 19 +  		try{ 
 20 +  		if(voterAge<18) 
 21 +  		{ 
 22 +  		throw new InvalidAgeException("YOU'RE NOT ELIGIBLE TO VOTE"); 
 23 +  		} 
 24 +  		} 
 25 +  		catch(InvalidAgeException i) 
 26 +  		{ 
 27 +  			System.out.println(i.getMessage()); 
 28 +  		} 
 29 +  		if(voterAge>=18) 
 30 +  		{ 
 31 +  		for(int i=0;i<names.length;i++) 
 32 +  			{ 
 33 +  			if(name==names[i]) 
 34 +  			votes[i]++; 
 35 +  			} 
 36 +  		} 
 37 +  		} 
 38 +  
 
 39 +  		public void printResults() 
 40 +  		{ 
 41 +  			for(int i=0;i<names.length;i++) 
 42 +  			{ 
 43 +  			System.out.println(names[i]+ " has received= "+ votes[i]+ " votes");  
 44 +  			} 
 45 +  		} 
 46 +  } 
 47 +  class InvalidAgeExceptionDemo 
 48 +  { 
 49 +  public static void main(String args[]) 
 50 +  	{ 
 51 +  		Scanner sc=new Scanner(System.in); 
 52 +  		InvalidAgeException i=new InvalidAgeException("YOU'RE NOT ELIGIBLE TO VOTE"); 
 53 +  		VotingMachine v=new VotingMachine(); 
 54 +  			//trying for above 18 age voters 
 55 +  		try{ 
 56 +  		v.castVote(18,"nawaz sharif"); 
 57 +  		v.castVote(19,"imran khan"); 
 58 +  		v.castVote(25,"imran khan");		 
 59 +  		} 
 60 +  		catch(InvalidAgeException a) 
 61 +  		{ 
 62 +  		System.out.println(a.getMessage());    //will show the message as passed in the constructor. 
 63 +  		} 
 64 +  		v.printResults(); 
 65 +  
 
 66 +  		System.out.println(); 
 67 +  		System.out.println(); 
 68 +  		//trying for age under 18 
 69 +  
 
 70 +  		try 
 71 +  		{ 
 72 +  		v.castVote(17,"nawaz sharif");	 
 73 +  		} 
 74 +  		catch(InvalidAgeException a) 
 75 +  		{ 
 76 +  		System.out.println(a.getMessage());    //will show the message as passed in the constructor. 
 77 +  		} 
 78 +  
 
 79 +  	} 
 80 +  }   
 
   



   









 



 




 



