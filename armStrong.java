import java.util.Scanner;

public class ArmStrong {

	public void getdata(int num) {

		int sum = 0;

		int temp = num;

		while (num > 0) {

			int a = num % 10;
			num = num / 10;

			sum = sum + (a * a * a);
		}

		if (temp == sum) {

			System.out.println("number is armstrong");
		}

		else {
			System.out.println("number is not armstrong");
		}
	}

	public static void main(String[] args) {

		ArmStrong_WhileLoops obj = new ArmStrong_WhileLoops();
		System.out.println("Please enter a number to check armstrong");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		obj.getdata(num);
	}

}
