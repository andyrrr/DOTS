package Pruebas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dibujar extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawLine(0, 100, 10, 10);
		
	}

}

