/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAutor;
import Controlador.ControladorTitulo;
import Modelo.Autor;
import Modelo.TituloLibro;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class RegistrarTitulo extends javax.swing.JPanel {

    private ControladorAutor cAu = new ControladorAutor();
    ArrayList<Autor> listadoAu = cAu.listado();

    /**
     * Creates new form MenuPrincipal
     */
    public RegistrarTitulo() {
        initComponents();
        this.setPreferredSize(Principal.dimension);
        this.setMinimumSize(Principal.dimension);
        this.setMaximumSize(Principal.dimension);

    }

    private Object[][] llenarTablita() {

        Object tabla[][] = new Object[listadoAu.size()][4];
        for (int i = 0; i < listadoAu.size(); i++) {
            tabla[i][0] = listadoAu.get(i).getNombres();
            tabla[i][1] = listadoAu.get(i).getApPaterno();
            tabla[i][2] = listadoAu.get(i).getApMaterno();
            tabla[i][3] = false;
        }

        return tabla;

    }
    
    private void llenarTablitaTitulos(){
        ArrayList<TituloLibro> lista = new ControladorTitulo().listado();
        
        Object model[][] = new Object[lista.size()][1];
        
        for (int i = 0; i < lista.size(); i++) {
            model[i][0] = lista.get(i).getTitulo();
        }
        
        tablaTitulos.setModel(new DefaultTableModel(model, new String[] {"Título"}));
        
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
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutores = new javax.swing.JTable();
        Autores = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTitulos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        contenedorSecundario = new javax.swing.JLabel();
        contenedorPrincipal = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1382, 744));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(66, 66, 66));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Tíitulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Felix Titling", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);
        jPanel1.add(txtTitulo);
        txtTitulo.setBounds(180, 260, 230, 24);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Título:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 260, 34, 20);

        tablaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAutores);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 310, 390, 80);

        Autores.setForeground(new java.awt.Color(255, 255, 255));
        Autores.setText("Autores:");
        jPanel1.add(Autores);
        Autores.setBounds(120, 340, 48, 16);

        tablaTitulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Título"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaTitulos);
        if (tablaTitulos.getColumnModel().getColumnCount() > 0) {
            tablaTitulos.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(110, 100, 453, 100);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(320, 410, 120, 32);

        add(jPanel1);
        jPanel1.setBounds(540, 110, 660, 490);

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
        if(new ControladorTitulo().agregarTitulo(new TituloLibro(txtTitulo.getText()))){
            ArrayList<Autor> autoresTitulo = new ArrayList<>();
            
            for (int i = 0; i < tablaAutores.getRowCount(); i++) {
                if((boolean)tablaAutores.getValueAt(i, 3)){
                    autoresTitulo.add(listadoAu.get(i));
                }
            }
            
            for (int i = 0; i < autoresTitulo.size(); i++) {
                if(true){
                    
                }
                
            }
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autores;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel contenedorPrincipal;
    private javax.swing.JLabel contenedorSecundario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAutores;
    private javax.swing.JTable tablaTitulos;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
