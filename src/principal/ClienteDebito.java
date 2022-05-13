package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ClienteDebito extends Cliente {

    public static List<ClienteDebito> listaClienteDebito = new ArrayList<>();

    public ClienteDebito(int numCliente, String nombre, String apellido1, String apellido2, int saldo, int ingresosMedios, int gastosMedios) {
        super(numCliente, nombre, apellido1, apellido2, saldo, ingresosMedios, gastosMedios);
    }

    public static List<ClienteDebito> generarListaClientesDebito() {
        int contador = 0;

        while (contador < listaClienteDebito.size()) {

            if ((listaClienteDebito.get(contador).getSaldo()) <0 && (listaClienteDebito.get(contador).getSaldo()) > -3000) {

                if (!listaClienteDebito.contains(listaClienteDebito.get(contador))) {
                    listaClienteDebito.add(listaClienteDebito.get(contador));


                }
            }


            contador++;
        }

        return listaClienteDebito;
    }

    public static void insertarListaClienteDebito(List<ClienteDebito> clientes) {

        try {
            FileWriter t1 = new FileWriter("ClienteDebito.txt");
            BufferedWriter pw = new BufferedWriter(t1);
            for (int i = 0; i < listaClienteDebito.size(); i++) {

                pw.append(listaClienteDebito.get(i).toString());
                pw.write('\n');
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("awa");
        }
    }


}
