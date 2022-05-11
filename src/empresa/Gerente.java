package empresa;

public class Gerente extends PlantaPermanente {
private static final int VALOR_A�O_ANTIGUEDAD = 0;
private static double VALOR_HORA = 4000;
private static double VALOR_A�OS_ANTIGUEDAD = 4000;

	public Gerente(int horasTrabajadas, int cantHijos, boolean casado, int a�osDeAntiguedad) {
		super(horasTrabajadas, cantHijos, casado, a�osDeAntiguedad);
		// TODO Auto-generated constructor stub
	}
	@Override
public double getSalario () {
		return this.getA�osDeAntiguedad()*Gerente.VALOR_A�O_ANTIGUEDAD+super.getHorasTrabajadas()*Gerente.VALOR_HORA+super.getSalarioFamiliar();
}
	public static double getVALOR_A�OS_ANTIGUEDAD() {
		return VALOR_A�OS_ANTIGUEDAD;
	}
}
 