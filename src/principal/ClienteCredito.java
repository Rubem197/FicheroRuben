package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ClienteCredito extends Cliente {

    public static List<Cliente> listaClienteCredito = new ArrayList<>();

    public ClienteCredito(int numCliente, String nombre, String apellido1, String apellido2, int saldo, int ingresosMedios, int gastosMedios, String direccion, int codigoPostal) {
        super(numCliente, nombre, apellido1, apellido2, saldo, ingresosMedios, gastosMedios, direccion, codigoPostal);
    }



    public static List<Cliente> generarListaClientesCredito() {
        int contador = 0;

        while (contador < Cliente.listaCliente.size()) {

            if ((Cliente.listaCliente.get(contador).getSaldo()) >0 && (Cliente.listaCliente.get(contador).getSaldo()) < 3000) {

                if (!listaClienteCredito.contains(Cliente.listaCliente.get(contador))) {
                    listaClienteCredito.add(Cliente.listaCliente.get(contador));


                }
            }


            contador++;
        }

        return listaClienteCredito;
    }

    public static void insertarListaClienteCredito(List<Cliente> listaClienteCredito) {

        try {
            FileWriter t1 = new FileWriter("ClienteCredito.txt");
            BufferedWriter pw = new BufferedWriter(t1);
            for (int i = 0; i < listaClienteCredito.size(); i++) {

                pw.append(listaClienteCredito.get(i).toString());
                pw.write('\n');
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("awa");
        }
    }



}
