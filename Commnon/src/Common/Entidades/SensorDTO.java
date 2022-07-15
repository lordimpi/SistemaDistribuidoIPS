package Common.Entidades;

import java.io.Serializable;

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
    
    
}