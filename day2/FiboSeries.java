package week1.day2;

public class FiboSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a+System.lineSeparator()+b);
		for(int i = 2;i<=13;i++)
		{
		 int fibo=a+b;
		 System.out.println(fibo);
		 a=b;
		 b=fibo;
		}
	}

}
