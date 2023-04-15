package aproject;
import javax.swing.JOptionPane;
public class ex61 {

	public static void main(String[] args) {
		int option =  JOptionPane.showConfirmDialog(null, "Do you want to change?");
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
		
		System.exit(0);
	}

}
