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

public class AtendenteHospitalar extends DadoPessoal {
    // Atributos
    private String setor; // Setor de trabalho do atendente hospitalar
    private int chSemanal; // Carga horária semanal do atendente hospitalar
    private int idAtendente; // Identificador único do atendente hospitalar

    // Construtor
    public AtendenteHospitalar(String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato,
                               Genero.Tipo genero, String setor, int chSemanal, int idAtendente) {
        super(nomeCompleto, dataNascimento, endereco, contato, genero);
        this.setor = setor;
        this.chSemanal = chSemanal;
        this.idAtendente = idAtendente;
    }

    // Getters e setters

    /**
     * Obtém o setor de trabalho do atendente hospitalar.
     * @return O setor de trabalho do atendente hospitalar.
     */
    public String getSetor() {
        return setor;
    }

    /**
     * Define o setor de trabalho do atendente hospitalar.
     * @param setor O setor de trabalho do atendente hospitalar.
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * Obtém a carga horária semanal do atendente hospitalar.
     * @return A carga horária semanal do atendente hospitalar.
     */
    public int getChSemanal() {
        return chSemanal;
    }

    /**
     * Define a carga horária semanal do atendente hospitalar.
     * @param chSemanal A carga horária semanal do atendente hospitalar.
     */
    public void setChSemanal(int chSemanal) {
        this.chSemanal = chSemanal;
    }

    /**
     * Obtém o identificador único do atendente hospitalar.
     * @return O identificador único do atendente hospitalar.
     */
    public int getIdAtendente() {
        return idAtendente;
    }

    /**
     * Define o identificador único do atendente hospitalar.
     * @param idAtendente O identificador único do atendente hospitalar.
     */
    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }
}