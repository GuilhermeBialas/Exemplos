package Exercicio01Lista09Package;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Guilherme Bialas
 */
public class Exercicio01Lista09Principal implements JFrameBaseInterface {

    private JFrame jFrame;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;

    public Exercicio01Lista09Principal() {
        gerarTela();
        adcionarComponentes();
        instanciaComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoJButton01();
        acacoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
        acaoJButton10();
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
    public void adcionarComponentes() {
    }

    @Override
    public void instanciaComponentes() {
    }

    @Override
    public void gerarLocalizacoes() {
    }

    @Override
    public void gerarDimensoes() {
    }

}

public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

    
    }
