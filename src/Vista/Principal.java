/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    private MenuPrincipal menuPrincipal = new MenuPrincipal();
    
    public static Principal principal;
    public static Dimension dimension;
    
    public Principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        IniciarSesion();
        
    }
    
    public void MenuPrinicipal(){        
        this.setContentPane(menuPrincipal);
        this.pack();
        
    }
    public void IniciarSesion(){
        this.setContentPane(new IniciarSesion());
        this.pack();
    }
    
    public void MostratTodoLibros(){
        this.setContentPane(new MostrarTodoLibro());
        this.pack();
    }
    
    public void MostrarTodosDistribuidor(){
        this.setContentPane(new MostrarDistribuidor());
        this.pack();
    }
    
    public void registrarTitulo(){
        this.setContentPane(new RegistrarTitulo());
        this.pack();
    }
    
    public void BuscarLibro(){
        this.setContentPane(new BuscarLibro());
        this.pack();
    }
    
    public void TipoTransaccion(){
        this.setContentPane(new TipoTransaccion());
        this.pack();
    }
    
    public void Arriendo(){
        this.setContentPane(new RegistrarArriendo());
        this.pack();
    }
    
    public void Venta(){
        this.setContentPane(new Venta());{
        this.pack();
    }
    }
    
    public void registrarMetodoPago(){
        this.setContentPane(new RegistrarMetodoPago());
        this.pack();
    }
    
    public void buscarDistribuidor(){
        this.setContentPane(new BuscarDistribuidor());
        this.pack();
    }
    
    public void registrarAutor(){
        this.setContentPane(new RegistrarAutor());
        this.pack();
    }
    
    public void registrarLibro(){
        this.setContentPane(new RegistrarLibro());
        this.pack();
    }
    public void registrarEditorial(){
        this.setContentPane(new RegistrarEditorial());
        this.pack();
    }
    
    public void registrarCategoria(){
        this.setContentPane(new RegistrarCategoria());
        this.pack();
    }
    
    public void registrarEstado(){
        this.setContentPane(new RegistrarEstado());
        this.pack();
    }
    
    public void registrarIdioma(){
        this.setContentPane(new RegistrarIdioma());
        this.pack();
    }
    
    public void registrarDistribuidor(){
        this.setContentPane(new RegistrarDistribuidor());
        this.pack();
    }
    public void registrarFactura(){
        this.setContentPane(new RegistrarFactura());
        this.pack();
    }
    
    private void Dimensiones(){
        double Height = this.dimension.getHeight();
        double Width = this.dimension.getWidth();
        
        System.out.println("Height: " + Height);
        System.out.println("Width: " + Width);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal.principal = new Principal();
                Principal.principal.setVisible(true);
                Principal.dimension = Principal.principal.getSize();
                Principal.principal.setPreferredSize(Principal.dimension);
                Principal.principal.Dimensiones();
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
