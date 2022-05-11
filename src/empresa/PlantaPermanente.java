package empresa;

public class PlantaPermanente extends Empleado {
	protected int getA�osDeAntiguedad() {
		return a�osDeAntiguedad;
	}

	private int a�osDeAntiguedad;
	private static double VALOR_HORA= 3000;
	private static double VALOR_A�O_ANTIGUEDAD= 1000;

	public PlantaPermanente(int horasTrabajadas, int cantHijos, boolean casado,int a�osDeAntiguedad) {
		super(horasTrabajadas, cantHijos, casado);
		this.a�osDeAntiguedad=a�osDeAntiguedad;
	}

	@Override
	public double getSalario() {
		return this.a�osDeAntiguedad*PlantaPermanente.VALOR_A�O_ANTIGUEDAD+super.getHorasTrabajadas()*PlantaPermanente.VALOR_HORA+super.getSalarioFamiliar();
	}

}
