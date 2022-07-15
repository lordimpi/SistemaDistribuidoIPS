/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Common.Interfaces;


import Common.Entidades.SensorDTO;

/**
 *
 * @author adrianfelipegp
 */
public interface INotificacionCallback {
    public void notificarAnomalia(SensorDTO objSensor);
}
