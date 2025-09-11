import java.util.*;

public class CourseFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get number of courses
        System.out.println("Enter no of course:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Check for valid range
        if (n <= 0 || n > 20) {
            System.out.println("Invalid Range");
            return; // stop program here
        }

        // Step 3: Input course names
        String[] courses = new String[n];
        System.out.println("Enter course names:");
        for (int i = 0; i < n; i++) {
            courses[i] = sc.nextLine();
        }

        // Step 4: Input course to search
        System.out.println("Enter the course to be searched:");
        String searchCourse = sc.nextLine();

        // Step 5: Search the course
        boolean found = false;
        for (String course : courses) {
            if (course.equalsIgnoreCase(searchCourse)) { // case-insensitive
                found = true;
                break;
            }
        }

        // Step 6: Display result
        if (found) {
            System.out.println(searchCourse + " course is available");
        } else {
            System.out.println(searchCourse + " course is not available");
        }

        sc.close();
    }
}
