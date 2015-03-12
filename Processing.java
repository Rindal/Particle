

/**
 * Created by fun on 12.03.15.
 */
import processing.core.*;

import java.util.ArrayList;
import java.util.Random;

public class Processing extends PApplet{
boolean state = true;
float D = 2;
int steps = 10000;
    ArrayList<Particle> particles;
    public void setup(){
        size(1920,1080);
        particles = new ArrayList<Particle>();
        for(int i=0; i<10000 ; i++){
            particles.add(new Particle(width/2,height/2));
        }
    }

    public void draw(){
        if(state && steps > 0) {


            background(0);
            for(Particle p : particles){
                p.display();
                state = p.move();
                if(!state) {
                    break;
                }

            }
            steps--;
        }
    }

    class Particle{
        Random randomGenerator;
        float x;
        float y;
        int[][] dir = {
                {0,0},
                {0,1},
                {0,-1},
                {1,0},
                {1,1},
                {1,-1},
                {-1,0},
                {-1,1},
                {-1,-1}
        };
        //  Particle(){}
        Particle(float x,float y){
            randomGenerator = new Random();
            this.x = x;
            this.y = y;
        }
        void display(){
            rectMode(CENTER);
            stroke(255,0,0);
            fill(255,0 ,0);
            rect(x,y,2,2);
        }
        boolean move(){
            
            int ind = randomGenerator.nextInt(9);
            x=x+dir[ind][0]*D;
            y=y+dir[ind][1]*D;
            if(x > width || y > height || x < 0 || y < 0) {
                return false;
            }
            return true;
        }
        
    }

    public static void main(String[] args) {
        PApplet.main(new String[] {"--present","Processing"});
    }

}
