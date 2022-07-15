package Common.Interfaces;

import Common.Interfaces.IClienteNotificacionCallback;
import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 *
 * @author snt-2
 */
public interface IControladorGestionNotificaciones extends Remote {

    public void registrarReferenciaRemotaClienteNotificacion(IClienteNotificacionCallback objReferencia) throws RemoteException;

}
