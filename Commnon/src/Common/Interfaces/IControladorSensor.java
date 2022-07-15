
package Common.Interfaces;
import Common.Entidades.SensorDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IControladorSensor extends Remote{
    public void enviarIndicar(SensorDTO objSong) throws RemoteException;
}


