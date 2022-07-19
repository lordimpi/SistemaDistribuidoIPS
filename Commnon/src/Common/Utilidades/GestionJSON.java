package Common.Utilidades;

import Common.Entidades.SensorDTO;
import com.google.gson.Gson;

public class GestionJSON {
    public static SensorDTO JsonToObject(String json){
        Gson gson = new Gson();
        SensorDTO response = new SensorDTO();
        response = gson.fromJson(json, SensorDTO.class);
        return response;
    }
    public static String objectToJson(SensorDTO objSensor) {
        Gson gson = new Gson();
        String response;
        response = gson.toJson(objSensor);
        return response;
    }
}
