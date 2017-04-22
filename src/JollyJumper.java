import java.util.*;

public class JollyJumper {

	public static void main(String[] args) 
	{
		Vector numList = new Vector();
		Vector diffList = new Vector();
		boolean jollyCheck = true;
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		numList.addElement(scan.nextInt());
		n = (int) numList.elementAt(0);
		//System.out.println(n); //debugging statement, meant to confirm initial input size
		numList.clear();
		for(int x = 0; x < n ; x++)
		{
			System.out.println("Enter the next number: ");
			numList.addElement(scan.nextInt());
		}
		for(int x = 0; x < n-1; x++)
		{
			diffList.addElement(Math.abs((int)numList.elementAt(x)- (int)numList.elementAt(x+1)));
		}
		for(int x = 1; x < n; x++)
		{
			if(!diffList.contains(x))
			{
				jollyCheck = false;
				break;
			}
		}
		if(jollyCheck)
			System.out.println("JOLLY");
		else
			System.out.println("NOT JOLLY");
	}

}
