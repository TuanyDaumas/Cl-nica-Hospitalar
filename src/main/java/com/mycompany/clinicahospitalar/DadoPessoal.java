/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicahospitalar;

import java.util.Date;
/**
 *
 * @author Tuany
 */
public class DadoPessoal {
    
    // Atributos
    private String nomeCompleto;
    private Date dataNascimento;
    private Endereco endereco;
    private ContatoTelEmail contato;
    private Genero.Tipo genero;
    
    // Construtor
    public DadoPessoal(String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero.Tipo genero) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.genero = genero;
    }

    // Getters e setters
    /**
     * Obtém o nome completo da pessoa.
     * @return O nome completo da pessoa.
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Define o nome completo da pessoa.
     * @param nomeCompleto O nome completo da pessoa.
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ContatoTelEmail getContato() {
        return contato;
    }

    public void setContato(ContatoTelEmail contato) {
        this.contato = contato;
    }

    public Genero.Tipo getGenero() {
        return genero;
    }

    public void setGenero(Genero.Tipo genero) {
        this.genero = genero;
    }
}
