/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Telas;

import javax.swing.JPanel;

public class investimentotela extends javax.swing.JPanel {

    /**
     * Creates new form investimentotela
     */

     // Variables declaration - do not modify                     
    private javax.swing.JPanel EconomiajPanel;
    private javax.swing.JLabel catedraliconjLabel;
    private javax.swing.JButton catedraljButton;
    private javax.swing.JLabel catedraljLabel;
    private javax.swing.JPanel catedraljPanel;
    private javax.swing.JLabel cobalticonjLabel;
    private javax.swing.JLabel cobaltquantjLabel;
    private javax.swing.JLabel cobaltsjLabel;
    private javax.swing.JButton compararjButton;
    private javax.swing.JButton continuarjButton;
    private javax.swing.JLabel coroaiconjLabel;
    private javax.swing.JLabel fundojLabel;
    private javax.swing.JLabel hectaresiconjLabel;
    private javax.swing.JLabel hectaresjLabel;
    private javax.swing.JLabel hectaresquantjLabel;
    private javax.swing.JLabel hospitaisiconjLabel;
    private javax.swing.JButton hospitaisjButton;
    private javax.swing.JLabel hospitaisjLabel;
    private javax.swing.JPanel hospitaisjPanel;
    private javax.swing.JLabel investimentojLabel;
    private javax.swing.JPanel investimentojPanel;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JSeparator jSeparatorInv;
    private javax.swing.JButton mapearjButton;
    private javax.swing.JLabel mercadoiconjLabel;
    private javax.swing.JButton mercadojButton;
    private javax.swing.JLabel mercadosjLabel;
    private javax.swing.JPanel mercadosjPanel;
    private javax.swing.JPanel militaljPanel;
    private javax.swing.JLabel militariconjLabel;
    private javax.swing.JButton militarjButton;
    private javax.swing.JLabel militarjLabel;
    private javax.swing.JLabel moinhoiconjLabel;
    private javax.swing.JButton moinhojButton;
    private javax.swing.JLabel moinhosjLabel;
    private javax.swing.JPanel moinhosjPanel;
    private javax.swing.JLabel palacioiconjLabel;
    private javax.swing.JButton palaciojButton;
    private javax.swing.JLabel palaciojLabel;
    private javax.swing.JPanel palaciojPanel;
    private javax.swing.JLabel tesouroiconjLabel;
    private javax.swing.JLabel tesourojLabel;
    private javax.swing.JPanel tesourojPanel;
    private javax.swing.JLabel titulonomejLabel;
    private javax.swing.JPanel titulonomejPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel buffer;
    // End of variables declaration                   
    public investimentotela() {
        investimento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   public void investimento() {

        jSeparatorInv = new javax.swing.JSeparator();
        mercadojButton = new javax.swing.JButton();
        moinhojButton = new javax.swing.JButton();
        palaciojButton = new javax.swing.JButton();
        hospitaisjButton = new javax.swing.JButton();
        militarjButton = new javax.swing.JButton();
        catedraljButton = new javax.swing.JButton();
        mapearjButton = new javax.swing.JButton();
        compararjButton = new javax.swing.JButton();
        continuarjButton = new javax.swing.JButton();
        investimentojPanel = new javax.swing.JPanel();
        investimentojLabel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        hectaresiconjLabel = new javax.swing.JLabel();
        hectaresjLabel = new javax.swing.JLabel();
        hectaresquantjLabel = new javax.swing.JLabel();
        moinhosjPanel = new javax.swing.JPanel();
        moinhoiconjLabel = new javax.swing.JLabel();
        moinhosjLabel = new javax.swing.JLabel();
        hospitaisjPanel = new javax.swing.JPanel();
        hospitaisiconjLabel = new javax.swing.JLabel();
        hospitaisjLabel = new javax.swing.JLabel();
        palaciojPanel = new javax.swing.JPanel();
        palacioiconjLabel = new javax.swing.JLabel();
        palaciojLabel = new javax.swing.JLabel();
        catedraljPanel = new javax.swing.JPanel();
        catedraliconjLabel = new javax.swing.JLabel();
        catedraljLabel = new javax.swing.JLabel();
        militaljPanel = new javax.swing.JPanel();
        militariconjLabel = new javax.swing.JLabel();
        militarjLabel = new javax.swing.JLabel();
        titulonomejPanel = new javax.swing.JPanel();
        coroaiconjLabel = new javax.swing.JLabel();
        titulonomejLabel = new javax.swing.JLabel();
        mercadosjPanel = new javax.swing.JPanel();
        mercadoiconjLabel = new javax.swing.JLabel();
        mercadosjLabel = new javax.swing.JLabel();
        EconomiajPanel = new javax.swing.JPanel();
        cobalticonjLabel = new javax.swing.JLabel();
        cobaltsjLabel = new javax.swing.JLabel();
        cobaltquantjLabel = new javax.swing.JLabel();
        tesourojPanel = new javax.swing.JPanel();
        tesouroiconjLabel = new javax.swing.JLabel();
        tesourojLabel = new javax.swing.JLabel();
        fundojLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buffer = new javax.swing.JPanel();
        
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 768));
        jPanel2.setLayout(null);

