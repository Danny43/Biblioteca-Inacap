/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Si vas a modificar el design vas a tener que volver a llamar al metodo
"llenarTablita()" en el "initComponents()" para pasarle el modelo de tabla al
constructor de JTable y renombrar manualmente los columnsName todo desde Atom.
*/

package Vista;

import Controlador.ControladorAnio;
import Controlador.ControladorAutor;
import Controlador.ControladorEditorial;
import Controlador.ControladorEstado;
import Controlador.ControladorISBN;
import Controlador.ControladorIdioma;
import Controlador.ControladorIdiomaLibro;
import Controlador.ControladorLibro;
import Controlador.ControladorTitulo;
import Controlador.ControladorUtilidad;
import Modelo.AnioPublicacion;
import Modelo.Autor;
import Modelo.Editorial;
import Modelo.Estado;
import Modelo.ISBN;
import Modelo.Idioma;
import Modelo.Libro;
import Modelo.TituloLibro;
import Modelo.Utilidad;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class RegistrarLibro extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */

    private ControladorAnio cA = new ControladorAnio();
    ArrayList<AnioPublicacion> listadoA = cA.listado();

    private ControladorTitulo cT = new ControladorTitulo();
    ArrayList<TituloLibro> listadoT = cT.listado();

    private ControladorEditorial cE = new ControladorEditorial();
    ArrayList<Editorial> listadoE = cE.listado();

    private ControladorEstado cEs = new ControladorEstado();
    ArrayList<Estado> listadoEs = cEs.listado();

    private ControladorISBN cISBN = new ControladorISBN();
    ArrayList<ISBN> listadoISBN = cISBN.listado();

    private ControladorUtilidad cU = new ControladorUtilidad();
    ArrayList<Utilidad> listadoU = cU.listado();

    private ControladorAutor cAu = new ControladorAutor();
    ArrayList<Autor> listadoAu = cAu.listado();
    
    private ControladorIdioma LI = new ControladorIdioma();
    ArrayList<Idioma> listaIdioma = LI.listado();
    
    private ControladorLibro cL = new ControladorLibro();

    public RegistrarLibro() {
        initComponents();
        this.setPreferredSize(Principal.dimension);
        this.setMinimumSize(Principal.dimension);
        this.setMaximumSize(Principal.dimension);
        llenarBox();
        
    }

    





    private void llenarBox(){
        for(int i = 0; i < listadoA.size(); i++){
            boxAnio.addItem(String.valueOf(listadoA.get(i).getAnio()));
        }

        for (int i = 0; i < listadoT.size(); i++){
            boxTitulo.addItem(listadoT.get(i).getTitulo());
        }

        for (int i = 0; i < listadoE.size(); i++){
            boxEditorial.addItem(listadoE.get(i).getNombre_editorial());
        }

        for (int i = 0; i < listadoEs.size(); i++){
            boxEstado.addItem(listadoEs.get(i).getEstado());
        }

        for (int i = 0; i < listadoISBN.size(); i++){
            boxISBN.addItem(listadoISBN.get(i).getISBN());
        }
        for (int i = 0; i < listadoU.size(); i++){
            boxUtilidad.addItem(listadoU.get(i).getDescripcion());
        }
        
        for (int i = 0; i < listaIdioma.size(); i++) {
            boxIdioma.addItem(listaIdioma.get(i).getIdioma());
        }
        
    }

    private void btnVolverDefault(){
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/volver-default.png")));
    }
    private void btnVolverSelected(){
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/volver-selected.png")));
    }

    private void btnRegistrarLibroDefault(){
        btnRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/registrar-default.png")));
    }
    private void btnRegistrarLibroSelected(){
        btnRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/registrar-selected.png")));
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
        jLabel1 = new javax.swing.JLabel();
        txtNroSerie = new javax.swing.JTextField();
        boxTitulo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxEditorial = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        boxUtilidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        boxAnio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        boxISBN = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNroPaginas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrarLibro = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        boxIdioma = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JLabel();
        contenedorSecundario = new javax.swing.JLabel();
        contenedorPrincipal = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1382, 744));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(66, 66, 66));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Felix Titling", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de Serie:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 40, 130, 20);
        jPanel1.add(txtNroSerie);
        txtNroSerie.setBounds(210, 40, 150, 24);

        jPanel1.add(boxTitulo);
        boxTitulo.setBounds(200, 100, 260, 26);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Título:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 100, 50, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editorial:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 140, 70, 20);

        jPanel1.add(boxEditorial);
        boxEditorial.setBounds(200, 140, 260, 26);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Utilidad:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 180, 70, 20);

        jPanel1.add(boxUtilidad);
        boxUtilidad.setBounds(200, 180, 260, 26);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 220, 60, 16);

        jPanel1.add(boxEstado);
        boxEstado.setBounds(200, 220, 260, 26);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Año de Publicacion:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 300, 140, 30);

        jPanel1.add(boxAnio);
        boxAnio.setBounds(200, 300, 260, 26);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ISBN:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 340, 41, 20);

        jPanel1.add(boxISBN);
        boxISBN.setBounds(200, 340, 260, 26);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero de Páginas:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 380, 150, 20);
        jPanel1.add(txtNroPaginas);
        txtNroPaginas.setBounds(200, 380, 150, 24);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio de Referencia:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 420, 160, 20);
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(200, 420, 150, 24);

        btnRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/botones/registrar-default.png"))); // NOI18N
        btnRegistrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarLibroMouseExited(evt);
            }
        });
        jPanel1.add(btnRegistrarLibro);
        btnRegistrarLibro.setBounds(470, 450, 170, 50);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Idioma:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 260, 41, 16);

        jPanel1.add(boxIdioma);
        boxIdioma.setBounds(200, 260, 260, 26);

        add(jPanel1);
        jPanel1.setBounds(540, 90, 660, 540);

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

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolverSelected();
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolverDefault();
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        btnVolverDefault();
        Principal.principal.MenuPrinicipal();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnRegistrarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarLibroMouseEntered
        btnRegistrarLibroSelected();
    }//GEN-LAST:event_btnRegistrarLibroMouseEntered

    private void btnRegistrarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarLibroMouseExited
        btnRegistrarLibroDefault();

    }//GEN-LAST:event_btnRegistrarLibroMouseExited

    private void btnRegistrarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarLibroMouseClicked
       String nroSerie = txtNroSerie.getText();
       int precioReferencia = Integer.parseInt(txtPrecio.getText());
       int nroPaginas = Integer.parseInt(txtNroPaginas.getText());
       int anioPublicacion = boxAnio.getSelectedIndex() +1;
       int editorial = boxEditorial.getSelectedIndex() + 1;
       int estado = boxEstado.getSelectedIndex() + 1;
       int ISBN = boxISBN.getSelectedIndex() + 1;
       int titulo = boxTitulo.getSelectedIndex() + 1;
       int utilidad = boxUtilidad.getSelectedIndex()+ 1;
       int idioma = boxIdioma.getSelectedIndex()+ 1;

       try{
           Libro libro = new Libro(nroSerie, nroPaginas, precioReferencia, editorial, estado, anioPublicacion, titulo, ISBN, utilidad);
       cL.crear(libro);
       JOptionPane.showMessageDialog(null, "Se ha Agregado correctamente");
           System.out.println("ID Editorial: " + editorial);
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null," Ha ocurrido un error: " + e.getMessage());
       }
       try{
           
           if(new ControladorIdiomaLibro().registrar(idioma, nroSerie)){
               JOptionPane.showMessageDialog(null, "Se ha agregado correctamente el idioma");
           }else{
               JOptionPane.showMessageDialog(null, "Error con el Idioma");
           }
           
       }catch (Exception e){
      
           
       }
       
       
    }//GEN-LAST:event_btnRegistrarLibroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAnio;
    private javax.swing.JComboBox<String> boxEditorial;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxISBN;
    private javax.swing.JComboBox<String> boxIdioma;
    private javax.swing.JComboBox<String> boxTitulo;
    private javax.swing.JComboBox<String> boxUtilidad;
    private javax.swing.JLabel btnRegistrarLibro;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel contenedorPrincipal;
    private javax.swing.JLabel contenedorSecundario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNroPaginas;
    private javax.swing.JTextField txtNroSerie;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
