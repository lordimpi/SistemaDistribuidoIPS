package cliente.controladores;

import Common.Entidades.SensorDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author snt-2
 */
public interface ClienteNotificacionCallbackInt extends Remote {
    public void notificarAlerta(SensorDTO notificacion) throws RemoteException;
}
