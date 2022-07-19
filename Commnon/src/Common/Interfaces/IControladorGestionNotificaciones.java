package Common.Interfaces;

import Common.Interfaces.IClienteNotificacionCallback;
import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 *
 * @author snt-2
 */
public interface IControladorGestionNotificaciones extends Remote {

    public int registrarReferenciaRemotaClienteNotificacion(IClienteNotificacionCallback objReferencia) throws RemoteException;

}
