package servidor.servicios;

import cliente.controladores.IControladorLogImp;

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
        int numPuertoRMIRegistryServidorCanciones;
        int numPuertoServidorLogs;
        String direccionIpRMIRegistryServidorCanciones;
        String direccionIPServidorLogs;
        
        /*
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry servidor Alertas");
        direccionIpRMIRegistryServidorCanciones = leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry servidor Alertas");
        numPuertoRMIRegistryServidorCanciones = leerEntero();
        
        System.out.println("Ingrese La direccion IP del servidor de Logs: ");
        direccionIPServidorLogs = UtilidadesConsola.leerCadena();
        System.out.println("Ingrese el puerto de escucha: ");
        numPuertoServidorLogs = UtilidadesConsola.leerEntero();
<<<<<<< HEAD
        */
        
        //NS puerto 2020 , ServLogs puerto 3030
              
        direccionIpRMIRegistryServidorCanciones = "localhost";
        numPuertoRMIRegistryServidorCanciones = 2020;
        direccionIPServidorLogs = "localhost";
        numPuertoServidorLogs = 3030;
        
        
        IControladorLogImp servidorLog = new IControladorLogImp();
        IControladorGestionNotificacionesImp objRemotoGestionNotificaciones = new IControladorGestionNotificacionesImp();
        IControladorSensorImp objRemotoGestionSensor = new IControladorSensorImp(servidorLog,objRemotoGestionNotificaciones);
        
        
=======
>>>>>>> origin/santiago

        ControladorGestionNotificacionesImp objRemotoGestionNotificaciones = new ControladorGestionNotificacionesImp();
        cliente.ServerConnection(direccionIPServidorLogs, numPuertoServidorLogs);
        ControladorSensorImp objRemotoGestionSensor = new ControladorSensorImp(objRemotoGestionNotificaciones, cliente);

        try {
            UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistryServidorCanciones);
            UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionNotificaciones, direccionIpRMIRegistryServidorCanciones, numPuertoRMIRegistryServidorCanciones, "objServicioGestionNotificaciones");
            UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionSensor, direccionIpRMIRegistryServidorCanciones, numPuertoRMIRegistryServidorCanciones, "objServicioGestionSensores");

        } catch (Exception e) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
        }

    }

}
