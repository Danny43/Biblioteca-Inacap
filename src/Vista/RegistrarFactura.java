/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCompra;
import Controlador.ControladorDistribuidor;
import Controlador.ControladorFactura;
import Controlador.ControladorLibro;
import Controlador.ControladorMetodoPago;
import Controlador.ControladorTitulo;
import Modelo.Autor;
import Modelo.Compra;
import Modelo.Distribuidor;
import Modelo.Factura;
import Modelo.Libro;
import Modelo.MetodoPago;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class RegistrarFactura extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */
    public RegistrarFactura() {
        initComponents();
        this.setPreferredSize(Principal.dimension);
        this.setMinimumSize(Principal.dimension);
        this.setMaximumSize(Principal.dimension);
        cargarBoxDistribuidores();
        cargarBoxMetodoPago();
        txtFolio.setText(String.valueOf(new ControladorFactura().asignarFolio()));
    }

    private ArrayList<Libro> Lista = new ArrayList<>();
    private float Neto = 0;
    private float IVA = 0;
    private float Total = 0;

    private ControladorDistribuidor cD = new ControladorDistribuidor();
    private ArrayList<Distribuidor> listaDistribuidores = cD.listado();

    private ControladorMetodoPago cM = new ControladorMetodoPago();
    private ArrayList<MetodoPago> listaMetodoPago = cM.listado();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void llenarTabla() {

        Object model[][] = new Object[Lista.size()][4];

        for (int i = 0; i < Lista.size(); i++) {

            model[i][0] = Lista.get(i).getNro_serie();
            model[i][1] = Lista.get(i).getTitulo();
            model[i][2] = Lista.get(i).getEditorial();
            model[i][3] = Lista.get(i).getPrecio_referencia();

        }

        tablaListado.setModel(new DefaultTableModel(model, new String[]{"Nro. Serie", "Título", "Editorial", "Precio"}));

    }

    private boolean buscarLibro() {

        boolean encontrado = false;

        ControladorLibro cL = new ControladorLibro();
        Libro l = cL.buscar(Integer.parseInt(txtNroSerieLibro.getText()));
        if (l != null) {
            encontrado = true;
            ControladorTitulo cT = new ControladorTitulo();
            ArrayList<Autor> listaAu = cT.buscarAutores(cT.buscarTitulo(l.getTitulo()));

            for (int i = 0; i < listaAu.size(); i++) {

                if (txtAutor.getText().equals("")) {
                    txtAutor.setText(listaAu.get(i).getNombres() + " " + listaAu.get(i).getApPaterno());
                } else {
                    txtAutor.setText(txtAutor.getText() + ", " + listaAu.get(i).getNombres() + " " + listaAu.get(i).getApPaterno());
                }

            }

            txtEditorial.setText(l.getEditorial());
            txtPrecio.setText(String.valueOf(l.getPrecio_referencia()));
            txtTitulo.setText(l.getTitulo());

        }

        return encontrado;
    }

    private void cargarBoxDistribuidores() {

        for (int i = 0; i < listaDistribuidores.size(); i++) {
            boxDistribuidor.addItem(listaDistribuidores.get(i).getNombre());
        }

    }

    private void cargarBoxMetodoPago() {
        for (int i = 0; i < listaMetodoPago.size(); i++) {
            boxMetodoPago.addItem(listaMetodoPago.get(i).getMetodo());
        }
    }

    private void calcular() {

        Neto = 0;

        for (int i = 0; i < tablaListado.getModel().getRowCount(); i++) {
            Neto += (float) tablaListado.getModel().getValueAt(i, 3);
        }
        IVA = (float) (Neto * 0.19);
        Total = Neto + IVA;

        txtNeto.setText("$" + String.valueOf(Neto));
        txtIVA.setText("$" + String.valueOf(IVA));
        txtTotal.setText("$" + String.valueOf(Total));

    }

    private void cleanText() {
        txtAutor.setText("");
        txtEditorial.setText("");
        txtPrecio.setText("");
        txtTitulo.setText("");
    }

    private void btnVolverDefault() {
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/volver-default.png")));
    }

    private void btnVolverSelected() {
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/volver-selected.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNroSerieLibro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarLibro = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        btnFactura = new javax.swing.JButton();
        txtNeto = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boxDistribuidor = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        boxMetodoPago = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();
        contenedorSecundario = new javax.swing.JLabel();
        contenedorPrincipal = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1382, 744));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(66, 66, 66));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Felix Titling", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        txtNroSerieLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNroSerieLibroKeyReleased(evt);
            }
        });
        jPanel1.add(txtNroSerieLibro);
        txtNroSerieLibro.setBounds(70, 130, 130, 24);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Libros");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 100, 90, 16);

        btnBuscarLibro.setText("Buscar");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarLibro);
        btnBuscarLibro.setBounds(210, 130, 71, 30);

        txtTitulo.setDragEnabled(true);
        jPanel1.add(txtTitulo);
        txtTitulo.setBounds(70, 170, 180, 24);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Título:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 170, 41, 20);
        jPanel1.add(txtAutor);
        txtAutor.setBounds(70, 210, 180, 24);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 210, 34, 16);
        jPanel1.add(txtEditorial);
        txtEditorial.setBounds(70, 250, 180, 24);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Editorial:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 250, 60, 30);
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(70, 290, 180, 24);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 286, 41, 30);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(100, 340, 110, 32);

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro. Serie", "Título", "Editorial", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaListado);
        if (tablaListado.getColumnModel().getColumnCount() > 0) {
            tablaListado.getColumnModel().getColumn(0).setResizable(false);
            tablaListado.getColumnModel().getColumn(1).setResizable(false);
            tablaListado.getColumnModel().getColumn(2).setResizable(false);
            tablaListado.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(293, 100, 410, 250);

        btnFactura.setText("Generar Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFactura);
        btnFactura.setBounds(340, 470, 130, 32);

        txtNeto.setEnabled(false);
        jPanel1.add(txtNeto);
        txtNeto.setBounds(610, 370, 90, 24);

        txtIVA.setEnabled(false);
        jPanel1.add(txtIVA);
        txtIVA.setBounds(610, 410, 90, 24);

        txtTotal.setEnabled(false);
        jPanel1.add(txtTotal);
        txtTotal.setBounds(610, 450, 90, 24);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Neto:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(570, 370, 30, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IVA:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(580, 410, 30, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 450, 40, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Seleccione Distribuidor:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(180, 380, 140, 20);

        jPanel1.add(boxDistribuidor);
        boxDistribuidor.setBounds(330, 380, 200, 26);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seleccione Metodo de Pago:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(160, 420, 160, 20);

        jPanel1.add(boxMetodoPago);
        boxMetodoPago.setBounds(330, 420, 200, 26);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FOLIO:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(550, 40, 40, 16);

        txtFolio.setForeground(new java.awt.Color(255, 255, 255));
        txtFolio.setText("nrofolio");
        jPanel1.add(txtFolio);
        txtFolio.setBounds(600, 40, 43, 16);

        add(jPanel1);
        jPanel1.setBounds(500, 80, 720, 520);

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
        btnVolver.setBounds(100, 540, 170, 60);

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

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed

        if (!buscarLibro()) {

            JOptionPane.showMessageDialog(null, "no se ha encontrado ningún libro con este numero de serie");

        }

    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtAutor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero de serie para buscar");
        } else {

            boolean existe = false;
            boolean asociado = false;

            for (int i = 0; i < Lista.size(); i++) {
                if (Lista.get(i).getNro_serie().equals(txtNroSerieLibro.getText())) {
                    existe = true;
                    JOptionPane.showMessageDialog(null, "Este producto ya se encuentra en la lista");
                }
            }
            if (new ControladorLibro().asociadoACompra(txtNroSerieLibro.getText())) {
                asociado = true;
                JOptionPane.showMessageDialog(null, "Este libro ya tiene una compra asociada");
            }

            if (!existe & !asociado) {
                Lista.add(new ControladorLibro().buscar(Integer.parseInt(txtNroSerieLibro.getText())));
            }

            llenarTabla();
            cleanText();
            txtNroSerieLibro.setText("");
            calcular();
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNroSerieLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroSerieLibroKeyReleased
        if (!buscarLibro()) {
            cleanText();
        }
    }//GEN-LAST:event_txtNroSerieLibroKeyReleased

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        int folio = new ControladorFactura().asignarFolio();
        float precioNeto = Neto;
        float precioTotal = Total;
        int idDistribuidor = 0;
        for (int i = 0; i < listaDistribuidores.size(); i++) {
            if (listaDistribuidores.get(i).getNombre().equals(boxDistribuidor.getSelectedItem())) {
                idDistribuidor = listaDistribuidores.get(i).getId();
            }
        }
        int metodoPago = 0;
        for (int i = 0; i < listaMetodoPago.size(); i++) {
            if (listaMetodoPago.get(i).getMetodo().equals(boxMetodoPago.getSelectedItem())) {
                metodoPago = listaMetodoPago.get(i).getId();
            }
        }

        Factura factura = new Factura(folio, precioNeto, precioTotal, metodoPago, IVA);

        System.out.println("filas: " + tablaListado.getRowCount());

        if (tablaListado.getRowCount() > 0) {
            if (new ControladorFactura().agregar(factura)) {
                JOptionPane.showMessageDialog(null, "se ha creado la factura correctamente");

                int idCompra = new ControladorCompra().obtenerID();

                Compra compra = new Compra(idCompra, idDistribuidor, folio);

                if (new ControladorCompra().agregar(compra)) {
                    JOptionPane.showMessageDialog(null, "se ha agregado la compra correctamente");

                    cleanText();
                    txtIVA.setText("");
                    txtNroSerieLibro.setText("");
                    txtNeto.setText("");
                    txtTotal.setText("");
                    Lista = new ArrayList<>();
                    llenarTabla();

                } else {
                    JOptionPane.showMessageDialog(null, "ha ocurrido un error al agregar la compra");
                }

                for (int i = 0; i < Lista.size(); i++) {
                    if (new ControladorLibro().agregarIdCompra(Lista.get(i), compra)) {
                        System.out.println("agregar idCompra: " + compra.getId() + " a Libro: " + Lista.get(i).getNro_serie() + " CORRECTO");
                    } else {
                        System.out.println("\"agregar idCompra: \"+ compra.getId()+ \" a Libro: \"+ Lista.get(i).getNro_serie()+ \" INCORRECTO\"");
                        JOptionPane.showMessageDialog(null, "Algo salio mal");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "ha ocurrido un error al agregar la factura, revisa si completaste todos los campos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        }


    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
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
    private javax.swing.JComboBox<String> boxDistribuidor;
    private javax.swing.JComboBox<String> boxMetodoPago;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnFactura;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel contenedorPrincipal;
    private javax.swing.JLabel contenedorSecundario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaListado;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JLabel txtFolio;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNeto;
    private javax.swing.JTextField txtNroSerieLibro;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
