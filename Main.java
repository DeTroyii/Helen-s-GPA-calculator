import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Troy's GPA calculator");
        System.out.println("How many courses are you registering: ");
        int noofcourses = input.nextInt(), i = 0;

        Gpaguide [] courses = new Gpaguide [noofcourses];

        while (i < noofcourses){
            input = new Scanner(System.in);
            Gpaguide newentry = new Gpaguide();

            input = new Scanner(System.in);
            System.out.println("Enter the course code: ");
            newentry.setCoursecode(input.nextLine());

            input = new Scanner(System.in);
            System.out.println("Enter the course unit: ");
            newentry.setCourseunit(input.nextInt());

            input = new Scanner(System.in);
            System.out.println("Enter the course score: ");
            newentry.setCoursescore(input.nextInt());

            courses[i] = newentry;
            i++;
        }
        Printoutguide print = new Printoutguide();
        print.printfiletable(courses);
    }
}