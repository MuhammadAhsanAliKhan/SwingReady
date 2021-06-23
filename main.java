
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;



public class main implements ActionListener, KeyListener
{
	public final static int WIDTH=400, HEIGHT=500;
	public static main obj;
	public Renderer renderer;
	public Timer timer;
	public JFrame jframe;
	
	public main()
	{
		jframe= new JFrame();
		timer= new Timer(10, this);
		
		renderer= new Renderer();
		
		jframe.add(renderer);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
		jframe.addKeyListener(this);
		
		timer.start();
		
	}

	public static void main(String[] args) 
	{
		obj=new main();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		renderer.repaint();
		
	}

	public void repaint(Graphics g) 
	{
		//paint background
		g.setColor(Color.yellow);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}

}

