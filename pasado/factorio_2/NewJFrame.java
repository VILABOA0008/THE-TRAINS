/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorio_2;
import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mi
 */
public class NewJFrame extends javax.swing.JFrame {
           DefaultTableModel model;
          
       String m[][];
   
Basicos b=new Basicos();
String sdirectorio;
   String spaguete="";
      String sclase="";
String[] s;
 int c=-1,cp=-1;
   

    public NewJFrame() {
     
        initComponents();
        this.setLocation(200, 0);    
        
     //   if(c==0){b.getBases().add(new tabla());}
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vpojos = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        poset = new javax.swing.JCheckBox();
        poget = new javax.swing.JCheckBox();
        ponombre = new javax.swing.JTextField();
        potipo = new javax.swing.JComboBox<>();
        bpojear = new javax.swing.JButton();
        jscroll = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpojos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;}};
        jButton1 = new javax.swing.JButton();
        pojearclasee = new javax.swing.JButton();
        tnombrepojo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        lconstructor = new javax.swing.JLabel();
        poconstructor = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cconsturctorvacio = new javax.swing.JCheckBox();
        tnumeropojos = new javax.swing.JLabel();
        cpojos = new javax.swing.JComboBox<>();
        Borrarpojo = new javax.swing.JButton();
        basetablacreae1 = new javax.swing.JButton();
        tnombrpojo = new javax.swing.JTextField();
        totro = new javax.swing.JComboBox<>();
        pojoaddpk = new javax.swing.JButton();
        pojokeys = new javax.swing.JLabel();
        framechoser = new javax.swing.JFrame();
        choser = new javax.swing.JFileChooser();
        vbases = new javax.swing.JFrame();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tbasenombre1 = new javax.swing.JTextField();
        basetipo1 = new javax.swing.JComboBox<>();
        jscroll1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbases = new javax.swing.JTable();
        baseborrarfila = new javax.swing.JButton();
        basecrear = new javax.swing.JButton();
        tnombrebase = new javax.swing.JTextField();
        totro1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tbasenombre2 = new javax.swing.JTextField();
        basetipo2 = new javax.swing.JComboBox<>();
        basenumero1 = new javax.swing.JTextField();
        basenumero2 = new javax.swing.JTextField();
        basenull1 = new javax.swing.JComboBox<>();
        basenull2 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        bañadicosasrtabla = new javax.swing.JButton();
        basetablacreae = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tnombretabla = new javax.swing.JTextField();
        tbasenombreclase = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tnumerotablas = new javax.swing.JLabel();
        ctablas = new javax.swing.JComboBox<>();
        Borrartabla = new javax.swing.JButton();
        bcosas = new javax.swing.JButton();
        vtabla = new javax.swing.JFrame();
        bintroducirkey = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ctablakey = new javax.swing.JComboBox<>();
        bintroducirforeign = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cforeigtabla = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        tablaforeignnombre = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalis = new javax.swing.JList<>();
        jLabel32 = new javax.swing.JLabel();
        bintroducirkey1 = new javax.swing.JButton();
        internalchose = new javax.swing.JInternalFrame();
        borrararchivo = new javax.swing.JButton();
        vbcosas = new javax.swing.JFrame();
        cosaspojos = new javax.swing.JComboBox<>();
        jscroll2 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tcosaspojos = new javax.swing.JTable();
        btransfpota1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        cosaslis = new javax.swing.JList<>();
        jscroll3 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        maptext = new javax.swing.JTextArea();
        botmap = new javax.swing.JButton();
        nombremap = new javax.swing.JTextField();
        labelprincipalerrores = new javax.swing.JLabel();
        bautomatizacion = new javax.swing.JButton();
        bopaltas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bopbajas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bopmodific = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bopconsultas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        truta = new javax.swing.JTextField();
        bpojos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bbases = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        vpojos.setSize(new java.awt.Dimension(510, 382));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("POJOS");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Tipo");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Set");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Get");

        poset.setSelected(true);

        poget.setSelected(true);

        ponombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ponombreKeyPressed(evt);
            }
        });

        potipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "String", "int", "float", "ArrayList<otro>", "Set<otro>", "Date", "Time", "boolean", " ", " " }));
        potipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                potipoKeyPressed(evt);
            }
        });

        bpojear.setText("Pojear");
        bpojear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bpojearMouseClicked(evt);
            }
        });

        tpojos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Get", "set", "Constructor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tpojos.setToolTipText("");
        jScrollPane1.setViewportView(tpojos);

        jscroll.setViewportView(jScrollPane1);

        jButton1.setText("Borrar fila");
        jButton1.setText("Borrar\nFila");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        pojearclasee.setText("Pojear Clase");
        pojearclasee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pojearclaseeMouseClicked(evt);
            }
        });

        jLabel16.setText("(Nombre de la clase)");

        lconstructor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lconstructor.setText("Constructor");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setText("(Otro)");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Constructor Vacio");

        cconsturctorvacio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cconsturctorvacioMouseClicked(evt);
            }
        });

        tnumeropojos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tnumeropojos.setText("Hay 0 Pojos");

        cpojos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpojosActionPerformed(evt);
            }
        });

        Borrarpojo.setText("Borrar Pojo");
        Borrarpojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarpojoMouseClicked(evt);
            }
        });

        basetablacreae1.setText("Crear pojo");
        basetablacreae1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basetablacreae1MouseClicked(evt);
            }
        });

        totro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "String", "Integer", "Float", "Date" }));
        totro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totroKeyPressed(evt);
            }
        });

        pojoaddpk.setText("PK");
        pojoaddpk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pojoaddpkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout vpojosLayout = new javax.swing.GroupLayout(vpojos.getContentPane());
        vpojos.getContentPane().setLayout(vpojosLayout);
        vpojosLayout.setHorizontalGroup(
            vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vpojosLayout.createSequentialGroup()
                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vpojosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pojearclasee)
                        .addGap(27, 27, 27)
                        .addComponent(tnombrepojo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpojosLayout.createSequentialGroup()
                        .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(vpojosLayout.createSequentialGroup()
                                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(vpojosLayout.createSequentialGroup()
                                        .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(vpojosLayout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(totro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(vpojosLayout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(pojokeys, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(pojoaddpk, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(vpojosLayout.createSequentialGroup()
                                                    .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(ponombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(34, 34, 34)
                                                    .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13)
                                                        .addComponent(potipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpojosLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(34, 34, 34)))
                                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(vpojosLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpojosLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(cconsturctorvacio)
                                                .addGap(41, 41, 41)
                                                .addComponent(Borrarpojo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(vpojosLayout.createSequentialGroup()
                                                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(vpojosLayout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel14))
                                                    .addGroup(vpojosLayout.createSequentialGroup()
                                                        .addComponent(poget)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(poset)))
                                                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(vpojosLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lconstructor))
                                                    .addGroup(vpojosLayout.createSequentialGroup()
                                                        .addGap(41, 41, 41)
                                                        .addComponent(poconstructor)
                                                        .addGap(38, 38, 38)
                                                        .addComponent(bpojear)))
                                                .addGap(0, 12, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpojosLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(vpojosLayout.createSequentialGroup()
                                                    .addComponent(tnumeropojos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cpojos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(vpojosLayout.createSequentialGroup()
                                                    .addComponent(tnombrpojo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(basetablacreae1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        vpojosLayout.setVerticalGroup(
            vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vpojosLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(vpojosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vpojosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cconsturctorvacio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpojosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(Borrarpojo)
                        .addGap(6, 6, 6)))
                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpojosLayout.createSequentialGroup()
                        .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tnumeropojos)
                            .addComponent(cpojos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(basetablacreae1)
                            .addComponent(tnombrpojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpojosLayout.createSequentialGroup()
                        .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pojoaddpk)
                            .addComponent(pojokeys, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(totro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13))
                    .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(vpojosLayout.createSequentialGroup()
                            .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(potipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, vpojosLayout.createSequentialGroup()
                            .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14)
                                .addComponent(lconstructor))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(poget)
                                .addComponent(poconstructor)))
                        .addComponent(poset)
                        .addComponent(bpojear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vpojosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tnombrepojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pojearclasee)
                    .addComponent(jButton1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        framechoser.setSize(new java.awt.Dimension(583, 360));

        choser.setAccessory(internalchose);
        choser.setApproveButtonToolTipText("");
        choser.setControlButtonsAreShown(false);
        choser.setCurrentDirectory(new java.io.File("I:\\2proyectosmios\\Probarfactorio\\src"));
        choser.setDialogTitle("");
        choser.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
        choser.setPreferredSize(new java.awt.Dimension(425, 245));
        choser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choserActionPerformed(evt);
            }
        });
        choser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                choserPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout framechoserLayout = new javax.swing.GroupLayout(framechoser.getContentPane());
        framechoser.getContentPane().setLayout(framechoserLayout);
        framechoserLayout.setHorizontalGroup(
            framechoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(choser, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        framechoserLayout.setVerticalGroup(
            framechoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(choser, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        framechoser.setLocation(700,0);

        vbases.setSize(new java.awt.Dimension(510, 382));
        vbases.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                vbasesWindowOpened(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Nombre");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Tipo");

        tbasenombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbasenombre1MouseClicked(evt);
            }
        });

        basetipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INT", "VARCHAR", "CHAR", "FLOAT", "DATE", "otro" }));

        tbases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Cosas", "Nº", "NULL"
            }
        ));
        tbases.setToolTipText("");
        jScrollPane3.setViewportView(tbases);

        jscroll1.setViewportView(jScrollPane3);

        baseborrarfila.setText("Borrar fila");
        jButton1.setText("Borrar\nFila");
        baseborrarfila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baseborrarfilaMouseClicked(evt);
            }
        });

        basecrear.setText("Crear Base con todo");
        basecrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basecrearMouseClicked(evt);
            }
        });

        tnombrebase.setToolTipText("");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel28.setText("(Otro)");

        tbasenombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbasenombre2MouseClicked(evt);
            }
        });

        basetipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INT", "VARCHAR", "CHAR", "FLOAT", "DATE", "otro" }));

        basenull1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOT NULL", "NULL" }));

        basenull2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOT NULL", "NULL" }));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Nº");

        bañadicosasrtabla.setText("Añadir");
        bañadicosasrtabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bañadicosasrtablaMouseClicked(evt);
            }
        });

        basetablacreae.setText("Crear tabla");
        basetablacreae.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basetablacreaeMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Base");

        jLabel29.setText("(Nombre base)");

        jLabel33.setText("(Nombre clase)");

        tnumerotablas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tnumerotablas.setText("Hay 0 tablas");

        ctablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctablasActionPerformed(evt);
            }
        });

        Borrartabla.setText("Borrar Tabla");
        Borrartabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrartablaMouseClicked(evt);
            }
        });

        bcosas.setText("en proceso");
        bcosas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcosasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout vbasesLayout = new javax.swing.GroupLayout(vbases.getContentPane());
        vbases.getContentPane().setLayout(vbasesLayout);
        vbasesLayout.setHorizontalGroup(
            vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vbasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vbasesLayout.createSequentialGroup()
                        .addComponent(basecrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tnombrebase, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addGap(10, 10, 10)
                        .addComponent(tbasenombreclase, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(vbasesLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(vbasesLayout.createSequentialGroup()
                                    .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(vbasesLayout.createSequentialGroup()
                                            .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel22)
                                                .addComponent(tbasenombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(34, 34, 34)
                                            .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel24)
                                                .addComponent(basetipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(vbasesLayout.createSequentialGroup()
                                            .addComponent(tbasenombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34)
                                            .addComponent(basetipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(vbasesLayout.createSequentialGroup()
                                            .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(basenumero1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(basenumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(basenull1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(basenull2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bañadicosasrtabla, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bcosas, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addContainerGap(41, Short.MAX_VALUE))
                                .addGroup(vbasesLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28))
                                    .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(vbasesLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(totro1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(vbasesLayout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(vbasesLayout.createSequentialGroup()
                                                    .addComponent(tnumerotablas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ctablas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(vbasesLayout.createSequentialGroup()
                                                    .addComponent(tnombretabla, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(basetablacreae)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Borrartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(76, Short.MAX_VALUE))))
                        .addComponent(jscroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vbasesLayout.createSequentialGroup()
                        .addComponent(baseborrarfila)
                        .addContainerGap(433, Short.MAX_VALUE))))
        );
        vbasesLayout.setVerticalGroup(
            vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vbasesLayout.createSequentialGroup()
                .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(vbasesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tnumerotablas)
                            .addComponent(ctablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(basetablacreae)
                            .addComponent(tnombretabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Borrartabla))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(vbasesLayout.createSequentialGroup()
                        .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22))
                        .addGap(9, 9, 9)
                        .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbasenombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(basetipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbasenombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(basetipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(vbasesLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(12, 12, 12)
                        .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(basenumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(basenull2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(vbasesLayout.createSequentialGroup()
                                .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(basenumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(basenull1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))))
                    .addGroup(vbasesLayout.createSequentialGroup()
                        .addComponent(bcosas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bañadicosasrtabla)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totro1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baseborrarfila)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vbasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basecrear)
                    .addComponent(jLabel29)
                    .addComponent(tnombrebase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbasenombreclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        vtabla.setSize(new java.awt.Dimension(400, 300));

        bintroducirkey.setText("Introducir");
        bintroducirkey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bintroducirkeyMouseClicked(evt);
            }
        });
        bintroducirkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bintroducirkeyActionPerformed(evt);
            }
        });

        jLabel1.setText("Primary key");

        bintroducirforeign.setText("Introducir");
        bintroducirforeign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bintroducirforeignMouseClicked(evt);
            }
        });

        jLabel2.setText("Foreign key");

        cforeigtabla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cforeigtablaItemStateChanged(evt);
            }
        });

        jLabel23.setText("Table");

        jLabel30.setText("Cambiar nombre");

        tablalis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tablalis);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel32.setText("(OPCIONAL)");

        bintroducirkey1.setText("+1PK");
        bintroducirkey1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bintroducirkey1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout vtablaLayout = new javax.swing.GroupLayout(vtabla.getContentPane());
        vtabla.getContentPane().setLayout(vtablaLayout);
        vtablaLayout.setHorizontalGroup(
            vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vtablaLayout.createSequentialGroup()
                        .addGroup(vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(vtablaLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel23))
                            .addGroup(vtablaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(vtablaLayout.createSequentialGroup()
                                        .addComponent(cforeigtabla, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(vtablaLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(vtablaLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel32)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(vtablaLayout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(bintroducirforeign)))
                                .addGap(76, 76, 76)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(vtablaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctablakey, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vtablaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(tablaforeignnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(vtablaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bintroducirkey)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bintroducirkey1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        vtablaLayout.setVerticalGroup(
            vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtablaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bintroducirkey)
                    .addComponent(ctablakey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bintroducirkey1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vtablaLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vtablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cforeigtabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tablaforeignnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vtablaLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(23, 23, 23)))
                .addComponent(bintroducirforeign)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        internalchose.setVisible(true);

        borrararchivo.setFont(new java.awt.Font("Segoe Print", 0, 8)); // NOI18N
        borrararchivo.setForeground(new java.awt.Color(255, 0, 0));
        borrararchivo.setText("Borrar archivo selecionado");
        borrararchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrararchivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout internalchoseLayout = new javax.swing.GroupLayout(internalchose.getContentPane());
        internalchose.getContentPane().setLayout(internalchoseLayout);
        internalchoseLayout.setHorizontalGroup(
            internalchoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalchoseLayout.createSequentialGroup()
                .addComponent(borrararchivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        internalchoseLayout.setVerticalGroup(
            internalchoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalchoseLayout.createSequentialGroup()
                .addComponent(borrararchivo)
                .addGap(0, 175, Short.MAX_VALUE))
        );

        vbcosas.setSize(new java.awt.Dimension(1000, 400));
        vbcosas.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                vbcosasWindowClosing(evt);
            }
        });

        cosaspojos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosaspojosActionPerformed(evt);
            }
        });

        tcosaspojos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Nº", "Cosas", "Null"
            }
        ));
        jScrollPane4.setViewportView(tcosaspojos);

        jscroll2.setViewportView(jScrollPane4);

        btransfpota1.setText("Añadir a la base");
        btransfpota1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btransfpota1MouseClicked(evt);
            }
        });

        cosaslis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(cosaslis);

        maptext.setColumns(20);
        maptext.setRows(5);
        jScrollPane6.setViewportView(maptext);

        jscroll3.setViewportView(jScrollPane6);

        botmap.setText("MAPEAR");
        botmap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botmapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout vbcosasLayout = new javax.swing.GroupLayout(vbcosas.getContentPane());
        vbcosas.getContentPane().setLayout(vbcosasLayout);
        vbcosasLayout.setHorizontalGroup(
            vbcosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vbcosasLayout.createSequentialGroup()
                .addGroup(vbcosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(vbcosasLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(vbcosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cosaspojos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(vbcosasLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btransfpota1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombremap, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botmap))))
                    .addComponent(jscroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jscroll3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        vbcosasLayout.setVerticalGroup(
            vbcosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vbcosasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cosaspojos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jscroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(vbcosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btransfpota1)
                    .addComponent(botmap)
                    .addComponent(nombremap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(vbcosasLayout.createSequentialGroup()
                .addComponent(jscroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(347, 378));

        labelprincipalerrores.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        bautomatizacion.setText("AUTOMATIZACION");
        bautomatizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bautomatizacionMouseClicked(evt);
            }
        });

        bopaltas.setText("1");
        bopaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bopaltasActionPerformed(evt);
            }
        });

        jLabel3.setText("Altas");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Numero de metodos");

        bopbajas.setText("1");

        jLabel5.setText("Bajas");

        bopmodific.setText("1");

        jLabel6.setText("Modificaciones");

        bopconsultas.setText("1");

        jLabel7.setText("Consultas");

        truta.setText("I:\\2proyectosmios\\Probarfactorio\\src\\pru");

        bpojos.setText("Pojos");
        bpojos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bpojosMouseClicked(evt);
            }
        });

        jButton2.setText("Ruta");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel8.setText("Elige el paquete donde crear altas bajas modis y consultis");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("AVISO  En esta ruta se creara TODO , tal vez tengas que ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel21.setText("cambiarla cuando vayas a crear algo asegurate que acabe en ");

        bbases.setText("Bases");
        bbases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbasesMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel25.setText("\\src\\\"nombre del paquete\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelprincipalerrores, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(truta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bpojos)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bopaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bautomatizacion)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(9, 9, 9)
                                                .addComponent(bopbajas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bopmodific, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bopconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(bbases)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addGap(58, 58, 58)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelprincipalerrores, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(4, 4, 4)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(truta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bpojos)
                            .addComponent(bbases)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bopaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(bopbajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bopmodific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(bopconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bautomatizacion)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel17)
                    .addContainerGap(250, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void bautomatizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bautomatizacionMouseClicked
    try{
     
    int response = JOptionPane.showConfirmDialog(null, "SOBREESCRIBIR MAIN Y CREAR \nAltas Bajas Modificaciones y Consultas ", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.YES_OPTION) {
  


      b.getOpswi().add(Integer.valueOf(bopaltas.getText()));
      b.getOpswi().add(Integer.valueOf(bopbajas.getText()));
      b.getOpswi().add(Integer.valueOf(bopmodific.getText()));
      b.getOpswi().add(Integer.valueOf(bopconsultas.getText()));
    crear();}
    }catch(NumberFormatException e){labelprincipalerrores.setText("Esciba los numeros bien");}
    }//GEN-LAST:event_bautomatizacionMouseClicked

    private void bopaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bopaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bopaltasActionPerformed

    private void bpojosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bpojosMouseClicked
     vpojos.setVisible(true);
    }//GEN-LAST:event_bpojosMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    
        if(tpojos.getSelectedRow()!=-1){
        borrarfila(tpojos,b.getPoj().get(cp).getP());
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void pojearclaseeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pojearclaseeMouseClicked

   
b.setCp(cpojos.getSelectedIndex());
tnombrepojo.setText(cpojos.getSelectedItem().toString());
           b.setAuxclase(tnombrepojo.getText());
      
    
      if(cconsturctorvacio.isSelected()){b.setConsvacio(true);}else{b.setConsvacio(false);}
 //      if(cconstructorverdad.isSelected()){b.setCons(true);}else{b.setCons(false);}
       b.setCons(false);
       for(String[]i: b.getPoj().get(cp).getP()){
       if(i[4].equalsIgnoreCase("Si")){b.setCons(true);break;}
       }
            automatizacion.autommatizacion(b,"pojo");
 b.setAuxclase(null);
            
    }//GEN-LAST:event_pojearclaseeMouseClicked

    private void choserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_choserPropertyChange
try{
  
    sdirectorio=choser.getSelectedFile().toString();
      b.setArchivo(sdirectorio);
    spaguete=choser.getName(choser.getSelectedFile());
    b.setPaquete(spaguete);
        truta.setText(choser.getSelectedFile().toString());
      
  
     
}catch(NullPointerException e){System.out.println("null");}
    }//GEN-LAST:event_choserPropertyChange

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
 framechoser.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void bbasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbasesMouseClicked
vbases.setVisible(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_bbasesMouseClicked
private void borrarfila(JTable t,ArrayList<String[]> o){
o.remove(t.getSelectedRow());

t.setModel(crearModelobien(t));
for(String[]i:o){
    insertarbien(i, t);}



}
    private void baseborrarfilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baseborrarfilaMouseClicked
        borrarfila(tbases, b.getBases().get(c).getT());
        
     
/*for(int i=0;i<b.getBases().get(c).getT().size();i++){
   insertarbien(b.getBases().get(c).getT().get(i),false);}*/


     
    }//GEN-LAST:event_baseborrarfilaMouseClicked

    private void basecrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basecrearMouseClicked


if(!tnombrebase.getText().isEmpty()&&!tbasenombreclase.getText().isEmpty()){b.setNombrebase(tnombrebase.getText());
b.setAuxclase(tbasenombreclase.getText());
if(b.getBases().get(b.getBases().size()-1).getNombre()==null){b.getBases().remove(b.getBases().get(b.getBases().size()-1));}
automatizacion.autommatizacion(b, "base");}else{error("Completa los campos");}
 
    }//GEN-LAST:event_basecrearMouseClicked

    private void tbasenombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbasenombre1MouseClicked

        if(c!=-1){        
             if(!tbasenombre2.getText().isEmpty()){
             if((basenumero2.getText().isEmpty()||numero(basenumero2.getText()))==true&&numero(tbasenombre2.getText().substring(0,1))==false){
      
        s=new String[5];
        String a="",a1,a2;int i=0;
        s[i]=(tbasenombre2.getText());i++;
        if(basetipo2.getSelectedItem()=="otro"){a1=totro1.getText();} else{a1=basetipo2.getSelectedItem().toString();}        
        s[i]=a1;i++;
        if(basenumero2.getText().isEmpty()){a2="";}else{a2="("+basenumero2.getText()+")";}
        s[i]=a2;i++;
        s[i]=(a);i++;
        s[i]=(basenull2.getSelectedItem().toString());i++;   
        if(tbasenombre2.getText().isEmpty()){}else{
      
        insertarbien(s,tbases);tbasenombre2.setText("");basenumero2.setText("");b.getBases().get(c).getT().add(s);   }    
        }else{error("utilize numeros o letras segun corresponda");}}
}else{error("Cree o elige una tabla");}
    }//GEN-LAST:event_tbasenombre1MouseClicked

    private void tbasenombre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbasenombre2MouseClicked
      
        if(c!=-1){         
            if(!tbasenombre1.getText().isEmpty()){
              if((basenumero1.getText().isEmpty()||numero(basenumero1.getText())==true)&&numero(tbasenombre1.getText().substring(0,1))==false){
         s=new String[5];
        String a="",a1,a2;int i=0;
        s[i]=(tbasenombre1.getText());i++;
        if(basetipo1.getSelectedItem()=="otro"){a1=totro1.getText();} else{a1=basetipo1.getSelectedItem().toString();}        
        s[i]=a1;i++;
        if(basenumero1.getText().isEmpty()){a2="";}else{a2="("+basenumero1.getText()+")";}
        s[i]=a2;i++;
        s[i]=(a);i++;
        s[i]=(basenull1.getSelectedItem().toString());i++;  
        if(tbasenombre1.getText().isEmpty()){}else{
        insertarbien(s,tbases);tbasenombre1.setText("");basenumero1.setText("");b.getBases().get(c).getT().add(s);   }    
        }else{error("utilize numeros o letras segun corresponda");}
        }}else{error("Cree o elige una tabla");}
    }//GEN-LAST:event_tbasenombre2MouseClicked

    private boolean numero(String a){
        
       
        boolean r=true;
        try{ Integer.parseInt(a);r=true;
     } catch (NumberFormatException e) {      r=false; 
        }  
   
    return r;
    }
    
    private void bintroducirkeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bintroducirkeyMouseClicked

