
import com.sun.glass.events.KeyEvent;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
public class Main extends javax.swing.JFrame {
    
    ImageIcon lion = new ImageIcon(getClass().getResource("lion.png"));
   // ImageIcon lion = new ImageIcon(new ImageIcon("lion.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    ImageIcon platypus = new ImageIcon(getClass().getResource("platypus.png"));
    ImageIcon snake = new ImageIcon(getClass().getResource("snake.png"));
    ImageIcon crocodile = new ImageIcon(getClass().getResource("crocodile.png"));
    ImageIcon eagle = new ImageIcon(getClass().getResource("eagle.png"));
    ImageIcon penguin = new ImageIcon(getClass().getResource("penguin.png"));
    Display df = new Display(this);
    IdCard testIdc = new IdCard(1, "1", "1");
    Lion testLion = new Lion(testIdc, "test", 0, 0, 0, "test", false, false);
    Platypus testPlatypus = new Platypus(testIdc, "test", 0, 0, 0, "test", false, 0);
    Snake testSnake = new Snake(testIdc, "test", 0, 0, 0, true, 0, true);
    Crocodile testCrocodile = new Crocodile(testIdc, "test", 0, 0, 0, true, 0, 0);
    Eagle testEagle = new Eagle(testIdc, "test", 0, 0, 0, true, "test", 0);
    Penguin testPenguin = new Penguin(testIdc, "test", 0, 0, 0, true, "test", "test");
    
    
    public Main() {
        initComponents();
        AnimalSys.readTxt();
        species_panel.setVisible(false);
        //id_panel.setVisible(false);
        animalinfo_panel.setVisible(false);
        lion_panel.setVisible(false);
        platypus_panel.setVisible(false);
        snake_panel.setVisible(false);
        crocodile_panel.setVisible(false);
        eagle_panel.setVisible(false);
        penguin_panel.setVisible(false);
        bloodinfo_label.setVisible(false);
       
    }
    
