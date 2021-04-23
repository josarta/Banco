/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.banco;

import edu.sena.clases.banco.Cuenta;
import edu.sena.clases.banco.Persona;
import java.util.Scanner;

/**
 *
 * @author Josarta
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona personaIn = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese sus nombres :");
        personaIn.setNombre(sc.nextLine());

        System.out.println("Ingrese sus apellidos :");
        personaIn.setApellido(sc.nextLine());

        String movil = "";
        do {
            System.out.println("Ingrese su numero celular :");
            movil = sc.next();
        } while (movil.length() != 10);

        personaIn.setTelefono(Long.parseLong(movil));
        Cuenta miCuenta = new Cuenta(1010, 0, personaIn);

        do {
            System.out.println("Ingrese el tipo de transaccion - >");
            String tp = sc.next();
            System.out.println("Ingrese el Valor $ ");
            double valor = sc.nextDouble();
            miCuenta.transaccion(valor, tp);
            System.out.println("Ingrese 1 para continuar");
        } while (sc.nextInt() == 1);

    }

}
