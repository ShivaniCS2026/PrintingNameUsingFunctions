import java.util.*;

public class Functions {
    // Pass the name as a parameter to the static method
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name); // Calling the function from inside main
        sc.close();
    }
}
