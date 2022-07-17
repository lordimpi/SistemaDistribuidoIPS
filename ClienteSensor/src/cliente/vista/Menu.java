/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.vista;


import Common.Entidades.IndicadorClinicoDTO;
import Common.Entidades.SensorDTO;
import Common.Entidades.TensionArterialDTO;

import Common.Interfaces.IControladorSensor;
import static Common.Utilidades.UtilidadesConsola.leerDecimal;
import static Common.Utilidades.UtilidadesConsola.leerEntero;

/**
 *
 * @author adrianfelipegp
 */
public class Menu {

    private final IControladorSensor objControladorRemotoSensor;

    public Menu(IControladorSensor objRemoto) {
        this.objControladorRemotoSensor = objRemoto;
    }

    public void ejecutarMenuPrincipal() {
        SensorDTO objSensor = new SensorDTO();
        IndicadorClinicoDTO objIndicador = new IndicadorClinicoDTO();
        TensionArterialDTO objTension = new TensionArterialDTO();
        System.out.println("Digite el numero de habitacion: ");
        objSensor.setNumeroHabitacion(leerEntero());

        while(true){
            try{
                System.out.println("Digite la frecuencia cardiaca: ");
                objIndicador.setFrecuenciaCardiaca(leerEntero());
                System.out.println("Digite la presion sistolica: ");
                objTension.setPresionSistolica(leerEntero());
                System.out.println("Digite la presion diastolica: ");
                objTension.setPresionDiastolica(leerEntero());
                System.out.println("Digite la frecuencia respiratoria: ");
                objIndicador.setFrecuenciaRespiratoria(leerEntero());
                System.out.println("Digite la temperatura: ");
                objIndicador.setTemperatura(leerDecimal());
                System.out.println("Digite la saturacion de oxigeno (sin porcentaje ej: 90)");
                objIndicador.setSaturacionOxigeno(leerEntero());
                objIndicador.setTensionArterial(objTension);
                objSensor.setIndicador(objIndicador);
                
                objControladorRemotoSensor.enviarIndicadores(objSensor);
                
            }catch(Exception e){
                System.out.println("Excepcion tal: "+e.getMessage());
            }
            
        }
    }

    private void Opcion1() 
    {
     
    }

    private void Opcion2() {
      
    }

}
