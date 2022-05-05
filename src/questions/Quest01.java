package questions;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ButtonGroup;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import menu.Menu;
@SuppressWarnings("serial")
public class Quest01 extends JFrame{
	
	JFrame  frame = new JFrame();
    
    /*ImageIcon gif = new ImageIcon(getClass().getResource("pixel-jeff-matrix-s.gif"));
	JLabel picture = new JLabel(gif);*/
	
    JLabel q1 = new JLabel("Qual dessas peças é responsavel pelo armazenamento de dados da máquina?");

    JLabel inform = new JLabel();
    
    public static void main(String st[]) {
    	
        SwingUtilities.invokeLater( new Runnable(){
            public void run(){
                Quest01 myquest01 = new Quest01();
                myquest01.load();
            }
        });
    }
    
    public void load() {
    	
    	ButtonGroup grp = new ButtonGroup();
    	
    	JRadioButton r1 = new JRadioButton("Hard Disk (HD)"); //Resposta Correta
    	r1.setActionCommand("Resposta Correta");
        
    	JRadioButton r2 = new JRadioButton("Placa-Mãe (MB)");
        r2.setActionCommand("Tente novamente");
    	
        JRadioButton r3 = new JRadioButton("Processador (CPU)");
        r3.setActionCommand("Tente novamente");                
        
        JRadioButton r4 = new JRadioButton("O gabinete");
        r4.setActionCommand("Tente novamente");
        
        JButton b1 = new JButton("CONFIRMAR");
        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if( grp.getSelection() != null ){
                    JOptionPane.showMessageDialog(
                            Quest01.this,
                            grp.getSelection().getActionCommand());                    
                }else{
                    JOptionPane.showMessageDialog(
                    		Quest01.this, 
                            "Selecione uma opção!");                    
                }				
			}
		});
        
    	JButton b2 = new JButton("VOLTAR");
        b2.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			frame.dispose();
    			Menu mymenu = new Menu();
                mymenu.load();    							
    		}
    	});

    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(new Dimension(700, 700));
    frame.getContentPane().setBackground(Color.BLACK);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setUndecorated(true);
    frame.setVisible(true);
   
    ArrayList<JRadioButton> lista = new ArrayList<JRadioButton>(); //Misturar alternativas
	lista.add(r1); //Resposta correta
	lista.add(r2);
	lista.add(r3);
	lista.add(r4);
	
	Collections.shuffle(lista);
	
	grp.add(lista.get(0));
    grp.add(lista.get(1));
    grp.add(lista.get(2));
    grp.add(lista.get(3));
    
    Container c = frame.getContentPane();
    
    c.setLayout(null);
    
    q1.setBounds(130, 150, 500, 20);
    q1.setVerticalAlignment(SwingConstants.CENTER);
    q1.setBackground(Color.black);
    q1.setForeground(Color.white);
    c.add(q1);
    
    lista.get(0).setBounds(130, 250, 200, 20);
    lista.get(0).setBackground(Color.black);
    lista.get(0).setForeground(Color.white);
    c.add(lista.get(0));
    
    lista.get(1).setBounds(130, 280, 200, 20);
    lista.get(1).setBackground(Color.black);
    lista.get(1).setForeground(Color.white);
    c.add(lista.get(1));
    
    lista.get(2).setBounds(130, 310, 200, 20);
    lista.get(2).setBackground(Color.black);
    lista.get(2).setForeground(Color.white);
    c.add(lista.get(2));
    
    lista.get(3).setBounds(130, 340, 200, 20);
    lista.get(3).setBackground(Color.black);
    lista.get(3).setForeground(Color.white);
    c.add(lista.get(3));
    
    b1.setBounds(550, 640, 110, 20);
    b1.setBackground(Color.black);
    b1.setForeground(Color.white);
    c.add(b1);
    
    b2.setBounds(50, 640, 100, 20);
    b2.setBackground(Color.black);
    b2.setForeground(Color.white);
    c.add(b2);
    
    /*picture.setBounds(0, 0, 720, 980);
    picture.setLocation(-20, -240);
    c.add(picture);*/
    }
}