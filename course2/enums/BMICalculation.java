package ro.ase.course2.enums;

public enum BMICalculation {
	GIGEL (72.57f, 1.78f),
	DOREL (73, 1.80f),
	MARICICA (56, 1.62f);
	
	private final float greutate;
	private final float inaltime;

	BMICalculation(float g, float h) {
		this.greutate = g;
		this.inaltime = h;
	}
	
	public static void main(String[] args)
	{
		for(BMICalculation bmi: 
			BMICalculation.values())
			System.out.printf("BMI lui %s " +
					"este %f\n", bmi, 
					bmi.greutate/
					(bmi.inaltime*bmi.inaltime));
	}
}
