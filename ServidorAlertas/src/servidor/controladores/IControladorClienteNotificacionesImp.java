/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.controladores;

import Common.Entidades.NotificacionDTO;
import Common.Entidades.SensorDTO;
import Common.Interfaces.IControladorClienteNotificaciones;
import Common.Interfaces.INotificacionCallback;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author adrianfelipegp
 */
public class IControladorClienteNotificacionesImp extends UnicastRemoteObject implements IControladorClienteNotificaciones {
    
    private final ArrayList<INotificacionCallback> referenciasClientesNotificar;
    
    public IControladorClienteNotificacionesImp() throws RemoteException{
        super();
        this.referenciasClientesNotificar = new ArrayList<INotificacionCallback>();
    }
    
    @Override
    public boolean guardarreferenciaremotacliente(INotificacionCallback referencia) throws RemoteException {
       this.referenciasClientesNotificar.add(referencia);
       return true;
    }
    
    public void notificarClientes(SensorDTO objSensor){
        for(INotificacionCallback referenciaCliente: referenciasClientesNotificar){
            referenciaCliente.notificarAnomalia(objSensor);
        }
    }
    
}
