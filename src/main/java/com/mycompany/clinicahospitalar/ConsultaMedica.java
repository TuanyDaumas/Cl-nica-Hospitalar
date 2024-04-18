/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospitalar;

/**
 *
 * @author Tuany
 */
public class ConsultaMedica {
    // Atributos
    private final Long idConsulta; 
    private final Paciente paciente; 
    private final Medico medico; 
    private final String exameQueixa; 
    private final String diagnostico; 
    private final String prescricao; 
    private boolean indicacaoCirurgica; 

    // Construtor
    public ConsultaMedica(Long idConsulta, Paciente paciente, Medico medico, String exameQueixa, 
            String diagnostico, String prescricao, boolean indicacaoCirurgica) {
        this.idConsulta = idConsulta;
        this.paciente = paciente;
        this.medico = medico;
        this.exameQueixa = exameQueixa;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.indicacaoCirurgica = indicacaoCirurgica;
    }

    // Getters e setters
    
    public Long getIdConsulta() {
        return idConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }


    public Medico getMedico() {
        return medico;
    }


    public String getExameQueixa() {
        return exameQueixa;
    }

   
    public String getDiagnostico() {
        return diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    /**
     * Obtém se há indicação de cirurgia.
     * @return true se há indicação de cirurgia, false caso contrário.
     */
    public boolean isIndicacaoCirurgica() {
        return indicacaoCirurgica;
    }

    /**
     * Define se há indicação de cirurgia.
     * @param indicacaoCirurgica true se há indicação de cirurgia, false caso contrário.
     */
    public void setIndicacaoCirurgica(boolean indicacaoCirurgica) {
        this.indicacaoCirurgica = indicacaoCirurgica;
    }
}
