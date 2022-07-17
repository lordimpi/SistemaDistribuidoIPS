package co.edu.unicauca.modelo;

import co.edu.unicauca.servicios.InformacionComputador;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ServidorSecuencial extends PlantillaServidor{

    public ServidorSecuencial() 
    {}
    
    @Override
    public void atenderPeticiones() {
        System.out.println("id del hilo principal:"+Thread.currentThread().getId());
        DataInputStream flujoEntrada;
        DataOutputStream flujoSalida;
        String message;
        try {            
            while (true) {
                objsocket = objservidor.accept();               
                System.out.println("Cliente conectado");
                flujoEntrada = new DataInputStream(objsocket.getInputStream());
                flujoSalida=new DataOutputStream(objsocket.getOutputStream());
                message = flujoEntrada.readUTF();//se bloquea el servidor
                if(message.equals("caracteristicas")){
                    message = InformacionComputador.atenderPeticion();
                    flujoSalida.writeUTF(message);
                }
                objsocket.close();
            }
        } catch (IOException excep) {
            excep.printStackTrace();
        } 
    }
}
