/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente.servicios;

import Common.Interfaces.IControladorSensor;
import cliente.utilidades.UtilidadesRegistroC;
import cliente.vista.Menu;

import static cliente.utilidades.UtilidadesConsola.leerCadena;
import static cliente.utilidades.UtilidadesConsola.leerEntero;

/**
 *
 * @author adrianfelipegp
 */
public class ClienteSensor {

    /**
     * @param args the command line arguments
     */
    private static IControladorSensor objRemoto;
    public static void main(String[] args) {
        
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
        direccionIpRMIRegistry = leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
        numPuertoRMIRegistry = leerEntero();

        objRemoto = (IControladorSensor) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry, "objServicioGestionSensores");
        Menu objMenu = new Menu(objRemoto);
        objMenu.ejecutarMenuPrincipal();
        
    } 
}
