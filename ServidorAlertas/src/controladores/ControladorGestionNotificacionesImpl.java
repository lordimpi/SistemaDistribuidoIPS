package controladores;

import Common.Entidades.SensorDTO;
import cliente.controladores.ClienteNotificacionCallbackInt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author snt-2
 */
public class ControladorGestionNotificacionesImpl extends UnicastRemoteObject implements ControladorGestionNotificacionesInt {

    private final List<ClienteNotificacionCallbackInt> referenciasAdministradores;

    public ControladorGestionNotificacionesImpl() throws RemoteException {
        super();
        this.referenciasAdministradores = new ArrayList();
    }

    @Override
    public void registrarReferenciaRemotaClienteNotificacion(ClienteNotificacionCallbackInt objReferencia) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void enviarNotificacion(SensorDTO objSensor) throws RemoteException {
        for (ClienteNotificacionCallbackInt referencia : referenciasAdministradores) {
            referencia.notificarAlerta(objSensor);
        }
    }
}
