
/**
 * A guess the password program.
 *
 * @author (Tomas Meskauskas)
 * @version (11/20/2018)
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "notvalid";
    
    
    static String obfuscate(String input) {
        return input.replace('n', 'y') .replace('o', 'e') .replace('t', 's') .concat("opposite_of_yesvalid");
    }
    public static void main(String [] args) {
        if (args.length != 1)
        {
            System.out.println("Wrong! You jave to run this program with one argument :\njava Reverse <argument>");
        }
        if (args[0] .equals (obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You win! Epic Gamer Moment!");
        }
        else
        {
            System.out.println("Password incorrect! Try again.");
        }
    }
}
