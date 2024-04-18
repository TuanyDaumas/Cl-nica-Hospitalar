/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospitalar;

/**
 *
 * @author Tuany
 */
public class Genero {

    public static Tipo getMasculino() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Tipo getFeminino() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public enum Tipo {
        M, // Masculino
        F // Feminino
    }

    // Método estático para obter o tipo de gênero a partir de uma String
    public static Tipo fromString(String generoStr) {
        if (generoStr.equalsIgnoreCase("Masculino")) {
            return Tipo.M;
        } else if (generoStr.equalsIgnoreCase("Feminino")) {
            return Tipo.F;
        } else {
            throw new IllegalArgumentException("Gênero inválido: " + generoStr);
        }
    }
}
