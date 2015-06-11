/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc1_proyecto1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Erick
 */
public class Menu extends javax.swing.JFrame {
    public static String path;
    public JFileChooser seleccion;
    public File archivo;
    public FileReader fr;
    public  BufferedReader br;
    public static ArrayList<Errores> errores_lexicos =new ArrayList();
    public static ArrayList<tablaSimbolos> tabla_simbolos=new ArrayList();
    public static ArrayList<Errores> errores_sintacticos=new ArrayList();
    public static ArrayList<Errores> errores_semanticos=new ArrayList();
    public Scanner s;
    public sintactico p;
    

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
            Area_edicion.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent ce){
                int pos = ce.getDot();
                try {
                    int row = Area_edicion.getLineOfOffset(pos) + 1;
                    int col = pos - Area_edicion.getLineStartOffset(row - 1) + 1;
                    coordenadas.setText("Linea: " + row + ", " + "Columna: " + col);
                } catch (BadLocationException exc) {
                    System.out.println(exc);
                }
            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_edicion = new javax.swing.JTextArea();
        coordenadas = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Consola1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu_Archivo_nuevo = new javax.swing.JMenuItem();
        Menu_Archivo_Abrir = new javax.swing.JMenuItem();
        Menu_Archivo_Guardar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Menu_Archivo_compilar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Menu_Ayuda_Usuario = new javax.swing.JMenuItem();
        Menu_Ayuda_Tecnico = new javax.swing.JMenuItem();
        Menu_Ayuda_Acercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        Area_edicion.setColumns(20);
        Area_edicion.setRows(5);
        jScrollPane1.setViewportView(Area_edicion);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 770, 380);

        coordenadas.setText("Linea:0, Columna:0");
        jPanel1.add(coordenadas);
        coordenadas.setBounds(560, 490, 180, 20);

        Consola1.setColumns(20);
        Consola1.setRows(5);
        jScrollPane2.setViewportView(Consola1);

        jTabbedPane1.addTab("Salida", jScrollPane2);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 390, 770, 100);

        jTabbedPane3.addTab("Área de Edición", jPanel1);
        jTabbedPane3.addTab("Resultados", jPanel2);

        getContentPane().add(jTabbedPane3);
        jTabbedPane3.setBounds(0, 0, 780, 540);

        jMenu1.setText("Archivo");

        Menu_Archivo_nuevo.setText("Nuevo");
        Menu_Archivo_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Archivo_nuevoActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Archivo_nuevo);

        Menu_Archivo_Abrir.setText("Abrir");
        Menu_Archivo_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Archivo_AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Archivo_Abrir);

        Menu_Archivo_Guardar.setText("Guardar");
        Menu_Archivo_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Archivo_GuardarActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Archivo_Guardar);

        jMenuItem1.setText("Guardar como");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Menu_Archivo_compilar.setText("Compilar");
        Menu_Archivo_compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Archivo_compilarActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Archivo_compilar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        Menu_Ayuda_Usuario.setText("Manual Usuario");
        Menu_Ayuda_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Ayuda_UsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(Menu_Ayuda_Usuario);

        Menu_Ayuda_Tecnico.setText("Manual Técnico");
        Menu_Ayuda_Tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Ayuda_TecnicoActionPerformed(evt);
            }
        });
        jMenu2.add(Menu_Ayuda_Tecnico);

        Menu_Ayuda_Acercade.setText("Acerca de");
        Menu_Ayuda_Acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Ayuda_AcercadeActionPerformed(evt);
            }
        });
        jMenu2.add(Menu_Ayuda_Acercade);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 803, 613);
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_Archivo_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Archivo_GuardarActionPerformed
        try {        
        path=this.getTitle();   
        guardarnuevo();
        JOptionPane.showMessageDialog(null, "Cambios Guardados");        
           } catch (FileNotFoundException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_Archivo_GuardarActionPerformed

    private void Menu_Archivo_compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Archivo_compilarActionPerformed
        compilar();
    }//GEN-LAST:event_Menu_Archivo_compilarActionPerformed

    private void Menu_Ayuda_AcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Ayuda_AcercadeActionPerformed
    JOptionPane.showMessageDialog(null," Erick Roberto Tejaxún Xicón 201213050 OLC1 2015");     
    }//GEN-LAST:event_Menu_Ayuda_AcercadeActionPerformed

    private void Menu_Ayuda_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Ayuda_UsuarioActionPerformed
       this.abrirHtml(PathActual()+"\\src\\olc1_proyecto1\\Usuario.pdf");
    }//GEN-LAST:event_Menu_Ayuda_UsuarioActionPerformed

    private void Menu_Ayuda_TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Ayuda_TecnicoActionPerformed
       this.abrirHtml(PathActual()+"\\src\\olc1_proyecto1\\Tecnico.pdf");
    }//GEN-LAST:event_Menu_Ayuda_TecnicoActionPerformed

    private void Menu_Archivo_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Archivo_AbrirActionPerformed
        seleccion =new JFileChooser();
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("php","php");
        seleccion.setFileFilter(filtro);
        seleccion.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado= seleccion.showOpenDialog(this);
        if(resultado==JFileChooser.APPROVE_OPTION){
            File nombre=seleccion.getSelectedFile();
            path=nombre.toString();
            String url=seleccion.getSelectedFile().getAbsolutePath();
            
            this.setTitle(url);
            
            try {
         archivo = new File (path);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         Area_edicion.setText("");
         String linea;
         while((linea=br.readLine())!=null){
         String texto=Area_edicion.getText();
         if(Area_edicion.getText().equals("")){texto+=linea;}else{
         texto+="\n"+linea;}
         Area_edicion.setText(texto);
         }
         
         path=seleccion.getSelectedFile().getParent()+"\\";
         
      }
      catch(Exception e){
      }finally{
         
         try{                   
            if( null != fr ){  
               fr.close();    
            }                 
         }catch (Exception e2){
            
         }
      }
          
 
      }
    }//GEN-LAST:event_Menu_Archivo_AbrirActionPerformed

    private void Menu_Archivo_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Archivo_nuevoActionPerformed
        path="";
        Area_edicion.setText("");
        this.setTitle(path+"Nuevo"+" php");
    }//GEN-LAST:event_Menu_Archivo_nuevoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    try {
        
        if(!this.getTitle().equals(path)){
        seleccion =new JFileChooser();
        seleccion.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado= seleccion.showOpenDialog(this);
            if(resultado==JFileChooser.APPROVE_OPTION){
            File nombre=seleccion.getSelectedFile();
            String nombrenuevo=seleccion.getToolTipText();        
            path=nombre.toString()+".ph";
            guardarnuevo();
            this.setTitle(path);
            JOptionPane.showMessageDialog(null, "Archivo Guardado");
            }      
        }else{
        path=this.getTitle();
            guardarnuevo();
            JOptionPane.showMessageDialog(null, "Cambios Guardados");
        }
    } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area_edicion;
    private javax.swing.JTextArea Consola1;
    private javax.swing.JMenuItem Menu_Archivo_Abrir;
    private javax.swing.JMenuItem Menu_Archivo_Guardar;
    private javax.swing.JMenuItem Menu_Archivo_compilar;
    private javax.swing.JMenuItem Menu_Archivo_nuevo;
    private javax.swing.JMenuItem Menu_Ayuda_Acercade;
    private javax.swing.JMenuItem Menu_Ayuda_Tecnico;
    private javax.swing.JMenuItem Menu_Ayuda_Usuario;
    private javax.swing.JLabel coordenadas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
