import javax.swing.JOptionPane;

public class L9{


    public static void main(String[] args) {

       String firstName;
       String lastName;

       firstName = JOptionPane.showInputDialog("what is your first name?");
       lastName = JOptionPane.showInputDialog("what is your last name?");





        JOptionPane.showMessageDialog(null, "hello " + firstName + " " + lastName + "!!");



        //All input is received as a string

        // pro tip: VARIABLES OF THE SAME DATA-TYPE CAN BE SEPARATED WITH A COMMA IN THE DECLARATION

        int mph, minutes;
        double distance, hours;

        mph = Integer.parseInt(JOptionPane.showInputDialog("how fast were you travelling (in MPH) ?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("how long, in minutes, were you travelling?"));

        hours = minutes/60.0;

        distance = mph * hours;

        JOptionPane.showMessageDialog(null, "you travelled " + distance + "miles.");
        System.exit(0);

    }
}
