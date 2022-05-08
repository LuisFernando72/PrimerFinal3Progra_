package vista;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import static java.sql.JDBCType.NULL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.ContarLineas;
import modelo.Ver_Imprimir;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Control extends javax.swing.JFrame {
    
    ContarLineas Contar;
    JFileChooser chooser = new JFileChooser();
    File archivo;
    Ver_Imprimir impresora;
    
    public Control() {
        initComponents();
        setLocationRelativeTo(null);
        Contar = new ContarLineas(TextareaLineas);
        jScrollPane4.setRowHeaderView(Contar);
        TextareaLineas.setLineWrap(true);
        //    TextareaLineas.setWrapStyleWord(true);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextareaLineas = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaGrafico = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAbrir = new javax.swing.JMenuItem();
        itemNuevo = new javax.swing.JMenuItem();
        itemGuardar = new javax.swing.JMenuItem();
        itemGuardarcomo = new javax.swing.JMenuItem();
        itemImprimir = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemCopiar = new javax.swing.JMenuItem();
        itemPegar = new javax.swing.JMenuItem();
        itemDesacher = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        itemReemplazar = new javax.swing.JMenuItem();
        iteSeleccionar = new javax.swing.JMenuItem();
        itemBuscar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        itemAlejar = new javax.swing.JMenuItem();
        itemAcercar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(6, 1108, 954, 391);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel3.setLayout(null);

        TextareaLineas.setBackground(new java.awt.Color(204, 204, 204));
        TextareaLineas.setColumns(20);
        TextareaLineas.setFont(new java.awt.Font("Open Sans Semibold", 0, 16)); // NOI18N
        TextareaLineas.setRows(5);
        TextareaLineas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        jScrollPane4.setViewportView(TextareaLineas);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 1000, 320);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 10, 1000, 320);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Open Sans Semibold", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash_1.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpiar.setIconTextGap(10);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Open Sans Semibold", 1, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.setIconTextGap(20);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnColor.setBackground(new java.awt.Color(0, 0, 0));
        btnColor.setFont(new java.awt.Font("Open Sans Semibold", 1, 16)); // NOI18N
        btnColor.setForeground(new java.awt.Color(255, 255, 255));
        btnColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnColor.setText("Color");
        btnColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnColor.setIconTextGap(18);
        btnColor.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(1030, 10, 230, 320);

        txtAreaGrafico.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaGrafico.setColumns(20);
        txtAreaGrafico.setRows(5);
        txtAreaGrafico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true));
        jScrollPane3.setViewportView(txtAreaGrafico);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 340, 1240, 330);

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jMenu1.setIconTextGap(10);

        itemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAbrir.setBackground(new java.awt.Color(204, 255, 255));
        itemAbrir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        itemAbrir.setForeground(new java.awt.Color(0, 0, 0));
        itemAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder.png"))); // NOI18N
        itemAbrir.setText("Abrir");
        itemAbrir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(itemAbrir);

        itemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemNuevo.setBackground(new java.awt.Color(204, 255, 255));
        itemNuevo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        itemNuevo.setForeground(new java.awt.Color(0, 0, 0));
        itemNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add-file.png"))); // NOI18N
        itemNuevo.setText("Nuevo");
        itemNuevo.setBorder(null);
        itemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(itemNuevo);

        itemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemGuardar.setBackground(new java.awt.Color(204, 255, 255));
        itemGuardar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        itemGuardar.setForeground(new java.awt.Color(0, 0, 0));
        itemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diskette.png"))); // NOI18N
        itemGuardar.setText("Guardar");
        itemGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(itemGuardar);

        itemGuardarcomo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemGuardarcomo.setBackground(new java.awt.Color(204, 255, 255));
        itemGuardarcomo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        itemGuardarcomo.setForeground(new java.awt.Color(0, 0, 0));
        itemGuardarcomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diskette (1).png"))); // NOI18N
        itemGuardarcomo.setText("Guardar como");
        itemGuardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarcomoActionPerformed(evt);
            }
        });
        jMenu1.add(itemGuardarcomo);

        itemImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemImprimir.setBackground(new java.awt.Color(204, 255, 255));
        itemImprimir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        itemImprimir.setForeground(new java.awt.Color(0, 0, 0));
        itemImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/printer.png"))); // NOI18N
        itemImprimir.setText("Imprimir");
        itemImprimir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        itemImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(itemImprimir);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, 0));
        itemSalir.setBackground(new java.awt.Color(204, 255, 255));
        itemSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        itemSalir.setForeground(new java.awt.Color(0, 0, 0));
        itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrow.png"))); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(itemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        jMenu2.setText("Edición");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jMenu2.setIconTextGap(12);

        itemCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemCopiar.setBackground(new java.awt.Color(204, 255, 255));
        itemCopiar.setForeground(new java.awt.Color(0, 0, 0));
        itemCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/documents.png"))); // NOI18N
        itemCopiar.setText("Copiar");
        itemCopiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jMenu2.add(itemCopiar);

        itemPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemPegar.setBackground(new java.awt.Color(204, 255, 255));
        itemPegar.setForeground(new java.awt.Color(0, 0, 0));
        itemPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/files.png"))); // NOI18N
        itemPegar.setText("Pegar");
        jMenu2.add(itemPegar);

        itemDesacher.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemDesacher.setBackground(new java.awt.Color(204, 255, 255));
        itemDesacher.setForeground(new java.awt.Color(0, 0, 0));
        itemDesacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/undo.png"))); // NOI18N
        itemDesacher.setText("Desacher");
        itemDesacher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jMenu2.add(itemDesacher);

        itemEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminar.setBackground(new java.awt.Color(204, 255, 255));
        itemEliminar.setForeground(new java.awt.Color(0, 0, 0));
        itemEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash.png"))); // NOI18N
        itemEliminar.setText("Eliminar");
        jMenu2.add(itemEliminar);

        itemReemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemReemplazar.setBackground(new java.awt.Color(204, 255, 255));
        itemReemplazar.setForeground(new java.awt.Color(0, 0, 0));
        itemReemplazar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/switch.png"))); // NOI18N
        itemReemplazar.setText("Reemplazar");
        itemReemplazar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jMenu2.add(itemReemplazar);

        iteSeleccionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        iteSeleccionar.setBackground(new java.awt.Color(204, 255, 255));
        iteSeleccionar.setForeground(new java.awt.Color(0, 0, 0));
        iteSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/select-all.png"))); // NOI18N
        iteSeleccionar.setText("Seleccionar todo");
        jMenu2.add(iteSeleccionar);

        itemBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscar.setBackground(new java.awt.Color(204, 255, 255));
        itemBuscar.setForeground(new java.awt.Color(0, 0, 0));
        itemBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifying-glass.png"))); // NOI18N
        itemBuscar.setText("Buscar");
        itemBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jMenu2.add(itemBuscar);

        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(0, 0, 0));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/simple-data-format.png"))); // NOI18N
        jMenu4.setText("Formato");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jMenu4.setIconTextGap(12);

        jMenuItem14.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem14.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem14.setText("Formato");
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 0, 0));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jMenu5.setText("Ver");
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jMenu5.setIconTextGap(12);

        jMenu3.setBackground(new java.awt.Color(204, 255, 255));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Zoom");

        itemAlejar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAlejar.setBackground(new java.awt.Color(204, 255, 255));
        itemAlejar.setForeground(new java.awt.Color(0, 0, 0));
        itemAlejar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zoom-out.png"))); // NOI18N
        itemAlejar.setText("Alejar");
        jMenu3.add(itemAlejar);

        itemAcercar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PLUS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAcercar.setBackground(new java.awt.Color(204, 255, 255));
        itemAcercar.setForeground(new java.awt.Color(0, 0, 0));
        itemAcercar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zoom-out.png"))); // NOI18N
        itemAcercar.setText("Acercar");
        itemAcercar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        itemAcercar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcercarActionPerformed(evt);
            }
        });
        jMenu3.add(itemAcercar);

        jMenu5.add(jMenu3);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(0, 0, 0));
        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("Ayuda");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jMenu6.setIconTextGap(12);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem17.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem17.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/question.png"))); // NOI18N
        jMenuItem17.setText("Acerca de ayuda");
        jMenu6.add(jMenuItem17);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem18.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem18.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/testing.png"))); // NOI18N
        jMenuItem18.setText("Versión de la app");
        jMenuItem18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jMenu6.add(jMenuItem18);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void itemAcercarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcercarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAcercarActionPerformed

    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed
        // TODO add your handling code here:

        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int retunrval = chooser.showDialog(null, "Abrir");
        if (retunrval == JFileChooser.APPROVE_OPTION) {
            archivo = chooser.getSelectedFile();
        }
        String documento = "";
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8));
            
            int cod;
            while ((cod = in.read()) != -1) {
                char caracter = (char) cod;
                documento += caracter;
            }
            in.close();
        } catch (IOException ex) {
        }
        TextareaLineas.append(documento);

    }//GEN-LAST:event_itemAbrirActionPerformed

    private void itemGuardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarcomoActionPerformed
        // TODO add your handling code here:

        try {
            chooser.showSaveDialog(this);
            archivo = chooser.getSelectedFile();
            
            if (archivo != null) {
                FileWriter save = new FileWriter(archivo + ".txt");
                save.write(TextareaLineas.getText());
                save.close();
                JOptionPane.showMessageDialog(null, "Archivo creado correctamente!! ", "Guardado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Aceptar2.png"));
                
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al creal el archivo " + ex, "Error", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Cancelado.png"));
            
        }
    }//GEN-LAST:event_itemGuardarcomoActionPerformed

    private void itemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarActionPerformed
        // TODO add your handling code here:

        if (archivo != null) {
            try {
                String ruta = archivo.getAbsolutePath();
                //    Area_murcielago.setText(ruta);

                String nombre = "";
                //   JFileChooser file = new JFileChooser();
                //  file.showSaveDialog(this);
                //   File guarda = file.getSelectedFile();

                if (ruta != null) {
                    FileWriter save = new FileWriter(ruta);
                    save.write(TextareaLineas.getText());
                    save.close();
                    JOptionPane.showMessageDialog(null, "Archivo creado correctamente!! ", "Guardado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Aceptar2.png"));
                    
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al creal el arvchivo " + ex, "Error", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Cancelado.png"));
            }
        } else {
            try {
                JFileChooser file = new JFileChooser();
                file.showSaveDialog(this);
                File guarda = file.getSelectedFile();
                
                if (guarda != null) {
                    FileWriter save = new FileWriter(guarda + ".txt");
                    save.write(TextareaLineas.getText());
                    save.close();
                    JOptionPane.showMessageDialog(null, "Archivo creado correctamente!! ", "Guardado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Aceptar2.png"));
                    
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al creal el arvchivo " + ex, "Error", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Cancelado.png"));
                
            }
        }
        

    }//GEN-LAST:event_itemGuardarActionPerformed

    private void itemImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImprimirActionPerformed
        // TODO add your handling code here:
        String AreaEntrada = this.TextareaLineas.getText();
        String AreaSalida = this.txtAreaGrafico.getText();
        String[] options = {"Imprimir Entrada", "Imprimir Salida"};
        ImageIcon icon = new ImageIcon("src/Imagenes/Impresoras.png");
        String n = (String) JOptionPane.showInputDialog(null, "Opciones",
                "Impresora", JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        
        if (n != null) {
            
            switch (n) {
                
                case "Imprimir Entrada":
                    impresora = new Ver_Imprimir(AreaEntrada);
                    impresora.imprimir();
                    break;
                
                case "Imprimir Salida":
                    impresora = new Ver_Imprimir(AreaSalida);
                    impresora.imprimir();
                    
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Por favor elija una opcion correcta ", "Error", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Error1.png"));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cancelado ", "Cancelar", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Error1.png"));
            
        }

    }//GEN-LAST:event_itemImprimirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        TextareaLineas.setText("");
        //    String lineas = TextareaLineas.getText();
        //    System.out.println("lineas\n" + lineas);

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoActionPerformed
        // TODO add your handling code here:
        if (archivo != null) {
            try {
                String ruta = archivo.getAbsolutePath();
                //    Area_murcielago.setText(ruta);

                String nombre = "";
                //   JFileChooser file = new JFileChooser();
                //  file.showSaveDialog(this);
                //   File guarda = file.getSelectedFile();

                if (ruta != null) {
                    FileWriter save = new FileWriter(ruta);
                    save.write(TextareaLineas.getText());
                    save.close();
                    JOptionPane.showMessageDialog(null, "Archivo creado correctamente!! ", "Guardado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Aceptar2.png"));
                    
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al creal el arvchivo " + ex, "Error", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Cancelado.png"));
            }
        } else {
            try {
                JFileChooser file = new JFileChooser();
                file.showSaveDialog(this);
                File guarda = file.getSelectedFile();
                
                if (guarda != null) {
                    FileWriter save = new FileWriter(guarda + ".txt");
                    save.write(TextareaLineas.getText());
                    save.close();
                    JOptionPane.showMessageDialog(null, "Archivo creado correctamente!! ", "Guardado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Aceptar2.png"));
                    
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al creal el arvchivo " + ex, "Error", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Cancelado.png"));
                
            }
        }
        
        TextareaLineas.setText("");//Limpiando el TextArea
        

    }//GEN-LAST:event_itemNuevoActionPerformed
    
    public void contar() {
        int Area = TextareaLineas.getRows();
        System.out.println("" + Area);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Control.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextareaLineas;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem iteSeleccionar;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemAcercar;
    private javax.swing.JMenuItem itemAlejar;
    private javax.swing.JMenuItem itemBuscar;
    private javax.swing.JMenuItem itemCopiar;
    private javax.swing.JMenuItem itemDesacher;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemGuardar;
    private javax.swing.JMenuItem itemGuardarcomo;
    private javax.swing.JMenuItem itemImprimir;
    private javax.swing.JMenuItem itemNuevo;
    private javax.swing.JMenuItem itemPegar;
    private javax.swing.JMenuItem itemReemplazar;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtAreaGrafico;
    // End of variables declaration//GEN-END:variables
}
