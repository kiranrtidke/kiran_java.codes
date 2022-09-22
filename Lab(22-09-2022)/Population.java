package LAB_22092022;

public class Population {

	public static void main(String[] args) {
		
		double p1,p2;
		
		p1 = 175000;
		p2 = 262500;
		
		double decade = 10;
		
		double equation = p2-p1;
		double percent = equation/p1*100;
		
		double perpopulation = percent/decade;
		
		System.out.println("Average percent increase population per year is "+perpopulation+" %");
		
		

	}

}
