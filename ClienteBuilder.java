package open_bootcamp.Persona_sesion21;

public class ClienteBuilder {
    Cliente cliente;

    public ClienteBuilder(String snombre) {
        cliente = new Cliente();
        cliente.setSnombre(snombre);
    }
    public ClienteBuilder setEdad(int iedad) {
        cliente.setIedad(iedad);
        return this;
    }
    public ClienteBuilder setTelefono(String snumTelefonico) {
        cliente.setSnumTelefonico(snumTelefonico);
        return this;
    }
    public ClienteBuilder setCredito(double cuantoCredito) {
        cliente.setDcredito(cuantoCredito);
        return this;
    }

    public ClienteBuilder setAplicaADescuento(boolean aplicaADescuento) {
        cliente.setAplicaADescuento(aplicaADescuento);
        return this;
    }

    public ClienteBuilder setDmontoCompraActual(double dmontoCompraActual) {
        cliente.setDmontoCompraActual(dmontoCompraActual);
        return this;
    }

    public Cliente build(){
        return this.cliente;
    }
}
