package cliente.controladores;

import Common.Entidades.IndicadorClinicoDTO;
import Common.Entidades.SensorDTO;
import Common.Interfaces.IClienteNotificacionCallback;
import cliente.vistas.FrmNotificacion;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IClienteNotificacionCallbackImp extends UnicastRemoteObject implements IClienteNotificacionCallback {
    private static int  idCliente;
    public static void setId(int id) {
        idCliente=id;
    }

    public IClienteNotificacionCallbackImp() throws RemoteException {
        super();
    }

    @Override
    public void notificarAlerta(SensorDTO objSensor) throws RemoteException {
    String menContexto = "El paciente de la habitacion "+objSensor.getNumeroHabitacion() +" ";
    String menIndicadores="";
    int contarIndicadores=0;
    IndicadorClinicoDTO objIndicadores = objSensor.getIndicador();
    if (!(objIndicadores.getFrecuenciaCardiaca() >= 60 && objIndicadores.getFrecuenciaCardiaca() <= 80)) {
        menIndicadores = menIndicadores+"Frecuencia cardiaca: "+objIndicadores.getFrecuenciaCardiaca()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getFrecuenciaRespiratoria() >= 12 && objIndicadores.getFrecuenciaRespiratoria() <= 20)) {
        menIndicadores = menIndicadores+"Frecuencia respiratoria: "+objIndicadores.getFrecuenciaRespiratoria()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getSaturacionOxigeno() >= 95 && objIndicadores.getSaturacionOxigeno() <= 100)) {
        menIndicadores = menIndicadores+"Saturacion de Oxigeno: "+objIndicadores.getSaturacionOxigeno()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getTemperatura() >= 36.2 && objIndicadores.getTemperatura() <= 37.2)) {
        menIndicadores = menIndicadores+"Temperatura: "+objIndicadores.getTemperatura()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getTensionArterial().getPresionSistolica() >= 110 && objIndicadores.getTensionArterial().getPresionSistolica() <= 140)) {
        menIndicadores = menIndicadores+"Presion arterial (Sistolica): "+objIndicadores.getTensionArterial().getPresionSistolica()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getTensionArterial().getPresionDiastolica() >= 70 && objIndicadores.getTensionArterial().getPresionDiastolica() <= 90)) {
        menIndicadores = menIndicadores+"Presion arterial (Diastolica): "+objIndicadores.getTensionArterial().getPresionDiastolica()+"\n\n";
        contarIndicadores++;
    }
    menContexto = menContexto + "presenta " + contarIndicadores + " indicadores fuera de rango.";
    try{
            FrmNotificacion frmNotificacion = new FrmNotificacion(idCliente,menContexto,menIndicadores);
    }catch(Exception e){
        System.out.println("Excepcion en form.");
    }

    }

}
