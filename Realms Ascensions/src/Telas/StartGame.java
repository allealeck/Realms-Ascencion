package Telas;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Telas.TestGame;
import sound.musicEpic;

public class StartGame extends JPanel{

     // Variables declaration - do not modify  
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
    private TestGame game = new TestGame();
    private musicEpic epic = new musicEpic("src/resources/music/The-Ice-Giants.wav");
    
    public StartGame(){
        initComponents();
    }

    @SuppressWarnings("unchecked")

    public void initComponents() {

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

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {      

        System.exit(0);

    }                                          

    private void StarGameButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        JStartPanel.remove(JFatherPanel);
        JStartPanel.add(game.getPanel());
        JStartPanel.revalidate();
        JStartPanel.repaint();
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

    public JPanel getPanel(){
        return JStartPanel;
    }
}