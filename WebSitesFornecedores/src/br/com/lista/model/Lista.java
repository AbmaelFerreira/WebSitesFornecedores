/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista.model;

/* @author Abmael */
public class Lista {
    
    private Integer id;
    private String Empresa;
    private String Forma;
    private String Marca;
    private String  Website;
    private String Produtos;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the Empresa
     */
    public String getEmpresa() {
        return Empresa;
    }

    /**
     * @param Empresa the Empresa to set
     */
    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    /**
     * @return the Forma
     */
    public String getForma() {
        return Forma;
    }

    /**
     * @param Forma the Forma to set
     */
    public void setForma(String Forma) {
        this.Forma = Forma;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Website
     */
    public String getWebsite() {
        return Website;
    }

    /**
     * @param Website the Website to set
     */
    public void setWebsite(String Website) {
        this.Website = Website;
    }

    /**
     * @return the Produtos
     */
    public String getProdutos() {
        return Produtos;
    }

    /**
     * @param Produtos the Produtos to set
     */
    public void setProdutos(String Produtos) {
        this.Produtos = Produtos;
    }
    
    
}
