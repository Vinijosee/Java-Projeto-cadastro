/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Vinicius Jose
 */
public class Fornecedor extends Pessoa {
    
    private String endereço;
    
    private String observaçao;

    public Fornecedor(int id, String nome, String telefone, String email, String endereço, String cnpj) {
        super(id, nome, telefone, email, endereço, cnpj);
        this.endereço = endereço;
        
    }

    public Fornecedor(int id, String nome, String endereço, String cep ) {
        super(id, nome);
        this.endereço = endereço;
       
            }

    public Fornecedor(int id, String nome, String telefone, String email, String endereço, String cnpj, String observaçao) {
        this(id,nome, telefone,email);
        this.observaçao = observaçao;
        
    }

   
    
    
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

   

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    @Override
    public String toString(){
        return getNome();
        
   
    
    
}

    public String getObservaçao() {
        return observaçao;
    }

    public void setObservaçao(String observaçao) {
        this.observaçao = observaçao;
    }

   
}
