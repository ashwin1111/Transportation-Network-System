import java.awt.Desktop;
import java.net.URI;
public class aaa {
public static void main(String args[])throws Exception
{String source="COIMBATORE";
String destination="chennai";
	Desktop d=Desktop.getDesktop();
	d.browse(new URI("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations="+ destination +"&departure_time=1541202457&traffic_model=best_guess&key=AIzaSyAFHbOtWE6m5VAgboDMdbpl0UDyvkpW9hY"));
	
}
}