b.getBases().get(c).setKe(false);
b.getBases().get(c).setKey(ctablakey.getSelectedItem().toString());
        resetearlisttabla();
    }//GEN-LAST:event_bintroducirkeyMouseClicked

    private void bañadicosasrtablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bañadicosasrtablaMouseClicked
if(c==-1){error("Primero cree una tabla");}else{
        ctablakey.removeAllItems();

cforeigtabla.removeAllItems();
        vtabla.setVisible(true);       
        int j=0;
for(String[] i:b.getBases().get(c).getT()){
ctablakey.addItem(i[0]);}  
for(tabla i:b.getBases()){
    if(j<c){
cforeigtabla.addItem(i.getNombre());}
j++;}  
resetearlisttabla();
}

    }//GEN-LAST:event_bañadicosasrtablaMouseClicked

    private void basetablacreaeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basetablacreaeMouseClicked
        // CREAR tABLAAAAAAAAAAA
        boolean error=false;
        if(c==-1){}else{
        if(b.getBases().get(c).getKey()==null){error("Pongale una prymary key primero");error=true;}}
        if(tnombretabla.getText().isEmpty()){error("Pongale un nombre a la tabla");}
        for(tabla i:b.getBases()){
        if(i.getNombre().equalsIgnoreCase(tnombretabla.getText())){error=true;error("Nombre repetido");break;}
        }
        
            if(error==false){
        b.getBases().add(new tabla());        
        c++;tnumerotablas.setText("Hay "+(b.getBases().size())+" tablas");
        b.getBases().get(c).setNombre(tnombretabla.getText());
       

            crearModelobien(tbases);
    tnombretabla.setText("");    
            rescombo(ctablas, 'b');}
        
        
        
        c=ctablas.getSelectedIndex();
    }//GEN-LAST:event_basetablacreaeMouseClicked

    private void borrararchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrararchivoMouseClicked
