/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oystein
 */
import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
 
 
class Particles {
 
        private int x;
        private int y;
        private int [][] grid = new int[x][y];
        Particles() {
            x = 400;
            y = 300;
            
        }
 
        Particles(int x, int y) {
            this.x = x;
            this.y = y;
        }
 
        public int getX() {
            return x;
        }
 
        public void setX(int x) {
            this.x = x;
        }
 
        public int getY() {
            return y;
        }
 
        public void setY(int y) {
            this.y = y;
        }
 
          public void move()
        {
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(9);
            Double randomDouble = randomGenerator.nextDouble();
           
            switch (randomInt) {
            case 0: break; // do nothing
            case 1: y--; x-- ; break;
            case 2: x-- ; break;
            case 3: y++; x-- ; break;
            case 4: y++; break;
            case 5: y++; x++ ; break;
            case 6: x++ ; break;
            case 7: y--; x++ ; break;
            case 8: y--; break;
            
            }
        }
}
 


 