        jSeparatorInv.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorInv);
        jSeparatorInv.setBounds(0, 70, 1370, 19);

        mercadojButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        mercadojButton.setText("($ 1000)");
        jPanel2.add(mercadojButton);
        mercadojButton.setBounds(720, 160, 160, 50);

        moinhojButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        moinhojButton.setText("($ 2000)");
        moinhojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinhojButtonActionPerformed(evt);
            }
        });
        jPanel2.add(moinhojButton);
        moinhojButton.setBounds(720, 210, 160, 50);

        palaciojButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        palaciojButton.setText("($ 3000)");
        palaciojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palaciojButtonActionPerformed(evt);
            }
        });
        jPanel2.add(palaciojButton);
        palaciojButton.setBounds(720, 310, 160, 50);

        hospitaisjButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        hospitaisjButton.setText("($ 2500)");
        hospitaisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitaisjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(hospitaisjButton);
        hospitaisjButton.setBounds(720, 260, 160, 50);

        militarjButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        militarjButton.setText("($ 500)");
        militarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                militarjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(militarjButton);
        militarjButton.setBounds(720, 410, 160, 50);

        catedraljButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        catedraljButton.setText("($ 5000)");
        catedraljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catedraljButtonActionPerformed(evt);
            }
        });
        jPanel2.add(catedraljButton);
        catedraljButton.setBounds(720, 360, 160, 50);

        mapearjButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        mapearjButton.setText("Mapear");
        mapearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapearjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(mapearjButton);
        mapearjButton.setBounds(363, 567, 157, 39);

        compararjButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        compararjButton.setText("Comparar");
        compararjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compararjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(compararjButton);
        compararjButton.setBounds(603, 567, 180, 39);

        continuarjButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        continuarjButton.setText("Continuar");
        continuarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(continuarjButton);
        continuarjButton.setBounds(839, 567, 180, 39);

        investimentojPanel.setBackground(new java.awt.Color(102, 102, 102));
        investimentojPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        investimentojLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        investimentojLabel.setText("INVESTIMENTOS DO ESTADO:");
        investimentojPanel.add(investimentojLabel);

        jPanel2.add(investimentojPanel);
        investimentojPanel.setBounds(460, 80, 420, 50);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hectaresiconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/fazenda.png")); // NOI18N
        jPanel11.add(hectaresiconjLabel);

        hectaresjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        hectaresjLabel.setText("Hectares:");
        jPanel11.add(hectaresjLabel);

        hectaresquantjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        hectaresquantjLabel.setForeground(new java.awt.Color(255, 255, 255));
        hectaresquantjLabel.setText("99999");
        jPanel11.add(hectaresquantjLabel);

        jPanel2.add(jPanel11);
        jPanel11.setBounds(960, 10, 310, 50);

        moinhosjPanel.setBackground(new java.awt.Color(102, 102, 102));
        moinhosjPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        moinhoiconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/moinho-de-vento.png")); // NOI18N
        moinhosjPanel.add(moinhoiconjLabel);

        moinhosjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        moinhosjLabel.setText("Moinhos");
        moinhosjPanel.add(moinhosjLabel);

        jPanel2.add(moinhosjPanel);
        moinhosjPanel.setBounds(460, 210, 260, 50);

        hospitaisjPanel.setBackground(new java.awt.Color(102, 102, 102));
        hospitaisjPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hospitaisiconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/medieval.png")); // NOI18N
        hospitaisjPanel.add(hospitaisiconjLabel);

        hospitaisjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        hospitaisjLabel.setText("Hospitais");
        hospitaisjPanel.add(hospitaisjLabel);

        jPanel2.add(hospitaisjPanel);
        hospitaisjPanel.setBounds(460, 260, 260, 50);

        palaciojPanel.setBackground(new java.awt.Color(102, 102, 102));
        palaciojPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        palacioiconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/castelo-de-areia.png")); // NOI18N
        palaciojPanel.add(palacioiconjLabel);

        palaciojLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        palaciojLabel.setText("Palacio");
        palaciojPanel.add(palaciojLabel);

        jPanel2.add(palaciojPanel);
        palaciojPanel.setBounds(460, 310, 260, 50);

        catedraljPanel.setBackground(new java.awt.Color(102, 102, 102));
        catedraljPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        catedraliconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/catedral.png")); // NOI18N
        catedraljPanel.add(catedraliconjLabel);

        catedraljLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        catedraljLabel.setText("Catedral");
        catedraljPanel.add(catedraljLabel);

        jPanel2.add(catedraljPanel);
        catedraljPanel.setBounds(460, 360, 260, 50);

        militaljPanel.setBackground(new java.awt.Color(102, 102, 102));
        militaljPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        militariconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/cavaleiro.png")); // NOI18N
        militaljPanel.add(militariconjLabel);

        militarjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        militarjLabel.setText("Gastos Militares");
        militaljPanel.add(militarjLabel);

        jPanel2.add(militaljPanel);
        militaljPanel.setBounds(460, 410, 260, 50);

        titulonomejPanel.setBackground(new java.awt.Color(102, 102, 102));
        titulonomejPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        coroaiconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/coroa-holandesa.png")); // NOI18N
        titulonomejPanel.add(coroaiconjLabel);

        titulonomejLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        titulonomejLabel.setText("Princesa Eduardo de GENOVA");
        titulonomejPanel.add(titulonomejLabel);

        jPanel2.add(titulonomejPanel);
        titulonomejPanel.setBounds(10, 10, 440, 50);

        mercadosjPanel.setBackground(new java.awt.Color(102, 102, 102));
        mercadosjPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mercadoiconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/hidromel.png")); // NOI18N
        mercadosjPanel.add(mercadoiconjLabel);

        mercadosjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        mercadosjLabel.setText("Mercados");
        mercadosjPanel.add(mercadosjLabel);

        jPanel2.add(mercadosjPanel);
        mercadosjPanel.setBounds(460, 160, 260, 50);

        EconomiajPanel.setBackground(new java.awt.Color(102, 102, 102));
        EconomiajPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cobalticonjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/moedas_3.png")); // NOI18N
        EconomiajPanel.add(cobalticonjLabel);

        cobaltsjLabel.setBackground(new java.awt.Color(0, 0, 0));
        cobaltsjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        cobaltsjLabel.setText("Cobalts:");
        EconomiajPanel.add(cobaltsjLabel);

        cobaltquantjLabel.setBackground(new java.awt.Color(0, 0, 0));
        cobaltquantjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        cobaltquantjLabel.setForeground(new java.awt.Color(255, 255, 255));
        cobaltquantjLabel.setText("99999");
        EconomiajPanel.add(cobaltquantjLabel);

        jPanel2.add(EconomiajPanel);
        EconomiajPanel.setBounds(530, 10, 310, 50);

        tesourojPanel.setBackground(new java.awt.Color(102, 102, 102));
        tesourojPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tesouroiconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/bau-de-tesouro.png")); // NOI18N
        tesourojPanel.add(tesouroiconjLabel);

        tesourojLabel.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        tesourojLabel.setText("Cobalts: 9999");
        tesourojPanel.add(tesourojLabel);

        jPanel2.add(tesourojPanel);
        tesourojPanel.setBounds(460, 480, 420, 50);

        fundojLabel.setIcon(new javax.swing.ImageIcon("src/resources/images/medieval-pixel-art.jpg")); // NOI18N
        fundojLabel.setText("jLabel2");
        jPanel2.add(fundojLabel);
        fundojLabel.setBounds(0, 0, 1310, 700);

        buffer.add(jPanel2);
    }     

    private void moinhojButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void palaciojButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void hospitaisjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void militarjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void catedraljButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void mapearjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void compararjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void continuarjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }       

    public JPanel getPanel(){
        return buffer;
    }
}