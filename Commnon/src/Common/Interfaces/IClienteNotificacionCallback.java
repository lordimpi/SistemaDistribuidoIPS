/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Common.Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import Common.Entidades.SensorDTO;

/**
 *
 * @author adrianfelipegp
 */
public interface IClienteNotificacionCallback extends Remote{
    public void notificarAlerta(SensorDTO objSensor) throws RemoteException;
}
