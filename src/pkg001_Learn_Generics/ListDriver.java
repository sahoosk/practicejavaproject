package pkg001_Learn_Generics;

public class ListDriver {
public static void main(String[] args) {
	
	List<String> glist = new List<>(3);
	glist.add("Riceeeeee");
	glist.add("Wheattttttt");
	glist.add("Barley");
	
	System.out.println(glist.toString());
}
}
