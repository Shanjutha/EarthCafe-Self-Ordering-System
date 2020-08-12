/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import EarthCafe.EarthCafe;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shanjutha
 */
public class SuperClass_Parent {
    public double BreakfastWrap;
    public double TwoEggs;
    public double Pancakes;
    public double GrillSand;
    public double SpicyBean;
    public double HummasWrap;
    public double Salad;
    public double Muffin;
    public double Yogurt;
    
    public double Smoothie;
    public double OrangeJuice;
    public double Water;
    
    public double Food;
    public double Drinks;
    public double Subtotal;
    public double TotalCost;
    public double TotalCal;
    
    public double getAmount() {
        Food = BreakfastWrap + TwoEggs + Pancakes + GrillSand + SpicyBean + HummasWrap + Salad + Muffin + Yogurt;
        Drinks = Smoothie + OrangeJuice + Water;
                
        Subtotal = Food + Drinks;
        TotalCost = Subtotal; 
        return TotalCost;
    }
    
    public double getCalories() {
        Food = BreakfastWrap + TwoEggs + Pancakes + GrillSand + SpicyBean + HummasWrap + Salad + Muffin + Yogurt;
        Drinks = Smoothie + OrangeJuice + Water;
                
        TotalCal = Food + Drinks; 
        return TotalCal;
    }
    
    private JFrame frame;
    public void ExitSystem(){
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?","Earth Cafe Menu",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            
            new EarthCafe().setVisible(true);
            
        }
    }
    
    
    
    
    // ~~~~~~~~~~~~ PRICE ~~~~~~~~~~~~~
    
    public double pBreakfastWrap = 7.00;
    public double pTwoEggs = 7.00;
    public double pPancakes = 8.00;
    public double pGrillSand = 8.00;
    public double pSpicyBean = 8.00;
    public double pHummasWrap = 7.00;
    public double pSalad = 7.00;
    public double pMuffin = 4.00;
    public double pYogurt = 6.90;
    
    public double pSmoothie = 4.00;
    public double pOrangeJuice = 2.00;
    public double pWater = 1.25;
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    public double tax = 0.13; 
    public double calcTax(double subtotal){
        double taxAmount = (subtotal * tax);
        return taxAmount;
    }
    
    // ~~~~~~~~~~~~ CALORIES ~~~~~~~~~~~~~
    
    public double calBreakfastWrap = 190;
    public double calTwoEggs = 200;
    public double calPancakes = 240;
    public double calGrillSand = 250;
    public double calSpicyBean = 225;
    public double calHummasWrap = 200;
    public double calSalad = 45;
    public double calMuffin = 100;
    public double calYogurt = 45;
    
    public double calSmoothie = 55;
    public double calOrangeJuice = 45;
    public double calWater = 0;
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    
}
