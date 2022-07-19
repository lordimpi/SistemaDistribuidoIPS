/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.controladores;

import Common.Entidades.SensorDTO;
import Common.Interfaces.IControladorLog;
import java.util.Calendar;
import servidor.servicios.Conexion_cliente_servidor;

/**
 *
 * @author adrianfelipegp
 */
public class ControladorLogImp implements IControladorLog{
    private final Conexion_cliente_servidor clienteLog;

    public ControladorLogImp(Conexion_cliente_servidor clienteLog) {
        this.clienteLog = clienteLog;
    }
    
    @Override
    public void informarExcepcion(SensorDTO objsensor) {
       clienteLog.peticion_respuesta(objsensor);
    }

}
