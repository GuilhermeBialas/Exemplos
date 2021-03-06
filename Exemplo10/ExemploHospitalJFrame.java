package Exemplo10;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class ExemploHospitalJFrame implements JFrameBaseInterface {

    private int linhaSelecionada -1;
    private JFrame jFrame;
    private JTextField jTextFieldNome, jTextFieldRendaAnual;
    private JFormattedTextField jFormattedTextFieldCNPJ;
    private JComboBox jComboBoxCategoria;
    private JCheckBox jCheckBoxRendaAtual, jTextFieldAno, jCheckBoxPrivado;
    private JLabel jLabelAno, jLabelCategoria, jLabelNome, jLabelPrivado, jLabelRendaAnual, jLabelCNPJ;
    private JButton jButtonAdicionar, jButtonEditar, jButtonExcluir;
    private JTable jTable;
    private JScrollPane jScroolPane;
    private DefaultTableModel dtm;
    private ArrayList<Hospital> hospitais = new ArrayList<>();

    public ExemploHospitalJFrame() {
        gerarTela();
        instanciarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        adicionarComponentes();

        jFrame.setVisible(true);

    }

    public void gerarTela() {
        jFrame = new JFrame("Hospital para o seu momento");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);
    }

    public void instanciarComponentes() {
        jLabelAno = new JLabel("Ano");
        jLabelCategoria = new JLabel("Categoria");
        jLabelRendaAnual = new JLabel("Renda Atual");
        jLabelCNPJ = new JLabel("CNPJ");
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JTextField();
        jTextFieldAno = new JTextField();
        jTextFieldRendaAnual = new JTextField();
        jCheckBoxPrivado = new JCheckBox();
        jComboBoxCategoria = new jCheckBox();
        jFormattedTextFieldCNPJ = new jFormattedTextField();
        jButtonAdicionar = new JButton("Adicionar");
        jButtonEditar = new JButton("Editar");
        jButtonExcluir = new JButton("Excuir");
        jTable = new JTable();
        configurarJTable();
        jScrollPane = new JScrollPane(jTable);
        configurarJComboBox();

    }

    public void gerarComponentes() {
    }

    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jTextFieldNome.setLocation(10, 35);

        jLabelNome.setLocation(10, 60);
        jTextFieldAno.setLocation(10, 85);

        jLabelCNPJ.setLocation(10, 110);
        jFormattedTextFieldCNPJ.setLocation(10, 135);

        jLabelCategoria.setLocation(10, 160);
        jComboBoxCategoria.setLocation(10, 185);

        jLabelRendaAnual.setLocation(10, 210);
        jTextFieldRendaAnual.setLocation(10, 235);

        jCheckBoxPrivado.setLocation(10, 260);

        jButtonAdicionar.setLocation(10, 285);
        jScrollPane.setLocation(170, 35);

    }

    public void gerarDimensoes() {
        jLabelNome.setSize(150, 20);
        jTextFieldNome.setSize(150, 20);
        jLabelAno.setSize(150, 20);
        jTextFieldAno.setSize(150, 20);

        jLabeCategoria.setSize(150, 20);
        jComboBoxCategoria(150, 20);

        jLabelRendaAnual.setSize(150, 20);
        jLabelTextFieldRendaAnual.setSize(150, 20);

        jCheckBoxPrivado.setSize(150, 20);

        jButtonRendaAdicionar.setSize(100, 20);
        jScroolPane.setSize(300, 400);
    }

    public void adicionarComponentes() {
        jFrame.add(jTextFieldAno);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldRendaAtual);
        jFrame.add(jComboBoxCategoria);
        jFrame.add(jCheckBoxPrivado);
        jFrame.add(jLabelAno);
        jFrame.add(jLabelCategoria);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelRendaAnual);
        jFrame.add(jButtonAdicionar);
        jFrame.add(jLabelCNPJ);
        jFrame.add(jButtonEditar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jFormattedTextFieldCNPJ);
        jFrame.add(jScrollPane);

    }

    private void configurarJComboBox() {
        DefaultComboBoxModel
    }

    private void configurarjFormattedTextField() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##.###.###/####-##");
            maskFormatter.install(jFormattedTextFieldCNPJ);
        } catch (Exeption e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog("Digita Direito");

        }
    }

    private void configurarJTable() {
        dtm = new DefaultTableModel();
        dtm.addColumn("Nome");
        dtm.addColumn("Cnpj");
        dtm.addColumn("Renda Atual");
        jTable.setModel(dtm);

    }

    private void acaoBotaoAdicionar() {
        jButtonAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hospital hospital = new Hospital();
                hospital.setNome(jTextFieldNome.getText());
                hospital.setCNPJ(jFormattedTextFieldCNPJ.getText());
                hospital.setRendaAnual(Double.parseDouble(
                        jTextFieldRendaAnual.getText()
                ));
                hospital.setPrivado(jCheckBoxPrivado.isSelected());
                hospital.setCategoria(
                        jComboBoxCategoria.getSelectedItem().toString()
                );
                hospítais.add(hospital);
                dtm.addRow(new Object[]{
                    hospital.getNome(),
                    hospital.getCnpjj(),
                    hospital.getRendaAnual()
                });
            }
        });

        limparCampos();

    }

    private void limparCampos() {
        jTextFieldAno.setText("");
        jTextFieldNome.setText("");
        jTextFieldRendaAnual.setText("");

        preencherCampos(hospital);
    }

    private void preencherCampos(Hospital hospital) {
        jTextFieldNome.setText(hospital.getNome());
        jTextFieldAno.setText(
                String.valueOf(hospital.getRendeAnual())
        );
    }

    jTextFieldRendeAnual.setText (
            String.valueOf

    (hospital.getRendaAnual()
      );
    jComboBoxCategoria.setText ()

);
      
      




}
