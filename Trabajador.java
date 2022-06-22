package open_bootcamp.Persona_sesion21;

public class Trabajador extends Persona {
	public double dsalario;
	public boolean aumentoSalarial1 = false;
	public boolean aumentoSalarial2 = false;

	public Trabajador() {
		super();
	}

	public void setSnombre(String snombre) {
		this.snombre = snombre;
	}

	public void setIedad(int iedad) {
		this.iedad = iedad;
	}

	public void setTelefono(String snumTelefonico) {
		this.snumTelefonico = snumTelefonico;
	}

	public void setDsalario(double dsalario) {
		this.dsalario = dsalario;
	}

	public void setAumentoSalarial1(boolean aumentoSalarial1) {
		this.aumentoSalarial1 = aumentoSalarial1;
	}
	public void setAumentoSalarial2(boolean aumentoSalarial2) {
		this.aumentoSalarial2 = aumentoSalarial2;
	}

	@Override
	public String toString() {
		return "Trabajador{" +
				"snombre='" + snombre + '\'' +
				", iedad=" + iedad +
				", snumTelefonico='" + snumTelefonico + '\'' +
				", dsalario=" + dsalario +
				'}';
	}

	public void determinarAumentoSalarial (double dsalario, double salarioBase){
		this.dsalario = dsalario;

		if(dsalario == salarioBase){
			this.aumentoSalarial1 = true;
			System.out.println("Requiere el primer aumento");

		} else if(dsalario > salarioBase) {
			this.aumentoSalarial2 = true;
			System.out.println("Requiere el segundo aumento");
		}
	}

	public void subirSalario(boolean aumentoSalarial1, boolean aumentoSalarial2, double salario1,
							 double salario2) {
		this.aumentoSalarial1 = aumentoSalarial1;
		this.aumentoSalarial2 = aumentoSalarial2;

		if(aumentoSalarial1){
			this.dsalario += salario1;
		}else if(aumentoSalarial2){
			this.dsalario += salario2;
		}else
			System.out.println("No requiere nuevo aumento");
	}

	@Override
	public String cobrarSalario() {
		return "El trabajador cobró su salario el mes corriente";
	}

	@Override
	public String pagarCompras() {
		return null;
	}
}
