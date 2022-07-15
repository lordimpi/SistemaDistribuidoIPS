package cliente.servicios;

import cliente.controladores.IClienteNotificacionCallbackImp;
import cliente.utilidades.UtilidadesRegistroC;
import java.rmi.RemoteException;
import Common.Interfaces.IControladorGestionNotificaciones;

/**
 *
 * @author snt-2
 */
public class ClienteDeObjetos {

    private static IControladorGestionNotificaciones objRemoto;

    public static void main(String[] args) throws RemoteException {

        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";

        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
        direccionIpRMIRegistry = cliente.utilidades.UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
        numPuertoRMIRegistry = cliente.utilidades.UtilidadesConsola.leerEntero();

        objRemoto = (IControladorGestionNotificaciones) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,
                numPuertoRMIRegistry, "objServicioGestionAdministradores");
        IClienteNotificacionCallbackImp objRemotoClienteNotificacion = new IClienteNotificacionCallbackImp();
        objRemoto.registrarReferenciaRemotaClienteNotificacion(objRemotoClienteNotificacion);

        System.out.println("Esperando notificaciones...");
    }
}