try{
        File a=new File(choser.getSelectedFile().getAbsolutePath());
        a.delete();
  
}catch(NullPointerException e){errorruta();}
         choser.rescanCurrentDirectory();
    }//GEN-LAST:event_borrararchivoMouseClicked

    private void bintroducirforeignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bintroducirforeignMouseClicked
        // INTRODUCISR LA FOREING
        if(!tablaforeignnombre.getText().isEmpty()&&cforeigtabla.getSelectedItem()!=null){
        String[]q=new String[3];
        q[0]=tablaforeignnombre.getText();
        q[1]=cforeigtabla.getSelectedItem().toString();
         String[]qq=null;
        for(String[] i:b.getBases().get(cforeigtabla.getSelectedIndex()).getT()){
        if(i[0].equalsIgnoreCase(b.getBases().get(cforeigtabla.getSelectedIndex()).getKey())){qq=i;
        q[2]=i[0];}
        }
    
        qq[0]=tablaforeignnombre.getText();        
            insertarbien(qq,tbases);
            b.getBases().get(c).getT().add(s);   
            ctablakey.addItem(qq[0]);
        b.getBases().get(c).getF().add(q);resetearlisttabla();}else{error("Introduce todos los campos");}
        
    }//GEN-LAST:event_bintroducirforeignMouseClicked

    private void choserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choserActionPerformed

    private void cforeigtablaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cforeigtablaItemStateChanged
