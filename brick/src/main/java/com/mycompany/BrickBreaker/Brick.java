/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.BrickBreaker;

/**
 *
 * @author Hp
 */

    import javax.swing.JFrame;

/**
 *
 * @author chinm
 */
public class Brick {
    public static void main(String[] args) {
       JFrame obj = new JFrame();
       GamePlay game = new GamePlay();
       obj.setBounds(10,10,700,600);
       obj.setTitle("BrickBreaker");
       obj.setResizable(true);
       obj.setVisible(true);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.add(game);
    }
    
}
