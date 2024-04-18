/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospitalar;
import java.util.Date;

/**
 *
 * @author Tuany
 */

public class Enfermeiro extends DadoPessoal {
    // Atributos
    private Long idEnfermeiro; // ID do enfermeiro
    private boolean treinadoOpRX; // Indica se o enfermeiro está treinado em operações de radiologia

    // Construtor
    public Enfermeiro(String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero.Tipo genero,
                      Long idEnfermeiro, boolean treinadoOpRX) {
        super(nomeCompleto, dataNascimento, endereco, contato, genero);
        this.idEnfermeiro = idEnfermeiro;
        this.treinadoOpRX = treinadoOpRX;
    }

    // Getters e setters

    /**
     * Obtém o ID do enfermeiro.
     * @return O ID do enfermeiro.
     */
    public Long getIdEnfermeiro() {
        return idEnfermeiro;
    }

    /**
     * Verifica se o enfermeiro está treinado em operações de radiologia.
     * @return true se o enfermeiro está treinado em operações de radiologia, false caso contrário.
     */
    public boolean isTreinadoOpRX() {
        return treinadoOpRX;
    }

    /**
     * Define se o enfermeiro está treinado em operações de radiologia.
     * @param treinadoOpRX true se o enfermeiro está treinado em operações de radiologia, false caso contrário.
     */
    public void setTreinadoOpRX(boolean treinadoOpRX) {
        this.treinadoOpRX = treinadoOpRX;
    }
}
