package Pruebas;

import javax.swing.JFrame;

public class bucky {
	public static void main(String[] args){
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dibujar p = new Dibujar();
		f.add(p);
		f.setSize(400,250);
		f.setVisible(true);
		
	}

}
