/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorMetodoPago;
import Modelo.MetodoPago;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class RegistrarMetodoPago extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */
    public RegistrarMetodoPago() {
        initComponents();
        this.setPreferredSize(Principal.dimension);
        this.setMinimumSize(Principal.dimension);
        this.setMaximumSize(Principal.dimension);
        llenarTablita();
    }
    
    private void llenarTablita(){
        ArrayList<MetodoPago> metodos = new ControladorMetodoPago().listado();
        Object model[][] = new Object[metodos.size()][1];
        
        for (int i = 0; i < metodos.size(); i++){
            model[i][0] = metodos.get(i).getMetodo();
        }
        
        DefaultTableModel modelo = new DefaultTableModel(model, new String[]{"Metodo"});
        
        tablaMetodos.setModel(modelo);
    }
    
    private void btnVolverDefault(){
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/volver-default.png")));
    }
    
    private void btnVolverSelected(){
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/volver-selected.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMetodos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMetodo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JLabel();
        contenedorSecundario = new javax.swing.JLabel();
        contenedorPrincipal = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1382, 744));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(66, 66, 66));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Metodo de Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Felix Titling", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        tablaMetodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMetodos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 580, 180);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Metodo:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 310, 50, 20);
        jPanel1.add(txtMetodo);
        txtMetodo.setBounds(130, 310, 150, 24);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(310, 310, 90, 32);

        add(jPanel1);
        jPanel1.setBounds(540, 110, 660, 490);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/volver-default.png"))); // NOI18N
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(110, 570, 170, 50);

        contenedorSecundario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/contenedores/contenedor-secundario.png"))); // NOI18N
        add(contenedorSecundario);
        contenedorSecundario.setBounds(480, 60, 770, 590);

        contenedorPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/contenedores/contenedor-main.png"))); // NOI18N
        add(contenedorPrincipal);
        contenedorPrincipal.setBounds(40, 70, 300, 580);

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/wallpapers/wallpaper.jpg"))); // NOI18N
        wallpaper.setPreferredSize(Principal.dimension);
        add(wallpaper);
        wallpaper.setBounds(0, 0, 2558, 1562);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!txtMetodo.getText().equals("")){
            if(new ControladorMetodoPago().registrar(new MetodoPago(txtMetodo.getText()))){
                JOptionPane.showMessageDialog(null, "Se ha registrado correctamente");
                txtMetodo.setText("");
                llenarTablita();
            }else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar valores al campo del Metodo");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        txtMetodo.setText("");
        btnVolverDefault();
        Principal.principal.MenuPrinicipal();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolverSelected();
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolverDefault();
    }//GEN-LAST:event_btnVolverMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel contenedorPrincipal;
    private javax.swing.JLabel contenedorSecundario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMetodos;
    private javax.swing.JTextField txtMetodo;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
