package glasses;

public class Frame extends Patient {

	private String identifier;
	private String type;
	private double a;
	private double b;
	private double dbl;
	private double ed;
	private double temple;

	Frame(String name, double monoOD, double monoOS, double a, 
			double b, double dbl, double ed){
		super(name, monoOD, monoOS);
		this.a = a;
		this.b = b;
		this.dbl = dbl;
		this.ed = ed;
	}
	
	double calcGCD() {
		return a + dbl;
	}
	
	double calcMBS() {
		return (calcGCD() - calcPD()) + ed;
	}

	public String getIdentifier() {
		return identifier;
	}
	public String getType() {
		return type;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getDBL() {
		return dbl;
	}
	public double getED() {
		return ed;
	}
	public double getTemple() {
		return temple;
	}
}
