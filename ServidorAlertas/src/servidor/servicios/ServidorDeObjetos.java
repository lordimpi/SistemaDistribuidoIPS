package servidor.servicios;

import cliente.utilidades.UtilidadesConsola;
import common.utilidades.UtilidadesRegistroS;
import controladores.ControladorGestionNotificacionesImpl;
import java.rmi.RemoteException;


/**
 *
 * @author snt-2
 */
public class ServidorDeObjetos {

    public static void main(String args[]) throws RemoteException {

        int numPuertoRMIRegistryServidorCanciones;
        String direccionIpRMIRegistryServidorCanciones;

        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry servidor Alertas");
        direccionIpRMIRegistryServidorCanciones = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry servidor Alertas");
        numPuertoRMIRegistryServidorCanciones = UtilidadesConsola.leerEntero();
        
          //CancionRepository objRepository = new CancionRepository();
        ControladorGestionNotificacionesImpl objRemotoGestionNotificaciones = new ControladorGestionNotificacionesImpl();
        //ControladorGestorCancionesImpl objRemotoGestionCanciones = new ControladorGestorCancionesImpl(
          //      objRepository, objRemotoGestionAdministradores);
        
        
        try {
            UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistryServidorCanciones);
            //UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionCanciones, direccionIpRMIRegistryServidorCanciones,
              //      numPuertoRMIRegistryServidorCanciones, "objServicioGestionCanciones");
            //UtilidadesRegistroS.RegistrarObjetoRemoto(objRemotoGestionAdministradores, direccionIpRMIRegistryServidorCanciones, numPuertoRMIRegistryServidorCanciones, "objServicioGestionAdministradores");
        } catch (Exception e) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
        }

    }
    
}
