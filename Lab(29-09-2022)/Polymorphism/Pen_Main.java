package lab_Polymorphism;

public class Pen_Main {



		public static void main(String[] args) {
			
			Pen p1=new Cello();
			
			Pen p2=new Montex();
			
			p1.Brand();
			p1.Price();
			p1.Colour();
			
			System.out.println();
			
			p2.Brand();
			p2.Price();
			p2.Colour();
			
		}

	}

