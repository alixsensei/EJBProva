/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primo;

import javax.ejb.Stateless;

/**
 *
 * @author Alix
 */
@Stateless
public class JavaBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private int id;
    private String nome;
    private String cognome;
    private String data;
    private String codfisc;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the codfisc
     */
    public String getCodfisc() {
        return codfisc;
    }

    /**
     * @param codfisc the codfisc to set
     */
    public void setCodfisc(String codfisc) {
        this.codfisc = codfisc;
    }
    
    

}