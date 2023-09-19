package Telas;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Jogo.jogador;
import Jogo.kingdom;
import Telas.Taxas;

public class TestGame extends javax.swing.JPanel{

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonBuyGrains;
    private javax.swing.JButton buttonBuyLands;
    private javax.swing.JButton buttonContinue;
    private javax.swing.JButton buttonSellGrains;
    private javax.swing.JButton buttonSellLands;
    private javax.swing.JLabel demandGrainsLabel;
    private javax.swing.JPanel demandGrainsPanel;
    private javax.swing.JLabel demandLabel;
    private javax.swing.JPanel economyJPanel;
    private javax.swing.JLabel economyLabel;
    private javax.swing.JLabel grainReserveLabel;
    private javax.swing.JLabel grainsLabel;
    private javax.swing.JLabel harvestLabel;
    private javax.swing.JLabel iconCoinLabel;
    private javax.swing.JLabel iconLandsLabel;
    private javax.swing.JLabel iconPlayerLabel;
    private javax.swing.JLabel imagePanel2;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel landsJPanel;
    private javax.swing.JLabel landsLabel;
    private javax.swing.JLabel landsPlayerLabel;
    private javax.swing.JLabel namePlayerLabel;
    private javax.swing.JPanel namePlayerPanel;
    private javax.swing.JLabel priceGLabel;
    private javax.swing.JLabel priceGrainsLabel;
    private javax.swing.JPanel priceGrainsPanel;
    private javax.swing.JLabel priceLLabel;
    private javax.swing.JLabel priceLandsLabel;
    private javax.swing.JPanel priceLandsPanel;
    private javax.swing.JLabel ratsLabel;
    private javax.swing.JPanel reserveGrainsPanel;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JPanel bufferPanel;
    
    private JButton voltar = new JButton();
    private JLabel label = new JLabel();
    private JTextField textField = new JTextField();
    private GridBagConstraints gbc = new GridBagConstraints();
    private jogador player = new jogador("H", "Eduardo");
    private Taxas taxa = new Taxas();
    private kingdom kingdom = new kingdom();

    public TestGame() {
        initComponents();

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">      

    public void initComponents() {

        kingdom.colheitaTerrasGraos();
        kingdom.praga();
        bufferPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        buttonBuyGrains = new javax.swing.JButton();
        buttonSellGrains = new javax.swing.JButton();
        buttonBuyLands = new javax.swing.JButton();
        buttonSellLands = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        buttonContinue = new javax.swing.JButton();
        priceGrainsPanel = new javax.swing.JPanel();
        priceGrainsLabel = new javax.swing.JLabel();
        priceGLabel = new javax.swing.JLabel();
        namePlayerPanel = new javax.swing.JPanel();
        iconPlayerLabel = new javax.swing.JLabel();
        namePlayerLabel = new javax.swing.JLabel();
        demandGrainsPanel = new javax.swing.JPanel();
        demandLabel = new javax.swing.JLabel();
        demandGrainsLabel = new javax.swing.JLabel();
        reserveGrainsPanel = new javax.swing.JPanel();
        grainsLabel = new javax.swing.JLabel();
        grainReserveLabel = new javax.swing.JLabel();
        priceLandsPanel = new javax.swing.JPanel();
        priceLandsLabel = new javax.swing.JLabel();
        priceLLabel = new javax.swing.JLabel();
        economyJPanel = new javax.swing.JPanel();
        iconCoinLabel = new javax.swing.JLabel();
        economyLabel = new javax.swing.JLabel();
        landsJPanel = new javax.swing.JPanel();
        landsPlayerLabel = new javax.swing.JLabel();
        iconLandsLabel = new javax.swing.JLabel();
        landsLabel = new javax.swing.JLabel();
        informationPanel = new javax.swing.JPanel();
        ratsLabel = new javax.swing.JLabel();
        harvestLabel = new javax.swing.JLabel();
        imagePanel2 = new javax.swing.JLabel();

        jSeparator2.setForeground(new java.awt.Color(0, 255, 0));

        setBackground(new java.awt.Color(196, 199, 197));

        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 768));
        jPanel1.setLayout(null);