if(vtabla.isVisible()){
        for(String[] i:b.getBases().get(cforeigtabla.getSelectedIndex()).getT()){
        if(i[0].equalsIgnoreCase(b.getBases().get(cforeigtabla.getSelectedIndex()).getKey())){tablaforeignnombre.setText(i[0]);
       }}
        }
    }//GEN-LAST:event_cforeigtablaItemStateChanged

    private void vbasesWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_vbasesWindowOpened
   // TODO add your handling code here:
    }//GEN-LAST:event_vbasesWindowOpened

    private void ctablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctablasActionPerformed
if(ctablas.getSelectedIndex()!=-1){
        c=ctablas.getSelectedIndex();
        tbases.setModel(crearModelobien(tbases));
for(String[]i:b.getBases().get(c).getT()){
    insertarbien(i, tbases);}}
    }//GEN-LAST:event_ctablasActionPerformed

    private void BorrartablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrartablaMouseClicked
  if(c>=0){b.getBases().remove(c);
if(c==-1){}else{

     
    tbases.setModel(crearModelobien(tbases));
  rescombo(ctablas, 'b');}
c=b.getBases().size()-1;
}else{error("No hay ninguna tabla");}     
     tnumerotablas.setText("Hay "+(b.getBases().size())+" tablas");  // BORRAR TABLA
       
 
    }//GEN-LAST:event_BorrartablaMouseClicked

    private void bintroducirkey1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bintroducirkey1MouseClicked
      boolean error=false;
        tabla t=b.getBases().get(c);
        if(t.getKey()==null){error("No hay primary key");error=true;}
          if(error==false){
              if(!t.isKe()){
                  System.out.println("aquiii");
              String s[]={t.getKey(),ctablakey.getSelectedItem().toString()};
              t.setKeys(new String[2]);
              t.getKeys()[0]=s[0];t.getKeys()[1]=s[1];
              }else{
                  System.out.println("lliisdii");
              String s[]=t.getKeys();
              t.setKeys(new String[t.getKeys().length+1]);
              for(int i=0;i<s.length;i++){
              t.getKeys()[i]=s[i];
              }
              t.getKeys()[s.length]=ctablakey.getSelectedItem().toString();
              }

        t.setKe(true);
        resetearlisttabla();}
    }//GEN-LAST:event_bintroducirkey1MouseClicked
