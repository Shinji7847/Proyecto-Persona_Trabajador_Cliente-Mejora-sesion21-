package open_bootcamp.Persona_sesion21;

abstract class Persona {
	public String snombre;
	public int iedad;
	public String snumTelefonico;

	public Persona(){}

	abstract public String cobrarSalario();

    abstract public String pagarCompras();
}