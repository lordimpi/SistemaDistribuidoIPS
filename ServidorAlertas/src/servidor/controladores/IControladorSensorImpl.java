package servidor.controladores;
import Common.Entidades.SensorDTO;
import java.rmi.server.UnicastRemoteObject;
import Common.Interfaces.IControladorSensor;
import java.rmi.RemoteException;

/*
 * @author adrianfelipegp
 */
public class IControladorSensorImpl extends UnicastRemoteObject implements IControladorSensor {

    @Override
    public void enviarIndicar(SensorDTO objSong) throws RemoteException {
      /**/
    }
    
}
