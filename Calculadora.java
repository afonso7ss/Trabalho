import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.*;

public class Calculadora extends JFrame  {


	public Calculadora(String [] ope, String [] dig){
			super();
			
			this.addButton(ope,dig);
		
		
		
		
	}
	public void addButton(String [] n1, String [] n2) {
		for (int i =0 ; i<=n1.length;i++) {
			this.add(new JButton (n1 [i]));
	}
		for (int i=0 ; i<=n2.length; i++) {
			this.add(new JButton(n2[i]));
		}
}

	
	public static void main(String[] args) {
		String [] dig = new String[] {"0","1","2","3","4","5","6","7"};
		String [] ope = new String[] {"+","-","/","*"};
		
		
		
		JFrame meuframe = new JFrame("calculadora");
		System.out.println("teste aleatorio");
		JTextArea areatexto = new JTextArea(5,5);
		
		JButton b =new JButton("somar");
//		JButton b =new JButton("somar");
//		JButton b =new JButton("somar");
//		JButton b =new JButton("somar");
//		JButton b =new JButton("somar");
		
		JTextField campotexto = new JTextField(6);
		
		meuframe.add(areatexto);
		meuframe.add(b);
		
		
		meuframe.setSize(500,400);
		meuframe.setVisible(true);
		meuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		meuframe.setResizable(false);
		meuframe.add(campotexto);
		Calculadora calc = new Calculadora(dig,ope);
		
		
		

	}

}
