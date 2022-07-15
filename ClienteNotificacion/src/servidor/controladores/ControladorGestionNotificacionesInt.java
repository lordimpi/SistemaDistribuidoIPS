package servidor.controladores;

import cliente.controladores.ClienteNotificacionCallbackInt;
import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 *
 * @author snt-2
 */
public interface ControladorGestionNotificacionesInt extends Remote {

    public void registrarReferenciaRemotaClienteNotificacion(ClienteNotificacionCallbackInt objReferencia) throws RemoteException;

}