public void resetearlisttabla(){
         tabla t=b.getBases().get(c);
    
                  String s[]=new String[1+t.getF().size()];
                  
      int j=0;String a;
      if(t.isKe()){           
      a="PRIMARY KEY(";
      for(int i=0;i<t.getKeys().length;i++){
              if(i==t.getKeys().length-1){ a+=t.getKeys()[i];}else{  a+=t.getKeys()[i]+","; }}
      a+=");";
       }else{
            a="PRIMARY KEY("+t.getKey()+");";}         
        s[j]=a;
        
      j++;
      
        for(String[] i:t.getF()){
        s[j]=i[0]+" REFERENCES "+i[1]+"("+i[2]+")";
            j++;
        }

        tablalis.setListData(s);     
}
    private void bintroducirkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bintroducirkeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bintroducirkeyActionPerformed

    private void cpojosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpojosActionPerformed
    
        if(cpojos.getSelectedIndex()!=-1){        
        cp=cpojos.getSelectedIndex();
            if(b.getPoj().get(cp).isConstrvacio()){cconsturctorvacio.setSelected(true);}else{cconsturctorvacio.setSelected(false);}
    tpojos.setModel(crearModelobien(tpojos));
for(String[]i:b.getPoj().get(cp).getP()){
    insertarbien(i, tbases);}
pojokeys.setText(b.getPoj().get(cp).getKey());
     rescombo(totro, 'n');
       rescombo(potipo, 't');
     }
    }//GEN-LAST:event_cpojosActionPerformed

    private void BorrarpojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarpojoMouseClicked
 if(cp>=0){b.getPoj().remove(cp);cp--;      
 if(cp==-1){tpojos.setModel(crearModelobien(tbases));}
 cp=b.getPoj().size();
 cpojos.setSelectedIndex(cp-1);
 tnumeropojos.setText("Hay "+b.getPoj().size()+" Pojos");
     rescombo(cpojos, 'p');
     rescombo(totro, 'n');     
 }
    }//GEN-LAST:event_BorrarpojoMouseClicked

    private void basetablacreae1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basetablacreae1MouseClicked
