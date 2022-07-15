package Common.Entidades;

import java.util.ArrayList;

/**
 *
 * @author snt-2
 */
public class IndicadorClinicoDTO {

    private int frecuenciaCardiaca;
    private ArrayList<Integer> tencionArterial;
    private int frecuenciaRespiratoria;
    private float temperatura;
    private int saturacionOxigeno;

    public IndicadorClinicoDTO(int frecuenciaCardiaca, ArrayList<Integer> tencionArterial,
            int frecuenciaRespiratoria, float temperatura, int saturacionOxigeno) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.tencionArterial = tencionArterial;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public ArrayList<Integer> getTencionArterial() {
        return tencionArterial;
    }

    public void setTencionArterial(ArrayList<Integer> tencionArterial) {
        this.tencionArterial = tencionArterial;
    }

    public int getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public int getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(int saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

}
