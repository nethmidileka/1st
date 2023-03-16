import java.util.Scanner;

public class love_cal{
	

private static int findsum(int no)
{
	int sum=0;
	
	while(no >0)
	{
		sum+= no%10;
		no/=10;
	}
	
	return sum;
}	
	
	

public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	
	final String LOVE ="love";
	
	String fname;
	String sname;
	
	int fsum;
	int ssum;
	int lovesum;
	int totalsum;
	
	while(true)
	{
		System.out.println("________LOVE CALCULATOR__________");
		
		System.out.print("ENTER YOUR NAME:");
		fname=sc.nextLine();
		
		if(fname.isEmpty()) 
		{
			System.out.println("oh!please enter your name");
		}
		
		System.out.print("ENTER YOUR LOVER'S NAME:");
		sname=sc.nextLine();
		
		fsum=0;
		ssum=0;
		lovesum=0;
		
		fname=fname.toLowerCase();
	    sname=sname.toLowerCase();

	     for (var i = 0; i < fname.length(); i++) 
		    {
                fsum += fname.charAt(i);
            }

        for (var i = 0; i < sname.length(); i++)
			{
                ssum += sname.charAt(i);
            }


		for (var i = 0; i < LOVE.length(); i++) 
		    { lovesum += LOVE.charAt(i); 
		
		    } 
		    
			totalsum = findsum(fsum + ssum);
      		lovesum = findsum(lovesum); 
			
			if (totalsum > lovesum) 
			{
                totalsum = lovesum - (totalsum - lovesum);
            }
			
			System.out.println("Love : " + (totalsum * 100 / lovesum)+"%");

	}
	
	
	
}
}