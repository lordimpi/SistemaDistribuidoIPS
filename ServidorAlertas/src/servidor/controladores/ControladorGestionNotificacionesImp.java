
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
public class ControladorGestionNotificacionesImp extends UnicastRemoteObject implements IControladorGestionNotificaciones {
    
    private final ArrayList<IClienteNotificacionCallback> referenciasClientesNotificar;
    
    public ControladorGestionNotificacionesImp() throws RemoteException{
        super(); //asigna puerto de escucha
        this.referenciasClientesNotificar = new ArrayList<IClienteNotificacionCallback>();
    }
    
    @Override
    public int registrarReferenciaRemotaClienteNotificacion(IClienteNotificacionCallback objReferencia) throws RemoteException {
       this.referenciasClientesNotificar.add(objReferencia);
       return referenciasClientesNotificar.size();
    }
    
    public void notificarClientes(SensorDTO objSensor) throws RemoteException{
        for(IClienteNotificacionCallback referenciaCliente: referenciasClientesNotificar){
            referenciaCliente.notificarAlerta(objSensor);
        }
    }
    
}
