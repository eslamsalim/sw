package Model;
import javax.swing.JOptionPane;

public class CheckInModel {

	public CheckInModel() {
		
	}

	public void SaveCheckin(String Text,PlaceModel place,UserModel user)
	{
		//ro7 el database w zwd b2a el shoghl da;
	}
	
	public void GetCheckin(String name)
	{
		PlaceModel p=new PlaceModel();
	if(p.found(name)==1)
	{
		//ed5ol el data base w dwr 3la el check in ale 7asl fl table chekin w table place;
	}
	else 
	{
		JOptionPane.showMessageDialog(null, " No Place with this name");

	}
		
	}
	public void UpdateCheckin(String name,String Text)
	{
		PlaceModel p=new PlaceModel();
	if(p.found(name)==1)
	{
		//lw mwgod fl database had5ol 3la el chekin ale ana 3amlo save w hyghyro;
	}
	else 
	{
		JOptionPane.showMessageDialog(null, " No Place with this name");

	}
	}
	
	
}
