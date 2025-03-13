//https://www.geeksforgeeks.org/check-if-the-given-string-is-linear-or-not/?ref=ml_lbp
import java.util.*;

class Linear_string{

static boolean is_linear(String s)
{
	int tmp = 0;
	char first = s.charAt(0);

	// Iterate over string
	for(int pos = 0; pos < s.length(); 
			pos += tmp)
	{
		
		// If character is not same as
		// the first character then
		// return false
		if (s.charAt(pos) != first)
		{
			return false;
		}
		
		
		tmp++;
	}
	return true;
}

public static void main(String[] args)
{
	
	
	String str = "aapaxyayziabcde";

	// Function call
	if (is_linear(str)) 
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
}
}

