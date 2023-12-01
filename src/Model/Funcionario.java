/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;





/**
 *
 * @author Vinicius Jose
 */
public class Funcionario extends Pessoa {
    

    protected String senha;
    protected String nivelAcesso;
   

    public Funcionario(int id, String nome,String senha) {
        super(id, nome);
        this.senha = senha;
    }
    
    public Funcionario( int id, String nome, char sexo, String dataNascimento, String telefone, String email, String cpf, String senha, String nivelAcesso ) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
       
    }

   
    public String getSenha() {
        return senha;
    }

    public Date getdataNascimento() {
        return dataNascimento;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento);
    }
    
    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(dataNascimento);
    }

    public void setdataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    
    
    

    
    
    
    
    
}
