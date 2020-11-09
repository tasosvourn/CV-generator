/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package gui;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.*;

import data.Load;

public class MainWindow {

	private static JFrame frmCvMaker;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmCvMaker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCvMaker = new JFrame();
		frmCvMaker.setTitle("CV Maker");
		frmCvMaker.setBounds(100, 100, 450, 300);
		frmCvMaker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCvMaker.getContentPane().setLayout(null);
		frmCvMaker.setVisible(true);
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Tasos\\Desktop"));
		fileChooser.setAcceptAllFileFilterUsed(false);
		FileFilter filterTxt = new FileNameExtensionFilter("Plain text file","txt");
		fileChooser.setFileFilter(filterTxt);
		FileFilter filterTex = new FileNameExtensionFilter("Latex file", "tex");
		fileChooser.setFileFilter(filterTex);
		
		JButton func = new JButton("Functional CV");
		func.setBounds(10, 119, 115, 23);
		frmCvMaker.getContentPane().add(func);
		func.addActionListener(new OpenFCv());
		
		JButton chr = new JButton("Chronological CV");
		chr.setBounds(146, 119, 136, 23);
		frmCvMaker.getContentPane().add(chr);
		chr.addActionListener(new OpenChrCv());
		
		JButton comb = new JButton("Combined CV");
		comb.setBounds(309, 119, 115, 23);
		frmCvMaker.getContentPane().add(comb);
		comb.addActionListener(new OpenCombCv());
		
		JLabel lblSelectTheType = new JLabel("Select the type of your CV:");
		lblSelectTheType.setBounds(146, 11, 172, 34);
		frmCvMaker.getContentPane().add(lblSelectTheType);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.setBounds(162, 227, 89, 23);
		frmCvMaker.getContentPane().add(btnOpen);
		btnOpen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int result = fileChooser.showOpenDialog(new JFrame());
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					try {
						new Load(selectedFile);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		JLabel lblOpenExistingCv = new JLabel("Open existing CV:\r\n");
		lblOpenExistingCv.setBounds(162, 186, 115, 14);
		frmCvMaker.getContentPane().add(lblOpenExistingCv);

	}
	
	public static void setFrame(){
		frmCvMaker.dispose();
	}
}

	class OpenFCv implements ActionListener{

		public void actionPerformed (ActionEvent open){
			FunctionalCV func = new FunctionalCV();
			MainWindow.setFrame();
		}
}

	class  OpenChrCv implements ActionListener{
	
		public void actionPerformed (ActionEvent open){
			ChronologicalCV chr = new ChronologicalCV();
			MainWindow.setFrame();
		}
	}
	class OpenCombCv implements ActionListener{
		
		public void actionPerformed (ActionEvent open){
			CombinedCV comb = new CombinedCV();
			MainWindow.setFrame();			
		}	
	}