//Sara Clark
//COP2552.001
//Activity Monitor for people trying to maintain weight. 
import javax.swing.JOptionPane;
public class Input {
	public int setIntensity()
	{
		//prompt user for intensity 
		String intense = JOptionPane.showInputDialog("Your Workout Intensity\n\n"
				+ "Press 1 for Moderate\n"
				+ "Press 2 for Vigorous\n\n");

				//if the user presses cancel 
				if (intense == null)
					System.exit(1);
		try {
				int intensity = Integer.parseInt(intense); 
				return intensity; 
			}
		catch (NumberFormatException e)
			{
				System.out.println("Invalid Input");
				return 0; 
			}
						
	}//end setIntensity
	
} //end Input
