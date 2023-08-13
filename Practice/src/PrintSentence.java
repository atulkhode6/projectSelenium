
public class PrintSentence {
	
	public static void main(String[] args) {
		
		String sen;
		
		sen="world is biggest";
		
		  sen=sen+" ";
		  
		  System.out.println("sentence is: "+sen);
		  
		  String word="";
		  String lg="";
		 char ch;
		  for(int i=0;i<sen.length();i++)
			  
		  {
			    
		       ch=sen.charAt(i);
			   if(ch!=' ')
			   {
				   
				   word=word+ch;
			   }
			   else 
			   
				  
				   {
					   System.out.print("  "+word);
					   
//					   if(word=="is")
//					   System.out.println();
					   lg=lg+word;
					   word="";
				   }
			
		  }
		  
		  System.out.println();
		  System.out.println("s1"+lg); 
		
	}
	
}


