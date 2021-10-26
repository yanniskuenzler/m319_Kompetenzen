import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie ihren Satz ein");
        String rawinput = sc.nextLine();

        String input[] = rawinput.split("\\W");

        System.out.println("Enter your search word:");
        String searchword = sc.nextLine();

        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (searchword.equals(input[i])) {count++;}
        }

        System.out.println("Found the word " + count + " times");
    }
}
