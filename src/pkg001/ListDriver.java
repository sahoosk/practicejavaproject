package pkg001;

public class ListDriver {
public static void main(String[] args) {
	
	List<String> glist = new List<>(3);
	glist.add("Rice");
	glist.add("Wheat");
	glist.add("Barley");
	
	System.out.println(glist.toString());
}
}
