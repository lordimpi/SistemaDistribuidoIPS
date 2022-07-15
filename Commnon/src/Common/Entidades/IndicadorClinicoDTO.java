package Common.Entidades;

import java.io.Serializable;

/**
 *
 * @author snt-2
 */
public class IndicadorClinicoDTO implements Serializable {

    private int frecuenciaCardiaca;
    private TensionArterialDTO tensionArterial;
    private int frecuenciaRespiratoria;
    private float temperatura;
    private int saturacionOxigeno;

    public IndicadorClinicoDTO(int frecuenciaCardiaca, TensionArterialDTO tencionArterial,
            int frecuenciaRespiratoria, float temperatura, int saturacionOxigeno) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.tensionArterial = tencionArterial;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.saturacionOxigeno = saturacionOxigeno;
    }
    public IndicadorClinicoDTO(){};

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public TensionArterialDTO getTensionArterial() {
        return tensionArterial;
    }

    public void setTensionArterial(TensionArterialDTO tencionArterial) {
        this.tensionArterial = tencionArterial;
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
