package cliente.controladores;

import Common.Entidades.SensorDTO;
import Common.Interfaces.IClienteNotificacionCallback;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IClienteNotificacionCallbackImp extends UnicastRemoteObject implements IClienteNotificacionCallback {

    public IClienteNotificacionCallbackImp() throws RemoteException {
        super();
    }

    @Override
    public void notificarAlerta(SensorDTO objSensor) throws RemoteException {
        System.out.println(objSensor.toString());
    }

}
