package co.edu.unicauca.presentacion;

import co.edu.unicauca.modelo.FabricaServidor;
import co.edu.unicauca.modelo.PlantillaServidor;
import java.util.Scanner;

public class VistaDelServidor {

    public static void main(String[] args) {
        try ( Scanner objScanner = new Scanner(System.in)) {
            String tipo = "concurrente";
            int puerto = 0;
            FabricaServidor fabrica = new FabricaServidor();

            System.out.println("Digite el puerto de escucha: ");
            //puerto = objScanner.nextInt();
            puerto = 3030;
            PlantillaServidor objServidor = fabrica.obtenerTipoServidor(tipo);
            objServidor.inicializarServidor(puerto);
            objServidor.ejecutarServidor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
