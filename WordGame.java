import javax.swing.JOptionPane;

/* written by: Ricardo Zelante

   This program accepts user input and formulates
   a paragraph as output.
*/
public class WordGame {
    
    /** The main method is the program's starting point.
     */
    public static void main(String[] args) {
        
        String name, age, city, college, profession, animal, petsName;//variables that hold various user input
        
        
        name = JOptionPane.showInputDialog("Enter your name");//gets name from user input
        age = JOptionPane.showInputDialog("Enter your age");  //gets age from user input
        city = JOptionPane.showInputDialog("Enter your city");//gets city from user input
        college = JOptionPane.showInputDialog("Enter the name of your college");//gets college from user input
        profession = JOptionPane.showInputDialog("Enter the name of your profession");//gets profession from user input
        animal = JOptionPane.showInputDialog("Enter a type of animal");//gets animal from user input
        petsName = JOptionPane.showInputDialog("Enter a pets name");//gets pets name from user input
        
        
        /** The dialog box presents the finished output for this program.
         */
        JOptionPane.showMessageDialog(null,"There once was a person named " + name + 
                                            " who lived in " + city + ".\nAt the age of " 
                                            + age + ", " + name + " went to college at " 
                                            + college + ".\n" + name + " graduated and went to work as a " 
                                            + profession + ".\nThen, " + name + " adopted a(n) "
                                            + animal + " named " + petsName + ".\nThey both lived happily ever after!");
               
    }
    
}
