package week1.day2;

public class IsPrime {
	    public static void main(String[] args) {
	        int number = 101;
	            for (int i = 2; i <= number-1; i++) 
	            {
	                if (number % i == 0) 
	                {
	                   System.out.println((number + " is not a prime number."));
	                	break;
	                }
	        else 
	        {
	            System.out.println(number + " is a prime number.");
	            break;
	        }
	            }
	            
	    }
}
