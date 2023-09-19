/*Créditos
 * 
 * Icons Flaticon
 */

//Bibliotecas

//AWT
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Insets;

//Swing
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


//Classes do jogo
import sound.musicEpic;
import Jogo.jogador;
import Jogo.kingdom;

public class RealmsAscensionGame extends javax.swing.JPanel{

    //Variaveis
    private JFrame frame;
    private JPanel panel, panel2;
    private int duration = 5000;
    kingdom reino = new kingdom();

    //Tela StartGame                   
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
    jogador player;

    //Tela Taxas
    private javax.swing.JButton buttonContinue3;
    private javax.swing.JButton buttonCustoms;
    private javax.swing.JButton buttonJustice;
    private javax.swing.JButton buttonMiscellaneous;
    private javax.swing.JButton buttonSales;
    private javax.swing.JPanel choiceTaxJPanel;
    private javax.swing.JLabel choiceTaxLabel;
    private javax.swing.JLabel customsLabel;
    private javax.swing.JPanel economyJPanel3;
    private javax.swing.JLabel economyPlayerLabel3;
    private javax.swing.JLabel iconCoinLabel3;
    private javax.swing.JLabel iconLandsLabel3;
    private javax.swing.JLabel iconPlayerLabel3;
    private javax.swing.JLabel iconTreasureLabel;
    private javax.swing.JLabel imageLabel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel justiceLabel;
    private javax.swing.JPanel landsJPanel3;
    private javax.swing.JLabel landsLabel3;
    private javax.swing.JLabel landsPlayerLabel3;
    private javax.swing.JLabel miscellaneousLabel;
    private javax.swing.JLabel namePlayerLabel3;
    private javax.swing.JPanel namePlayerPanel3;
    private javax.swing.JLabel salesLabel;
    private javax.swing.JPanel taxCustomsJPanel;
    private javax.swing.JLabel taxCustomsLabel;
    private javax.swing.JPanel taxJusticeJPanel;
    private javax.swing.JLabel taxJusticeLabel;
    private javax.swing.JPanel taxMiscellaneousJPanel;
    private javax.swing.JLabel taxMiscellaneousLabel;
    private javax.swing.JPanel taxSalesJPanel;
    private javax.swing.JLabel taxSalesLabel;
    private javax.swing.JPanel treasureJPanel;
    private javax.swing.JLabel treasureLabel;
    private javax.swing.JLabel treasurePlayerLabel;
    private javax.swing.JPanel Jpanel1;
    private javax.swing.JPanel bufferTaxa;

    //Tela Investimento
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

    //Tela de seleção
    private javax.swing.JButton CreditsButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton SoundButton;
    private javax.swing.JButton StarGameButton;
    private javax.swing.JLabel TittleName;
    private javax.swing.JPanel JFatherPanel;
    private javax.swing.JPanel JStartPanel;
    private javax.swing.JPanel CreditsPanel;

    private boolean playMusic = false;
    
    private Dimension buttonSizeSmall = new Dimension(100, 50);
    private musicEpic epic = new musicEpic("src/resources/music/The-Ice-Giants.wav");

    public RealmsAscensionGame() {

        player = new jogador("H", "Eduardo");


        //Criando a janela
        frame = new JFrame("Realms Ascensions");
        frame.setSize(1280, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color( 196, 199, 199));
        //frame.add(new background(backgroundImage));
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);

        //Criando o JPanel que vai armazenar o componente textInit e adicionando um layout manager
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        //Criando o texto de boas vindas, apresentação do jogo e definindo suas propriedades
        JLabel textInit = new JLabel("Bem-vindo(a) ao Realms Ascensions");
        textInit.setFont(new Font("Verdana", Font.BOLD, 35));
        textInit.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel textInit2 = new JLabel("<html> <div style='text-align: center;'>Realms Ascensions é um jogo simples de dois jogadores ou mais, cujo objetivo é diversão, testar suas técnicas de administração e aprender como funcionava o estilo de vida durante a idade média.</div></html>");
        textInit2.setFont(new Font("Verdana", Font.BOLD, 35));
        textInit2.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Adicionando janelas
        panel.add(Box.createVerticalGlue());
        panel.add(textInit);
        panel.add(Box.createVerticalGlue());

