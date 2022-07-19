package servidor.servicios;

import Common.Entidades.SensorDTO;
import com.google.gson.Gson;

/**
 *
 * @author lmarango
 */
public class ConversorJson {

    public static String objectToJson(SensorDTO objSensor) {
        Gson gson = new Gson();
        String response;
        response = gson.toJson(objSensor);
        return response;
    }
}
