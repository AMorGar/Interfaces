
package cositacreada;
import org.apache.commons.validator.routines.EmailValidator;
import javax.swing.ImageIcon;
import java.io.File;
import javax.swing.Icon;


public class EmailJTextField extends javax.swing.JPanel {
    private String errorText = "Mensaje de error";
    private String labelText = "Correo Electrónico:";
    private String hint = "Introduce tu correo electrónico";
    private File errorImageFile; 
    private File successImageFile;
    
 
    public EmailJTextField() {
    errorImageFile = new File("");
    successImageFile = new File("");   
 
        initComponents();
    }
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        emailField = new java.awt.TextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelMensajeError = new javax.swing.JLabel();
        jLabelIcono = new javax.swing.JLabel();

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teclarelease(evt);
            }
        });

        jLabelNombre.setText("jLabel1");

        jLabelMensajeError.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelMensajeError)
                        .addGap(114, 114, 114))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensajeError)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained

    if(emailField.getText().equals(hint)){
        emailField.setText("");
    }
        
    }//GEN-LAST:event_emailFieldFocusGained
    
    private void teclarelease(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclarelease
               String email = emailField.getText();
               ImageIcon errorIcon = new ImageIcon(errorImageFile.getAbsolutePath());
               ImageIcon successIcon = new ImageIcon(successImageFile.getAbsolutePath());
        if (emailValidator(email)) {
            
            jLabelIcono.setIcon(successIcon);
            jLabelMensajeError.setText("Correo válido");
        } else {
            
            jLabelIcono.setIcon(errorIcon);
            jLabelMensajeError.setText("Correo no válido");
        }
    }//GEN-LAST:event_teclarelease

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
       
        if(emailField.getText().isEmpty()){
             emailField.setText(hint);
         }
    }//GEN-LAST:event_emailFieldFocusLost
       public File getErrorImageFile() {
        return errorImageFile;
    }

    public void setErrorImageFile(File imageFile) {
        this.errorImageFile = imageFile;
   
    }
    
    public File getSuccessImageFile() {
        return successImageFile;
    }

    public void setSuccessImageFile(File imageFile) {
        this.successImageFile = imageFile;
 
    }
    
    public String getLabelText() {
        return labelText;
    }


    public void setLabelText(String text) {
        labelText = text;
        jLabelNombre.setText(text);
    }
     public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String text) {
        errorText = text;
        jLabelMensajeError.setText(text);
    }

    
    public String getHint() {
        return hint;
    }

    public void setHint(String text) {
        hint = text;
        emailField.setText(text);
  
    }

    

        public static boolean emailValidator(String email)
    {
        // Obtener una instancia de `EmailValidator`
        EmailValidator validator = EmailValidator.getInstance();
 
        // Valida la string especificada que contiene una dirección de correo electrónico
        return validator.isValid(email);
    }

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField emailField;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelMensajeError;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}
