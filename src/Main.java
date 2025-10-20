import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        watch watch1 = new watch(12, 30, 15);
        watch1.display();
        System.out.print("Do you want to change the time?(type yes to change the time): ");
        String choice = input.nextLine();
        if (choice.equals("yes")) {
            System.out.print("Hour: ");
            int hour = input.nextInt();
            System.out.print("Minute: ");
            int minute = input.nextInt();
            System.out.print("Seconds: ");
            int seconds = input.nextInt();
            watch1.setHour(hour);
            watch1.setMinute(minute);
            watch1.setSeconds(seconds);
            watch1.display();
        }

        watch watch2 = new watch(0,0,0);
        watch watch3 = new watch(6, 5);
        watch2.display();
        watch3.display();
    }
}