        panel2.add(Box.createVerticalGlue());        
        panel2.add(textInit2);
        panel2.add(Box.createVerticalGlue());

        //Adicionando o Panel no frame
        frame.add(panel);

        //Adicionando o evento de transição de tela com o Jframe
        Timer timeTextInit = new Timer(duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel);
                frame.add(panel2);
                frame.revalidate();
                frame.repaint();
                startselectionPanel();
            }
        }); 
        //Iniciando o temporizador do TextInit
        timeTextInit.setRepeats(false);
        timeTextInit.start();
    }
      
    @SuppressWarnings("unchecked")
    
    public void startselectionPanel(){

        Timer timeselectionPanel = new Timer(duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel2);
                Select();
                frame.add(JStartPanel);
                frame.revalidate();
                frame.repaint();                
            }
        }); 
        
        //Iniciando o temporizador do menu de seleção
        timeselectionPanel.setRepeats(false);
        timeselectionPanel.start();
    }           

    private void Select() {

        epic.playMusicMenu();

        TittleName = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        StarGameButton = new javax.swing.JButton();
        CreditsButton = new javax.swing.JButton();
        SoundButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        ImageLabel = new javax.swing.JLabel();
        JFatherPanel = new javax.swing.JPanel();
        JStartPanel = new javax.swing.JPanel();

        JFatherPanel.setBackground(getBackground());
        JFatherPanel.setPreferredSize(new java.awt.Dimension(1280, 768));
        JFatherPanel.setLayout(null);

        TittleName.setFont(new java.awt.Font("Verdana", 1, 55)); // NOI18N
        TittleName.setLabelFor(TittleName);
        TittleName.setText("Realms Ascension");
        JFatherPanel.add(TittleName);
        TittleName.setBounds(370, 120, 559, 68);

        ExitButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        ExitButton.setText("Sair");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        JFatherPanel.add(ExitButton);
        ExitButton.setBounds(460, 500, 350, 50);

        StarGameButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        StarGameButton.setText("Novo Jogo");
        StarGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StarGameButtonActionPerformed(evt);
            }
        });

        JFatherPanel.add(StarGameButton);
        StarGameButton.setBounds(460, 380, 350, 50);

        CreditsButton.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        CreditsButton.setText("Créditos");
        CreditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditsButtonActionPerformed(evt);
            }
        });
        JFatherPanel.add(CreditsButton);
        CreditsButton.setBounds(460, 440, 350, 50);

        SoundButton.setIcon(new javax.swing.ImageIcon("src/resources/icons/caixas-de-som.png")); // NOI18N
        SoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundButtonActionPerformed(evt);
            }
        });
        JFatherPanel.add(SoundButton);
        SoundButton.setBounds(650, 570, 40, 40);

        SettingsButton.setIcon(new javax.swing.ImageIcon("src/resources/icons/contexto.png")); // NOI18N
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        JFatherPanel.add(SettingsButton);
        SettingsButton.setBounds(590, 570, 38, 39);

        ImageLabel.setIcon(new javax.swing.ImageIcon("src/resources/images/medieval-pixel-art.jpg")); // NOI18N
        JFatherPanel.add(ImageLabel);
        ImageLabel.setBounds(0, -30, 1280, 768);

        JStartPanel.add(JFatherPanel);
    }           

    private void StartGame() {

        player.colheitaTerrasGraos();    

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
        namePlayerLabel.setText(player.getTitulo()+ " " + player.getNome() +  " do Reino Norte");

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
        ratsLabel.setText("Os ratos comeram " + player.getRatosComeram() + "% das reservas no armazenamento.");

        harvestLabel.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        harvestLabel.setText("A colheita dessa estação rendeu uma safra de " + player.getColheita() + " sacas de grãos.");

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

    private void Taxas() {

        player.calculoRendasTaxas();
        
        jSeparator3 = new javax.swing.JSeparator();
        taxCustomsJPanel = new javax.swing.JPanel();
        taxCustomsLabel = new javax.swing.JLabel();
        customsLabel = new javax.swing.JLabel();
        taxSalesJPanel = new javax.swing.JPanel();
        taxSalesLabel = new javax.swing.JLabel();
        salesLabel = new javax.swing.JLabel();
        taxMiscellaneousJPanel = new javax.swing.JPanel();
        taxMiscellaneousLabel = new javax.swing.JLabel();
        miscellaneousLabel = new javax.swing.JLabel();
        taxJusticeJPanel = new javax.swing.JPanel();
        taxJusticeLabel = new javax.swing.JLabel();
        justiceLabel = new javax.swing.JLabel();
        buttonMiscellaneous = new javax.swing.JButton();
        buttonCustoms = new javax.swing.JButton();
        buttonSales = new javax.swing.JButton();
        buttonJustice = new javax.swing.JButton();
        buttonContinue3 = new javax.swing.JButton();
        treasureJPanel = new javax.swing.JPanel();
        treasureLabel = new javax.swing.JLabel();
        iconTreasureLabel = new javax.swing.JLabel();
        treasurePlayerLabel = new javax.swing.JLabel();
        choiceTaxJPanel = new javax.swing.JPanel();
        choiceTaxLabel = new javax.swing.JLabel();
        namePlayerPanel3 = new javax.swing.JPanel();
        namePlayerLabel3 = new javax.swing.JLabel();
        iconPlayerLabel3 = new javax.swing.JLabel();
        economyJPanel3 = new javax.swing.JPanel();
        iconCoinLabel3 = new javax.swing.JLabel();
        economyPlayerLabel3 = new javax.swing.JLabel();
        landsJPanel3 = new javax.swing.JPanel();
        landsPlayerLabel3 = new javax.swing.JLabel();
        iconLandsLabel3 = new javax.swing.JLabel();
        landsLabel3 = new javax.swing.JLabel();
        imageLabel3 = new javax.swing.JLabel();
        Jpanel1 = new javax.swing.JPanel();
        bufferTaxa = new javax.swing.JPanel();

        Jpanel1.setBackground(new java.awt.Color(196, 199, 197));
        Jpanel1.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        Jpanel1.setPreferredSize(new java.awt.Dimension(1280, 768));
        Jpanel1.setLayout(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        Jpanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 90, 1274, 10);

        taxCustomsJPanel.setBackground(new java.awt.Color(102, 102, 102));
        taxCustomsJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        taxCustomsLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        taxCustomsLabel.setText("Taxas Alfandegárias");

        customsLabel.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        customsLabel.setForeground(new java.awt.Color(255, 255, 255));
        customsLabel.setText(reino.getTaxaAlfandegaria() + "%");

        javax.swing.GroupLayout taxCustomsJPanelLayout = new javax.swing.GroupLayout(taxCustomsJPanel);
        taxCustomsJPanel.setLayout(taxCustomsJPanelLayout);
        taxCustomsJPanelLayout.setHorizontalGroup(
            taxCustomsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxCustomsJPanelLayout.createSequentialGroup()
                .addGroup(taxCustomsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(taxCustomsJPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(taxCustomsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(taxCustomsJPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(customsLabel)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        taxCustomsJPanelLayout.setVerticalGroup(
            taxCustomsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxCustomsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taxCustomsLabel)
                .addGap(18, 18, 18)
                .addComponent(customsLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Jpanel1.add(taxCustomsJPanel);
        taxCustomsJPanel.setBounds(20, 250, 300, 110);

        taxSalesJPanel.setBackground(new java.awt.Color(102, 102, 102));
        taxSalesJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        taxSalesLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        taxSalesLabel.setText("Taxas de Vendas");

        salesLabel.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        salesLabel.setForeground(new java.awt.Color(255, 255, 255));
        salesLabel.setText(reino.getTaxaVendas()+"%");

        javax.swing.GroupLayout taxSalesJPanelLayout = new javax.swing.GroupLayout(taxSalesJPanel);
        taxSalesJPanel.setLayout(taxSalesJPanelLayout);
        taxSalesJPanelLayout.setHorizontalGroup(
            taxSalesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxSalesJPanelLayout.createSequentialGroup()
                .addGroup(taxSalesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(taxSalesJPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(taxSalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(taxSalesJPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(salesLabel)))
                .addGap(35, 35, 35))
        );
        taxSalesJPanelLayout.setVerticalGroup(
            taxSalesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxSalesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taxSalesLabel)
                .addGap(18, 18, 18)
                .addComponent(salesLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Jpanel1.add(taxSalesJPanel);
        taxSalesJPanel.setBounds(340, 250, 294, 110);

        taxMiscellaneousJPanel.setBackground(new java.awt.Color(102, 102, 102));
        taxMiscellaneousJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        taxMiscellaneousLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        taxMiscellaneousLabel.setText("Taxas Diversas");

        miscellaneousLabel.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        miscellaneousLabel.setForeground(new java.awt.Color(255, 255, 255));
        miscellaneousLabel.setText(reino.getTaxaDiversas()+"%");

        javax.swing.GroupLayout taxMiscellaneousJPanelLayout = new javax.swing.GroupLayout(taxMiscellaneousJPanel);
        taxMiscellaneousJPanel.setLayout(taxMiscellaneousJPanelLayout);
        taxMiscellaneousJPanelLayout.setHorizontalGroup(
            taxMiscellaneousJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taxMiscellaneousJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(taxMiscellaneousLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(taxMiscellaneousJPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(miscellaneousLabel)
                .addContainerGap())
        );
        taxMiscellaneousJPanelLayout.setVerticalGroup(
            taxMiscellaneousJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxMiscellaneousJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taxMiscellaneousLabel)
                .addGap(18, 18, 18)
                .addComponent(miscellaneousLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Jpanel1.add(taxMiscellaneousJPanel);
        taxMiscellaneousJPanel.setBounds(650, 250, 289, 110);

        taxJusticeJPanel.setBackground(new java.awt.Color(102, 102, 102));
        taxJusticeJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        taxJusticeLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        taxJusticeLabel.setText("Justiça");

        justiceLabel.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        justiceLabel.setForeground(new java.awt.Color(255, 255, 255));
        justiceLabel.setText(reino.getJustica());

        javax.swing.GroupLayout taxJusticeJPanelLayout = new javax.swing.GroupLayout(taxJusticeJPanel);
        taxJusticeJPanel.setLayout(taxJusticeJPanelLayout);
        taxJusticeJPanelLayout.setHorizontalGroup(
            taxJusticeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxJusticeJPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(taxJusticeLabel)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taxJusticeJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(justiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        taxJusticeJPanelLayout.setVerticalGroup(
            taxJusticeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxJusticeJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taxJusticeLabel)
                .addGap(18, 18, 18)
                .addComponent(justiceLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Jpanel1.add(taxJusticeJPanel);
        taxJusticeJPanel.setBounds(960, 250, 297, 110);

        buttonMiscellaneous.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        buttonMiscellaneous.setText("Taxas Diversas");
        buttonMiscellaneous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMiscellaneousActionPerformed(evt);
            }
        });
        Jpanel1.add(buttonMiscellaneous);
        buttonMiscellaneous.setBounds(700, 520, 417, 39);

        buttonCustoms.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        buttonCustoms.setText("Taxas Alfandegárias");
        buttonCustoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustomsActionPerformed(evt);
            }
        });
        Jpanel1.add(buttonCustoms);
        buttonCustoms.setBounds(150, 520, 417, 39);

        buttonSales.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        buttonSales.setText("Taxas de Vendas");
        buttonSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalesActionPerformed(evt);
            }
        });
        Jpanel1.add(buttonSales);
        buttonSales.setBounds(150, 600, 417, 39);

        buttonJustice.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        buttonJustice.setText("Justiça");
        buttonJustice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJusticeActionPerformed(evt);
            }
        });
        Jpanel1.add(buttonJustice);
        buttonJustice.setBounds(700, 600, 417, 39);

        buttonContinue3.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        buttonContinue3.setText("Continue");
        buttonContinue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContinue3ActionPerformed(evt);
            }
        });
        Jpanel1.add(buttonContinue3);
        buttonContinue3.setBounds(540, 660, 186, 39);

        treasureJPanel.setBackground(new java.awt.Color(102, 102, 102));
        treasureJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        treasureLabel.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        treasureLabel.setText("Tesouro Nacional:");

        treasurePlayerLabel.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        treasurePlayerLabel.setForeground(new java.awt.Color(255, 255, 255));
        treasurePlayerLabel.setText("$ " + reino.getTaxas());

        javax.swing.GroupLayout treasureJPanelLayout = new javax.swing.GroupLayout(treasureJPanel);
        treasureJPanel.setLayout(treasureJPanelLayout);
        treasureJPanelLayout.setHorizontalGroup(
            treasureJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, treasureJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconTreasureLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(treasureLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(treasurePlayerLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        treasureJPanelLayout.setVerticalGroup(
            treasureJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treasureJPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(treasureJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconTreasureLabel)
                    .addGroup(treasureJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(treasureLabel)
                        .addComponent(treasurePlayerLabel)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Jpanel1.add(treasureJPanel);
        treasureJPanel.setBounds(20, 130, 450, 80);

        choiceTaxJPanel.setBackground(new java.awt.Color(102, 102, 102));
        choiceTaxJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        choiceTaxLabel.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        choiceTaxLabel.setText("Alterar as Taxas:");

        javax.swing.GroupLayout choiceTaxJPanelLayout = new javax.swing.GroupLayout(choiceTaxJPanel);
        choiceTaxJPanel.setLayout(choiceTaxJPanelLayout);
        choiceTaxJPanelLayout.setHorizontalGroup(
            choiceTaxJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choiceTaxJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choiceTaxLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        choiceTaxJPanelLayout.setVerticalGroup(
            choiceTaxJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choiceTaxJPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(choiceTaxLabel)
                .addGap(23, 23, 23))
        );

        Jpanel1.add(choiceTaxJPanel);
        choiceTaxJPanel.setBounds(20, 410, 256, 80);

        namePlayerPanel3.setBackground(new java.awt.Color(102, 102, 102));
        namePlayerPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        namePlayerLabel3.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        namePlayerLabel3.setText(player.getTitulo() + " " + player.getNome() + " do reino do Norte");

        iconPlayerLabel3.setIcon(new javax.swing.ImageIcon("src/resources/icons/coroa-holandesa.png")); // NOI18N

        javax.swing.GroupLayout namePlayerPanel3Layout = new javax.swing.GroupLayout(namePlayerPanel3);
        namePlayerPanel3.setLayout(namePlayerPanel3Layout);
        namePlayerPanel3Layout.setHorizontalGroup(
            namePlayerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namePlayerPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconPlayerLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namePlayerLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        namePlayerPanel3Layout.setVerticalGroup(
            namePlayerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePlayerPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(namePlayerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconPlayerLabel3)
                    .addComponent(namePlayerLabel3))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Jpanel1.add(namePlayerPanel3);
        namePlayerPanel3.setBounds(10, 10, 457, 70);

        economyJPanel3.setBackground(new java.awt.Color(102, 102, 102));
        economyJPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        iconCoinLabel3.setIcon(new javax.swing.ImageIcon("src/resources/icons/moedas_3.png")); // NOI18N

        economyPlayerLabel3.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        economyPlayerLabel3.setForeground(new java.awt.Color(255, 255, 255));
        economyPlayerLabel3.setText("$ " + player.getCobalts());

        javax.swing.GroupLayout economyJPanel3Layout = new javax.swing.GroupLayout(economyJPanel3);
        economyJPanel3.setLayout(economyJPanel3Layout);
        economyJPanel3Layout.setHorizontalGroup(
            economyJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(economyJPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconCoinLabel3)
                .addGap(18, 18, 18)
                .addComponent(economyPlayerLabel3)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        economyJPanel3Layout.setVerticalGroup(
            economyJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(economyJPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(economyJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconCoinLabel3)
                    .addComponent(economyPlayerLabel3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Jpanel1.add(economyJPanel3);
        economyJPanel3.setBounds(490, 10, 270, 70);

        landsJPanel3.setBackground(new java.awt.Color(102, 102, 102));
        landsJPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        landsPlayerLabel3.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        landsPlayerLabel3.setText("Área do Reino:");

        iconLandsLabel3.setIcon(new javax.swing.ImageIcon("src/resources/icons/fazenda.png")); // NOI18N

        landsLabel3.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        landsLabel3.setForeground(new java.awt.Color(255, 255, 255));
        landsLabel3.setText(reino.getTerras() + " Hectares");

        javax.swing.GroupLayout landsJPanel3Layout = new javax.swing.GroupLayout(landsJPanel3);
        landsJPanel3.setLayout(landsJPanel3Layout);
        landsJPanel3Layout.setHorizontalGroup(
            landsJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landsJPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLandsLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(landsPlayerLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(landsLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        landsJPanel3Layout.setVerticalGroup(
            landsJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landsJPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(landsJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLandsLabel3)
                    .addGroup(landsJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(landsPlayerLabel3)
                        .addComponent(landsLabel3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Jpanel1.add(landsJPanel3);
        landsJPanel3.setBounds(790, 10, 470, 70);

        imageLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/medieval-pixel-art.jpg"))); // NOI18N
        Jpanel1.add(imageLabel3);
        imageLabel3.setBounds(0, 0, 1280, 770);

        bufferTaxa.add(Jpanel1);
    }

    private void investimento() {

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
        mercadojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercadojButtonActionPerformed(evt);
            }
        });
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
        hectaresjLabel.setText("Área do reino");
        jPanel11.add(hectaresjLabel);

        hectaresquantjLabel.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        hectaresquantjLabel.setForeground(new java.awt.Color(255, 255, 255));
        hectaresquantjLabel.setText("" + reino.getTerras());
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
        titulonomejLabel.setText(player.getTitulo() + player.getNome() + "Reino do Norte");
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
        cobaltquantjLabel.setText("" + player.getCobalts());
        EconomiajPanel.add(cobaltquantjLabel);

        jPanel2.add(EconomiajPanel);
        EconomiajPanel.setBounds(530, 10, 310, 50);

        tesourojPanel.setBackground(new java.awt.Color(102, 102, 102));
        tesourojPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tesouroiconjLabel.setIcon(new javax.swing.ImageIcon("src/resources/icons/bau-de-tesouro.png")); // NOI18N
        tesourojPanel.add(tesouroiconjLabel);

        tesourojLabel.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        tesourojLabel.setText("Cobalts: " + player.getCobalts());
        tesourojPanel.add(tesourojLabel);

        jPanel2.add(tesourojPanel);
        tesourojPanel.setBounds(460, 480, 420, 50);

        fundojLabel.setIcon(new javax.swing.ImageIcon("src/resources/images/medieval-pixel-art.jpg")); // NOI18N
        fundojLabel.setText("jLabel2");
        jPanel2.add(fundojLabel);
        fundojLabel.setBounds(0, 0, 1310, 700);

        buffer.add(jPanel2);
    }
    
    //Botões da Tela Select
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {      

        System.exit(0);

    }                                          

    private void StarGameButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        frame.remove(JStartPanel);
        StartGame();
        frame.add(bufferPanel);
        frame.revalidate();
        frame.repaint();
    }                                              

    private void CreditsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        //Configurando o JPanel de referência dos autores do código
        CreditsPanel = new JPanel();
        CreditsPanel.setLayout(new BoxLayout(CreditsPanel, BoxLayout.Y_AXIS));

        //Labels com os nomes dos autores
        JLabel actor1 = new JLabel("Eduardo de Andrade");
        actor1.setFont(new Font("Verdana", Font.PLAIN, 35));
        actor1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel actor2 = new JLabel("Eider Souza");
        actor2.setFont(new Font("Verdana", Font.PLAIN, 35));
        actor2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel actor3 = new JLabel("Everton Jesus");
        actor3.setFont(new Font("Verdana", Font.PLAIN, 35));
        actor3.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel actor4 = new JLabel("Felipe Soares");
        actor4.setFont(new Font("Verdana", Font.PLAIN, 35));
        actor4.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel actor5 = new JLabel("Mari Alessandra");
        actor5.setFont(new Font("Verdana", Font.PLAIN, 35));
        actor5.setAlignmentX(Component.CENTER_ALIGNMENT);

        //JButton para voltar ao JPanel anterior
        JButton backSelectionButton = new JButton("Voltar");
        backSelectionButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backSelectionButton.setFont(new Font("Verdana", Font.BOLD, 25));

        //Adicionando os componentes do JLabel ao JPanel
        CreditsPanel.add(Box.createVerticalGlue());
        CreditsPanel.add(actor1);
        CreditsPanel.add(Box.createVerticalStrut(15));
        CreditsPanel.add(actor2);
        CreditsPanel.add(Box.createVerticalStrut(15));
        CreditsPanel.add(actor3);
        CreditsPanel.add(Box.createVerticalStrut(15));
        CreditsPanel.add(actor4);
        CreditsPanel.add(Box.createVerticalStrut(15));
        CreditsPanel.add(actor5);
        CreditsPanel.add(Box.createVerticalStrut(35));//Espaçamento do último nome para o botão de voltar
        CreditsPanel.add(backSelectionButton);
        CreditsPanel.add(Box.createVerticalGlue());

        //Remoção do Panel anterior
       JStartPanel.remove(JFatherPanel);

        //Adicionando o JPanel de créditos ao JStartPanel
        JStartPanel.add(CreditsPanel);
        JStartPanel.revalidate();
        JStartPanel.repaint();

        //Ação do botão de voltar
        backSelectionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                JStartPanel.remove(CreditsPanel);
                JStartPanel.add(JFatherPanel);
                JStartPanel.revalidate();
                JStartPanel.repaint();

            }
        });
    }                                             

    private void SoundButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(!playMusic){
            epic.playMusicMenu();
            playMusic = true;
        }else{
            epic.stopMusic();
            playMusic = false;
        }
    }                                           

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice device = env.getDefaultScreenDevice();

            //Configuração do painel e layout das configurações
            JPanel configPanel = new JPanel();   
            configPanel.setLayout(new GridBagLayout()); 
            GridBagConstraints optionsConstraints = new GridBagConstraints();
            
            //Configuração do titulo
            JLabel configTitleLabel = new JLabel("<html><div>Configurações</div></html>");
            configTitleLabel.setFont(new Font("Verdana", Font.BOLD,35));
            
            //Configuração da posição do titulo
            optionsConstraints.gridx = 0;
            optionsConstraints.gridy = 0;
            optionsConstraints.insets = new Insets(0, 0, 100, 0);
            optionsConstraints.fill = GridBagConstraints.NONE;
            
            //Adicionando o titulo no JPanel
            configPanel.add(configTitleLabel, optionsConstraints);
            
            //Configuração dos botões
            JButton soundButton = new JButton("Música");   
            soundButton.setFont(new Font("Verdana",Font.BOLD,25));
            soundButton.setPreferredSize(buttonSizeSmall);

            JButton fullscreenButton = new JButton("Tela Cheia");
            fullscreenButton.setFont(new Font("Verdana",Font.BOLD,25));
            fullscreenButton.setPreferredSize(buttonSizeSmall);

            JButton backToMenuButton = new JButton("Voltar");
            backToMenuButton.setFont(new Font("Verdana", Font.BOLD, 25));
            backToMenuButton.setPreferredSize(buttonSizeSmall);
    }                                              

    //Botões da Tela de StartGame
    private void buttonBuyGrainsActionPerformed(java.awt.event.ActionEvent evt) {   //Comprar Grãos                                      
        
        int compra = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de grãos que você deseja comprar:"));
        player.comprarGraos(compra);
        grainsLabel.setText(player.getGraos() + " Sacas");
        economyLabel.setText("$ " + player.getCobalts());
        
    }     
    
    private void buttonSellGrainsActionPerformed(java.awt.event.ActionEvent evt) {   //Vender Grãos                       
        
        int venda = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de grãos que você deseja vender:"));
        player.venderGraos(venda);
        grainsLabel.setText(player.getGraos() + " Sacas");
        economyLabel.setText("$ " + player.getCobalts());

    }   
    
    private void buttonBuyLandsActionPerformed(java.awt.event.ActionEvent evt) {   //Comprar Terras                        
        
        int compra = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de terras que você deseja comprar:"));
        player.comprarTerras(compra);
        landsLabel.setText(player.getTerras() + " Hectares");
        economyLabel.setText("$ " + player.getCobalts());

    }   

    private void buttonSellLandsActionPerformed(java.awt.event.ActionEvent evt) {   //Vender Terras                      
        int venda = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de terras que você deseja vender:"));
        player.venderTerras(venda);
        landsLabel.setText(player.getTerras() + " Hectares");
        economyLabel.setText("$ " + player.getCobalts());
    } 

    private void  buttonContinueActionPerformed(java.awt.event.ActionEvent evt) {   //Continue                          
        frame.remove(bufferPanel);
        Taxas();
        frame.add(bufferTaxa);
        frame.revalidate();
        frame.repaint();
    } 
    
    //Botões Taxas
    private void buttonMiscellaneousActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        int diversa = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 25 para alterar a taxa diversa"));
        int erro = reino.setDiversos(diversa);
        if (erro == -1) {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
        miscellaneousLabel.setText(reino.getTaxaDiversas() + "%");
    }                                                   

    private void buttonCustomsActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int Alfandega = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 100 para alterar a taxa alfandegária"));
        int erro = reino.setAlfandega(Alfandega);
        if (erro == -1) {
             JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
        customsLabel.setText(reino.getTaxaAlfandegaria() + "%");
    }                                             

    private void buttonSalesActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int Vendas = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 50 para alterar a taxa de vendas"));
        int erro = reino.setVendas(Vendas);
        if (erro == -1) {
            JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
        salesLabel.setText(reino.getTaxaVendas()+"%");
    }                                           

    private void buttonJusticeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int Justica = Integer.parseInt(JOptionPane.showInputDialog("Que nível de justiça? / 1- Justa / 2- Moderada / 3- Ríspida / 4- Severa"));
        int erro = reino.setJustica(Justica);
        if (erro == -1) {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
        justiceLabel.setText(reino.getJustica());
    }                                             

    private void buttonContinue3ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        frame.remove(bufferTaxa);
        investimento();
        frame.add(buffer);
        frame.revalidate();
        frame.repaint();   
    }        
    
    //Botões Investimento
    private void moinhojButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        player.comprarMoinho();
        cobaltquantjLabel.setText("" + player.getCobalts());
        tesourojLabel.setText("Cobalts: " + player.getCobalts());

    }                                             

    private void mercadojButtonActionPerformed(java.awt.event.ActionEvent evt)
    {        
        player.comprarMercado();
        cobaltquantjLabel.setText("" + player.getCobalts());
        tesourojLabel.setText("Cobalts: " + player.getCobalts());
    }

    private void palaciojButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        player.comprarPalacio();
        cobaltquantjLabel.setText("" + player.getCobalts());
        tesourojLabel.setText("Cobalts: " + player.getCobalts());

    }                                              

    private void hospitaisjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        player.comprarHospital();
        cobaltquantjLabel.setText("" + player.getCobalts());
        tesourojLabel.setText("Cobalts: " + player.getCobalts());

    }                                                

    private void militarjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        player.comprarSoldados();
        cobaltquantjLabel.setText("" + player.getCobalts());
        tesourojLabel.setText("Cobalts: " + player.getCobalts());

    }                                              

    private void catedraljButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        player.comprarCatedral();
        cobaltquantjLabel.setText("" + player.getCobalts());
        tesourojLabel.setText("Cobalts: " + player.getCobalts());

    }                                               

    private void mapearjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void compararjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void continuarjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        player.novoTitulo();
        player.colheitaTerrasGraos();
        StartGame();
        frame.remove(buffer);
        frame.add(bufferPanel);
        frame.revalidate();
        frame.repaint();
        
    }       
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RealmsAscensionGame());
    }
}