package empresa;

public class Gerente extends PlantaPermanente {
private static final int VALOR_AÑO_ANTIGUEDAD = 0;
private static double VALOR_HORA = 4000;
private static double VALOR_AÑOS_ANTIGUEDAD = 4000;

	public Gerente(int horasTrabajadas, int cantHijos, boolean casado, int añosDeAntiguedad) {
		super(horasTrabajadas, cantHijos, casado, añosDeAntiguedad);
		// TODO Auto-generated constructor stub
	}
	@Override
public double getSalario () {
		return this.getAñosDeAntiguedad()*Gerente.VALOR_AÑO_ANTIGUEDAD+super.getHorasTrabajadas()*Gerente.VALOR_HORA+super.getSalarioFamiliar();
}
	public static double getVALOR_AÑOS_ANTIGUEDAD() {
		return VALOR_AÑOS_ANTIGUEDAD;
	}
}
 