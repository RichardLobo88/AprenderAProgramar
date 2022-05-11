package empresa;

public class PlantaPermanente extends Empleado {
	protected int getAñosDeAntiguedad() {
		return añosDeAntiguedad;
	}

	private int añosDeAntiguedad;
	private static double VALOR_HORA= 3000;
	private static double VALOR_AÑO_ANTIGUEDAD= 1000;

	public PlantaPermanente(int horasTrabajadas, int cantHijos, boolean casado,int añosDeAntiguedad) {
		super(horasTrabajadas, cantHijos, casado);
		this.añosDeAntiguedad=añosDeAntiguedad;
	}

	@Override
	public double getSalario() {
		return this.añosDeAntiguedad*PlantaPermanente.VALOR_AÑO_ANTIGUEDAD+super.getHorasTrabajadas()*PlantaPermanente.VALOR_HORA+super.getSalarioFamiliar();
	}

}
