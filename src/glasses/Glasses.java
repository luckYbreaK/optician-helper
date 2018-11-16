package glasses;

public class Glasses {

	public static void main(String[] args) {

		Lenses gl1 = new Lenses("George", 30.0, 31.0, 54.0, 28.0, 16.0, 56.0);
		
		System.out.println("OD: " + gl1.getMonoOD() + " mm OS: " + gl1.getMonoOS() + 
				" mm PD: " + gl1.calcPD() + " mm");
		System.out.println("GCD: " + gl1.calcGCD() + " mm");
		System.out.println("MBS: " + gl1.calcMBS() + " mm");

	}

}
