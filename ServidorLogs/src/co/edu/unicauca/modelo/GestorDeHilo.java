package co.edu.unicauca.modelo;

import Common.Entidades.SensorDTO;
import Common.Utilidades.GestionJSON;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class GestorDeHilo extends Thread {

    private Socket objSocketCliente;

    public GestorDeHilo(Socket objSocket) {
        this.objSocketCliente = objSocket;
    }

    @Override
    public void run() {
        try {
            System.out.println("id del hilo generado:" + Thread.currentThread().getId());
            System.out.println("Atendiendo hilo de cliente");
            DataInputStream flujoEntrada;
            DataOutputStream flujoSalida;
            String message;
            flujoEntrada = new DataInputStream(objSocketCliente.getInputStream());
            flujoSalida = new DataOutputStream(objSocketCliente.getOutputStream());
            message = flujoEntrada.readUTF();//se bloquea el servidor
            SensorDTO objSensor = new SensorDTO();
            objSensor = GestionJSON.JsonToObject(message);
            
            System.out.println(objSensor.toString());
            //objSocketCliente.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
