/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common.Entidades;

import java.io.Serializable;

/**
 *
 * @author adrianfelipegp
 */
public class TensionArterialDTO implements Serializable{
    int presionSistolica;
    int presionDiastolica;

    public TensionArterialDTO(int presionSistolica, int presionDiastolica) {
        this.presionSistolica = presionSistolica;
        this.presionDiastolica = presionDiastolica;
    }
    
    public TensionArterialDTO(){};

    public int getPresionSistolica() {
        return presionSistolica;
    }

    public void setPresionSistolica(int presionSistolica) {
        this.presionSistolica = presionSistolica;
    }

    public int getPresionDiastolica() {
        return presionDiastolica;
    }

    public void setPresionDiastolica(int presionDiastolica) {
        this.presionDiastolica = presionDiastolica;
    }
    
}
