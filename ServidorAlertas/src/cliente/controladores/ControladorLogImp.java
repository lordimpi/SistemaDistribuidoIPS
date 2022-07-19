/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.controladores;

import Common.Entidades.SensorDTO;
import Common.Interfaces.IControladorLog;
import java.util.Calendar;

/**
 *
 * @author adrianfelipegp
 */
public class ControladorLogImp implements IControladorLog{

    @Override
    public void informarExcepcion(SensorDTO objsensor, Calendar fecha) {
        System.out.println("Informando al servidor de logs...");
    }

}
