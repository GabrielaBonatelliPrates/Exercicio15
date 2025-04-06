/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio15 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
        
        if ((15 < idade)&&(idade < 25)) {
            JOptionPane.showMessageDialog(null, nome + " ACEITO");
        } else {
            JOptionPane.showMessageDialog(null, nome + " NÃO ACEITO");
        }

    }

}