    public void fillCombobox(String s){
        species_checkbox.removeAllItems();
        if(s.equals("Mammal")){
            species_checkbox.addItem("None");
            species_checkbox.addItem("Lion");
            species_checkbox.addItem("Platypus");
        }
        else if(s.equals("Reptile")){
            species_checkbox.addItem("None");
            species_checkbox.addItem("Snake");
            species_checkbox.addItem("Crocodile");
        }
        else if(s.equals("Bird")){
            species_checkbox.addItem("None");
            species_checkbox.addItem("Eagle");
            species_checkbox.addItem("Penguin");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alpha_rb = new javax.swing.ButtonGroup();
        rattler_rb = new javax.swing.ButtonGroup();
        allpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        family_checkbox = new javax.swing.JComboBox<>();
        species_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        species_checkbox = new javax.swing.JComboBox<>();
        photo_label = new javax.swing.JLabel();
        bloodinfo_label = new javax.swing.JLabel();
        id_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_tb = new javax.swing.JTextField();
        state_tb = new javax.swing.JTextField();
        keepersName_tb = new javax.swing.JTextField();
        animalinfo_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name_tb = new javax.swing.JTextField();
        height_tb = new javax.swing.JTextField();
        weight_tb = new javax.swing.JTextField();
        age_tb = new javax.swing.JTextField();
        allanimals_panel = new javax.swing.JPanel();
        lion_panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        procreation_tb = new javax.swing.JTextField();
        waterlife_cb = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        yesalpha_rb = new javax.swing.JRadioButton();
        noalpha_rb = new javax.swing.JRadioButton();
        platypus_panel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        procreation1_tb = new javax.swing.JTextField();
        waterlife1_cb = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        beakLength_tb = new javax.swing.JTextField();
        eagle_panel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        flyability_cb = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        featherColor_tb = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        altitude_tb = new javax.swing.JTextField();
        snake_panel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        poisonos_cb = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        limbCount_tb = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        yesrattler_rb = new javax.swing.JRadioButton();
        norattler_rb = new javax.swing.JRadioButton();
        crocodile_panel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        poisonous1_cb = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        limbCount1_tb = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        teethCount_tb = new javax.swing.JTextField();
        penguin_panel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        flyability1_tb = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        featherColor1_tb = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        beakColor_tb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addinfo_label = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        info_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zoo Database");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allpanel.setForeground(new java.awt.Color(255, 255, 255));
        allpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Select Animal Family:");
        allpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        family_checkbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Mammal", "Reptile", "Bird" }));
        family_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                family_checkboxActionPerformed(evt);
            }
        });
        allpanel.add(family_checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, -1, -1));

        species_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Select Animal Species:");
        species_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        species_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                species_checkboxActionPerformed(evt);
            }
        });
        species_panel.add(species_checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));
        species_panel.add(photo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 180));

        bloodinfo_label.setText("Click here to get Info");
        bloodinfo_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloodinfo_labelMouseClicked(evt);
            }
        });
        bloodinfo_label.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bloodinfo_labelKeyPressed(evt);
            }
        });
        species_panel.add(bloodinfo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        allpanel.add(species_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 300));

        id_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Information"));
        id_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("ID:");
        id_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 28, -1, -1));

        jLabel4.setText("State:");
        id_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 58, -1, -1));

        jLabel5.setText("Keeper's Name:");
        id_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 88, -1, -1));

        id_tb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_tbKeyPressed(evt);
            }
        });
        id_panel.add(id_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 24, 190, -1));
        id_panel.add(state_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 54, 190, -1));
        id_panel.add(keepersName_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 84, 190, -1));

        allpanel.add(id_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 330, 120));

        animalinfo_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Animal Registration"));
        animalinfo_panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                animalinfo_panelKeyPressed(evt);
            }
        });
        animalinfo_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Name:");
        animalinfo_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel7.setText("Height:");
        animalinfo_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel8.setText("Weight:");
        animalinfo_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel9.setText("Age:");
        animalinfo_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        animalinfo_panel.add(name_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 70, -1));
        animalinfo_panel.add(height_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 56, 69, -1));
        animalinfo_panel.add(weight_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 82, 70, -1));
        animalinfo_panel.add(age_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 116, 70, -1));

        allanimals_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lion_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Procreation:");
        lion_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, -1, -1));

        jLabel11.setText("Water Life:");
        lion_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));
        lion_panel.add(procreation_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, -1));
        lion_panel.add(waterlife_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 50, -1, -1));

        jLabel14.setText("Alpha:");
        lion_panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        alpha_rb.add(yesalpha_rb);
        yesalpha_rb.setText("Yes");
        yesalpha_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesalpha_rbActionPerformed(evt);
            }
        });
        lion_panel.add(yesalpha_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        alpha_rb.add(noalpha_rb);
        noalpha_rb.setText("No");
        lion_panel.add(noalpha_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        allanimals_panel.add(lion_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        platypus_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Procreation:");
        platypus_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, -1, -1));
        platypus_panel.add(procreation1_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, -1));
        platypus_panel.add(waterlife1_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 50, -1, -1));

        jLabel13.setText("Water Life:");
        platypus_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));

        jLabel15.setText("Beak Lenght:");
        platypus_panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        platypus_panel.add(beakLength_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 92, -1));

        allanimals_panel.add(platypus_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        eagle_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Flyability:");
        eagle_panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        eagle_panel.add(flyability_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 6, -1, -1));

        jLabel23.setText("Feather Color:");
        eagle_panel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));
        eagle_panel.add(featherColor_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 36, 86, -1));

        jLabel24.setText("Altitude:");
        eagle_panel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        eagle_panel.add(altitude_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 86, -1));

        allanimals_panel.add(eagle_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        snake_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Poisonous:");
        snake_panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        snake_panel.add(poisonos_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 6, -1, -1));

        jLabel17.setText("Limb Count:");
        snake_panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));
        snake_panel.add(limbCount_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 36, 94, -1));

        jLabel18.setText("Rattler:");
        snake_panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, -1, -1));

        rattler_rb.add(yesrattler_rb);
        yesrattler_rb.setText("Yes");
        snake_panel.add(yesrattler_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 72, -1, -1));

        rattler_rb.add(norattler_rb);
        norattler_rb.setText("No");
        snake_panel.add(norattler_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 72, -1, -1));

        allanimals_panel.add(snake_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        crocodile_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Poisonous:");
        crocodile_panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        crocodile_panel.add(poisonous1_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 6, -1, -1));

        jLabel20.setText("Limb Count:");
        crocodile_panel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));
        crocodile_panel.add(limbCount1_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 36, 94, -1));

        jLabel21.setText("Teeth Count:");
        crocodile_panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, -1, -1));
        crocodile_panel.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 36, 94, -1));
        crocodile_panel.add(teethCount_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 90, -1));

        allanimals_panel.add(crocodile_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        penguin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("Flyability:");
        penguin_panel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        penguin_panel.add(flyability1_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 6, -1, -1));

        jLabel29.setText("Feather Color:");
        penguin_panel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));
        penguin_panel.add(featherColor1_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 36, 86, -1));

        jLabel30.setText("Beak Color:");
        penguin_panel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, -1, -1));
        penguin_panel.add(beakColor_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 78, 86, -1));

        allanimals_panel.add(penguin_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        animalinfo_panel.add(allanimals_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 130));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        animalinfo_panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        animalinfo_panel.add(addinfo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 270, 20));

        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        animalinfo_panel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        allpanel.add(animalinfo_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 330, 220));

        jLabel31.setText("-Search and Delete references ID-");
        allpanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        allpanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        allpanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        info_label.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        allpanel.add(info_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 270, 60));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        allpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 270, 220));

        jButton4.setText("Display");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        allpanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        getContentPane().add(allpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 790, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void family_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_family_checkboxActionPerformed
        photo_label.setIcon(null);
        if(!family_checkbox.getSelectedItem().equals("None")){
            photo_label.setIcon(null);
            species_panel.setVisible(true);
            fillCombobox(family_checkbox.getSelectedItem().toString());
        }
        else{
        species_panel.setVisible(false);
        //id_panel.setVisible(false);
        animalinfo_panel.setVisible(false);
        lion_panel.setVisible(false);
        platypus_panel.setVisible(false);
        snake_panel.setVisible(false);
        crocodile_panel.setVisible(false);
        eagle_panel.setVisible(false);
        penguin_panel.setVisible(false);
        bloodinfo_label.setVisible(false);
        }
    }//GEN-LAST:event_family_checkboxActionPerformed

    private void species_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_species_checkboxActionPerformed
        if(species_checkbox.getSelectedItem() == null)
        return;
        if(species_checkbox.getSelectedItem().equals("None")){
               // id_panel.setVisible(false);
                animalinfo_panel.setVisible(false);
                lion_panel.setVisible(false);
                platypus_panel.setVisible(false);
                snake_panel.setVisible(false);
                crocodile_panel.setVisible(false);
                eagle_panel.setVisible(false);
                penguin_panel.setVisible(false);
                bloodinfo_label.setVisible(false);
        }
        else{
            bloodinfo_label.setVisible(true);
        }
        photo_label.setIcon(null);
        if(species_checkbox.getSelectedItem().equals("Lion")){
            bloodinfo_label.setText("Click here to get Info");
            animalinfo_panel.setVisible(true);
            photo_label.setIcon(lion);
            lion_panel.setVisible(true);
             platypus_panel.setVisible(false);
        }
        else if(species_checkbox.getSelectedItem().equals("Platypus")){
            bloodinfo_label.setText("Click here to get Info");
            animalinfo_panel.setVisible(true);
            photo_label.setIcon(platypus);
            platypus_panel.setVisible(true);
            lion_panel.setVisible(false);
        }
        else if(species_checkbox.getSelectedItem().equals("Snake")){
            bloodinfo_label.setText("Click here to get Info");
        animalinfo_panel.setVisible(true);
        photo_label.setIcon(snake);
        snake_panel.setVisible(true);
        crocodile_panel.setVisible(false);
        }
        else if(species_checkbox.getSelectedItem().equals("Crocodile")){
            bloodinfo_label.setText("Click here to get Info");
            animalinfo_panel.setVisible(true);
            photo_label.setIcon(crocodile);
            crocodile_panel.setVisible(true);
            snake_panel.setVisible(false);
        }
        else if(species_checkbox.getSelectedItem().equals("Eagle")){
            bloodinfo_label.setText("Click here to get Info");
            animalinfo_panel.setVisible(true);
            photo_label.setIcon(eagle);
            eagle_panel.setVisible(true);
            penguin_panel.setVisible(false);
        }
        else if(species_checkbox.getSelectedItem().equals("Penguin")){
            bloodinfo_label.setText("Click here to get Info");
            animalinfo_panel.setVisible(true);
            photo_label.setIcon(penguin);
            penguin_panel.setVisible(true);
            eagle_panel.setVisible(false);
        }
        else{
        photo_label.setIcon(null);
        animalinfo_panel.setVisible(false);
        }
    }//GEN-LAST:event_species_checkboxActionPerformed

    private void yesalpha_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesalpha_rbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesalpha_rbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id;
        String state, keepersName;
        String name;
        double height;
        double weight;
        int age;
        String procreation;
        boolean waterLife, alpha;
        double beakLength;
        boolean poisonous;
        int limbCount;
        boolean rattler;
        int teethCount;
        boolean flyability;
        String featherColor;
        double altitude;
        String beakColor;
        boolean result = false;
        id = Integer.parseInt(id_tb.getText());
        state = state_tb.getText();
        keepersName = keepersName_tb.getText();
        IdCard idc = new IdCard(id, state, keepersName);
        name = name_tb.getText();
        height = Double.parseDouble(height_tb.getText());
        weight = Double.parseDouble(weight_tb.getText());
        age = Integer.parseInt(age_tb.getText());
        if(species_checkbox.getSelectedItem().equals("Lion"))
        {
            procreation = procreation_tb.getText();
            waterLife = waterlife_cb.isSelected();
            alpha = yesalpha_rb.isSelected();
            Lion ani = new Lion(idc, name, height, weight, age, procreation, waterLife, alpha);
            result = AnimalSys.addAnimal(ani);
        }
        else if (species_checkbox.getSelectedItem().equals("Platypus")){
            procreation = procreation1_tb.getText();
            waterLife = waterlife1_cb.isSelected();
            beakLength = Double.parseDouble(beakLength_tb.getText());
            Platypus ani = new Platypus(idc, name, height, weight, age, procreation, waterLife, beakLength);
            result = AnimalSys.addAnimal(ani);
        }
        else if (species_checkbox.getSelectedItem().equals("Snake")){
            poisonous = poisonos_cb.isSelected();
            limbCount = Integer.parseInt(limbCount_tb.getText());
            rattler= yesrattler_rb.isSelected();
            Snake ani = new Snake(idc, name, height, weight, age, poisonous, limbCount, rattler);
            result = AnimalSys.addAnimal(ani);
        }
        else if (species_checkbox.getSelectedItem().equals("Crocodile")){
            poisonous = poisonous1_cb.isSelected();
            limbCount = Integer.parseInt(limbCount1_tb.getText());
            teethCount = Integer.parseInt(teethCount_tb.getText());
            Crocodile ani = new Crocodile(idc, name, height, weight, age, poisonous, limbCount, teethCount);
            result = AnimalSys.addAnimal(ani);
        }
        else if(species_checkbox.getSelectedItem().equals("Eagle")){
            flyability = flyability_cb.isSelected();
            featherColor = featherColor_tb.getText();
            altitude = Double.parseDouble(altitude_tb.getText());
            Eagle ani = new Eagle(idc, name, height, weight, age, flyability, featherColor, altitude);
            result = AnimalSys.addAnimal(ani);
        }
        else if(species_checkbox.getSelectedItem().equals("Penguin")){
            flyability = flyability1_tb.isSelected();
            featherColor = featherColor1_tb.getText();
            beakColor = beakColor_tb.getText();
            Penguin ani = new Penguin(idc, name, height, weight, age, flyability, featherColor, beakColor);
            result = AnimalSys.addAnimal(ani);
        }
            if(result){
                addinfo_label.setText("Animal succesfully added into database!");
            }
            else
                addinfo_label.setText("Id is already exists!");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addinfo_label.setText("");
        try
        {
            int id = Integer.parseInt(id_tb.getText());
            Animal a = AnimalSys.searchAnimal(id);
            if(a==null){
                info_label.setText("Such id is not in zoo database");
            }
            else{
                textarea.setText(a.toString());
                info_label.setText("");
            }
        }
        catch(Exception ex)
        {
            info_label.setText("Please select animal species first \n & enter proper id!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        textarea.setText("");
        addinfo_label.setText("");
        int id = Integer.parseInt(id_tb.getText());
        boolean res = AnimalSys.deleteAnimal(id);
        if(res)
            info_label.setText("Animal succesfully deleted!");
        else
            info_label.setText("Did not be deleted since id is not in database!");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        id_tb.setText("");
                state_tb.setText("");
                keepersName_tb.setText("");
                name_tb.setText("");
                height_tb.setText("");
                weight_tb.setText("");
                age_tb.setText("");
                procreation_tb.setText("");
                waterlife_cb.setSelected(false);
                
                procreation1_tb.setText("");
                waterlife1_cb.setSelected(false);
                beakLength_tb.setText("");
                poisonos_cb.setSelected(false);
                limbCount_tb.setText("");
                
                poisonous1_cb.setSelected(false);
                limbCount1_tb.setText("");
                teethCount_tb.setText("");
                flyability_cb.setSelected(false);
                featherColor_tb.setText("");
                altitude_tb.setText("");
                flyability1_tb.setSelected(false);
                featherColor1_tb.setText("");
                beakColor_tb.setText("");
                yesalpha_rb.setSelected(false);
                noalpha_rb.setSelected(false);
                yesrattler_rb.setSelected(false);
                norattler_rb.setSelected(false);
                addinfo_label.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        df.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void animalinfo_panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_animalinfo_panelKeyPressed
        
    }//GEN-LAST:event_animalinfo_panelKeyPressed

    private void id_tbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_tbKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            addinfo_label.setText("");
        try
        {
            int id = Integer.parseInt(id_tb.getText());
            Animal a = AnimalSys.searchAnimal(id);
            if(a==null){
                info_label.setText("Such id is not in zoo database");
            }
            else{
                textarea.setText(a.toString());
                info_label.setText("");
            }
        }
        catch(Exception ex)
        {
            info_label.setText("Please select animal species first \n & enter proper id!");
        }
        }
        
    }//GEN-LAST:event_id_tbKeyPressed

    private void bloodinfo_labelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bloodinfo_labelKeyPressed
       
    }//GEN-LAST:event_bloodinfo_labelKeyPressed

    private void bloodinfo_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloodinfo_labelMouseClicked
       if(species_checkbox.getSelectedItem().equals("Lion"))
           bloodinfo_label.setText(testLion.bloodCirculation());
       else if(species_checkbox.getSelectedItem().equals("Platypus"))
           bloodinfo_label.setText(testPlatypus.bloodCirculation());
       else if(species_checkbox.getSelectedItem().equals("Snake"))
           bloodinfo_label.setText(testSnake.bloodCirculation());
       else if(species_checkbox.getSelectedItem().equals("Crocodile"))
           bloodinfo_label.setText(testCrocodile.bloodCirculation());
       else if(species_checkbox.getSelectedItem().equals("Eagle"))
           bloodinfo_label.setText(testEagle.bloodCirculation());
       else if(species_checkbox.getSelectedItem().equals("Penguin"))
           bloodinfo_label.setText(testPenguin.bloodCirculation());
       
    }//GEN-LAST:event_bloodinfo_labelMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addinfo_label;
    private javax.swing.JTextField age_tb;
    private javax.swing.JPanel allanimals_panel;
    private javax.swing.JPanel allpanel;
    private javax.swing.ButtonGroup alpha_rb;
    private javax.swing.JTextField altitude_tb;
    private javax.swing.JPanel animalinfo_panel;
    private javax.swing.JTextField beakColor_tb;
    private javax.swing.JTextField beakLength_tb;
    private javax.swing.JLabel bloodinfo_label;
    private javax.swing.JPanel crocodile_panel;
    private javax.swing.JPanel eagle_panel;
    private javax.swing.JComboBox<String> family_checkbox;
    private javax.swing.JTextField featherColor1_tb;
    private javax.swing.JTextField featherColor_tb;
    private javax.swing.JCheckBox flyability1_tb;
    private javax.swing.JCheckBox flyability_cb;
    private javax.swing.JTextField height_tb;
    private javax.swing.JPanel id_panel;
    private javax.swing.JTextField id_tb;
    private javax.swing.JLabel info_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField keepersName_tb;
    private javax.swing.JTextField limbCount1_tb;
    private javax.swing.JTextField limbCount_tb;
    private javax.swing.JPanel lion_panel;
    private javax.swing.JTextField name_tb;
    private javax.swing.JRadioButton noalpha_rb;
    private javax.swing.JRadioButton norattler_rb;
    private javax.swing.JPanel penguin_panel;
    private javax.swing.JLabel photo_label;
    private javax.swing.JPanel platypus_panel;
    private javax.swing.JCheckBox poisonos_cb;
    private javax.swing.JCheckBox poisonous1_cb;
    private javax.swing.JTextField procreation1_tb;
    private javax.swing.JTextField procreation_tb;
    private javax.swing.ButtonGroup rattler_rb;
    private javax.swing.JPanel snake_panel;
    private javax.swing.JComboBox<String> species_checkbox;
    private javax.swing.JPanel species_panel;
    private javax.swing.JTextField state_tb;
    private javax.swing.JTextField teethCount_tb;
    private javax.swing.JTextArea textarea;
    private javax.swing.JCheckBox waterlife1_cb;
    private javax.swing.JCheckBox waterlife_cb;
    private javax.swing.JTextField weight_tb;
    private javax.swing.JRadioButton yesalpha_rb;
    private javax.swing.JRadioButton yesrattler_rb;
    // End of variables declaration//GEN-END:variables
}