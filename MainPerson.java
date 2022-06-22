package open_bootcamp.Persona_sesion21;

import java.util.ArrayList;

/**
 * Programa que registra y cataloga a personas, almacenandolas en estructuras de datos.
 * -La aplicación realiza el cálculo de aumentos salariales requeridos.
 * -Recepción de datos por argumentos e implementación de un Parser.
 *
 * Author: Facundo Martin Beltrame
 */

//TODO Desarrollar mejor los métodos cobrarSalario() y pagarCompras()
//TODO Modificar el metodo toString a otros getters

public class MainPerson {

    public static void main(String[] args) {
        System.out.println("Parametros recibidos: " + args.length);

        OptionsParser optionsParser = new OptionsParser(args);

        //Implementación de Parser
        optionsParser.registerOptions("salarioBase");
        optionsParser.registerOptions("primerAumento");
        optionsParser.registerOptions("segundoAumento");
        optionsParser.parse();

        double salarioBase = Double.parseDouble(optionsParser.getOptions("salarioBase"));
        double primerAumento = Double.parseDouble(optionsParser.getOptions("primerAumento"));
        double segundoAumento = Double.parseDouble(optionsParser.getOptions("segundoAumento"));
        double salario1 = salarioBase * primerAumento;
        double salario2 = salarioBase * segundoAumento;

        System.out.println("El salario base es: " + salarioBase);
        System.out.println("El primer aumento es de: " + primerAumento);
        System.out.println("El segundo es de: " + segundoAumento);

        //Estructuras de datos
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        Cliente cliente1 = new ClienteBuilder("Juan Hernandez")
                .setEdad(25)
                .setCredito(5000)
                .setTelefono("+911245255764")
                .setAplicaADescuento(false)
                .setDmontoCompraActual(0.0)
                .build();

        Cliente cliente2 = new ClienteBuilder("Facundo Quiroga")
                .setEdad(28)
                .setCredito(7000)
                .setTelefono("+911345258800")
                .setAplicaADescuento(true)
                .setDmontoCompraActual(1200.0)
                .build();

        clientes.add(cliente1);
        clientes.add(cliente2);

        for (Cliente cliente : clientes) {
            System.out.println("Cliente almacenado en lista: " + cliente);
        }
        System.out.println("*****************************************************************");

        Trabajador trabajador1 = new TrabajadorBuilder("Carlos Eduardo Alvarez")
                .setEdad(35)
                .setTelefono("+911245235544")
                .setDsalario(15000.0)
                .setAumentoSalarial1(false)
                .setAumentoSalarial2(false)
                .build();

        System.out.println(trabajador1.toString());

        trabajador1.determinarAumentoSalarial(trabajador1.dsalario, salarioBase);
        trabajador1.subirSalario(trabajador1.aumentoSalarial1, trabajador1.aumentoSalarial2, salario1, salario2);

        System.out.println("Nuevo registro sobre el trabajador1: " + trabajador1);
        System.out.println("*****************************************************************");

        Trabajador trabajador2 = new TrabajadorBuilder("Juan Valverde")
                .setEdad(25)
                .setTelefono("+911245232542")
                .setDsalario(12000.0)
                .setAumentoSalarial1(false)
                .setAumentoSalarial2(false)
                .build();

        System.out.println(trabajador2.toString());

        trabajador2.determinarAumentoSalarial(trabajador2.dsalario, salarioBase);
        trabajador2.subirSalario(trabajador2.aumentoSalarial1, trabajador2.aumentoSalarial2,
                salario1, salario2);

        System.out.println("Nuevo registro sobre el trabajador2: " + trabajador2);

        trabajadores.add(trabajador1);
        trabajadores.add(trabajador2);
        System.out.println("*****************************************************************");

        for(Trabajador trabajador : trabajadores){
            System.out.println("Trabajador almacenado en lista: " + trabajador);
        }
        System.out.println("*****************************************************************");

        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador.cobrarSalario());
        }
        System.out.println("*****************************************************************");

        for (Cliente cliente : clientes) {
            System.out.println(cliente.pagarCompras());
        }
    }
}
