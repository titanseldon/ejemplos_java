package graficos;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lineas extends JPanel{

	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		g.setColor(Color.GREEN);
		g.drawLine(50, 50, 500, 200);
		g.setColor(Color.RED);
		g.drawLine(50, 150, 200, 200);
		g.setColor(Color.YELLOW);
		g.drawLine(150, 50, 200, 400);				
	}

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Dibujo de líneas");		
		Lineas instanciaDeLineas = new Lineas();
		instanciaDeLineas.setBackground(Color.LIGHT_GRAY);
		ventana .add(instanciaDeLineas);
		ventana.setSize(800, 500);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
