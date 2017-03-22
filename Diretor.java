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
public class Diretor extends Funcionario {
    private double salario;
    
    public Diretor (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public Diretor (String nome) {
        this.nome = nome;
        this.salario = 10000.0;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double bonificaSalario (double valor) {
        this.salario = this.salario + valor;
        return this.salario;
    }
}
