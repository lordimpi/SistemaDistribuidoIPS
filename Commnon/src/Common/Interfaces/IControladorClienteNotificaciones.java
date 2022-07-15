/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Common.Interfaces;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author adrianfelipegp
 */
public interface IControladorClienteNotificaciones extends Remote{
    public boolean guardarreferenciaremotacliente(INotificacionCallback referencia) throws RemoteException;
}
