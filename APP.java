/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;
import javax.swing.JFrame;



public class APP {

    /**
     application main frame
     */
    public static void main(String[] args) {
       marketing frame= new marketing();
       frame.setSize(1000,1000);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(marketing.EXIT_ON_CLOSE);
    }
    
}
