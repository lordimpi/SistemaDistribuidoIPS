package servidor.servicios;

import cliente.controladores.ControladorLogImp;

import Common.Utilidades.UtilidadesConsola;
import static Common.Utilidades.UtilidadesConsola.leerCadena;
import static Common.Utilidades.UtilidadesConsola.leerEntero;
import Common.Utilidades.UtilidadesRegistroS;

import java.rmi.RemoteException;
import servidor.controladores.ControladorGestionNotificacionesImp;
import servidor.controladores.ControladorSensorImp;

/**
 *
 * @author snt-2
 */
public class ServidorDeObjetos {

    public static void main(String args[]) throws RemoteException {

        Conexion_cliente_servidor cliente = new Conexion_cliente_servidor();
        int numPuertoRMIRegistryServidorAlertas;
        int numPuertoServidorLogs;
        String direccionIpRMIRegistryServidorAlertas;
        String direccionIPServidorLogs;
        
        /*
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry servidor Alertas");
        direccionIpRMIRegistryServidorLogs = leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry servidor Alertas");
        numPuertoRMIRegistryServidorLogs = leerEntero();
        
        System.out.println("Ingrese La direccion IP del servidor de Logs: ");
        direccionIPServidorLogs = UtilidadesConsola.leerCadena();
        System.out.println("Ingrese el puerto de escucha: ");
        numPuertoServidorLogs = UtilidadesConsola.leerEntero();

        */
        
        //NS puerto 2020 , ServLogs puerto 3030
              
        direccionIpRMIRegistryServidorAlertas = "localhost";
        numPuertoRMIRegistryServidorAlertas = 2020;
        direccionIPServidorLogs = "localhost";
        numPuertoServidorLogs = 3030;
        
        ControladorLogImp ControladorLog = new ControladorLogImp(cliente);
        ControladorGestionNotificacionesImp objRemotoGestionNotificaciones = new ControladorGestionNotificacionesImp();
        ControladorSensorImp objRemotoGestionSensor = new ControladorSensorImp(objRemotoGestionNotificaciones, ControladorLog);

        try {
            UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistryServidorAlertas);
            UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionNotificaciones, direccionIpRMIRegistryServidorAlertas, numPuertoRMIRegistryServidorAlertas, "objServicioGestionNotificaciones");
            UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionSensor, direccionIpRMIRegistryServidorAlertas, numPuertoRMIRegistryServidorAlertas, "objServicioGestionSensores");

        } catch (Exception e) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
        }

    }

}