        buttonBuyGrains.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        buttonBuyGrains.setText("Comprar Grãos");
        buttonBuyGrains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuyGrainsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBuyGrains);
        buttonBuyGrains.setBounds(30, 500, 290, 35);

        buttonSellGrains.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        buttonSellGrains.setText("Vender Grãos");
        buttonSellGrains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSellGrainsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSellGrains);
        buttonSellGrains.setBounds(350, 500, 290, 35);

        buttonBuyLands.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        buttonBuyLands.setText("Comprar Terras");
        buttonBuyLands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuyLandsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBuyLands);
        buttonBuyLands.setBounds(670, 500, 270, 35);

        buttonSellLands.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        buttonSellLands.setText("Vender Terras");
        buttonSellLands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSellLandsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSellLands);
        buttonSellLands.setBounds(970, 500, 290, 35);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 100, 1283, 20);

        buttonContinue.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        buttonContinue.setText("Continue");
        buttonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContinueActionPerformed(evt);
            }
        });
        jPanel1.add(buttonContinue);
        buttonContinue.setBounds(560, 630, 210, 39);

        priceGrainsPanel.setBackground(new java.awt.Color(102, 102, 102));
        priceGrainsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        priceGrainsPanel.setPreferredSize(new java.awt.Dimension(292, 110));

        priceGrainsLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        priceGrainsLabel.setText("Preço dos Grãos:");

        priceGLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        priceGLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceGLabel.setText("$ " + player.getPreco_graos() + " por Mil Sacas");

        javax.swing.GroupLayout priceGrainsPanelLayout = new javax.swing.GroupLayout(priceGrainsPanel);
        priceGrainsPanel.setLayout(priceGrainsPanelLayout);
        priceGrainsPanelLayout.setHorizontalGroup(
            priceGrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priceGrainsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(priceGrainsLabel)
                .addGap(45, 45, 45))
            .addGroup(priceGrainsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(priceGLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        priceGrainsPanelLayout.setVerticalGroup(
            priceGrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priceGrainsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(priceGrainsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceGLabel)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel1.add(priceGrainsPanel);
        priceGrainsPanel.setBounds(670, 350, 270, 110);

        namePlayerPanel.setBackground(new java.awt.Color(102, 102, 102));
        namePlayerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        iconPlayerLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/coroa-holandesa.png")); // NOI18N

        namePlayerLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        namePlayerLabel.setText(player.getNome() + " " + player.getTitulo() + " do Reino Norte");

        javax.swing.GroupLayout namePlayerPanelLayout = new javax.swing.GroupLayout(namePlayerPanel);
        namePlayerPanel.setLayout(namePlayerPanelLayout);
        namePlayerPanelLayout.setHorizontalGroup(
            namePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namePlayerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconPlayerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namePlayerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        namePlayerPanelLayout.setVerticalGroup(
            namePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePlayerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(namePlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconPlayerLabel)
                    .addComponent(namePlayerLabel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(namePlayerPanel);
        namePlayerPanel.setBounds(10, 10, 425, 66);

        demandGrainsPanel.setBackground(new java.awt.Color(102, 102, 102));
        demandGrainsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        demandLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        demandLabel.setForeground(new java.awt.Color(255, 255, 255));
        demandLabel.setText(player.getDemanda() + " Sacas");

        demandGrainsLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        demandGrainsLabel.setText("Demanda de Grãos:");

        javax.swing.GroupLayout demandGrainsPanelLayout = new javax.swing.GroupLayout(demandGrainsPanel);
        demandGrainsPanel.setLayout(demandGrainsPanelLayout);
        demandGrainsPanelLayout.setHorizontalGroup(
            demandGrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, demandGrainsPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(demandGrainsLabel)
                .addGap(33, 33, 33))
            .addGroup(demandGrainsPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(demandLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        demandGrainsPanelLayout.setVerticalGroup(
            demandGrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, demandGrainsPanelLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(demandGrainsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(demandLabel)
                .addGap(18, 18, 18))
        );

        jPanel1.add(demandGrainsPanel);
        demandGrainsPanel.setBounds(350, 350, 292, 110);

        reserveGrainsPanel.setBackground(new java.awt.Color(102, 102, 102));
        reserveGrainsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reserveGrainsPanel.setPreferredSize(new java.awt.Dimension(292, 110));

        grainsLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        grainsLabel.setForeground(new java.awt.Color(255, 255, 255));
        grainsLabel.setText(player.getGraos() + " Sacas");

        grainReserveLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        grainReserveLabel.setText("Reservas de Grãos:");

        javax.swing.GroupLayout reserveGrainsPanelLayout = new javax.swing.GroupLayout(reserveGrainsPanel);
        reserveGrainsPanel.setLayout(reserveGrainsPanelLayout);
        reserveGrainsPanelLayout.setHorizontalGroup(
            reserveGrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reserveGrainsPanelLayout.createSequentialGroup()
                .addGroup(reserveGrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reserveGrainsPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(grainReserveLabel))
                    .addGroup(reserveGrainsPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(grainsLabel)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        reserveGrainsPanelLayout.setVerticalGroup(
            reserveGrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reserveGrainsPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(grainReserveLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grainsLabel)
                .addGap(18, 18, 18))
        );

        jPanel1.add(reserveGrainsPanel);
        reserveGrainsPanel.setBounds(30, 350, 292, 110);

        priceLandsPanel.setBackground(new java.awt.Color(102, 102, 102));
        priceLandsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        priceLandsPanel.setPreferredSize(new java.awt.Dimension(292, 110));

        priceLandsLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        priceLandsLabel.setText("Preço das Terras:");

        priceLLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        priceLLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLLabel.setText("$ "+ player.getPrecoTerras() + " por Hectar.");

        javax.swing.GroupLayout priceLandsPanelLayout = new javax.swing.GroupLayout(priceLandsPanel);
        priceLandsPanel.setLayout(priceLandsPanelLayout);
        priceLandsPanelLayout.setHorizontalGroup(
            priceLandsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priceLandsPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(priceLandsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priceLandsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(priceLLabel))
                    .addComponent(priceLandsLabel))
                .addGap(37, 37, 37))
        );
        priceLandsPanelLayout.setVerticalGroup(
            priceLandsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priceLandsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(priceLandsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceLLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(priceLandsPanel);
        priceLandsPanel.setBounds(970, 350, 292, 110);

        economyJPanel.setBackground(new java.awt.Color(102, 102, 102));
        economyJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        iconCoinLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/moedas_3.png")); // NOI18N

        economyLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        economyLabel.setForeground(new java.awt.Color(255, 255, 255));
        economyLabel.setText("$ " + player.getCobalts());

        javax.swing.GroupLayout economyJPanelLayout = new javax.swing.GroupLayout(economyJPanel);
        economyJPanel.setLayout(economyJPanelLayout);
        economyJPanelLayout.setHorizontalGroup(
            economyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(economyJPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(iconCoinLabel)
                .addGap(18, 18, 18)
                .addComponent(economyLabel)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        economyJPanelLayout.setVerticalGroup(
            economyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, economyJPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(economyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconCoinLabel)
                    .addComponent(economyLabel))
                .addGap(15, 15, 15))
        );

        jPanel1.add(economyJPanel);
        economyJPanel.setBounds(490, 10, 270, 66);

        landsJPanel.setBackground(new java.awt.Color(102, 102, 102));
        landsJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        landsPlayerLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        landsPlayerLabel.setText("Área do Reino:");

        iconLandsLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/fazenda.png")); // NOI18N

        landsLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        landsLabel.setForeground(new java.awt.Color(255, 255, 255));
        landsLabel.setText(player.getTerras() + " Hectares");

        javax.swing.GroupLayout landsJPanelLayout = new javax.swing.GroupLayout(landsJPanel);
        landsJPanel.setLayout(landsJPanelLayout);
        landsJPanelLayout.setHorizontalGroup(
            landsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLandsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(landsPlayerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(landsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        landsJPanelLayout.setVerticalGroup(
            landsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landsJPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(landsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLandsLabel)
                    .addGroup(landsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(landsPlayerLabel)
                        .addComponent(landsLabel)))
                .addGap(15, 15, 15))
        );

        jPanel1.add(landsJPanel);
        landsJPanel.setBounds(800, 10, 470, 66);

        informationPanel.setBackground(new java.awt.Color(102, 102, 102));
        informationPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ratsLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        ratsLabel.setText("Os ratos comeram 20% das reservas no armazenamento.");

        harvestLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        harvestLabel.setText("A colheita dessa estação rendeu uma safra de " + kingdom.getColheita() + " sacas de grãos.");

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(harvestLabel)
                    .addComponent(ratsLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ratsLabel)
                .addGap(18, 18, 18)
                .addComponent(harvestLabel)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(informationPanel);
        informationPanel.setBounds(20, 160, 1000, 116);

        imagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/medieval-pixel-art.jpg"))); // NOI18N
        jPanel1.add(imagePanel2);
        imagePanel2.setBounds(0, 0, 1290, 768);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 768);
        bufferPanel.add(jPanel1);
    }                      
                                                                                                                
    private void buttonBuyGrainsActionPerformed(java.awt.event.ActionEvent evt) {   //Comprar Grãos                                      
        
        bufferPanel.remove(jPanel1);
        bufferPanel.revalidate();
        bufferPanel.repaint();

        selectionPanel = new JPanel();

        label.setText("Quantos grãos você deseja comprar?");
        label.setFont(new Font("Verdana", Font.PLAIN, 25));

        textField.setPreferredSize(new Dimension(300, 40));
        textField.setFont(new Font("Verdana", Font.PLAIN, 20)); 

        selectionPanel.setLayout(new GridBagLayout());
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        selectionPanel.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        selectionPanel.add(textField, gbc);

        gbc.gridy = 2;
        voltar.setText("Voltar");
        selectionPanel.add(voltar, gbc);

        bufferPanel.add(selectionPanel);
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bufferPanel.remove(selectionPanel);
                bufferPanel.revalidate();
                bufferPanel.repaint();
                bufferPanel.add(jPanel1);
            }
        });
    }     
    
    private void buttonSellGrainsActionPerformed(java.awt.event.ActionEvent evt) {   //Vender Grãos                       
    
        bufferPanel.remove(jPanel1);
        bufferPanel.revalidate();
        bufferPanel.repaint();

        selectionPanel = new JPanel();

        label.setText("Quantos grãos você deseja vender?");
        label.setFont(new Font("Verdana", Font.PLAIN, 25));

        textField.setPreferredSize(new Dimension(300, 40));
        textField.setFont(new Font("Verdana", Font.PLAIN, 20)); 

        selectionPanel.setLayout(new GridBagLayout());
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        selectionPanel.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        selectionPanel.add(textField, gbc);

        gbc.gridy = 2;
        voltar.setText("Voltar");
        selectionPanel.add(voltar, gbc);

        bufferPanel.add(selectionPanel);
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bufferPanel.remove(selectionPanel);
                bufferPanel.revalidate();
                bufferPanel.repaint();
                bufferPanel.add(jPanel1);
            }
        });
    }   
    
    private void buttonBuyLandsActionPerformed(java.awt.event.ActionEvent evt) {   //Comprar Terras                        
        
        bufferPanel.remove(jPanel1);
        bufferPanel.revalidate();
        bufferPanel.repaint();

        selectionPanel = new JPanel();

        label.setText("Quantas terras você deseja comprar?");
        label.setFont(new Font("Verdana", Font.PLAIN, 25));

        textField.setPreferredSize(new Dimension(300, 40));
        textField.setFont(new Font("Verdana", Font.PLAIN, 20)); 

        selectionPanel.setLayout(new GridBagLayout());
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        selectionPanel.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        selectionPanel.add(textField, gbc);

        gbc.gridy = 2;
        voltar.setText("Voltar");
        selectionPanel.add(voltar, gbc);

        bufferPanel.add(selectionPanel);
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bufferPanel.remove(selectionPanel);
                bufferPanel.revalidate();
                bufferPanel.repaint();
                bufferPanel.add(jPanel1);
            }
        });
    }   

    private void buttonSellLandsActionPerformed(java.awt.event.ActionEvent evt) {   //Vender Terras                      
        
        bufferPanel.remove(jPanel1);
        bufferPanel.revalidate();
        bufferPanel.repaint();

        selectionPanel = new JPanel();

        label.setText("Quantas terras você deseja vender?");
        label.setFont(new Font("Verdana", Font.PLAIN, 25));

        textField.setPreferredSize(new Dimension(300, 40));
        textField.setFont(new Font("Verdana", Font.PLAIN, 20)); 

        selectionPanel.setLayout(new GridBagLayout());
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        selectionPanel.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        selectionPanel.add(textField, gbc);

        gbc.gridy = 2;
        voltar.setText("Voltar");
        selectionPanel.add(voltar, gbc);

        bufferPanel.add(selectionPanel);
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bufferPanel.remove(selectionPanel);
                bufferPanel.revalidate();
                bufferPanel.repaint();
                bufferPanel.add(jPanel1);
            }
        });
    } 

    private void  buttonContinueActionPerformed(java.awt.event.ActionEvent evt) {   //Continue                          
        bufferPanel.remove(jPanel1);
        bufferPanel.add(taxa.getPanel());
        bufferPanel.revalidate();
        bufferPanel.repaint();
    }                                        
    
    // End of variables declaration          
    public JPanel getPanel(){
        return bufferPanel;
    }
}