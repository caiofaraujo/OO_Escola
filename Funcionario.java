/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Atividade;

/**
 *
 * @author caio.faraujo
 */
public class Funcionario {
    public String nome;
    private double salario;
    
    public String getNome() {
        return nome;
    }    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double bonificaSalario (double valor) {
        this.salario = this.salario + valor;
        return this.salario;
    }
}
