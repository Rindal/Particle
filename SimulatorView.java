package Particle;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oystein
 */
class SimulatorView extends Canvas {
 
    private int particles_n;
    private int steps;
    private int framesize;

    public SimulatorView()
    {
        // get 500 particles by default
        this.particles_n = 500;
        // get 1000 interactions by default
        this.steps = 1000;
    }
 
    public SimulatorView(int particles_n, int steps, int framesize)
    {
        this.particles_n = particles_n;
        this.steps = steps;
        this.framesize = framesize;
    }
 
    public void pixel(int x, int y, Color c)
    {
        Graphics graphics = super.getGraphics();
        graphics.setColor(c);
        graphics.drawLine(x, y, x, y);
    }
 
    public void paint(Graphics graphics)
    {
        List<Particles> particles = new ArrayList<Particles>();
          int [][] grid = new int[framesize+1][framesize+1];
        // initialize particles
        for(int i=0; i < particles_n; i++) {
            particles.add(new Particles(framesize/2,framesize/2));
        }
 
        // number of particles iterations
        for(int i=0; i < steps; i++) {
            
            for (Particles p: particles) {
                 // particle motion
                pixel(p.getX(),p.getY(), Color.white);
                p.move();
                pixel(p.getX(),p.getY(), Color.red);
                 grid[p.getX()] [p.getY()]++;              
            }
        }
    } }