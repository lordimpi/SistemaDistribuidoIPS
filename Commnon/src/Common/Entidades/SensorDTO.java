package Common.Entidades;

/**
 *
 * @author snt-2
 */
public class SensorDTO {
    private int numeroHabitacion;
    private IndicadorDTO indicador;

    public SensorDTO(int numeroHabitacion, IndicadorDTO indicador) {
        this.numeroHabitacion = numeroHabitacion;
        this.indicador = indicador;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public IndicadorDTO getIndicador() {
        return indicador;
    }

    public void setIndicador(IndicadorDTO indicador) {
        this.indicador = indicador;
    }
    
    
}