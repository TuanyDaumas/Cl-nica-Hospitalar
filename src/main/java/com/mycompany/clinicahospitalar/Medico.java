/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospitalar;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Tuany
 */

public class Medico extends DadoPessoal {
    // Atributos
    private Long idMedico; 
    private int numeroCRM; 
    private List<String> areasEspecialidade; 
    private boolean cirurgiao; 

    // Construtor
    public Medico(String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero.Tipo genero,
                  Long idMedico, int numeroCRM, List<String> areasEspecialidade, boolean cirurgiao) {
        super(nomeCompleto, dataNascimento, endereco, contato, genero);
        this.idMedico = idMedico;
        this.numeroCRM = numeroCRM;
        this.areasEspecialidade = areasEspecialidade;
        this.cirurgiao = cirurgiao;
    }

    // Getters e setters

    public Long getIdMedico() {
        return idMedico;
    }

    /**
     * Obtém o número do CRM do médico.
     * @return O número do CRM do médico.
     */
    public int getNumeroCRM() {
        return numeroCRM;
    }

    /**
     * Define o número do CRM do médico.
     * @param numeroCRM O número do CRM do médico.
     */
    public void setNumeroCRM(int numeroCRM) {
        this.numeroCRM = numeroCRM;
    }

    /**
     * Obtém as áreas de especialidade do médico.
     * @return As áreas de especialidade do médico.
     */
    public List<String> getAreasEspecialidade() {
        return areasEspecialidade;
    }

    /**
     * Define as áreas de especialidade do médico.
     * @param areasEspecialidade As áreas de especialidade do médico.
     */
    public void setAreasEspecialidade(List<String> areasEspecialidade) {
        this.areasEspecialidade = areasEspecialidade;
    }

    /**
     * Verifica se o médico é cirurgião.
     * @return true se o médico é cirurgião, false caso contrário.
     */
    public boolean isCirurgiao() {
        return cirurgiao;
    }

    /**
     * Define se o médico é cirurgião.
     * @param cirurgiao true se o médico é cirurgião, false caso contrário.
     */
    public void setCirurgiao(boolean cirurgiao) {
        this.cirurgiao = cirurgiao;
    }
}