package Lab_290922;

public class Android_Main {

	public static void main(String[] args) {
		
		Android a1 = new Android(5.6, 6, "Green");
		Android a2 = new Android(6.2, 4, "Red");
		Android a3 = new Android(5.5, 8, "Yellow");

		
		Android[] arr = new Android[3];
		
		arr[0]= a1;
	    arr[1]= a2;
		arr[2]=	a3;
		
		for(Android a : arr)
		{
		
			System.out.println("Display: " + a.Display + " ram : "+ a.Ram + "     and color: "+ a.Color);

		}
		 
		
	}

}
