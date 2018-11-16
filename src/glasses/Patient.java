package glasses;

public class Patient {

	private String name;
	private double monoOD;
	private double monoOS;
	
	Patient(String name, double monoOD, double monoOS) {
		this.name = name;
		this.monoOD = monoOD;
		this.monoOS = monoOS;
	}
	
	double calcPD() {
		return monoOD + monoOS;
	}
	
	public String getName() {
		return name;
	}
	public double getMonoOD() {
		return monoOD;
	}
	public double getMonoOS() {
		return monoOS;
	}
}
