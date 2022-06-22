package open_bootcamp.Persona_sesion21;

public class TrabajadorBuilder {
    Trabajador trabajador;

    public TrabajadorBuilder(String snombre) {
        trabajador = new Trabajador();
        trabajador.setSnombre(snombre);
    }
    public TrabajadorBuilder setEdad(int iedad) {
        trabajador.setIedad(iedad);
        return this;
    }
    public TrabajadorBuilder setTelefono(String snumTelefonico) {
        trabajador.setTelefono(snumTelefonico);
        return this;
    }
    public TrabajadorBuilder setDsalario(double cuantoSalario) {
        trabajador.setDsalario(cuantoSalario);
        return this;
    }
    public TrabajadorBuilder setAumentoSalarial1(boolean aumentoSalarial1) {
        trabajador.setAumentoSalarial1(aumentoSalarial1);
        return this;
    }

    public TrabajadorBuilder setAumentoSalarial2(boolean aumentoSalarial2) {
        trabajador.setAumentoSalarial2(aumentoSalarial2);
        return this;
    }

    public Trabajador build(){
        return this.trabajador;
    }
}
