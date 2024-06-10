import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		/*
		for(String arg : args){
			System.out.print(arg + " ");
		}
		System.out.println();
		*/
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Input two integer numbers and press ENTER:");
			try{
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int res;
				res = num1+num2;
				System.out.println(num1 + " + " + num2 + " = " + res);
				res = num1-num2;
				System.out.println(num1 + " - " + num2 + " = " + res);
				res = num1*num2;
				System.out.println(num1 + " * " + num2 + " = " + res);
				if (num2 != 0)
				{
					float res1 = (float)num1/(float)num2;
					System.out.println(num1 + " / " + num2 + " = " + res1);
				}
				break;
			} catch (Exception e)
			{
				System.out.println("Wrong input, please try again.");
				sc.nextLine();
			}
		}
	}
}