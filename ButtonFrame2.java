package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
 
public class ButtonFrame2 extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
    float valorAtual, valorAnt, resultado;
    int operacao;
     
    public ButtonFrame2()
    {
    	setVisible(true);
    	setSize(500,300);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(75, 11, 298, 41);
        getContentPane().add(textField);
        textField.setColumns(10);
        textField.setEditable(false);
        textField.setVisible(true);
        
        JButton Limpar = new JButton("CE");
        Limpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Limpar.setBounds(31, 63, 50, 50);
        getContentPane().add(Limpar);
        Limpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				textField.setText(null);
			}
        	
        });
        
        JButton num1 = new JButton("1");
        num1.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num1.setBounds(115, 200, 50, 50);
        getContentPane().add(num1);
        num1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
				
			}
        	
        });
        
        JButton num2 = new JButton("2");
        num2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num2.setBounds(175, 200, 50, 50);
        getContentPane().add(num2);
        num2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
				
			}
        	
        });
        
        JButton num3 = new JButton("3");
        num3.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num3.setBounds(235, 200, 50, 50);
        getContentPane().add(num3);
        num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
        });
        
        JButton num4 = new JButton("4");
        num4.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num4.setBounds(115, 139, 50, 50);
        getContentPane().add(num4);
        num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
        });
        
        JButton num5 = new JButton("5");
        num5.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num5.setBounds(175, 139, 50, 50);
        getContentPane().add(num5);
        num5.addActionListener(new ActionListener() {
        	
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
        });
        
        JButton num6 = new JButton("6");
        num6.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num6.setBounds(235, 139, 50, 50);
        getContentPane().add(num6);
        num6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "6");
			}
        	
        });
        
        JButton num7 = new JButton("7");
        num7.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num7.setBounds(115, 78, 50, 50);
        getContentPane().add(num7);
        num7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
				
			}
        	
        });
        
        JButton num8 = new JButton("8");
        num8.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num8.setBounds(175, 78, 50, 50);
        getContentPane().add(num8);
        num8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
        	
        });
        
        JButton num9 = new JButton("9");
        num9.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num9.setBounds(235, 78, 50, 50);
        getContentPane().add(num9);
        num9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
        	
        });
        
        
        
        JButton somar = new JButton("+");
        somar.setFont(new Font("Tahoma", Font.PLAIN, 21));
        somar.setBounds(370, 78, 50, 50);
        getContentPane().add(somar);
        somar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valorAnt = Float.parseFloat(textField.getText());
				textField.setText(null);
				operacao = 1;
			}
		});
        
        JButton subtração = new JButton("-");
        subtração.setFont(new Font("Tahoma", Font.PLAIN, 21));
        subtração.setBounds(310, 139, 50, 50);
        getContentPane().add(subtração);
        subtração.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valorAnt = Float.parseFloat(textField.getText());
				textField.setText(null);
				operacao = 2;
			}
		});
        
        JButton divisao = new JButton("/");
        divisao.setFont(new Font("Tahoma", Font.PLAIN, 21));
        divisao.setBounds(370, 139, 50, 50);
        getContentPane().add(divisao);
        divisao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valorAnt = Float.parseFloat(textField.getText());
				textField.setText(null);
				operacao = 3;
				
			}
		});
        
        JButton num0 = new JButton("0");
        num0.setFont(new Font("Tahoma", Font.PLAIN, 21));
        num0.setBounds(295, 200, 50, 50);
        getContentPane().add(num0);
        num0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
				
			}
		});
        
        JButton igual = new JButton("=");
        igual.setFont(new Font("Tahoma", Font.PLAIN, 21));
        igual.setBounds(310, 78, 50, 50);
        getContentPane().add(igual);
        igual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valorAtual = Float.parseFloat(textField.getText());
				
				if(operacao == 1) { resultado = valorAnt + valorAtual; }
				if(operacao == 2) { resultado = valorAnt - valorAtual; }
				if(operacao == 3) { resultado = valorAnt / valorAtual; }
				if(operacao == 4) { resultado = valorAnt * valorAtual; }
				
				textField.setText(String.valueOf(resultado));
			}
		});
        
        JButton multiplicacao = new JButton("*");
        multiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 21));
        multiplicacao.setBounds(370, 204, 50, 50);
        getContentPane().add(multiplicacao);
        multiplicacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valorAnt = Float.parseFloat(textField.getText());
				textField.setText(null);
				operacao = 4;
				
			}
        });
       }
        
    public static void main(String[] args) {
		new ButtonFrame2();
		
	}
  }
