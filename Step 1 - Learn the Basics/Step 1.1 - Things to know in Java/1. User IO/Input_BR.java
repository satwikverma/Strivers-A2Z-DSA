import java.io.*;

class Input_BR {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String input
        String s = br.readLine();
        System.out.println("Your String is : " + s);

        // Integer input
        int x = Integer.parseInt(br.readLine());
        System.out.println("Your integer is : " + x);
    }
}