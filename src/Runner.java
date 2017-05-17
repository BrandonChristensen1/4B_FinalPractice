import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		// Our initial template
		
		Runner myRunner = new Runner();
		Converter myConverter = new Converter();
		myRunner.welcome();
				

	}

	private void welcome() {
		JOptionPane.showMessageDialog(null, "Welcome to my Converter Program, created by Brandon");
		
	}

}
