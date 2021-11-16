//Sara Clark
//COP2552.001
//Activity Monitor for people trying to maintain weight. 
import javax.swing.JOptionPane;
public class Run {
	
	//Variables
		private int intensity; 				//intensity selection
		private double calories;
		private int time; 
		
	//Methods
	//order of execution
		public void driver(Input i) //data type is Input 
		{
			intensity = i.setIntensity();
				getTime(); 
				calcCalories(); 
				JOptionPane.showMessageDialog(null, "Time running: " + time + " minutes and calories consumed: " + calories);
		}
		private int getIntensity()			//gets intensity selected by user in input 
			{
				return intensity;
			}//end getIntensity
		
		private void getTime()
		{
			String t = JOptionPane.showInputDialog("Enter the time in minutes you spent running/jogging: ");
				
				try {
					time = Integer.parseInt(t); 
				}
				catch (NumberFormatException e)
				{
					System.out.println("Invalid Input"); 
				}
		}//end getTime()
		private void calcCalories()
		{
			if (getIntensity() == 1)
			{
				calories = 12 * time; 
			}
			else if (getIntensity() == 2)
			{
				calories = 17 * time; 
			}
			else {
				JOptionPane.showMessageDialog(null, "error");
			}
		} //end calcCalories
		
		
		
}
