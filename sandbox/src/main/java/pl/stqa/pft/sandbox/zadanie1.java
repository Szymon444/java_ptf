package pl.stqa.pft.sandbox;

public class Zadanie1 {

		public static void main (String[] args) {

			hello("world");
			hello("Sim");

			Square s = new Square (5);
			System.out.println("Powierzchnia kwadratu z bokiem o długości " + s.l + " = " + area(s) );

			Rectangle r = new Rectangle (4, 6);
			System.out.println("Powierzchnia prostokątu z bokami o długościach  " + r.a + " i " + r.b + " = " + area(r) );
		}
		public static void hello (String somebody) {
			System.out.println("Hello " + somebody);
		}

		public static double area(Square s) {
			return s.l * s.l;
		}
		public static double area (Rectangle r) {
			return r.a * r.b;
		}
	}

