import java.util.Scanner;

class Input_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input
        String s = sc.nextLine();
        System.out.println("Entered string is : " + s);

        // Integer input
        int x = sc.nextInt();
        System.out.println("Entered integer is : " + x);

        // Character input
        char ch = sc.next().charAt(0);
        System.out.println("Entered character is : " + ch);

        // Float input
        float f = sc.nextFloat();
        System.out.println("Entered float value is : " + f);
    }
}