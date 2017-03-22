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
public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        Diretor diretor = new Diretor("Diretor", 10000.0);
        Professor professor = new Professor("Prof", 1000.0);
        Coordenador coordenador = new Coordenador("Coord", 5000.0);     
        
        double bonus = 10;
        System.out.println("Nome: \t" + "Salario \t" + "Bonificação ");
        System.out.println(professor.getNome() + "\t" + professor.getSalario());
        System.out.println(coordenador.getNome() + "\t" + coordenador.getSalario());
        System.out.println(diretor.getNome() + "\t" + diretor.getSalario() + "\t" + diretor.bonificaSalario(100.0));
        
        
        
        
    }
}
