/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.vista;

import Common.Utilidades.UtilidadesConsola;
import java.io.File;
import Common.Interfaces.IControladorSensor;

/**
 *
 * @author adrianfelipegp
 */
public class Menu {

    private final IControladorSensor objRemoto;

    public Menu(IControladorSensor objRemoto) {
        this.objRemoto = objRemoto;
    }

    public void ejecutarMenuPrincipal() {
        int opcion = 0;
        do {
            System.out.println("==Menu==");
            System.out.println("1. Registrar Cancion");
            System.out.println("2. Listar Canciones");
            System.out.println("3. Salir");

            opcion = UtilidadesConsola.leerEntero();

            switch (opcion) {
                case 1 ->
                    Opcion1();
                case 2 ->
                    Opcion2();
                case 3 ->
                    System.out.println("Salir...");
                default ->
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 3);
    }

    private void Opcion1() 
    {
     
    }

    private void Opcion2() {
      
    }

}
