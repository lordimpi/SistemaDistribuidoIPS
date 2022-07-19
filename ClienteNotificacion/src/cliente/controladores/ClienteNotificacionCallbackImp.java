package cliente.controladores;

import Common.Entidades.IndicadorClinicoDTO;
import Common.Entidades.SensorDTO;
import Common.Interfaces.IClienteNotificacionCallback;
import cliente.vistas.GUICliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClienteNotificacionCallbackImp extends UnicastRemoteObject implements IClienteNotificacionCallback {
    private static int  idCliente;
    private GUICliente objGUI;
    public static void setId(int id) {
        idCliente=id;
    }

    public ClienteNotificacionCallbackImp(GUICliente objGUI) throws RemoteException {
        super();
        this.objGUI = objGUI;
    }

    @Override
    public void notificarAlerta(SensorDTO objSensor) throws RemoteException {
        this.objGUI.mostrarNotificacion(objSensor);

    }

}
