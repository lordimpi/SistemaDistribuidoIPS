package cliente.controladores;

import Common.Entidades.SensorDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

//Hereda de la clase Remote, lo cual la convierte en interfaz remota
public interface ClienteNotificacionCallbackInt extends Remote {

    public void notificarAlerta(SensorDTO notificacion) throws RemoteException;
}
