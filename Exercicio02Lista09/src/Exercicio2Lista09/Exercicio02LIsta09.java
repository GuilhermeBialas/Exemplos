/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2Lista09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme Bialas
 */
public class Exercicio02LIsta09 implements JFrameBaseInterface02 {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonCalcular;

    public Exercicio02LIsta09() {
        gerarTela();
        intanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
       acaoButtonCalcular();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void intanciarComponentes() {
        jButtonCalcular = new JButton("Calcular");
        jTextFieldNumero = new JTextField("");
        jLabelNumero = new JLabel("Número");
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(100, 20);
        jTextFieldNumero.setSize(100, 20);
        jButtonCalcular.setSize(50,50);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 50);
        jButtonCalcular.setLocation(10, 100);
    }

    @Override
    public void adicionarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField("");
        jButtonCalcular = new JButton("Calcular");
    }

    private void acaoButtonCalcular() {

        jButtonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    
                
            }
        });
    }
    }

    
    
    
}
