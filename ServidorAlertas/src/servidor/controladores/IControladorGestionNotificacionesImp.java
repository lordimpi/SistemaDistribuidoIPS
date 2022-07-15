
package servidor.controladores;


import Common.Entidades.SensorDTO;
import java.util.ArrayList;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import Common.Interfaces.IClienteNotificacionCallback;
import Common.Interfaces.IControladorGestionNotificaciones;
/**
 *
 * @author adrianfelipegp
 */
public class IControladorGestionNotificacionesImp extends UnicastRemoteObject implements IControladorGestionNotificaciones {
    
    private final ArrayList<IClienteNotificacionCallback> referenciasClientesNotificar;
    
    public IControladorGestionNotificacionesImp() throws RemoteException{
        super();
        this.referenciasClientesNotificar = new ArrayList<IClienteNotificacionCallback>();
    }
    
    @Override
    public void registrarReferenciaRemotaClienteNotificacion(IClienteNotificacionCallback objReferencia) throws RemoteException {
       this.referenciasClientesNotificar.add(objReferencia);
       
    }
    
    public void notificarClientes(SensorDTO objSensor) throws RemoteException{
        for(IClienteNotificacionCallback referenciaCliente: referenciasClientesNotificar){
            referenciaCliente.notificarAlerta(objSensor);
        }
    }
    
}