boolean error=false;
        if(tnombrpojo.getText().isEmpty()){error=true;error("Escriba el nombre");}
      for(pojos i:b.getPoj()){
      if(i.getNombre().equalsIgnoreCase(tnombrpojo.getText())){error("Nombre de pojo repetido");error=true;break;}
      }     
     if(error==false){
     cp++;
     pojos p=new pojos();
     p.setNombre(tnombrpojo.getText());
     b.getPoj().add(p);
        tnumeropojos.setText("Hay "+b.getPoj().size()+" Pojos");
     rescombo(cpojos, 'p');
     rescombo(totro, 'n');
       rescombo(potipo, 't');}
    tnombrpojo.setText("");
    }//GEN-LAST:event_basetablacreae1MouseClicked

public void rescombo(JComboBox j,char ch){
  
    j.removeAllItems();
    switch(ch){
        case 'b':   for( tabla i:b.getBases()){
                        j.addItem(i.getNombre());}
                        j.setSelectedIndex(j.getItemCount()-1);break;
        case 'p': for( pojos i:b.getPoj()){
                        j.addItem(i.getNombre());System.out.println(i.getNombre());}
                        j.setSelectedIndex(j.getItemCount()-1);break;
       case 'n': j.addItem("String");j.addItem("Integer");j.addItem("Float");j.addItem("Date");
           for( pojos i:b.getPoj()){
                       if(!i.getNombre().equalsIgnoreCase(b.getPoj().get(cp).getNombre())){      j.addItem(i.getNombre());}}
                     j.setSelectedIndex(j.getItemCount()-1);break;
       case 't': j.addItem("String");j.addItem("int");j.addItem("float");j.addItem("ArrayList<otro>");j.addItem("Set<otro>");
        j.addItem("Date");j.addItem("Time");   j.addItem("boolean");j.addItem("char");
 
           for( pojos i:b.getPoj()){
                     if(!i.getNombre().equalsIgnoreCase(b.getPoj().get(cp).getNombre())){   j.addItem(i.getNombre());}}
                       j.setSelectedIndex(0);break;
    
    }
  
}

public void pojear(){
       
          if(cp!=-1){
       if(!ponombre.getText().isEmpty()&&numero(ponombre.getText().substring(0,1))==false){

                   String a1,a2="No",a3="No",a4="NO";
       if(potipo.getSelectedIndex()==3){a1="ArrayList<"+totro.getSelectedItem()+">";}else{
       if(potipo.getSelectedIndex()==4){a1="Set<"+totro.getSelectedItem()+">";}       
       
       else{a1=potipo.getSelectedItem().toString();}}
    if(poget.isSelected()){a2="Si";}
     if(poset.isSelected()){a3="Si";}
     if(poconstructor.isSelected()){a4="Si";}
        String []po=new String[5];
        po[0]=ponombre.getText();
        po[1]=a1;
        po[2]=a2;
        po[3]=a3;
        po[4]=a4;
        insertarbien(po, tpojos);
        b.getPoj().get(cp).getP().add(po);
     ponombre.setText("");

}else{error("Escriba bien los campos");}}else{error("Cree un pojo primero");}}
    private void bpojearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bpojearMouseClicked
pojear();
    }//GEN-LAST:event_bpojearMouseClicked

    private void ponombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ponombreKeyPressed
  if(evt.getKeyCode()==10){pojear();}   // TODO add your handling code here:
    }//GEN-LAST:event_ponombreKeyPressed

    private void potipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_potipoKeyPressed
if(evt.getKeyCode()==10){pojear();}          
    }//GEN-LAST:event_potipoKeyPressed

    private void cconsturctorvacioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cconsturctorvacioMouseClicked
