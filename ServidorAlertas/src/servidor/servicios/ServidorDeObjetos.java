package servidor.servicios;

import cliente.controladores.IControladorLogImp;
import static cliente.utilidades.UtilidadesConsola.leerCadena;
import static cliente.utilidades.UtilidadesConsola.leerEntero;
import common.utilidades.UtilidadesRegistroS;
import cliente.controladores.IControladorGestionNotificacionesImp;
import Common.Utilidades.UtilidadesConsola;
import Common.Utilidades.UtilidadesRegistroS;

import java.rmi.RemoteException;
import servidor.controladores.IControladorGestionNotificacionesImp;
import servidor.controladores.IControladorSensorImp;

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

        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry servidor Alertas");
        direccionIpRMIRegistryServidorCanciones = leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry servidor Alertas");
        numPuertoRMIRegistryServidorCanciones = leerEntero();
        System.out.println("Ingrese La direccion IP del servidor de Logs: ");
        direccionIPServidorLogs = UtilidadesConsola.leerCadena();
        System.out.println("Ingrese el puerto de escucha: ");
        numPuertoServidorLogs = UtilidadesConsola.leerEntero();
        
        IControladorLogImp servidorLog = new IControladorLogImp();
        IControladorGestionNotificacionesImp objRemotoGestionNotificaciones = new IControladorGestionNotificacionesImp();
        IControladorSensorImp objRemotoGestionSensor = new IControladorSensorImp(servidorLog,objRemotoGestionNotificaciones);
        
        


        try {
            UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistryServidorCanciones);
            UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionNotificaciones, direccionIpRMIRegistryServidorCanciones,numPuertoRMIRegistryServidorCanciones, "objServicioGestionNotificaciones");
            UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionSensor, direccionIpRMIRegistryServidorCanciones, numPuertoRMIRegistryServidorCanciones, "objServicioGestionSensores");
            cliente.ServerConnection(direccionIPServidorLogs, numPuertoServidorLogs);


        } catch (Exception e) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
        }

    }

}
