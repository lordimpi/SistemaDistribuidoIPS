package cliente.servicios;

import cliente.controladores.ClienteNotificacionCallbackImp;
import Common.Utilidades.UtilidadesRegistroC;
import java.rmi.RemoteException;
import Common.Interfaces.IControladorGestionNotificaciones;
import cliente.vistas.GUICliente;

/**
 *
 * @author snt-2
 */
public class ClienteDeObjetos {

    private static IControladorGestionNotificaciones objRemoto;

    public static void main(String[] args) throws RemoteException {

        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
        GUICliente objGUI = new GUICliente();
/*
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
        direccionIpRMIRegistry = Common.Utilidades.UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
        numPuertoRMIRegistry = Common.Utilidades.UtilidadesConsola.leerEntero();
        */
        
        direccionIpRMIRegistry = "localhost";
        numPuertoRMIRegistry = 2020;
        
        objRemoto = (IControladorGestionNotificaciones) UtilidadesRegistroC.
                obtenerObjRemoto(direccionIpRMIRegistry,numPuertoRMIRegistry, "objServicioGestionNotificaciones"); //consultar OR
        ClienteNotificacionCallbackImp objRemotoClienteNotificacion = new ClienteNotificacionCallbackImp(objGUI); //Crear OR
        int id=objRemoto.registrarReferenciaRemotaClienteNotificacion(objRemotoClienteNotificacion); //enviar referencia 
        objGUI.setIdCliente(id);
        System.out.println("Esperando notificaciones...");
    }
}
