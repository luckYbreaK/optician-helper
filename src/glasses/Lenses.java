package glasses;

public class Lenses extends Frame {

	private String material;
	private double ior;
	private boolean scratch;
	private boolean uv;
	private boolean ar;
	private boolean transition;

	Lenses(String name, double monoOD, double monoOS, 
			double a, double b, double dbl, double ed) {
		super(name, monoOD, monoOS, a, b, dbl, ed);
	}
	
	public String getMaterial() {
		return material;
	}

	public double getIor() {
		return ior;
	}

	public boolean isScratch() {
		return scratch;
	}

	public boolean isUv() {
		return uv;
	}

	public boolean isAr() {
		return ar;
	}

	public boolean isTransition() {
		return transition;
	}
}