if(cconsturctorvacio.isSelected()){
        b.getPoj().get(cp).setConstrvacio(true);}else{ b.getPoj().get(cp).setConstrvacio(false);}     // TODO add your handling code here:
    }//GEN-LAST:event_cconsturctorvacioMouseClicked

    private void totroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totroKeyPressed

    private void bcosasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcosasMouseClicked
   if(b.getPoj().size()==0){error("Cree pojos primero");}else{
        for(pojos i: b.getPoj()){
    if(i.getKey()==null){i.setKey(i.getP().get(0)[1]);System.out.println("NO HAY KEY EN "+i.getNombre());}
    }
        rescombo(cosaspojos,'p');
       
        vbcosas.setVisible(true);        // TMOSTRAR AUTOM
         cosaspojos.setSelectedIndex(0);}
    }//GEN-LAST:event_bcosasMouseClicked

    private void btransfpota1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btransfpota1MouseClicked

        if(c==-1){}   
    c=b.getBases().size();
    b.getBases().add(new tabla());       
        pojos p=b.getPoj().get(cosaspojos.getSelectedIndex());
        b.getBases().get(c).setNombre(p.getNombre());
        
     for(int i=0;i<tcosaspojos.getRowCount();i++){
           String[]q=new String[5];
     for(int j=0;j<tcosaspojos.getColumnCount();j++){
       
     q[j]=tcosaspojos.getValueAt(i, j).toString();
      }
   
       b.getBases().get(c).getT().add(q);               
  
     }           
        if(p.isKe()){           
            b.getBases().get(c).setKe(true);
            b.getBases().get(c).setKeys(new String[p.getKeys().length] );
      for(int i=0;i<p.getKeys().length;i++){
      b.getBases().get(c).getKeys()[i]=p.getKeys()[i];}
      }     
      else{
           b.getBases().get(c).setKey(p.getKey());}     
     
     b.getBases().get(c).setKey(p.getKey());

        rescombo(ctablas, 'b');
        tnumerotablas.setText("Hay "+(b.getBases().size())+" tablas");   
        for(String[] i:b.getAuxfore()){
          b.getBases().get(c).getF().add(i);   
          
        }
    }//GEN-LAST:event_btransfpota1MouseClicked

    private void cosaspojosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosaspojosActionPerformed
    if(vbcosas.isVisible()){ b.getAuxfore().clear();         tcosaspojos.setModel(crearModelobien(tcosaspojos));      

String h[]=new String[1];

h[0]="";
 cosaslis.setListData(h);
 maptext.setText("");
 h=new String[b.getPoj().get(cosaspojos.getSelectedIndex()).getP().size()];
        pojos p=b.getPoj().get(cosaspojos.getSelectedIndex());
  
        //añadir primary base
        String as;
      if(p.isKe()){           
      as="PRIMARY KEY(";
      for(int i=0;i<p.getKeys().length;i++){
      if(i==p.getKeys().length-1){ as+=p.getKeys()[i];}else{  as+=p.getKeys()[i]+","; }
      }     
      as+=");";
       }else{
            as="PRIMARY KEY("+p.getKey()+");";}         
        h[0]=as;
       //añadir primary base
        
//mapeos
b.getMapis().add(new maps());
    b.getMapis().get(0).setClase(p.getNombre());
    String a="";
    a+=peques.mapeoinicio();
    a+=peques.mapepoclass(p.getNombre(), p.getNombre());
    if(!p.isKe()){  a+=peques.mapeoid(p.getKey());}
    ArrayList<String> keys=new ArrayList<>();
   //mapeos    

    
        
          for(String[]i:p.getP()){
           if(i[1].charAt(i[1].length()-1)=='>'){
               for(pojos ii:b.getPoj()){
               if(ii.getNombre().equalsIgnoreCase(  i[1].substring(4, i[1].length()-1))){
                   a+=peques.mapeoset(p.getNombre(),i[0],ii.getNombre());break;}
               }
          
           }else{
                boolean key=false;
              
               if(p.isKe()){
               for(String ky:p.getKeys()){
               if(i[0].equalsIgnoreCase(ky)){key=true;}
               }
               }else{ if(i[0].equalsIgnoreCase(p.getKey())&&!p.isKe()){key=true;}}
            
                 String[]j=new String[5];
                      j[0]=i[0];j[2]="";j[3]="";j[4]="NOT NULL";
               switch(i[1].substring(0,3)){
                   case "int":j[1]="INT";break;
                   case "flo":j[1]="FLOAT";break;
                   case "boo":j[1]="BOOLEAN";break;
                   case "Dat":j[1]="DATE";break;
                   case "Tim":j[1]="TIME";break;
                   case "Str":j[1]="VARCHAR ";j[2]="(30) ";break;
                   default:;j=pillarforeign(i[1],h,keys,p);  key=true;
                   a+=peques.mapeomanyone(i[0], i[1]);
//error(" Cree primero la tabla a la que hace referencia esta");//pillarforeign(i[1]);
               }
               
               if (key == false) {
                   a += peques.mapeoproperty(i[0]);
               } else if (p.isKe()) {
                   System.out.println("soy falso");

                   for (int q = 0; q < p.getKeys().length; q++) {

                       System.out.println("\n\nkey" + p.getKeys()[q] + "   " + j[0] + "\n\n");
                       if (p.getKeys()[q].equalsIgnoreCase(j[0])) {
                           System.out.println("introduce");
                           keys.add(peques.mapkeypro(j[0]));
                           break;}}
               }

         
         insertarbien(j, tcosaspojos);
       }}
       if(p.isKe()){
       a+=peques.makeys('a');
       for(String j:keys){
       a+=j;
       }
       
       a+=peques.makeys('c');
       }
          
            a+=peques.mapeofin();
    maptext.setText(a);
    cosaslis.setListData(h);
    } 
    }//GEN-LAST:event_cosaspojosActionPerformed

    private void vbcosasWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_vbcosasWindowClosing
      
    }//GEN-LAST:event_vbcosasWindowClosing

    private void pojoaddpkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pojoaddpkMouseClicked
boolean error =false;
if(tpojos.getSelectedRow()==-1){error("Seleccione una fila");error=true;}
   pojos p=b.getPoj().get(cpojos.getSelectedIndex()); 
   if(error==false){    
  if(p.getKey()==null){p.setKey(tpojos.getValueAt(tpojos.getSelectedRow(), 0).toString());pojokeys.setText(p.getKey());}else{
   if(!p.isKe()){
       if(p.getKey().equalsIgnoreCase(tpojos.getValueAt(tpojos.getSelectedRow(), 0).toString())){error("introduce algo diferente");error=true;}}else{
            for(String i:p.getKeys()){
     if(i.equalsIgnoreCase(tpojos.getValueAt(tpojos.getSelectedRow(), 0).toString())){error("introduce algo diferente");error=true;}
      }}
     
if(error==false){            
  

      
      Object[] options = {"CHI",    "No !"};
int n;
      
if(!p.isKe()){
       n= JOptionPane.showOptionDialog(this,"Substituir key","añadir key",  JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null,   options, options[0]);
 
     if(n==JOptionPane.YES_OPTION){p.setKe(false);p.setKey(tpojos.getValueAt(tpojos.getSelectedRow(), 0).toString());pojokeys.setText(p.getKey());}else
          if(n==JOptionPane.NO_OPTION){p.setKe(true);String s[]={p.getKey(),tpojos.getValueAt(tpojos.getSelectedRow(), 0).toString()};
       p.setKeys(new String[2]);
       p.getKeys()[0]=s[0]; p.getKeys()[1]=s[1];
             pojokeys.setText(p.getKeys()[0]+","+p.getKeys()[1]);}}
else{
 n = JOptionPane.showOptionDialog(this,"Substituir key","añadir key",  JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null,   options, options[0]);
 
 if(n==JOptionPane.YES_OPTION){p.setKe(false);p.setKey(tpojos.getValueAt(tpojos.getSelectedRow(), 0).toString());pojokeys.setText(p.getKey());}else
          if(n==JOptionPane.NO_OPTION){p.setKe(true);
          String []s=p.getKeys();
          p.setKeys(new String[s.length+1]);
          for(int i=0;i<s.length;i++){
          p.getKeys()[i]=s[i];}
          p.getKeys()[s.length]=    tpojos.getValueAt(tpojos.getSelectedRow(), 0).toString(); String a="";
      for(String i:p.getKeys()){
     a+=i+",";
      }
      if(a.charAt(a.length()-1)==','){a=a.substring(0,a.length()-1);
              pojokeys.setText(a);}
          }
}
}}}
    }//GEN-LAST:event_pojoaddpkMouseClicked

    private void botmapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botmapMouseClicked
