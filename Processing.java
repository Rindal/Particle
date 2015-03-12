/**
 * Created by fun on 12.03.15.
 */
import processing.core.*;

import java.util.ArrayList;

public class Processing extends PApplet{

    ArrayList<Particle> particles;
    public void setup(){
        size(500,500);
        particles = new ArrayList<Particle>();
        for(int i=0; i<100 ; i++){
            particles.add(new Particle(width/2,height/2));
        }
    }

    public void draw(){
        background(0);
        for(Particle p : particles){
            p.display();
            p.move();
        }
    }

    class Particle{
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
            this.x = x;
            this.y = y;
        }
        void display(){
            rectMode(CENTER);
            stroke(0);
            fill(255,0,0);
            rect(x,y,5,5);
        }
        void move(){
            int ind  = round(random(8));
            x=x+dir[ind][0];
            y=y+dir[ind][1];
        }
    }

    public static void main(String[] args) {
        PApplet.main(new String[] {"--present","Processing"});
    }

}
