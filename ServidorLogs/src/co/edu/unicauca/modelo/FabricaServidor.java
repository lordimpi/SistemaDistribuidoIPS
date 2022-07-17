package co.edu.unicauca.modelo;

public class FabricaServidor {
    public PlantillaServidor obtenerTipoServidor(String servidorSeleccionado){
        switch (servidorSeleccionado) {
            case "secuencial" : return new ServidorSecuencial();
            case "concurrente" : return new ServidorConcurrente();
            default: return new ServidorConcurrente();
        }
    }
}
