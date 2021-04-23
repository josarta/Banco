/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.clases.banco;

/**
 *
 * @author Josarta
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Persona propietario;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldo, Persona propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    
    public void transaccion(double cantidad, String tipoTransaccion){
        if(tipoTransaccion.equalsIgnoreCase("Deposito")){
            this.saldo += cantidad;
            System.out.println("Se realizo un " +tipoTransaccion);
            System.err.println(toString());
        }else if(tipoTransaccion.equalsIgnoreCase("Retiro")){
            if(this.saldo == 0 || (this.saldo < cantidad )){
                 System.out.println("Fondos insuficientes");
            }else{
                this.saldo -= cantidad;
                System.out.println("Se realizo un " +tipoTransaccion);
                System.err.println(toString());
            }            
        }else{
            System.out.println("No se encontro el tipoTransaccion");
        }    
    }
    
 

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", propietario=").append(propietario.getNombre());
        sb.append(" ");
        sb.append(propietario.getApellido());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
