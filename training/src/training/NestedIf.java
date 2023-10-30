package training;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		int weight = 50;
		if(age>=18) {
			if(weight>=50) {
				System.out.println("Donate blood");
			}
		}
		else {
			System.out.println("Don't donate blood");
		}

	}

}
