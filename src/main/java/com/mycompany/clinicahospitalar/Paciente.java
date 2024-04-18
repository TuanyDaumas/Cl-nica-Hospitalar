/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospitalar;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Tuany
 */

public class Paciente extends DadoPessoal {
  

    // Atributos
    private  Long idPaciente;
    private final int idade;
    private Date dataCadastro;
    private final String obsGeral;
   // Atributo para armazenar histórico de consultas médicas
    private List<ConsultaMedica> historicoConsultasMedicas;
    private ContatoTelEmail contatoResponsavel;

    // Construtor
    public Paciente(String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero.Tipo genero,
                    Long idPaciente, int idade, Date dataCadastro, String obsGeral, List<ConsultaMedica> historicoConsultasMedicas,
                    ContatoTelEmail contatoResponsavel) {
        super(nomeCompleto, dataNascimento, endereco, contato, genero);
        this.idPaciente = idPaciente;
        this.idade = idade;
        this.dataCadastro = dataCadastro;
        this.obsGeral = obsGeral;
        this.historicoConsultasMedicas = (historicoConsultasMedicas != null) ? new ArrayList<>(historicoConsultasMedicas) : new ArrayList<>();
        this.contatoResponsavel = contatoResponsavel;
    }

    // Método para adicionar uma consulta médica ao histórico
    public void addConsultaMedica(ConsultaMedica consultaMedica) {
        if (consultaMedica != null) {
            historicoConsultasMedicas.add(consultaMedica);
        }
    }

    // Método para remover uma consulta médica do histórico
    public void removeConsultaMedica(ConsultaMedica consultaMedica) {
        historicoConsultasMedicas.remove(consultaMedica);
    }
   
    // Getters e setters

    public Long getIdPaciente() {
        return idPaciente;
    }
    
    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
}

    public int getIdade() {
        return idade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    // Método getter para o nome do paciente
    public String getNome() {
        return this.getNomeCompleto(); // Utiliza o método getNomeCompleto() da classe DadoPessoal
    }

    
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObsGeral() {
        return obsGeral;
    }

    public List<ConsultaMedica> getHistoricoConsultasMedicas() {
        return historicoConsultasMedicas;
    }

    public void setHistoricoConsultasMedicas(List<ConsultaMedica> historicoConsultasMedicas) {
        this.historicoConsultasMedicas = historicoConsultasMedicas;
    }

    public ContatoTelEmail getContatoResponsavel() {
        return contatoResponsavel;
    }

    public void setContatoResponsavel(ContatoTelEmail contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }

    // Método setter para o nome do paciente    
    public void setNome(String nome) {
        this.setNomeCompleto(nome); // Utiliza o método setter da classe DadoPessoal
    }
}
