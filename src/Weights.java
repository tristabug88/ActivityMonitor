//Sara Clark
//COP2552.001
//Activity Monitor for people trying to maintain weight. 
import javax.swing.JOptionPane;
public class Weights {

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
			JOptionPane.showMessageDialog(null, "Time weight training: " + time + " minutes and calories consumed: " + calories);
		}
		private int getIntensity()			//gets intensity selected by user in input 
		{
			return intensity;
		}//end getIntensity
		
		private void getTime()
		{
			String t = JOptionPane.showInputDialog("Enter the time in minutes you spent weight training: ");
				
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
				calories = 3.7 * time;  
			}
			else if (getIntensity() == 2)
			{
				calories = 5.9 * time;  
			}
			else {
				JOptionPane.showMessageDialog(null, "error");
			}
		} //end calcCalories
			
		
}
