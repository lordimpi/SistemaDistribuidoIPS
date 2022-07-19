package servidor.controladores;

import Common.Entidades.IndicadorClinicoDTO;
import java.rmi.server.UnicastRemoteObject;
import Common.Entidades.SensorDTO;

import Common.Interfaces.IControladorLog;
import Common.Interfaces.IControladorSensor;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 *
 * @author adrianfelipegp
 */
public class IControladorSensorImp extends UnicastRemoteObject implements IControladorSensor{
    private final IControladorLog servidorLog;
    private final IControladorGestionNotificacionesImp controladorNotificaciones;
    

    public IControladorSensorImp(IControladorLog servidorLog, IControladorGestionNotificacionesImp controladorNotificaciones)throws RemoteException{
        this.servidorLog = servidorLog;
        this.controladorNotificaciones= controladorNotificaciones;
    }
    @Override
    public void enviarIndicadores(SensorDTO objSensor) throws RemoteException {
        System.out.println("Se recibio informacion del sensor de la habitacion "+objSensor.getNumeroHabitacion());
       IndicadorClinicoDTO objIndicadores = objSensor.getIndicador();
       int contarIndicadores = 0;
        //si indicador es <=0 reportar logs
        if((objIndicadores.getFrecuenciaCardiaca()<=0)||
            objIndicadores.getFrecuenciaRespiratoria()<=0||
            objIndicadores.getSaturacionOxigeno()<=0||
            objIndicadores.getTemperatura()<=0||
            objIndicadores.getTensionArterial().getPresionSistolica()<=0||
            objIndicadores.getTensionArterial().getPresionDiastolica()<=0){
                
            //aqui va el cliente para el log
                servidorLog.informarExcepcion(objSensor, Calendar.getInstance());
                
        }else{
            if(!(objIndicadores.getFrecuenciaCardiaca()>=60 &&objIndicadores.getFrecuenciaCardiaca()<=80)){
                contarIndicadores++;
            }
            if(!(objIndicadores.getFrecuenciaRespiratoria()>=12 &&objIndicadores.getFrecuenciaRespiratoria()<=20)){
                contarIndicadores++;
            }
            if(!(objIndicadores.getSaturacionOxigeno()>=95&&objIndicadores.getSaturacionOxigeno()<=100)){
                contarIndicadores++;
            }
            if(!(objIndicadores.getTemperatura()>=36.2&&objIndicadores.getTemperatura()<=37.2)){
                contarIndicadores++;
            }
            if(!(objIndicadores.getTensionArterial().getPresionSistolica()>=110&&objIndicadores.getTensionArterial().getPresionSistolica()<=140)){
                contarIndicadores++;
            }
            if(!(objIndicadores.getTensionArterial().getPresionDiastolica()>=70&&objIndicadores.getTensionArterial().getPresionDiastolica()<=90)){
                contarIndicadores++;          
            }
            if(contarIndicadores>=2){
                controladorNotificaciones.notificarClientes(objSensor);
            }
            
        }
    }
  
}
