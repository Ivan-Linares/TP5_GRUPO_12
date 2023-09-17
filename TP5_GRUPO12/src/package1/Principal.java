package package1;

public class Principal 
{

	public static void main(String[] args) 
	{
		try 
		{
			VentanaPricipal frame = new VentanaPricipal();
			frame.setVisible(true);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
