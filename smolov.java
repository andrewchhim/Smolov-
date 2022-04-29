import java.util.Scanner;

public class smolov {
    public static void main(String[] args) {
        //Input from user
        Scanner input = new Scanner(System.in);
        //Prompt user
        System.out.println("Enter your max weight: ");
        int max = input.nextInt();

        //Menu selection
        System.out.println("\nWhich week are you on?");
        System.out.println("\nWeek 1\nWeek 2\nWeek 3\nWeek 4");
        System.out.println("\nEnter answer here: ");
        int weekItemSelection = input.nextInt();
//Each week calculates weights for fixed sets and reps based on max inputted by user
        //WEEK 1
        if (weekItemSelection == 1) {
            System.out.println("Week 1");
            //Specific day
            System.out.println("\nWhat day are you on?");
            System.out.println("\n1- Monday\n2- Wednesday\n3- Friday\n4- Saturday");
            System.out.println("\nEnter answer here: ");
            int week1ItemSelection = input.nextInt();

            if (week1ItemSelection == 1) {
                System.out.println("Monday's workout is:");
                System.out.printf("%d\n", (max * 70) / 100);
                System.out.println("\nDo nine reps for four sets");
            }
            if (week1ItemSelection == 2) {
                System.out.println("Wednesday's workout is:");
                System.out.printf("%d\n", (max * 75) / 100);
                System.out.println("Do seven reps for five sets");
            }
            if (week1ItemSelection == 3) {
                System.out.println("Friday's workout is:");
                System.out.printf("%d\n", (max * 80) / 100);
                System.out.println("Do five reps for seven sets");
            }
            if (week1ItemSelection == 4) {
                System.out.println("Saturday's workout is:");
                System.out.printf("%d\n", (max * 85) / 100);
                System.out.println("Do three reps for ten sets");
            }
        }
        //WEEK 2
        if (weekItemSelection == 2) {
            System.out.println("Week 1");
            //Specific day
            System.out.println("\nWhat day are you on?");
            System.out.println("\n1- Monday\n2- Wednesday\n3- Friday\n4- Saturday");
            System.out.println("\nEnter answer here: ");
            int week2ItemSelection = input.nextInt();

            if (week2ItemSelection == 1) {
                System.out.println("Monday's workout is:");
                System.out.printf("%d\n", (max * 70) / 100 + 20);
                System.out.println("\nDo nine reps for four sets");
            }
            if (week2ItemSelection == 2) {
                System.out.println("Wednesday's workout is:");
                System.out.printf("%d\n", (max * 75) / 100 + 20);
                System.out.println("Do seven reps for five sets");
            }
            if (week2ItemSelection == 3) {
                System.out.println("Friday's workout is:");
                System.out.printf("%d\n", (max * 80) / 100 + 20);
                System.out.println("Do five reps for seven sets");
            }
            if (week2ItemSelection == 4) {
                System.out.println("Saturday's workout is:");
                System.out.printf("%d\n", (max * 85) / 100 + 20);
                System.out.println("Do three reps for ten sets");
            }
        }
        //WEEK 3
        if (weekItemSelection == 3) {
            System.out.println("Week 3");
            //Specific day
            System.out.println("\nWhat day are you on?");
            System.out.println("\n1- Monday\n2- Wednesday\n3- Friday\n4- Saturday");
            System.out.println("\nEnter answer here: ");
            int week3ItemSelection = input.nextInt();

            if (week3ItemSelection == 1) {
                System.out.println("Monday's workout is:");
                System.out.printf("%d\n", (max * 70) / 100 + 30);
                System.out.println("\nDo nine reps for four sets");
            }
            if (week3ItemSelection == 2) {
                System.out.println("Wednesday's workout is:");
                System.out.printf("%d\n", (max * 75) / 100 + 30);
                System.out.println("Do seven reps for five sets");
            }
            if (week3ItemSelection == 3) {
                System.out.println("Friday's workout is:");
                System.out.printf("%d\n", (max * 80) / 100 + 30);
                System.out.println("Do five reps for seven sets");
            }
            if (week3ItemSelection == 4) {
                System.out.println("Saturday's workout is:");
                System.out.printf("%d\n", (max * 85) / 100 + 30);
                System.out.println("Do three reps for ten sets");
            }
        }
        //WEEK 4
        if (weekItemSelection == 4) {
            System.out.println("Week 4");
            //Specific day
            System.out.println("\nWhat day are you on?");
            System.out.println("\n1- Monday\n2- Wednesday\n3- Friday\n4- Saturday");
            System.out.println("\nEnter answer here: ");
            int week4ItemSelection = input.nextInt();

            if (week4ItemSelection == 1) {
                System.out.println("Monday's workout is:");
                System.out.println("All you need to do is rest!");
            }
            if (week4ItemSelection == 2) {
                System.out.println("Wednesday's workout is:");
                System.out.println("All you need to do is rest!");
            }
            if (week4ItemSelection == 3) {
                System.out.println("Friday's workout is:");
                System.out.println("Work up to a near max single");
            }
            if (week4ItemSelection == 4) {
                System.out.println("Saturday's workout is:");
                System.out.println("Work up to a near max single");
            }
        }
        //Menu selection
        System.out.println("\nDo you want to view a weekly layout?");
        System.out.println("\n1- Yes\n2- No");
        System.out.println("\nEnter answer here: ");
        int menuItemSelection = input.nextInt();
        if (menuItemSelection == 1) {

            //WEEK 1
            System.out.println("Week 1");
            //days of the week
            System.out.println("Monday\t\tWednesday\t\tFriday\t\tSaturday");
            //dividing by 100 to get correct weight without using double
            System.out.printf("%d\t\t\t%d\t\t\t\t%d\t\t\t%d\t\t\t", (max * 70) / 100, (max * 75) / 100, (max * 80) / 100, (max * 85) / 100);

            //WEEK 2
            System.out.println("\n\nWeek 2");
            //days of the week
            System.out.println("Monday\t\tWednesday\t\tFriday\t\tSaturday");
            //dividing by 100 to get correct weight without using double
            System.out.printf("%d\t\t\t%d\t\t\t\t%d\t\t\t%d\t\t\t", (max * 70) / 100 + 20, (max * 75) / 100 + 20, (max * 80) / 100 + 20, (max * 85) / 100 + 20);

            //WEEK 3
            System.out.println("\n\nWeek 3");
            //days of the week
            System.out.println("Monday\t\tWednesday\t\tFriday\t\tSaturday");
            //dividing by 100 to get correct weight without using double
            System.out.printf("%d\t\t\t%d\t\t\t\t%d\t\t\t%d\t\t\t", (max * 70) / 100 + 30, (max * 75) / 100 + 30, (max * 80) / 100 + 30, (max * 85) / 100 + 30);

            //WEEK 4
            System.out.println("\n\nWeek 4");
            //days of the week
            System.out.println("Monday\t\tWednesday\t\tFriday\t\tSaturday");
            //dividing by 100 to get correct weight without using double
            System.out.println("Rest\t\tRest\t\tWork up to a near max single\t\tWork up to a near max single");
        }
        if (menuItemSelection == 2) {
            System.out.println("Ok!");
        }
    }
}
