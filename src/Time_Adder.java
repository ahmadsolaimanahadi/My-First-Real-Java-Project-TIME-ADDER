import java.util.Scanner;

public class Time_Adder {

	public static void main(String[] args) {
		// start with scanner...
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter current Hour: ");
		int currentHour = scan.nextInt();

		// Set up the time zone...
		System.out.println("Enter current Minute: ");
		int currentMinute = scan.nextInt();

		System.out.println("Enter current Second: ");
		int currentSecond = scan.nextInt();

		System.out.println("Enter Hour to go forward: ");
		int forwardHour = scan.nextInt();

		System.out.println("Enter Minute to go forward: ");
		int forwardMinute = scan.nextInt();

		System.out.println("Enter Second to go forward: ");
		int forwardSecond = scan.nextInt();
		int answerHour = 0, answerMinute = 0, answerSecond = 0;
		int carrySecond = 0, carryMinute = 0;
		boolean isNextDay = false;

		// set condition for second
		answerSecond = currentSecond + forwardSecond;
		if (answerSecond >= 60) {
			answerSecond -= 60;
			carrySecond = 1;
		}

		// set condition for minute
		answerMinute = currentMinute + forwardMinute + carrySecond;
		if (answerMinute >= 60) {
			answerMinute -= 60;
			carryMinute = 1;
		}

		// set condition for hour
		answerHour = currentHour + forwardHour + carryMinute;
		if (answerHour >= 24) {
			answerHour -= 24;
			isNextDay = true;
		}

		if (isNextDay) {
			System.out.println(
					"The answer is " + answerHour + ":" + answerMinute + ":" + answerSecond + " on the next day");
		} else {
			System.out.println("The answer is " + answerHour + ":" + answerMinute + ":" + answerSecond);
		}

	}
}