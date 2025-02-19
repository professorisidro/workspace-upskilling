package estudoString;

public class MainClass {
	public static void main(String[] args) {
		String s1 = new String("Oi, quer tc?");
		String s2 = new String("Oi, quer tc?");
		
		if (s1.equals(s2)) {
			System.out.println("Strings são iguais");
		}
		else {
			System.out.println("Strings são diferentes");
		}
		
		double d = 1.0d;
		long l = 1l;
		float x = 1.0F/2;
		System.out.println("valor de x = "+x);
	}
}