public void abrirHtml(String pPath){
try {

    String[] cmd = new String[5];
    cmd[0] = "cmd";
    cmd[1] = "/C";
    cmd[2] = "start";
    cmd[3] = "\"\""; 
    cmd[4] = "\"" + pPath + "\""; 
    Runtime rt = Runtime.getRuntime();
    rt.exec(cmd);
} catch (Exception e) {
    e.printStackTrace();
}

}
public String PathActual(){
    String path="";
     File miDir = new File (".");
     try {
       //System.out.println (miDir.getCanonicalPath());
       path=miDir.getCanonicalPath();
     }
     catch(Exception e) {
       e.printStackTrace();
       }
     return path;
}

public void guardarnuevo() throws FileNotFoundException{
                 PrintWriter writer = new PrintWriter(path);
                 String texto=Area_edicion.getText();
//                 System.out.println(texto);
                 writer.print(texto);
                 writer.close();
                
}
public void compilar(){
try {
            
            path=this.getTitle();            
            guardarnuevo();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
             String Area=Area_edicion.getText();
         
//             new sintactico(new Scanner(new BufferedReader(new StringReader(Area)))).parse();
//             listaLexico=Proyecto1_Compiladores.listaLexico;      
//             new sintactico(new Scanner(new BufferedReader(new StringReader(Area)))).parse();
             
            s=new Scanner(new java.io.FileReader(path)); 
              
            p = new sintactico(s);
            p.parse();
            int numero= tabla_simbolos.size();
            for(int n=0;n<numero;n++){
            System.out.println(tabla_simbolos.get(n).columna + "  "+tabla_simbolos.get(n).linea+ "  "+tabla_simbolos.get(n).texto+ "  "+tabla_simbolos.get(n).tipo+ "  "+tabla_simbolos.get(n).descripcion);
            }
            System.out.println(numero);
//            Consola1.setText(p.textoConsola1);

            
            
            
            
           
        }
        catch(Exception e) { System.out.println(e.getMessage());}
    
}

}