b.setMap(maptext.getText());
b.setAuxclase(nombremap.getText());
automatizacion.autommatizacion(b, "mapeo");
// TODO add your handling code here:
    }//GEN-LAST:event_botmapMouseClicked
 public String[] pillarforeign(String a,String[]hh,ArrayList<String> keys,pojos p){

   String[]j=new String[7];
   String aa;
     for(pojos i:b.getPoj()){
 if (i.getNombre().equalsIgnoreCase(a)){
//cambiar
  aa="FOREIGN KEY "+i.getKey()+" REFERENCES "+i.getNombre()+"("+i.getKey()+")";



  /*   if(i.isKe()){ for (int q=0;q<i.getKeys().length;q++){
         if(i.getKeys()[q].equalsIgnoreCase(a)){keys.add(peques.mapkeymanyone(i.getKey(),i.getNombre()));break;}    
  }}/*/
  for(String[] q:p.getP()){
      if(p.isKe()){
          System.out.println("entra");
      for(String z:p.getKeys()){
      if(q[0].equalsIgnoreCase(z)){ System.out.println("entra22");
   if(i.getNombre().equalsIgnoreCase(q[1])){keys.add(peques.mapkeymanyone(i.getKey(),i.getNombre()));   System.out.println("hace");}   
      }}}
  }
    //cambiar
  for(int z=0;z<hh.length;z++){
  if(hh[z]==null){
      hh[z]=aa;String[]qw=new String[3];qw[0]=i.getKey();qw[1]=i.getNombre();qw[2]=i.getKey();
  b.getAuxfore().add(qw);
  break;}}


       String h="";
                       j[0]=i.getKey();j[2]="";j[3]="";j[4]="NOT NULL";
                       for(String[] ii:i.getP()){
                           if(i.getKey().equalsIgnoreCase(ii[0]));h=ii[1];break;
                       }
               switch(h.substring(0,3)){
                   case "int":j[1]="INT";break;
                   case "flo":j[1]="FLOAT";break;
                   case "boo":j[1]="BOOLEAN";break;
                   case "Dat":j[1]="DATE";break;
                   case "Tim":j[1]="TIME";break;
                   case "Str":j[1]="VARCHAR ";j[2]="(30) ";break;
               }              
       break;          
 }               
 }

 return j;
 //
 }
    public void errorruta(){
 JOptionPane.showMessageDialog(this, "Ruta Erronea Cambiela Plis.",  "ERROR",  JOptionPane.ERROR_MESSAGE);
 }
 
  public void error(String a){
 JOptionPane.showMessageDialog(null, a,  "ERROR",  JOptionPane.ERROR_MESSAGE);
 }

   private void insertarbien(String s[],JTable ta) {     
       
        if (ta.getModel() == null) {
            model = crearModelobien(ta);
        }
    
        String[] fila = new String[ta.getColumnCount()];
      for(int i=0;i<fila.length;i++){
     
          fila[i] =s[i];System.out.println(fila[i]);
      }
   
       model.addRow(fila);              

        ta.setModel(model);

    }
   
  public void crear() {
      try{
      
      automatizacion.autommatizacion(b,"abmc");

      }catch(NullPointerException e){labelprincipalerrores.setText("Seleccione el main");}
  }
  
  
  
    private DefaultTableModel crearModelobien(JTable ta) {
   
        String[] col=new String[ta.getColumnCount()];
        for(int i=0;i<col.length;i++){
        col[i]=ta.getColumnName(i);   
                }

        model = new DefaultTableModel(col, 0);

        return model;
    }  
  
  
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrarpojo;
    private javax.swing.JButton Borrartabla;
    private javax.swing.JButton baseborrarfila;
    private javax.swing.JButton basecrear;
    private javax.swing.JComboBox<String> basenull1;
    private javax.swing.JComboBox<String> basenull2;
    private javax.swing.JTextField basenumero1;
    private javax.swing.JTextField basenumero2;
    private javax.swing.JButton basetablacreae;
    private javax.swing.JButton basetablacreae1;
    private javax.swing.JComboBox<String> basetipo1;
    private javax.swing.JComboBox<String> basetipo2;
    private javax.swing.JButton bautomatizacion;
    private javax.swing.JButton bañadicosasrtabla;
    private javax.swing.JButton bbases;
    private javax.swing.JButton bcosas;
    private javax.swing.JButton bintroducirforeign;
    private javax.swing.JButton bintroducirkey;
    private javax.swing.JButton bintroducirkey1;
    private javax.swing.JTextField bopaltas;
    private javax.swing.JTextField bopbajas;
    private javax.swing.JTextField bopconsultas;
    private javax.swing.JTextField bopmodific;
    private javax.swing.JButton borrararchivo;
    private javax.swing.JButton botmap;
    private javax.swing.JButton bpojear;
    private javax.swing.JButton bpojos;
    private javax.swing.JButton btransfpota1;
    private javax.swing.JCheckBox cconsturctorvacio;
    private javax.swing.JComboBox<String> cforeigtabla;
    private javax.swing.JFileChooser choser;
    private javax.swing.JList<String> cosaslis;
    private javax.swing.JComboBox<String> cosaspojos;
    private javax.swing.JComboBox<String> cpojos;
    private javax.swing.JComboBox<String> ctablakey;
    private javax.swing.JComboBox<String> ctablas;
    private javax.swing.JFrame framechoser;
    private javax.swing.JInternalFrame internalchose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JScrollPane jscroll1;
    private javax.swing.JScrollPane jscroll2;
    private javax.swing.JScrollPane jscroll3;
    private javax.swing.JLabel labelprincipalerrores;
    private javax.swing.JLabel lconstructor;
    private javax.swing.JTextArea maptext;
    private javax.swing.JTextField nombremap;
    private javax.swing.JCheckBox poconstructor;
    private javax.swing.JCheckBox poget;
    private javax.swing.JButton pojearclasee;
    private javax.swing.JButton pojoaddpk;
    private javax.swing.JLabel pojokeys;
    private javax.swing.JTextField ponombre;
    private javax.swing.JCheckBox poset;
    private javax.swing.JComboBox<String> potipo;
    private javax.swing.JTextField tablaforeignnombre;
    private javax.swing.JList<String> tablalis;
    private javax.swing.JTextField tbasenombre1;
    private javax.swing.JTextField tbasenombre2;
    private javax.swing.JTextField tbasenombreclase;
    private javax.swing.JTable tbases;
    private javax.swing.JTable tcosaspojos;
    private javax.swing.JTextField tnombrebase;
    private javax.swing.JTextField tnombrepojo;
    private javax.swing.JTextField tnombretabla;
    private javax.swing.JTextField tnombrpojo;
    private javax.swing.JLabel tnumeropojos;
    private javax.swing.JLabel tnumerotablas;
    private javax.swing.JComboBox<String> totro;
    private javax.swing.JTextField totro1;
    private javax.swing.JTable tpojos;
    private javax.swing.JTextField truta;
    private javax.swing.JFrame vbases;
    private javax.swing.JFrame vbcosas;
    private javax.swing.JFrame vpojos;
    private javax.swing.JFrame vtabla;
    // End of variables declaration//GEN-END:variables
}
