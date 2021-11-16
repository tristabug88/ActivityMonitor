//Sara Clark
//COP2552.001
//Activity Monitor for people trying to maintain weight. 
import javax.swing.JOptionPane;
public class MenuLauncher {
	//main
	public static void main(String[] args) {
		String selection; 
		while (true)
		{
			//getInput returns the selection of the user 
			//main loop that will keep prompting the user 
			selection = getInput(); 
			selection(selection);
		}

	}// end main 
	
	//Activity Menu 
	public static String getInput()
	{
		//prompt the user to choose an activity
		String option = JOptionPane.showInputDialog("Activity Monitor\n\n"
				+ "Press 1 for Bicycle\n"
				+ "Press 2 for Running/Jogging\n"
				+ "Press 3 for Swimming\n"
				+ "Press 4 for Walking\n"
				+ "Press 5 for Weight Training\n"
				+ "Press 6 to exit\n\n");
		
		//if the user presses cancel 
		if (option == null)
			System.exit(1);
		
		//otherwise return option they chose
		return option; 									//option is returned to selection variable in main 
	}

	public static void selection(String select)			//select is the option the user chose 
	{
		//convert selection to an integer
		int s = 0; 
		try 
			{
			s = Integer.parseInt(select);
			}
		catch (NumberFormatException e)
			{
			System.out.println("Invalid Input");
			}
	
		//instantiate an object of the Input Class 	
		//gives access to the set methods in Input Class 
		Input i = new Input();
		
		//menu selection
		//instantiate an object of the shape chosen and call it's driver 
		if (s == 1)							
			{Bicycle b = new Bicycle(); 
			b.driver(i); }
		else if (s == 2)
		{
			Run r = new Run(); 
			r.driver(i);
		}
		else if (s == 3)
		{
			Swim swim = new Swim(); 
			swim.driver(i);
		}
		else if (s==4)
		{
			Walk w = new Walk(); 
			w.driver(i);
		}
		else if (s==5)
		{
			Weights weight = new Weights(); 
			weight.driver(i);
		}
		else if (s == 6)
			{ExitProgram exit = new ExitProgram(); 
			exit.driver();}
	}//end selection		
	
}//end menulauncher
