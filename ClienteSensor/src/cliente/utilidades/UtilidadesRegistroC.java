/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.utilidades;
import java.rmi.Naming;
import java.rmi.Remote;

/**
 *
 * @author adrianfelipegp
 */
public class UtilidadesRegistroC {
    public static Remote obtenerObjRemoto(String dirIP,int puerto, String nameObjReg){
         String URLRegistro;
        URLRegistro  = "rmi://" + dirIP + ":" + puerto + "/"+nameObjReg;
        try
        {
            return Naming.lookup(URLRegistro);
        }
        catch (Exception e)
        {
            System.out.println("Excepcion en obtencion del objeto remoto"+ e);
            return null;
        }
    }
    
}
