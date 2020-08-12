package MainMenu;

import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author shanjutha
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        orderBtn.setEnabled(false);
        receiptBtn.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        breakfast = new javax.swing.JPanel();
        breakWrapLabel = new javax.swing.JLabel();
        breakWrapCal = new javax.swing.JLabel();
        breakWrapQ = new javax.swing.JSpinner();
        twoEggsLabel = new javax.swing.JLabel();
        twoEggsCal = new javax.swing.JLabel();
        twoEggsQ = new javax.swing.JSpinner();
        pancakesLabel = new javax.swing.JLabel();
        pancakesCal = new javax.swing.JLabel();
        pancakesQ = new javax.swing.JSpinner();
        lunch = new javax.swing.JPanel();
        grillSandLabel = new javax.swing.JLabel();
        grillSandCal = new javax.swing.JLabel();
        grillSandQ = new javax.swing.JSpinner();
        spicyBeanLabel = new javax.swing.JLabel();
        spicyBeanCal = new javax.swing.JLabel();
        spicyBeanQ = new javax.swing.JSpinner();
        hummasLabel = new javax.swing.JLabel();
        hummasCal = new javax.swing.JLabel();
        hummasQ = new javax.swing.JSpinner();
        snacksNsides = new javax.swing.JPanel();
        saladLabel = new javax.swing.JLabel();
        saladCal = new javax.swing.JLabel();
        saladQ = new javax.swing.JSpinner();
        muffinLabel = new javax.swing.JLabel();
        muffinCal = new javax.swing.JLabel();
        muffinQ = new javax.swing.JSpinner();
        yogurtLabel = new javax.swing.JLabel();
        yogurtCal = new javax.swing.JLabel();
        yogurtQ = new javax.swing.JSpinner();
        drinks = new javax.swing.JPanel();
        strawberryLabel = new javax.swing.JLabel();
        strawberryCal = new javax.swing.JLabel();
        strawberryQ = new javax.swing.JSpinner();
        orangeLabel = new javax.swing.JLabel();
        orangeCal = new javax.swing.JLabel();
        orangeQ = new javax.swing.JSpinner();
        waterLabel = new javax.swing.JLabel();
        waterCal = new javax.swing.JLabel();
        waterQ = new javax.swing.JSpinner();
        orderDetails = new javax.swing.JPanel();
        foodLabel = new javax.swing.JLabel();
        foodCost = new javax.swing.JTextField();
        drinksLabel = new javax.swing.JLabel();
        drinksCost = new javax.swing.JTextField();
        subtotalLabel = new javax.swing.JLabel();
        subtotalCost = new javax.swing.JTextField();
        totalcostLabel = new javax.swing.JLabel();
        totalCost = new javax.swing.JTextField();
        taxLabel = new javax.swing.JLabel();
        taxCost = new javax.swing.JTextField();
        caloriesLabel = new javax.swing.JLabel();
        totalCal = new javax.swing.JTextField();
        orderReceipt = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        nameLabel = new javax.swing.JLabel();
        custName = new javax.swing.JTextField();
        buttons = new javax.swing.JPanel();
        totalBtn = new javax.swing.JButton();
        receiptBtn = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 1200, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon("/Users/shanjutha/NetBeansProjects/EarthCafeRestaurant/images/4e2a4a22-67ad-4826-b9a0-8e36eda39090_200x200.png")); // NOI18N
        logo.setToolTipText("");
        logo.setName(""); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 200, 210));

        title.setFont(new java.awt.Font("Digory Doodles", 0, 50)); // NOI18N
        title.setText("Earth Cafe Menu");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        breakfast.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BREAKFAST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abadi MT Condensed Light", 0, 30))); // NOI18N

        breakWrapLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        breakWrapLabel.setText("BREAKFAST WRAP | $7.00");

        breakWrapCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        breakWrapCal.setText("190 calories");

        breakWrapQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        twoEggsLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        twoEggsLabel.setText("TWO EGGS ON TOAST | $7.00");

        twoEggsCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        twoEggsCal.setText("200 calories");

        twoEggsQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        pancakesLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        pancakesLabel.setText("BLUEBERRY PANCAKES | $8.00");

        pancakesCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pancakesCal.setText("240 calories");

        pancakesQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        javax.swing.GroupLayout breakfastLayout = new javax.swing.GroupLayout(breakfast);
        breakfast.setLayout(breakfastLayout);
        breakfastLayout.setHorizontalGroup(
            breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakfastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(breakfastLayout.createSequentialGroup()
                        .addGroup(breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breakWrapLabel)
                            .addComponent(breakWrapCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(breakWrapQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breakfastLayout.createSequentialGroup()
                        .addGroup(breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(twoEggsLabel)
                            .addComponent(twoEggsCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(twoEggsQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breakfastLayout.createSequentialGroup()
                        .addGroup(breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pancakesLabel)
                            .addComponent(pancakesCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(pancakesQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        breakfastLayout.setVerticalGroup(
            breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakfastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(breakfastLayout.createSequentialGroup()
                        .addComponent(breakWrapLabel)
                        .addGap(1, 1, 1)
                        .addComponent(breakWrapCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(breakWrapQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(breakfastLayout.createSequentialGroup()
                        .addComponent(twoEggsLabel)
                        .addGap(1, 1, 1)
                        .addComponent(twoEggsCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(twoEggsQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(breakfastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(breakfastLayout.createSequentialGroup()
                        .addComponent(pancakesLabel)
                        .addGap(1, 1, 1)
                        .addComponent(pancakesCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pancakesQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(breakfast, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 360, 210));

        lunch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LUNCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abadi MT Condensed Light", 0, 30))); // NOI18N

        grillSandLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        grillSandLabel.setText("GRILLED CHICKEN SANDWICH | $8.00");

        grillSandCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        grillSandCal.setText("250 calories");

        grillSandQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        spicyBeanLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        spicyBeanLabel.setText("SPICY BLACK BEAN BURGER | $8.00");

        spicyBeanCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        spicyBeanCal.setText("225 calories");

        spicyBeanQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        hummasLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        hummasLabel.setText("HUMMAS WRAP | $7.00");

        hummasCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        hummasCal.setText("200 calories");

        hummasQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        javax.swing.GroupLayout lunchLayout = new javax.swing.GroupLayout(lunch);
        lunch.setLayout(lunchLayout);
        lunchLayout.setHorizontalGroup(
            lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lunchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lunchLayout.createSequentialGroup()
                        .addGroup(lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grillSandLabel)
                            .addComponent(grillSandCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grillSandQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lunchLayout.createSequentialGroup()
                        .addGroup(lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spicyBeanLabel)
                            .addComponent(spicyBeanCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spicyBeanQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lunchLayout.createSequentialGroup()
                        .addGroup(lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hummasLabel)
                            .addComponent(hummasCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(hummasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        lunchLayout.setVerticalGroup(
            lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lunchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lunchLayout.createSequentialGroup()
                        .addComponent(grillSandLabel)
                        .addGap(1, 1, 1)
                        .addComponent(grillSandCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(grillSandQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lunchLayout.createSequentialGroup()
                        .addComponent(spicyBeanLabel)
                        .addGap(1, 1, 1)
                        .addComponent(spicyBeanCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spicyBeanQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lunchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lunchLayout.createSequentialGroup()
                        .addComponent(hummasLabel)
                        .addGap(1, 1, 1)
                        .addComponent(hummasCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hummasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(lunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 360, 210));

        snacksNsides.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SNACKS & SIDES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abadi MT Condensed Light", 0, 30))); // NOI18N

        saladLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        saladLabel.setText("CLASSIC CAESAR SALAD | $7.00");

        saladCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        saladCal.setText("45 calories");

        saladQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        muffinLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        muffinLabel.setText("BLUEBERRY MUFFIN | $4.00");

        muffinCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        muffinCal.setText("100 calories");

        muffinQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        yogurtLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        yogurtLabel.setText("YOGURT PARFAIT | $6.90");

        yogurtCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        yogurtCal.setText("45 calories");

        yogurtQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        javax.swing.GroupLayout snacksNsidesLayout = new javax.swing.GroupLayout(snacksNsides);
        snacksNsides.setLayout(snacksNsidesLayout);
        snacksNsidesLayout.setHorizontalGroup(
            snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snacksNsidesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snacksNsidesLayout.createSequentialGroup()
                        .addGroup(snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saladLabel)
                            .addComponent(saladCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saladQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(snacksNsidesLayout.createSequentialGroup()
                        .addGroup(snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(muffinLabel)
                            .addComponent(muffinCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(muffinQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(snacksNsidesLayout.createSequentialGroup()
                        .addGroup(snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yogurtLabel)
                            .addComponent(yogurtCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(yogurtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        snacksNsidesLayout.setVerticalGroup(
            snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snacksNsidesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snacksNsidesLayout.createSequentialGroup()
                        .addComponent(saladLabel)
                        .addGap(1, 1, 1)
                        .addComponent(saladCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(saladQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snacksNsidesLayout.createSequentialGroup()
                        .addComponent(muffinLabel)
                        .addGap(1, 1, 1)
                        .addComponent(muffinCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(muffinQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(snacksNsidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snacksNsidesLayout.createSequentialGroup()
                        .addComponent(yogurtLabel)
                        .addGap(1, 1, 1)
                        .addComponent(yogurtCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(yogurtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(snacksNsides, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 360, 210));

        drinks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DRINKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abadi MT Condensed Light", 0, 30))); // NOI18N

        strawberryLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        strawberryLabel.setText("STRAWBERRY SMOOTHIE | $4.00");

        strawberryCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        strawberryCal.setText("55 calories");

        strawberryQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        orangeLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        orangeLabel.setText("ORANGE JUICE | $2.00");

        orangeCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        orangeCal.setText("45 calories");

        orangeQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        waterLabel.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        waterLabel.setText("BOTTLED WATER | $1.25");

        waterCal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        waterCal.setText("0 calories");

        waterQ.setFont(new java.awt.Font("Avenir Next Condensed", 1, 20)); // NOI18N

        javax.swing.GroupLayout drinksLayout = new javax.swing.GroupLayout(drinks);
        drinks.setLayout(drinksLayout);
        drinksLayout.setHorizontalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinksLayout.createSequentialGroup()
                        .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strawberryLabel)
                            .addComponent(strawberryCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(strawberryQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinksLayout.createSequentialGroup()
                        .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orangeLabel)
                            .addComponent(orangeCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orangeQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinksLayout.createSequentialGroup()
                        .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(waterLabel)
                            .addComponent(waterCal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(waterQ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        drinksLayout.setVerticalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinksLayout.createSequentialGroup()
                        .addComponent(strawberryLabel)
                        .addGap(1, 1, 1)
                        .addComponent(strawberryCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(strawberryQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinksLayout.createSequentialGroup()
                        .addComponent(orangeLabel)
                        .addGap(1, 1, 1)
                        .addComponent(orangeCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(orangeQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinksLayout.createSequentialGroup()
                        .addComponent(waterLabel)
                        .addGap(1, 1, 1)
                        .addComponent(waterCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(waterQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 360, 210));

        foodLabel.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 22)); // NOI18N
        foodLabel.setText("TOTAL COST OF FOOD:");

        foodCost.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 22)); // NOI18N

        drinksLabel.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 22)); // NOI18N
        drinksLabel.setText("TOTAL COST OF DRINKS:");

        drinksCost.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 22)); // NOI18N

        subtotalLabel.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 22)); // NOI18N
        subtotalLabel.setText("SUBTOTAL OF ORDER:");

        subtotalCost.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 22)); // NOI18N

        totalcostLabel.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 22)); // NOI18N
        totalcostLabel.setText("TOTAL COST:");

        totalCost.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 22)); // NOI18N

        taxLabel.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 22)); // NOI18N
        taxLabel.setText("TAX:");

        taxCost.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 22)); // NOI18N

        caloriesLabel.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 22)); // NOI18N
        caloriesLabel.setText("TOTAL CALORIES:");

        totalCal.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 22)); // NOI18N

        javax.swing.GroupLayout orderDetailsLayout = new javax.swing.GroupLayout(orderDetails);
        orderDetails.setLayout(orderDetailsLayout);
        orderDetailsLayout.setHorizontalGroup(
            orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drinksLabel)
                    .addComponent(foodLabel))
                .addGap(18, 18, 18)
                .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinksCost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodCost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderDetailsLayout.createSequentialGroup()
                        .addComponent(subtotalLabel)
                        .addGap(18, 18, 18)
                        .addComponent(subtotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderDetailsLayout.createSequentialGroup()
                        .addComponent(taxLabel)
                        .addGap(18, 18, 18)
                        .addComponent(taxCost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderDetailsLayout.createSequentialGroup()
                        .addComponent(totalcostLabel)
                        .addGap(18, 18, 18)
                        .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderDetailsLayout.createSequentialGroup()
                        .addComponent(caloriesLabel)
                        .addGap(18, 18, 18)
                        .addComponent(totalCal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        orderDetailsLayout.setVerticalGroup(
            orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderDetailsLayout.createSequentialGroup()
                        .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodLabel)
                            .addComponent(foodCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drinksLabel)
                            .addComponent(drinksCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(orderDetailsLayout.createSequentialGroup()
                        .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotalLabel)
                            .addComponent(subtotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalcostLabel)
                            .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(orderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(taxCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(taxLabel)
                                .addComponent(caloriesLabel)))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(orderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 1130, 100));

        receipt.setColumns(20);
        receipt.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        receipt.setRows(5);
        jScrollPane1.setViewportView(receipt);

        nameLabel.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 22)); // NOI18N
        nameLabel.setText("NAME:");

        custName.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 22)); // NOI18N
        custName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                custNameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout orderReceiptLayout = new javax.swing.GroupLayout(orderReceipt);
        orderReceipt.setLayout(orderReceiptLayout);
        orderReceiptLayout.setHorizontalGroup(
            orderReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderReceiptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(orderReceiptLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        orderReceiptLayout.setVerticalGroup(
            orderReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderReceiptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(orderReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 350, 460));

        totalBtn.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 22)); // NOI18N
        totalBtn.setText("TOTAL");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        receiptBtn.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 22)); // NOI18N
        receiptBtn.setText("RECEIPT");
        receiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptBtnActionPerformed(evt);
            }
        });

        paymentBtn.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 22)); // NOI18N
        paymentBtn.setText("PAYMENT");
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        orderBtn.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 22)); // NOI18N
        orderBtn.setText("PLACE ORDER");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 22)); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(totalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(receiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(orderBtn)
                .addGap(47, 47, 47)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        getContentPane().add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 1130, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
        SubClass_Child ItemCost = new SubClass_Child();
        SubClass_Child ItemCal = new SubClass_Child();
        
        double iTax, iSubtotal, iTotal;
        double iCalories;
        
        //FOOD COST 
        ItemCost.BreakfastWrap = ItemCost.pBreakfastWrap * ((Integer) breakWrapQ.getValue());
        ItemCost.TwoEggs = ItemCost.pTwoEggs * ((Integer) twoEggsQ.getValue());
        ItemCost.Pancakes = ItemCost.pPancakes * ((Integer) pancakesQ.getValue());
        ItemCost.GrillSand = ItemCost.pGrillSand * ((Integer) grillSandQ.getValue());
        ItemCost.SpicyBean = ItemCost.pSpicyBean * ((Integer) spicyBeanQ.getValue());
        ItemCost.HummasWrap = ItemCost.pHummasWrap * ((Integer) hummasQ.getValue());
        ItemCost.Salad = ItemCost.pSalad * ((Integer) saladQ.getValue());
        ItemCost.Muffin = ItemCost.pMuffin * ((Integer) muffinQ.getValue());
        ItemCost.Yogurt = ItemCost.pYogurt * ((Integer) yogurtQ.getValue());
        //DRINKS COST 
        ItemCost.Smoothie = ItemCost.pSmoothie * ((Integer) strawberryQ.getValue());
        ItemCost.OrangeJuice = ItemCost.pOrangeJuice * ((Integer) orangeQ.getValue());
        ItemCost.Water = ItemCost.pWater * ((Integer) waterQ.getValue());
        
        //TOTAL COST
        iSubtotal = ItemCost.getAmount();
        iTax = ItemCost.calcTax(iSubtotal);
        iTotal = iSubtotal + iTax;
        
        //CALORIES
        ItemCal.BreakfastWrap = ItemCal.calBreakfastWrap * ((Integer) breakWrapQ.getValue());
        ItemCal.TwoEggs = ItemCal.calTwoEggs * ((Integer) twoEggsQ.getValue());
        ItemCal.Pancakes = ItemCal.calPancakes * ((Integer) pancakesQ.getValue());
        ItemCal.GrillSand = ItemCal.calGrillSand * ((Integer) grillSandQ.getValue());
        ItemCal.SpicyBean = ItemCal.calSpicyBean * ((Integer) spicyBeanQ.getValue());
        ItemCal.HummasWrap = ItemCal.calHummasWrap * ((Integer) hummasQ.getValue());
        ItemCal.Salad = ItemCal.calSalad * ((Integer) saladQ.getValue());
        ItemCal.Muffin = ItemCal.calMuffin * ((Integer) muffinQ.getValue());
        ItemCal.Yogurt = ItemCal.calYogurt * ((Integer) yogurtQ.getValue());
        ItemCal.Smoothie = ItemCal.calSmoothie * ((Integer) strawberryQ.getValue());
        ItemCal.OrangeJuice = ItemCal.calOrangeJuice * ((Integer) orangeQ.getValue());
        ItemCal.Water = ItemCal.calWater * ((Integer) waterQ.getValue());
        
        //TOTAL CALORIES
        iCalories = ItemCal.getCalories();
        
        
        String Subtotal = String.format("$%.2f", iSubtotal);
        subtotalCost.setText(Subtotal);
        
        String Tax = String.format("$%.2f", iTax);
        taxCost.setText(Tax);
        
        String Total = String.format("$%.2f", iTotal);
        totalCost.setText(Total);
        
        String FoodTotal = String.format("$%.2f", ItemCost.Food);
        foodCost.setText(FoodTotal);
        
        String DrinksTotal = String.format("$%.2f", ItemCost.Drinks);
        drinksCost.setText(DrinksTotal);
        
        String TotalCalories = String.format("%.0f", iCalories);
        totalCal.setText(TotalCalories);
        
    }//GEN-LAST:event_totalBtnActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        Payment iPayment = new Payment();
        iPayment.setVisible(true);
        orderBtn.setEnabled(true);
        
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void receiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptBtnActionPerformed
        int ordNo = 1234 + (int) (Math.random()*2345); 
        
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
        Tdate.format(timer.getTime());
        
        receipt.append("\t  Earth Cafe Receipt:\n" +
                "Order No. \t\t\t" + ordNo + "\n" +
                "Name: \t\t\t\t" + custName.getText() + "\n" +
                "\n--------------------------------------\n" +
                "\nFood:\t\t\t\t" + foodCost.getText() + "\n\n" + 
                "Drinks:\t\t\t\t" + drinksCost.getText() + "\n\n" +
                "Subtotal:\t\t\t" + subtotalCost.getText() + "\n\n" +
                "\n--------------------------------------\n" + "\n" +
                "Tax:\t\t\t\t" + taxCost.getText() + "\n\n" + 
                "Total Cost:\t\t\t" + totalCost.getText() + "\n" +
                "\n--------------------------------------\n" + "\n" +
                "Total Calories:\t\t\t" + totalCal.getText() + "\n\n" +
                "--------------------------------------" +
                "\nDate: " + Tdate.format(timer.getTime()) + 
                "\tTime: " + tTime.format(timer.getTime()) + 
                "\n\n\t\t Thank you!\n" + 
                "======================================\n\n"
                );
    }//GEN-LAST:event_receiptBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        ThankYou iThankYou = new ThankYou();
        iThankYou.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_orderBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        SubClass_Child Exit = new SubClass_Child();
        Exit.ExitSystem();
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void custNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custNameKeyReleased
        receiptBtn.setEnabled(true);
    }//GEN-LAST:event_custNameKeyReleased

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel breakWrapCal;
    private javax.swing.JLabel breakWrapLabel;
    private javax.swing.JSpinner breakWrapQ;
    private javax.swing.JPanel breakfast;
    public javax.swing.JPanel buttons;
    private javax.swing.JLabel caloriesLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField custName;
    private javax.swing.JPanel drinks;
    private javax.swing.JTextField drinksCost;
    private javax.swing.JLabel drinksLabel;
    private javax.swing.JTextField foodCost;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JLabel grillSandCal;
    private javax.swing.JLabel grillSandLabel;
    private javax.swing.JSpinner grillSandQ;
    private javax.swing.JLabel hummasCal;
    private javax.swing.JLabel hummasLabel;
    private javax.swing.JSpinner hummasQ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel lunch;
    private javax.swing.JLabel muffinCal;
    private javax.swing.JLabel muffinLabel;
    private javax.swing.JSpinner muffinQ;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel orangeCal;
    private javax.swing.JLabel orangeLabel;
    private javax.swing.JSpinner orangeQ;
    public javax.swing.JButton orderBtn;
    private javax.swing.JPanel orderDetails;
    private javax.swing.JPanel orderReceipt;
    private javax.swing.JLabel pancakesCal;
    private javax.swing.JLabel pancakesLabel;
    private javax.swing.JSpinner pancakesQ;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JTextArea receipt;
    private javax.swing.JButton receiptBtn;
    private javax.swing.JLabel saladCal;
    private javax.swing.JLabel saladLabel;
    private javax.swing.JSpinner saladQ;
    private javax.swing.JPanel snacksNsides;
    private javax.swing.JLabel spicyBeanCal;
    private javax.swing.JLabel spicyBeanLabel;
    private javax.swing.JSpinner spicyBeanQ;
    private javax.swing.JLabel strawberryCal;
    private javax.swing.JLabel strawberryLabel;
    private javax.swing.JSpinner strawberryQ;
    private javax.swing.JTextField subtotalCost;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JTextField taxCost;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JLabel title;
    private javax.swing.JButton totalBtn;
    private javax.swing.JTextField totalCal;
    private javax.swing.JTextField totalCost;
    private javax.swing.JLabel totalcostLabel;
    private javax.swing.JLabel twoEggsCal;
    private javax.swing.JLabel twoEggsLabel;
    private javax.swing.JSpinner twoEggsQ;
    private javax.swing.JLabel waterCal;
    private javax.swing.JLabel waterLabel;
    private javax.swing.JSpinner waterQ;
    private javax.swing.JLabel yogurtCal;
    private javax.swing.JLabel yogurtLabel;
    private javax.swing.JSpinner yogurtQ;
    // End of variables declaration//GEN-END:variables
}
