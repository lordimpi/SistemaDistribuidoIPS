package cliente.controladores;

import Common.Entidades.SensorDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClienteNotificacionCallbackImpl extends UnicastRemoteObject implements ClienteNotificacionCallbackInt {

    public ClienteNotificacionCallbackImpl() throws RemoteException {
        super();
    }

    @Override
    public void notificarAlerta(SensorDTO notificacion) throws RemoteException {
        System.out.println(notificacion.toString());
    }

}
