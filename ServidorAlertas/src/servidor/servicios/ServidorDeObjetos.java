package servidor.servicios;

import cliente.controladores.IControladorGestionNotificacionesImp;
import Common.Utilidades.UtilidadesConsola;
import Common.Utilidades.UtilidadesRegistroS;
import java.rmi.RemoteException;

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
        direccionIpRMIRegistryServidorCanciones = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry servidor Alertas");
        numPuertoRMIRegistryServidorCanciones = UtilidadesConsola.leerEntero();

        System.out.println("Ingrese La direccion IP del servidor de Logs: ");
        direccionIPServidorLogs = UtilidadesConsola.leerCadena();
        System.out.println("Ingrese el puerto de escucha: ");
        numPuertoServidorLogs = UtilidadesConsola.leerEntero();

        //CancionRepository objRepository = new CancionRepository();
        IControladorGestionNotificacionesImp objRemotoGestionNotificaciones = new IControladorGestionNotificacionesImp();
        //ControladorGestorCancionesImpl objRemotoGestionCanciones = new ControladorGestorCancionesImpl(
        //      objRepository, objRemotoGestionAdministradores);

        try {
            UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistryServidorCanciones);
            cliente.ServerConnection(direccionIPServidorLogs, numPuertoServidorLogs);

            //UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionCanciones, direccionIpRMIRegistryServidorCanciones,
            //      numPuertoRMIRegistryServidorCanciones, "objServicioGestionCanciones");
            //UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionAdministradores, direccionIpRMIRegistryServidorCanciones, numPuertoRMIRegistryServidorCanciones, "objServicioGestionAdministradores");
        } catch (Exception e) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
        }

    }

}
