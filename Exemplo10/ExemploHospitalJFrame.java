package Exemplo10;

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
import javax.swing.text.MaskFormatter;

public class ExemploHospitalJFrame implements JFrameBaseInterface {

    private JFrame jFrame;
    private JTextField jTextFieldNome, jTextFieldRendaAnual;
    private JFormattedTextField jFormattedTextFieldCNPJ;
    private JComboBox jComboBoxCategoria;
    private JCheckBox jCheckBoxRendaAtual, jTextFieldAno, jCheckBoxPrivado;
    private JLabel jLabelAno, jLabelCategoria, jLabelNome, jLabelPrivado,
            jLabelRendaAnual, jLabelCNPJ;
    private JButton jButtonAdicionar, jButtonEditar, jButtonExcluir;
    private JTable jTable;
    private JScrollPane jScroolPane;
    private defaultTableMode dtm;
    private Object jScrollPane;
    public ExemploHospitalJFrame() {
        gerarTela();
        instanciarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        adicionarComponentes();

        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Hospital para o seu momento");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
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

    @Override
    public void gerarComponentes() {
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jTextFieldNome.setLocation(10,35);
        
        jLabelNome.setLocation(10,60);
        jTextFieldAno.setLocation(10,85);
        
        jLabelCNPJ.setLocation(10,110);
        jFormattedTextFieldCNPJ.setLocation(10,135);
        
        jLabelCategoria.setLocation(10,160);
        jComboBoxCategoria.setLocation(10,185);
        
        jLabelRendaAnual.setLocation(10,210);
        jTextFieldRendaAnual.setLocation(10,235);
        
        jCheckBoxPrivado.setLocation(10,260);
        
        jButtonAdicionar.setLocation(10,285);
        jScrollPane.setLocation(170,35);
        
    
    }

    @Override
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
      jScroolPane.setSize(300,400);
    }

    @Override
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
 private void configurarJTable(){
 dtm = new DefaultTableModel();
 dtm.addColumn("Nome");
 dtm.addColumn("Cnpj");
 dtm.addColumn("Renda Atual");
 jTable.setModel(dtm);

}
