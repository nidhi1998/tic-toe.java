package mypack;

import javax.swing.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
public class Main1 extends JFrame implements ActionListener,WindowListener,MouseListener {

	JLabel l1;
	JLabel l2 ;
	JLabel l3;
	JTextField f1;
	JTextField f2;
String name=" ";
	JButton b1;
	  char[] ch = new char[9];
	JLabel l4;
	 int flag = 2;
	    int n;
	    int m;   	   int i = 0;
	    static int bug = 0;
	    String s1 = " ";
	    char c = 'a';
	    public Main1()
	{
		l1 = new JLabel("TIC-TOE");          
		l1.setBounds(200,30, 100, 50);
		this.add(l1);
		
		l2 = new JLabel("Player 2: ");
		l2.setBounds(70,140, 100, 60);
		this.add(l2);
		f1 = new JTextField();
		f1.setBounds(200,150,150,40);
		this.add(f1);
	l3 = new JLabel("Player 1: ");
		l3.setBounds(70,90,100, 60);
		this.add(l3); 
		f2 = new JTextField();
		f2.setBounds(200, 110,150,40);
		this.add(f2);
		l4= new JLabel("Player 1 is O and Player 2 is X");
		l4.setBounds(150,200,200,30);
		this.add(l4);
b1 = new JButton("NEW GAME");
b1.setBounds(200,600,100,40);
this.add(b1);
b1.addActionListener(this);
		this.setSize(500,700); 
		this.setLayout(null);
	this.addWindowListener(this);
	this.addMouseListener(this);
		this.setVisible(true);		
		 for (this.i = 0; this.i < 9; this.i += 1)
		        this.ch[this.i] = 'B';
		 
		 
		 JOptionPane pane = new JOptionPane("click on the frame");
	     JDialog dialog = pane.createDialog(new JFrame(), "Dilaog");
	     dialog.show();
	    Graphics g = this.getGraphics();
	     g.drawLine(200, 300, 200, 600);
	     g.drawLine(300, 300, 300, 600);
	     g.drawLine(100, 400, 400, 400);
	     g.drawLine(100, 500, 400, 500);

	
	
	} 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main1();
		

	}
	 public void keyPressed(KeyEvent k)
	    {
	        System.out.print("");
	    }
	    
	    public void keyTyped(KeyEvent k) {
	        this.s1 += k.getKeyChar();
	    }
	    
	    public void keyReleased(KeyEvent k) {
	        System.out.print("");
	    }
	    
	public void actionPerformed(ActionEvent e)
	{
		 if (e.getSource() == b1)
	        {
	            setVisible(false);
	            bug = 0;
	           new Main1();
	        }
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		Graphics2D g2;
        Graphics g = this.getGraphics();
        g.drawLine(200, 300, 200, 600);
	     g.drawLine(300, 300, 300, 600);
	     g.drawLine(100, 400, 400, 400);
	     g.drawLine(100, 500, 400, 500);
        this.flag -= 1;
        int x = e.getX();
        int y = e.getY(); int count=0;
        if (this.flag == 1)
        {
            if ((x < 200) && (y < 400) && (x>100) && (y>300)) { this.m = 100; this.n = 300; this.ch[0] = 'R'; }
            if ((x > 200) && (x < 300) && (y < 400) && (y>300)) { this.m = 200; this.n = 300; this.ch[1] = 'R'; }
            if ((x > 300) && (x < 400) && (y < 400) &&  (y>300) ) { this.m = 300; this.n = 300; this.ch[2] = 'R'; }
            if ((x < 200) &&(x>100)&& (y > 400) && (y < 500)) { this.m = 100; this.n = 400; this.ch[3] = 'R'; }
            if ((x > 200) && (x < 300) && (y > 400) && (y < 500) && (x>100)) { this.m = 200; this.n = 400; this.ch[4] = 'R'; }
            if ((x > 300) && (x < 400) && (y > 400) && (y < 500) ) { this.m = 300; this.n = 400; this.ch[5] = 'R'; }
            if ((x < 200) && (x >100) && (y > 500) && (y < 600)) { this.m = 100; this.n = 500; this.ch[6] = 'R'; }
            if ((x > 200) && (x < 300) && (y > 500) && (y < 600)) { this.m = 200; this.n = 500; this.ch[7] = 'R'; }
            if ((x > 300) && (x < 400) && (y > 500) && (y < 600)) { this.m = 300; this.n = 500; this.ch[8] = 'R'; }
            g.setColor(new Color(77, 176, 230));
            g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(10.0F));
            g.drawOval(this.m + 10, this.n + 10, 80, 80);count++;
            
        }
        
        if (this.flag == 0)
        {
            if ((x < 200) && (y < 400) && (x>100) && (y>300)) { this.m = 100; this.n = 300; this.ch[0] = 'P'; }
            if ((x > 200) && (x < 300) && (y < 400)) { this.m = 200; this.n = 300; this.ch[1] = 'P'; }
            if ((x > 300) && (x < 400) && (y <400) &&  (y>300) ) { this.m = 300; this.n = 300; this.ch[2] = 'P'; }
            if ((x < 200) && (x>100)&&(y > 400) && (y < 500)) { this.m = 100; this.n = 400; this.ch[3] = 'P'; }
            if ((x > 200) && (x < 300) && (y > 400) && (y < 500) && (x>100)) { this.m = 200; this.n = 400; this.ch[4] = 'P'; }
            if ((x > 300) && (x < 400) && (y > 400) && (y < 500) ) { this.m = 300; this.n = 400; this.ch[5] = 'P'; }
            if ((x < 200) && (x >100) && (y > 500) && (y < 600)) { this.m = 100; this.n = 500; this.ch[6] = 'P'; }
            if ((x > 200) && (x < 300) && (y > 500) && (y < 600)) { this.m = 200; this.n = 500; this.ch[7] = 'P'; }
            if ((x > 300) && (x < 400) && (y > 500) && (y < 600)) { this.m = 300; this.n = 500; this.ch[8] = 'P';}
            g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(10.0F));
            g.setColor(new Color(77, 176, 230));
            g.drawLine(this.m + 10, this.n + 10, this.m + 90, this.n + 90);
            g.drawLine(this.m + 90, this.n + 10, this.m + 10, this.n +90);
            this.flag += 2;count++;
        }
        
        for (this.i = 0; this.i < 3; this.i += 1)
        {
        	if(count%2!=0) name = f2.getText();
        	else 
        		name =f1.getText();
            if ((this.ch[this.i] != 'B') &&
            (this.ch[(this.i + 3)] == this.ch[this.i]) && (this.ch[(this.i + 6)] == this.ch[this.i]))
            {
                new Board().win(name);
                bug = 1;
            }
            
        }
        
        for (this.i = 0; this.i < 7; this.i += 1)
        {
        	if(count%2!=0) name = f2.getText();
        	else 
        		name =f1.getText();
            if (this.ch[this.i] != 'B')
            {
                if ((this.ch[this.i] == this.ch[(this.i + 1)]) && (this.ch[this.i] == this.ch[(this.i + 2)]))
                {
                    new Board().win(name);
                    bug = 1;
                }
                this.i += 2;
            }
            else {
                this.i += 2;
            }
        }
        if ((this.ch[4] != 'B') && ((
        ((this.ch[0] == this.ch[4]) && (this.ch[4] == this.ch[8])) || ((this.ch[2] == this.ch[4]) && (this.ch[4] == this.ch[6])))))
        {
        	if(count%2!=0) name = f2.getText();
        	else 
        		name =f1.getText();
            new Board().win(name);
            bug = 1;
        }
        
        for (this.i = 0; (this.i < 9) &&
        (this.ch[this.i] != 'B'); this.i += 1)
        {
            if (this.i == 8)
            {
                if (bug == 0)
                new Board().draw();
                bug = 0;
            }
        }// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {System.out.print("");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {System.out.print("");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {System.out.print("");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {System.out.print("");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("");
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("");
		// TODO Auto-generated method stub
		
	} 

}
