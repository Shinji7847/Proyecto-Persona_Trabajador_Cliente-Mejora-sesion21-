package open_bootcamp.Persona_sesion21;

public class Cliente extends Persona {
	public double dcredito;
	public boolean aplicaADescuento = false;
	public double dmontoCompraActual = 0;

    public Cliente() {
        super();
    }

    public void setSnombre(String snombre) {
		this.snombre = snombre;
	}

	public void setIedad(int iedad) {
		this.iedad = iedad;
	}

	public void setSnumTelefonico(String snumTelefonico) {
		this.snumTelefonico = snumTelefonico;
	}

	public void setDcredito(double dcredito) {
		this.dcredito = dcredito;
	}

	public void setAplicaADescuento(boolean aplicaADescuento) {
		this.aplicaADescuento = aplicaADescuento;
	}

	public void setDmontoCompraActual(double dmontoCompraActual) {
		this.dmontoCompraActual = dmontoCompraActual;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"snombre='" + snombre + '\'' +
				", iedad=" + iedad +
				", snumTelefonico='" + snumTelefonico + '\'' +
				", dcredito=" + dcredito +
				", aplicaADescuento=" + aplicaADescuento +
				", dmontoCompraActual=" + dmontoCompraActual +
				'}';
	}

	public String aplicarDescuento(double cuantoDescuento, double dmontoCompra){
		double resultado = 0;
		dmontoCompraActual = dmontoCompra;

		if(aplicaADescuento) {
			resultado = dmontoCompra * 100 / cuantoDescuento;

			return "El monto de la compra luego del descuento es: " + resultado;
		}
		return "El cliente no aplica a un descuento";
	}

	@Override
	public String cobrarSalario() {
		return null;
	}

	@Override
	public String pagarCompras() {
		return "El cliente pagó su compra por el monto indicado";
	}
}
