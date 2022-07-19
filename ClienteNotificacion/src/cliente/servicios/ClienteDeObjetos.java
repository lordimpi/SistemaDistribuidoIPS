package cliente.servicios;

import cliente.controladores.IClienteNotificacionCallbackImp;
import Common.Utilidades.UtilidadesRegistroC;
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
/*
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
        direccionIpRMIRegistry = Common.Utilidades.UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
        numPuertoRMIRegistry = Common.Utilidades.UtilidadesConsola.leerEntero();
        */
        
      
        direccionIpRMIRegistry = "localhost";
        numPuertoRMIRegistry = 2020;
        
        objRemoto = (IControladorGestionNotificaciones) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,numPuertoRMIRegistry, "objServicioGestionNotificaciones");
        IClienteNotificacionCallbackImp objRemotoClienteNotificacion = new IClienteNotificacionCallbackImp();
        int id=objRemoto.registrarReferenciaRemotaClienteNotificacion(objRemotoClienteNotificacion);
        IClienteNotificacionCallbackImp.setId(id);
        System.out.println("Esperando notificaciones...");
    }
}
