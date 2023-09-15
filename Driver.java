package uniqueString;

public class Driver
{

	public static void main(String[] args)
	{
	    System.out.println(uniqueString("abby"));
	    //uniqueString("abby");
	}
	
	public static Boolean uniqueString(String s)
	{
	    Boolean unique = true;
	    String map = "abcdefghijklmnopqrstuvwxyz";
		int[] zeros = new int[26];
		
		for(int i = 0; i < zeros.length; i++) //filling the zeros array
		{
			zeros[i] = 0;
		}
		
		for(int i = 0; i < s.length(); i++) //incrementing zeros array based on position of letter
		{
		    for(int j = 0; j < map.length(); j++)
		    {
		        if(s.charAt(i) == map.charAt(j)) //the letter in index i of string is checked with every char of map
		        {
    		        zeros[j] = zeros[j] + 1;
    		        //System.out.println(zeros[j]);
		        }
		    }
		    
		}
		for(int i = 0; i < zeros.length; i++)
		{
		    //System.out.println(zeros[i]); 
		    if(zeros[i] >= 2)
    		{
    		    unique = false;
    		    //System.out.println(unique);
    		    break;
    		}
		}
		//System.out.println(unique);
        return unique;
	}

}
