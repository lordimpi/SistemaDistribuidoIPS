package co.edu.unicauca.modelo;

public class FabricaServidor {

    public PlantillaServidor obtenerTipoServidor(String servidorSeleccionado) {
        switch (servidorSeleccionado) {
            case "concurrente":
                return new ServidorConcurrente();
            default:
                return new ServidorConcurrente();
        }
    }
}
