//Sara Clark
//COP2552.001
//Activity Monitor for people trying to maintain weight. 
import javax.swing.JOptionPane;
public class Bicycle {
	
	//Variables
	private int intensity; 				
	private double bikeCal;
	private int bikeTime; 
	
	//Methods ************************************************************
	
	//order of execution
	public void driver(Input i) //data type is Input 
	{
		intensity = i.setIntensity();
		setTime();
		calcCalories(); 
		//debug:
		JOptionPane.showMessageDialog(null, "Time biking: " + bikeTime + " minutes and calories consumed: " + bikeCal);
			
	}
	
	//gets intensity selected by user in input 
	private int getIntensity()			
	{
		return intensity;
	}//end getIntensity
	
	//get time spent doing activity 
	private void setTime()
	{
		//local variable 
		String rad = JOptionPane.showInputDialog("Enter the time spent bicycling: "); 
		
		//convert to int
		try {
			bikeTime = Integer.parseInt(rad);
			}
		catch (NumberFormatException e)
		{
			System.out.println("Invalid input.");
			}
	}
	//calculate calories depending on intensity 
	private void calcCalories()
	{
		if (getIntensity() == 1)
		{
			bikeCal = 10 * bikeTime; 
		}
		else if (getIntensity() == 2)
		{
			bikeCal = 14.3 * bikeTime;  
		}
		else {
			JOptionPane.showMessageDialog(null, "error");
		}
	} //end calcCalories

} //end Bicycle
