package Common.Entidades;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author snt-2
 */
public class SensorDTO implements Serializable{
    private int numeroHabitacion;
    private IndicadorClinicoDTO indicador;

    public SensorDTO(int numeroHabitacion, IndicadorClinicoDTO indicador) {
        this.numeroHabitacion = numeroHabitacion;
        this.indicador = indicador;
    }
    public SensorDTO(){};

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public IndicadorClinicoDTO getIndicador() {
        return indicador;
    }

    public void setIndicador(IndicadorClinicoDTO indicador) {
        this.indicador = indicador;
    }

    @Override
    public String toString() {
        String mensaje = "El sensor ubicado en la habitacion "+numeroHabitacion+" presenta fallas\n"+
                         "Indicadores medicos: \n"+
                         "Frecuencia cardiaca: "+indicador.getFrecuenciaCardiaca()+"\n"+
                         "Frecuencia respiratoria: "+indicador.getFrecuenciaRespiratoria()+"\n"+
                         "Saturacion de Oxigeno: "+indicador.getSaturacionOxigeno()+"\n"+
                         "Temperatura: "+indicador.getTemperatura()+"\n"+
                         "Tension Arterial (Presion Diastolica): "+indicador.getTensionArterial().getPresionDiastolica()+"\n"+
                         "Tension Arterial (Presion Sistolica): "+indicador.getTensionArterial().getPresionSistolica()+"\n"+
                         "Fecha informe: "+LocalDate.now();
        return mensaje;
    }
    
    
    
    
}