import java.util.Scanner;

public class Main {
    public static boolean isNumeric( String string ) {

        if (string == null || string.length() == 0) {
            return false;
        }
        for ( int i = 0; i < string.length(); i++ ) {
            if ( ! Character.isDigit( string.charAt( i ) ) ) {
                return false;
            }
        }
        return true;
    }


    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Please enter your Text");
            String test = sc.nextLine();
            boolean hasOnlyDigits = isNumeric( test );
            System.out.println( hasOnlyDigits ); //"1234" --> false
            boolean exitofexit = false;
            do {
                System.out.println("Do you want to exit? yes/no");
                String inputraw = sc.nextLine();
                if ( inputraw.equals("yes") || inputraw.equals("y") ) { exit = true; exitofexit = true; }
                else if ( inputraw.equals("no") || inputraw.equals("n") ) { exitofexit = true; }
                else { System.out.println("This wasnt an option"); }
            } while ( !exitofexit );
        } while ( !exit );
    }

}