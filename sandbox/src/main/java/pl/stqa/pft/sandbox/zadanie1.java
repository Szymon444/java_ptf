package pl.stqa.pft.sandbox;

public class zadanie1 {

		public static void main (String[] args) {

			hello("world");
			hello("Sim");

			double len = 5;
			double a = 4;
			double b = 6;
			System.out.println("Powierzchnia kwadratu z bokiem o długości " + len + " = " + area(len) );

			System.out.println("Powierzchnia prostokątu z bokami o długościach  " + a + " i " + b + " = " + area(a, b) );
		}
		public static void hello (String somebody) {
			System.out.println("Hello " + somebody);
		}

		public static double area(double l) {
			return l * l;
		}
		public static double area (double a, double b) {
			return a * b;
		}
	}

