package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input =121;
		int temp,rev=0,output;
		temp = input;
		while(temp > 0) {
			output = temp %10;
			rev = rev * 10 + output;
			temp = temp /10;
		}
		if(input == rev) {
			System.out.format("%d is Palindrome.", input);
		}
		else  {
			System.out.format("%d is Not.", input);
		}

}
}