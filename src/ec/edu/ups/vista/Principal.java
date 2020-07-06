/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDirectorio;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanc
 */
public class Principal extends javax.swing.JFrame {

   private final ControladorDirectorio controladorDirectorios;
   
    public Principal() {
        initComponents();
        this.controladorDirectorios= new ControladorDirectorio();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        txtRuta = new javax.swing.JTextField();
        btnLDirectorios = new javax.swing.JButton();
        btnLArchivosOcultos = new javax.swing.JButton();
        btnLDirectoriosOcultos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLista = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnInfo = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        btnCrear = new javax.swing.JMenuItem();
        btnEliminar = new javax.swing.JMenuItem();
        btnRenombrar = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktopPane.add(txtRuta);
        txtRuta.setBounds(180, 30, 200, 30);

        btnLDirectorios.setBackground(new java.awt.Color(204, 204, 204));
        btnLDirectorios.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnLDirectorios.setText("Listar Directorios");
        btnLDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLDirectoriosActionPerformed(evt);
            }
        });
        desktopPane.add(btnLDirectorios);
        btnLDirectorios.setBounds(20, 100, 130, 30);

        btnLArchivosOcultos.setBackground(new java.awt.Color(204, 204, 204));
        btnLArchivosOcultos.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnLArchivosOcultos.setText("Listar Archivos Ocultos");
        btnLArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLArchivosOcultosActionPerformed(evt);
            }
        });
        desktopPane.add(btnLArchivosOcultos);
        btnLArchivosOcultos.setBounds(160, 100, 160, 30);

        btnLDirectoriosOcultos.setBackground(new java.awt.Color(204, 204, 204));
        btnLDirectoriosOcultos.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnLDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnLDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLDirectoriosOcultosActionPerformed(evt);
            }
        });
        desktopPane.add(btnLDirectoriosOcultos);
        btnLDirectoriosOcultos.setBounds(330, 100, 170, 30);

        lstLista.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jScrollPane1.setViewportView(lstLista);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 270, 190);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        desktopPane.add(jScrollPane2);
        jScrollPane2.setBounds(320, 170, 230, 150);

        btnInfo.setBackground(new java.awt.Color(204, 204, 204));
        btnInfo.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnInfo.setText("mostrar informacion");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        desktopPane.add(btnInfo);
        btnInfo.setBounds(70, 350, 150, 30);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Gestionar Directorios");

        btnCrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnCrear.setMnemonic('o');
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        fileMenu.add(btnCrear);

        btnEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        btnEliminar.setMnemonic('s');
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        fileMenu.add(btnEliminar);

        btnRenombrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        btnRenombrar.setMnemonic('a');
        btnRenombrar.setText("Renombrar");
        btnRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenombrarActionPerformed(evt);
            }
        });
        fileMenu.add(btnRenombrar);

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        btnSalir.setMnemonic('x');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        fileMenu.add(btnSalir);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenombrarActionPerformed
       String renombre = null;
        renombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del directorio");
        if(renombre == null){
            JOptionPane.showMessageDialog(this, "Agregue un nombre al directorio");
            
        }else{
            String ruta = txtRuta.getText();
            if(controladorDirectorios.validaRuta(ruta)){
                String actual = lstLista.getSelectedValue();
                controladorDirectorios.renombrar(ruta, actual, renombre);
                JOptionPane.showMessageDialog(this, "Se ha renombrado directorio");
                List<String> directorio = controladorDirectorios.listarDirectorios(ruta);
                cargarLista(directorio);
                
            }else{
                JOptionPane.showMessageDialog(this, " Ruta  incorrecta");
            }
        }
    }//GEN-LAST:event_btnRenombrarActionPerformed

    private void btnLDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLDirectoriosActionPerformed
        String ruta = txtRuta.getText();
        String subDirectorio = lstLista.getSelectedValue();

        if (subDirectorio != null) {
            List<String> directorios = controladorDirectorios.Listar(ruta, subDirectorio);
            txtRuta.setText(controladorDirectorios.retornaRuta(ruta, subDirectorio));
            subDirectorio = null;
            if (directorios==null) {
                JOptionPane.showMessageDialog(this, " Directorio vacio");
                limpiar();

            } else {
                cargarLista(directorios);

            }
        } else {
            if (ruta == null) {
                JOptionPane.showMessageDialog(this, "Llene el campo ruta");

            } else {
                if (controladorDirectorios.validaRuta(ruta)) {
                    List<String> directorios = controladorDirectorios.listarDirectorios(ruta);
                    if (directorios.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "El directorio esta vacio");
                        limpiar();

                    } else {
                        cargarLista(directorios);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ruta  incorrecta");
                }
            }
        }
    }//GEN-LAST:event_btnLDirectoriosActionPerformed

    private void btnLArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLArchivosOcultosActionPerformed
        String ruta = txtRuta.getText();
        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "llene el campo ");

        } else {
            if (controladorDirectorios.validaRuta(ruta)) {
                List<String> directorios = controladorDirectorios.listarArchivosOcultos(ruta);
                if (directorios!=null) {
                    cargarLista(directorios);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay archivos ocultos");
                    limpiar();

                }
            } else {
                JOptionPane.showMessageDialog(this, "Ruta  incorrecta");
            }
        }
    }//GEN-LAST:event_btnLArchivosOcultosActionPerformed

    private void btnLDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLDirectoriosOcultosActionPerformed
        String ruta = txtRuta.getText();
        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "llene el campo");

        } else {
            if (controladorDirectorios.validaRuta(ruta)) {
                List<String> directorios = controladorDirectorios.listarDirectoriosOcultos(ruta);
                if (directorios.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "directorio oculto  vacio");
                    limpiar();

                } else {
                    cargarLista(directorios);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ruta  incorrecta");
            }
        }
    }//GEN-LAST:event_btnLDirectoriosOcultosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar este Directorio?");
        if(opcion == JOptionPane.YES_OPTION){
            try{
                String eliminar = lstLista.getSelectedValue();
                String ruta = txtRuta.getText();
                controladorDirectorios.eliminar(ruta, eliminar);
                List<String> directorio = controladorDirectorios.listarDirectorios(ruta);
               cargarLista(directorio);
                JOptionPane.showMessageDialog(this, "El directorio fue eliminado");
                
            }catch(IOException ex){
               JOptionPane.showMessageDialog(this, "Error al eliminar directorio");
                
            }
        }
        List<String> directorio = controladorDirectorios.listarDirectorios(txtRuta.getText());
        cargarLista(directorio);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
    }//GEN-LAST:event_formWindowActivated

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        
        if(controladorDirectorios.validaRuta(txtRuta.getText())&&lstLista.getSelectedValue()!=null){
         String nombre = lstLista.getSelectedValue();
        String ruta = txtRuta.getText();
        String informacion = controladorDirectorios.mostrarInformacion(nombre, ruta);
        txtArea.setText(informacion);
        }
       
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
       String Dir = JOptionPane.showInputDialog("Ingrese nuevo directorio");
        if(Dir == null){
            JOptionPane.showMessageDialog(this, "Ingrese nombre del directorio");
            
        }else{
            String ruta = txtRuta.getText();
            if(ruta.isEmpty()){
                JOptionPane.showMessageDialog(this, "Llene el campo de la ruta");
                
            }else{
                if(controladorDirectorios.validarArchivo(ruta, Dir)){
                    int opcion = JOptionPane.showConfirmDialog(this, "¿Quiere reemplazar directorio?");
                    if(opcion == JOptionPane.YES_OPTION){
                        controladorDirectorios.crear(ruta, Dir);
                        JOptionPane.showMessageDialog(this, "Directorio creado con exito");
                        if(controladorDirectorios.listarDirectorios(ruta).isEmpty()){
                         List<String> directorio = controladorDirectorios.listarDirectorios(ruta);
                          cargarLista(directorio);
                        }
                        
                       
                       
                    }
                }else{
                    controladorDirectorios.crear(ruta, Dir);
                    JOptionPane.showMessageDialog(this, "Directorio creado con exito");
                }
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

     
    public void cargarLista(List<String> directorios) {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();

        directorios.forEach((nombre) -> {
            modelo.addElement(nombre);
       });
        lstLista.setModel(modelo);
    }

    public void limpiar() {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();
       lstLista.setModel(modelo);
    }
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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCrear;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLArchivosOcultos;
    private javax.swing.JButton btnLDirectorios;
    private javax.swing.JButton btnLDirectoriosOcultos;
    private javax.swing.JMenuItem btnRenombrar;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstLista;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

}
