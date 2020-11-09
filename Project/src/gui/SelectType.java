/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import data.*;

public class SelectType extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectType frame = new SelectType();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectType() {
		setTitle("Select export type");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton plainText = new JButton("Plain Text");
		plainText.setBounds(44, 139, 123, 36);
		contentPane.add(plainText);
		
		JButton btnLatex = new JButton("Latex ");
		btnLatex.setBounds(239, 139, 136, 36);
		contentPane.add(btnLatex);
		
		JLabel lblSelectInWhat = new JLabel("Select in what form you want to export your CV:");
		lblSelectInWhat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectInWhat.setBounds(56, 47, 331, 36);
		contentPane.add(lblSelectInWhat);
	}
	
	public SelectType(CV cv) {
		setTitle("Select export type");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton plainText = new JButton("Plain Text");
		plainText.setBounds(44, 139, 123, 36);
		contentPane.add(plainText);
		plainText.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new SaveTxt(cv);
				dispose();
			}
		});
		
		JButton latex = new JButton("Latex ");
		latex.setBounds(239, 139, 136, 36);
		contentPane.add(latex);
		latex.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new SaveTex(cv);
				dispose();
			}
		});
		
		JLabel lblSelectInWhat = new JLabel("Select in what form you want to export your CV:");
		lblSelectInWhat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectInWhat.setBounds(56, 47, 331, 36);
		contentPane.add(lblSelectInWhat);
	}
}
