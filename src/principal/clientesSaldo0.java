package principal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class clientesSaldo0 extends Cliente {

    public static List<Cliente> listaClienteSaldo0 = new ArrayList<>();

    public clientesSaldo0(int numCliente, String nombre, String apellido1, String apellido2, int saldo, int ingresosMedios, int gastosMedios, String direccion, int codigoPostal) {
        super(numCliente, nombre, apellido1, apellido2, saldo, ingresosMedios, gastosMedios, direccion, codigoPostal);
    }


    public static List<Cliente> generarListaClientesSaldo0() {
        int contador = 0;

        while (contador < Cliente.listaCliente.size()) {

            if ((Cliente.listaCliente.get(contador).getSaldo()) == 0) {

                if (!listaClienteSaldo0.contains(Cliente.listaCliente.get(contador))) {
                    listaClienteSaldo0.add(Cliente.listaCliente.get(contador));


                }
            }


            contador++;
        }

        return listaClienteSaldo0;
    }

    public static void insertarListaClienteSaldo0(List<Cliente> listaClienteSaldo0) {

        try {
            FileWriter t1 = new FileWriter("Cliente0.txt");
            BufferedWriter pw = new BufferedWriter(t1);
            for (int i = 0; i < listaClienteSaldo0.size(); i++) {

                pw.append(listaClienteSaldo0.get(i).toString());
                pw.write('\n');
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("awa");
        }
    }


}
