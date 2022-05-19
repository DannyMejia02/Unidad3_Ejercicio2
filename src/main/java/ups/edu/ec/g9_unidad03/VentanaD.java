/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.g9_unidad03;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PC-1
 */
public class VentanaD extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    
    public VentanaD(String title) throws HeadlessException {
        super(title);
        this.setSize(900,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(15,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        this.iniciarChecks();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
   
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanel1.add(this.jPanelList.get(9));
        this.jPanel1.add(this.jPanelList.get(10));
        this.jPanel1.add(this.jPanelList.get(11));
        this.jPanel1.add(this.jPanelList.get(12));
        this.jPanel1.add(this.jPanelList.get(13));
        this.jPanel1.add(this.jPanelList.get(14));
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus/Extension: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Codigo de proyecto: "));
        this.jLabelList.add(new JLabel("Asignatura: "));
        this.jLabelList.add(new JLabel("Nombre del grupo: "));
        this.jLabelList.add(new JLabel("Cupos por grupo: "));
        this.jLabelList.add(new JLabel("Autorizacion calificacion sobre 100: "));
        this.jLabelList.add(new JLabel("Seleccionar jornada del grupo: "));
        this.jLabelList.add(new JLabel("Oferta para estudiantes: "));
        this.jLabelList.add(new JLabel("Aplica cambio de grupo: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jLabelList.get(10));
        this.jPanelList.get(11).add(this.jLabelList.get(11));
        this.jPanelList.get(12).add(this.jLabelList.get(12));
        
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(15);
        this.jTextFieldList.get(1).setColumns(15);
        this.jTextFieldList.get(2).setColumns(15);
        this.jTextFieldList.get(3).setColumns(15);
        this.jTextFieldList.get(4).setColumns(15);
        this.jTextFieldList.get(5).setColumns(15);
        this.jTextFieldList.get(6).setColumns(15);
        this.jTextFieldList.get(7).setColumns(15);
        this.jTextFieldList.get(8).setColumns(15);
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(5));
        this.jPanelList.get(6).add(this.jTextFieldList.get(6));
        this.jPanelList.get(7).add(this.jTextFieldList.get(7));
        this.jPanelList.get(8).add(this.jTextFieldList.get(8));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Cancelar"));
        
        this.jPanelList.get(14).add(this.jButtonList.get(0));
        this.jPanelList.get(14).add(this.jButtonList.get(1));    
    }
    
    public void iniciarChecks(){
        this.jCheckboxList = new ArrayList<>();
        this.jCheckboxList.add(new JCheckBox("Nuevos"));
        
         this.jPanelList.get(11).add(this.jCheckboxList.get(0));
  
    }
    
    public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("No");
        this.jComboBox1.addItem("Si");
        
        this.jPanelList.get(10).add(this.jComboBox1);
        
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Jornadas Disponibles");
        this.jComboBox2.addItem("Diurna");
        this.jComboBox2.addItem("Noctura");
        
        this.jPanelList.get(12).add(this.jComboBox2);
        
        this.jComboBox3 = new JComboBox();
        this.jComboBox3.addItem("No");
        this.jComboBox3.addItem("Si");
        
        this.jPanelList.get(14).add(this.jComboBox3);
        
    }
    
    
}
