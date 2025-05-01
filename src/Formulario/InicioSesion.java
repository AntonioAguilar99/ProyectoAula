package Formulario;

import java.awt.Color;


public class InicioSesion extends javax.swing.JFrame {


    int Xmouse, Ymouse;
    public InicioSesion() {
        initComponents();
        setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        NombreEmpresa = new javax.swing.JLabel();
        Favicon = new javax.swing.JLabel();
        City = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        Exitbtn = new javax.swing.JPanel();
        ExitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Userlabel = new javax.swing.JLabel();
        UserTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Passwordlabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        PassTxt = new javax.swing.JPasswordField();
        EntrarBtn = new javax.swing.JPanel();
        EntrarbtnTxt = new javax.swing.JLabel();
        EntrarbtnTxt1 = new javax.swing.JLabel();
        EntrarbtnTxt2 = new javax.swing.JLabel();
        EntrarbtnTxt3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        Background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 290, 190));

        NombreEmpresa.setBackground(new java.awt.Color(240, 240, 240));
        NombreEmpresa.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        NombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreEmpresa.setText("Med Eps");
        Background.add(NombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 290, 40));

        Favicon.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        Background.add(Favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 60));

        City.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city.png"))); // NOI18N
        Background.add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        Exitbtn.setBackground(new java.awt.Color(255, 255, 255));
        Exitbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ExitTxt.setBackground(new java.awt.Color(0, 0, 0));
        ExitTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        ExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitTxt.setText("X");
        ExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ExitbtnLayout = new javax.swing.GroupLayout(Exitbtn);
        Exitbtn.setLayout(ExitbtnLayout);
        ExitbtnLayout.setHorizontalGroup(
            ExitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        ExitbtnLayout.setVerticalGroup(
            ExitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 730, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jLabel1.setBackground(new java.awt.Color(50, 50, 50));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIAR SESION");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        Userlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Userlabel.setText("USUARIO");
        Background.add(Userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        UserTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        UserTxt.setForeground(new java.awt.Color(60, 60, 60));
        UserTxt.setText("Ingrese su nombre de usuario");
        UserTxt.setBorder(null);
        UserTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserTxtFocusGained(evt);
            }
        });
        UserTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserTxtMousePressed(evt);
            }
        });
        UserTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTxtActionPerformed(evt);
            }
        });
        Background.add(UserTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 350, 30));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 390, 10));

        Passwordlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Passwordlabel.setText("CONTRASEÑA");
        Background.add(Passwordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 390, -1));

        PassTxt.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        PassTxt.setForeground(new java.awt.Color(60, 60, 60));
        PassTxt.setText("********");
        PassTxt.setBorder(null);
        PassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassTxtMousePressed(evt);
            }
        });
        Background.add(PassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 350, 30));

        EntrarBtn.setBackground(new java.awt.Color(0, 134, 190));

        EntrarbtnTxt.setBackground(new java.awt.Color(0, 120, 215));
        EntrarbtnTxt.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        EntrarbtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        EntrarbtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntrarbtnTxt.setText("ENTRAR");
        EntrarbtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarbtnTxt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                EntrarbtnTxtAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        EntrarbtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarbtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarbtnTxtMouseExited(evt);
            }
        });

        EntrarbtnTxt1.setBackground(new java.awt.Color(0, 134, 190));
        EntrarbtnTxt1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        EntrarbtnTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntrarbtnTxt1.setText("ENTRAR");
        EntrarbtnTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarbtnTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarbtnTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarbtnTxt1MouseExited(evt);
            }
        });

        EntrarbtnTxt2.setBackground(new java.awt.Color(0, 134, 190));
        EntrarbtnTxt2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        EntrarbtnTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntrarbtnTxt2.setText("ENTRAR");
        EntrarbtnTxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarbtnTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarbtnTxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarbtnTxt2MouseExited(evt);
            }
        });

        EntrarbtnTxt3.setBackground(new java.awt.Color(0, 120, 215));
        EntrarbtnTxt3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        EntrarbtnTxt3.setForeground(new java.awt.Color(255, 255, 255));
        EntrarbtnTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntrarbtnTxt3.setText("ENTRAR");
        EntrarbtnTxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarbtnTxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarbtnTxt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarbtnTxt3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout EntrarBtnLayout = new javax.swing.GroupLayout(EntrarBtn);
        EntrarBtn.setLayout(EntrarBtnLayout);
        EntrarBtnLayout.setHorizontalGroup(
            EntrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntrarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(EntrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EntrarbtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntrarbtnTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntrarbtnTxt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntrarbtnTxt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        EntrarBtnLayout.setVerticalGroup(
            EntrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EntrarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EntrarbtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EntrarbtnTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EntrarbtnTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EntrarbtnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(EntrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 40));

        jButton1.setText("Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarbtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnTxtMouseEntered
        EntrarBtn.setBackground(new Color(0, 156, 233));
    }//GEN-LAST:event_EntrarbtnTxtMouseEntered

    private void EntrarbtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnTxtMouseExited
        EntrarBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_EntrarbtnTxtMouseExited

    private void UserTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxtMousePressed
        if (UserTxt.getText().equals("Ingrese su nombre de usuario")){
        UserTxt.setText("");
        UserTxt.setForeground(Color.black);
        }
        if (String.valueOf(PassTxt.getPassword()).isEmpty()){
        PassTxt.setText("********");
        PassTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UserTxtMousePressed

    private void PassTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassTxtMousePressed
        if (UserTxt.getText().isEmpty()) {
        UserTxt.setText("Ingrese su nombre de usuario");
        UserTxt.setForeground(Color.gray);
         }
         if (String.valueOf(PassTxt.getPassword()).equals("********")){
        PassTxt.setText("");
        PassTxt.setForeground(Color.black);
         }
    }//GEN-LAST:event_PassTxtMousePressed

    private void EntrarbtnTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnTxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarbtnTxt1MouseEntered

    private void EntrarbtnTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnTxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarbtnTxt1MouseExited

    private void EntrarbtnTxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnTxt2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarbtnTxt2MouseEntered

    private void EntrarbtnTxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnTxt2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarbtnTxt2MouseExited

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void ExitTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitTxtMousePressed

    private void ExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseExited
        Exitbtn.setBackground(Color.white);
        ExitTxt.setForeground(Color.black);
    }//GEN-LAST:event_ExitTxtMouseExited

    private void ExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseEntered
        Exitbtn.setBackground(Color.red);
        ExitTxt.setForeground(Color.white);
    }//GEN-LAST:event_ExitTxtMouseEntered

    private void ExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitTxtMouseClicked

    private void UserTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTxtActionPerformed

    private void UserTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTxtFocusGained

    private void EntrarbtnTxt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnTxt3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarbtnTxt3MouseEntered

    private void EntrarbtnTxt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnTxt3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarbtnTxt3MouseExited

    private void EntrarbtnTxtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EntrarbtnTxtAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarbtnTxtAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Registro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel City;
    private javax.swing.JPanel EntrarBtn;
    private javax.swing.JLabel EntrarbtnTxt;
    private javax.swing.JLabel EntrarbtnTxt1;
    private javax.swing.JLabel EntrarbtnTxt2;
    private javax.swing.JLabel EntrarbtnTxt3;
    private javax.swing.JLabel ExitTxt;
    private javax.swing.JPanel Exitbtn;
    private javax.swing.JLabel Favicon;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreEmpresa;
    private javax.swing.JPasswordField PassTxt;
    private javax.swing.JLabel Passwordlabel;
    private javax.swing.JTextField UserTxt;
    private javax.swing.JLabel Userlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
