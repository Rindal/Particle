
import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oystein
 */
public class Simulate {
 
    /**
     * @param args
     */
 
    public static void main(String[] args){
        int framesize = 600;
        SimulatorView canvas = new SimulatorView(1400,2000,framesize);
        JFrame frame = new JFrame();
        frame.setSize(framesize, framesize); // square
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.getContentPane().setBackground(Color.white);
        frame.setVisible(true);
    }
}