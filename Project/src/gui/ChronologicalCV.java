/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;

import java.awt.Font;
import java.awt.Scrollbar;

import javax.swing.JList;
import javax.swing.JScrollBar;

import java.awt.List;

import javax.swing.JComboBox;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.event.*;
import java.io.Writer;

import javax.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.SwingConstants;

import data.*;

public class ChronologicalCV {

	private static JFrame frmChronologicalCv;
	private JTextField name;
	private JTextField address;
	private JTextField telHome;
	private JTextField telMob;
	private JTextField email;
	private JTextField compName;
	private JTextField job;
	private JTextField date;
	private JTextField company;
	private JTextField achievTxt;
	private JTextField qualification;
	private JTextField coursesTxt;
	JButton generate = new JButton("Generate my CV");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChronologicalCV window = new ChronologicalCV();
					window.frmChronologicalCv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChronologicalCV() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChronologicalCv = new JFrame();
		frmChronologicalCv.setTitle("Chronological CV");
		frmChronologicalCv.setBounds(100, 100, 940, 488);
		frmChronologicalCv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChronologicalCv.getContentPane().setLayout(null);
		frmChronologicalCv.setVisible(true);
		CV cv = new CV();
		cv.setType("chrCV");
		Section genInfo = new Section("GENERAL INFORMATION");
		cv.addSection(genInfo);
		Section pProfile = new Section("PROFESSIONAL PROFILE");
		cv.addSection(pProfile);
		Section core = new Section("CORE STRENGHTS");
		cv.addSection(core);
		Section pExp = new Section("PROFESSIONAL EXPERIENCE");
		cv.addSection(pExp);
		Section educ = new Section("EUCATION AND TRAINING");
		cv.addSection(educ);
		Section cours = new Section("FURTHER COURSES");
		cv.addSection(cours);
		Section addInformation = new Section("ADDITIONAL INFORMATION");
		cv.addSection(addInformation);
		Section inter = new Section("INTERESTS");
		cv.addSection(inter);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(45, 39, 838, 306);
		frmChronologicalCv.getContentPane().add(tabbedPane);
		
		JPanel generalInfo = new JPanel();
		tabbedPane.addTab("GENERAL INFORMATION", null, generalInfo, null);
		generalInfo.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 27, 46, 14);
		generalInfo.add(lblName);
		
		JLabel lblNewLabel = new JLabel("Address:");
		lblNewLabel.setBounds(10, 70, 69, 14);
		generalInfo.add(lblNewLabel);
		
		JLabel lblTelephonehome = new JLabel("Telephone (Home):");
		lblTelephonehome.setBounds(10, 120, 120, 14);
		generalInfo.add(lblTelephonehome);
		
		JLabel lblNewLabel_1 = new JLabel("Telephone (Mobile):");
		lblNewLabel_1.setBounds(10, 164, 120, 14);
		generalInfo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setBounds(10, 210, 69, 14);
		generalInfo.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setBounds(140, 24, 639, 20);
		generalInfo.add(name);
		name.setColumns(10);
		name.addKeyListener(new KeyAdapter(){

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){
					cv.setName(name.getText());
				}
			}
		});

		address = new JTextField();
		address.setColumns(10);
		address.setBounds(140, 67, 639, 20);
		generalInfo.add(address);
		address.addKeyListener(new KeyAdapter(){

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){
					cv.setAddress(address.getText());
				}
			}
		});
		
		telHome = new JTextField();
		telHome.setColumns(10);
		telHome.setBounds(140, 117, 639, 20);
		generalInfo.add(telHome);
		telHome.addKeyListener(new KeyAdapter(){

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){
					cv.setTelHome(telHome.getText());
				}
			}
		});
		
		telMob = new JTextField();
		telMob.setColumns(10);
		telMob.setBounds(140, 161, 639, 20);
		generalInfo.add(telMob);
		telMob.addKeyListener(new KeyAdapter(){

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){
					cv.setTelMob(telMob.getText());
				}
			}
		});
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(140, 207, 639, 20);
		generalInfo.add(email);
		email.addKeyListener(new KeyAdapter(){

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){
					cv.setEmail(email.getText());
				}
			}
		});
		
		JPanel profProfile = new JPanel();
		tabbedPane.addTab("PROFESSIONAL PROFILE", null, profProfile, null);
		profProfile.setLayout(null);
		
		JLabel label = new JLabel("Hint!");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(673, 24, 46, 14);
		profProfile.add(label);
		
		JTextArea pProfTxt = new JTextArea();
		pProfTxt.setLineWrap(true);
		pProfTxt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pProfTxt.setBounds(10, 11, 563, 240);
		profProfile.add(pProfTxt);
		
		JButton pProfAdd = new JButton("Add ");
		pProfAdd.setBounds(580, 228, 89, 23);
		profProfile.add(pProfAdd);
		pProfAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent add){
				cv.addParagraph(pProfile, pProfTxt.getText());
			}
		});
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText("\r\n\r\n\r\nWrite a brief paragraph about your career, your professional goals etc.");
		editorPane.setFont(new Font("Tahoma", Font.ITALIC, 11));
		editorPane.setEditable(false);
		editorPane.setBackground(SystemColor.menu);
		editorPane.setBounds(583, 49, 240, 170);
		profProfile.add(editorPane);
		
		JPanel coreStenghts = new JPanel();
		tabbedPane.addTab("CORE STRENGHTS", null, coreStenghts, null);
		coreStenghts.setLayout(null);
		
		JLabel label_4 = new JLabel("Hint!");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(677, 24, 46, 14);
		coreStenghts.add(label_4);
		
		JEditorPane dtrpnWriteABrief_3 = new JEditorPane();
		dtrpnWriteABrief_3.setText("\r\n\r\n\r\nWrite a brief paragraph about your core \r\nstrenghts.");
		dtrpnWriteABrief_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		dtrpnWriteABrief_3.setEditable(false);
		dtrpnWriteABrief_3.setBackground(SystemColor.menu);
		dtrpnWriteABrief_3.setBounds(583, 49, 240, 171);
		coreStenghts.add(dtrpnWriteABrief_3);
		
		JTextArea coreStr = new JTextArea();
		coreStr.setLineWrap(true);
		coreStr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		coreStr.setBounds(10, 11, 563, 240);
		coreStenghts.add(coreStr);
		
		JButton addCoreStr = new JButton("Add");
		addCoreStr.setBounds(583, 228, 89, 23);
		coreStenghts.add(addCoreStr);
		addCoreStr.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent add){
				cv.addParagraph(core, coreStr.getText());
			}
		});
		
		JPanel profExp = new JPanel();
		profExp.setBorder(null);
		profExp.setToolTipText("");
		tabbedPane.addTab("PROFESSIONAL EXPERIENCE", null, profExp, null);
		profExp.setLayout(null);
		
		JLabel lblCompanyName = new JLabel("Fill the following field in this form (Company name, job title, date): ");
		lblCompanyName.setBounds(10, 11, 465, 14);
		profExp.add(lblCompanyName);
		
		JLabel lblResponsibilities = new JLabel("Responsibilities:");
		lblResponsibilities.setBounds(10, 96, 103, 14);
		profExp.add(lblResponsibilities);
		
		JLabel lblListOfAchievements = new JLabel("List of Achievements:");
		lblListOfAchievements.setBounds(523, 11, 103, 14);
		profExp.add(lblListOfAchievements);
		
		JTextArea responsibilities = new JTextArea();
		responsibilities.setWrapStyleWord(true);
		responsibilities.setFont(new Font("Tahoma", Font.PLAIN, 11));
		responsibilities.setLineWrap(true);
		responsibilities.setBounds(10, 132, 484, 130);
		profExp.add(responsibilities);
		
		JComboBox achievList = new JComboBox();
		achievList.setBounds(523, 63, 299, 23);
		profExp.add(achievList);
		DefaultComboBoxModel dm = new DefaultComboBoxModel();
		
		achievTxt = new JTextField();
		achievTxt.setBounds(523, 32, 299, 20);
		profExp.add(achievTxt);
		achievTxt.setColumns(10);
		profExp.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblCompanyName, lblResponsibilities, lblListOfAchievements}));
		ArrayList<String> aList = new ArrayList<String>();

		
		JButton addAchiev = new JButton("Add achievement");
		addAchiev.setBounds(679, 103, 143, 23);
		profExp.add(addAchiev);
		addAchiev.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				add(achievList, dm, achievTxt.getText());
				aList.add(achievTxt.getText());
				achievTxt.setText("");
			}
		});
		
		company = new JTextField();
		company.setBounds(10, 36, 500, 20);
		profExp.add(company);
		company.setColumns(10);
		
		JComboBox companyList = new JComboBox();
		companyList.setBounds(10, 64, 500, 20);
		profExp.add(companyList);
		DefaultComboBoxModel dm1 = new DefaultComboBoxModel();
		ArrayList<Date> compDateList = new ArrayList<Date>();
		
		JButton addComp = new JButton("Add Company");
		addComp.setBounds(679, 194, 143, 23);
		profExp.add(addComp);
		addComp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String[] info = company.getText().split(", ");
				String contents = info[0] + ", " + info[1] + ", " + info[2] + "\n	" + responsibilities.getText();
				DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = format.parse(info[2]);
					compDateList.add(date);
					add(companyList, dm1, company.getText());
					BulletListItem bl = new BulletListItem(date, contents);
					for(int i = 0; i < aList.size(); i++){
						bl.addListItem(aList.get(i));
					}
					cv.addBulletListItem(pExp, bl);
					boolean j = false;
					for(int i = 0; i < compDateList.size(); i++){
						if (date.after(compDateList.get(i))){
							j = true;
						}
					}
					Warning war = new Warning();
					war.setVisible(j);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				company.setText("");
				responsibilities.setText("");
				clear(achievList, dm);
			}
		});
		
		
		JButton clearCompanies = new JButton("Clear Companies' List");
		clearCompanies.setBounds(661, 228, 161, 23);
		profExp.add(clearCompanies);
		clearCompanies.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clear(companyList, dm1);
				compDateList.clear();
				pExp.clearBulletList();
			}
		});
		
		JPanel education = new JPanel();
		tabbedPane.addTab("EDUCATION AND TRAINING", null, education, null);
		education.setLayout(null);
		
		qualification = new JTextField();
		qualification.setColumns(10);
		qualification.setBounds(10, 91, 750, 20);
		education.add(qualification);
		
		JComboBox qualList = new JComboBox();
		qualList.setBounds(10, 129, 750, 20);
		education.add(qualList);
		DefaultComboBoxModel dm2 = new DefaultComboBoxModel();
		ArrayList<Date> educDateList = new ArrayList<Date>();
		
		JButton addEduc = new JButton("Add ");
		addEduc.setBounds(382, 228, 89, 23);
		education.add(addEduc);
		addEduc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String[] info = qualification.getText().split(", ");
				String contents = info[0] + ", " + info[1] + ", " + info[2] + ", " + info[3];
				DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = format.parse(info[3]);
					educDateList.add(date);
					add(qualList, dm2, qualification.getText());
					BulletListItem bli = new BulletListItem(date, contents);
					educ.addBulletListItem(bli);
					boolean j = false;
					for(int i = 0; i < educDateList.size(); i++){
						if (date.after(educDateList.get(i))){
							j = true;
						}
					}
					Warning war = new Warning();
					war.setVisible(j);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				qualification.setText("");
			}
		});
		
		JButton clearEduc = new JButton("Clear education list\r\n");
		clearEduc.setToolTipText("Pressing this button will delete all contents stored");
		clearEduc.setBounds(671, 228, 152, 23);
		education.add(clearEduc);
		clearEduc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clear(qualList, dm2);
				educDateList.clear();
				educ.clearBulletList();
			}
		});
		
		JLabel lblFillThisField = new JLabel("Fill this field in the following form (Qualification, Establishment, Location, Date):");
		lblFillThisField.setBounds(10, 66, 590, 14);
		education.add(lblFillThisField);

		
		JPanel courses = new JPanel();
		tabbedPane.addTab("FURTHER COURSES", null, courses, null);
		courses.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 833, 262);
		courses.add(panel);
		
		coursesTxt = new JTextField();
		coursesTxt.setColumns(10);
		coursesTxt.setBounds(10, 91, 750, 20);
		panel.add(coursesTxt);
		
		JComboBox coursesList = new JComboBox();
		coursesList.setBounds(10, 129, 750, 20);
		panel.add(coursesList);
		DefaultComboBoxModel dm3 = new DefaultComboBoxModel();
		ArrayList<Date> courDateList = new ArrayList<Date>();
		
		JButton addCourse = new JButton("Add ");
		addCourse.setBounds(382, 228, 89, 23);
		panel.add(addCourse);
		addCourse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String[] info = coursesTxt.getText().split(", ");
				String contents = info[0] + ", " + info[1] + ", " + info[2] + ", " + info[3];
				DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = format.parse(info[3]);
					courDateList.add(date);
					add(coursesList, dm3, coursesTxt.getText());
					BulletListItem bli = new BulletListItem(date, contents);
					cours.addBulletListItem(bli);
					boolean j = false;
					for(int i = 0; i < courDateList.size(); i++){
						if (date.after(courDateList.get(i))){
							j = true;
						}
					}
					Warning war = new Warning();
					war.setVisible(j);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					coursesTxt.setText("");
				}
			});
		
		JButton clearCourse = new JButton("Clear course list\r\n");
		clearCourse.setToolTipText("Pressing this button will delete all contents stored");
		clearCourse.setBounds(671, 228, 152, 23);
		panel.add(clearCourse);
		clearCourse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clear(coursesList, dm3);
				courDateList.clear();
				cours.clearBulletList();
			}
		});
		
		JLabel label_3 = new JLabel("Fill this field in the following form (Course, Establishment, Location, Date):");
		label_3.setBounds(10, 66, 578, 14);
		panel.add(label_3);
		
		JPanel additionalInfo = new JPanel();
		tabbedPane.addTab("ADDITIONAL INFORMATION", null, additionalInfo, null);
		additionalInfo.setLayout(null);
		
		JLabel label_1 = new JLabel("Hint!");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(673, 24, 46, 14);
		additionalInfo.add(label_1);
		
		JEditorPane dtrpnWriteABrief = new JEditorPane();
		dtrpnWriteABrief.setText("\r\n\r\n\r\nWrite a brief paragraph about yourself.\r\n");
		dtrpnWriteABrief.setFont(new Font("Tahoma", Font.ITALIC, 11));
		dtrpnWriteABrief.setEditable(false);
		dtrpnWriteABrief.setBackground(SystemColor.menu);
		dtrpnWriteABrief.setBounds(583, 49, 240, 170);
		additionalInfo.add(dtrpnWriteABrief);
		
		JTextArea addInfo = new JTextArea();
		addInfo.setLineWrap(true);
		addInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addInfo.setBounds(10, 11, 563, 240);
		additionalInfo.add(addInfo);
		
		
		JButton addAddInfo = new JButton("Add ");
		addAddInfo.setBounds(580, 228, 89, 23);
		additionalInfo.add(addAddInfo);
		addAddInfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent add){
				cv.addParagraph(addInformation, addInfo.getText());
			}
		});
		
		JPanel interests = new JPanel();
		tabbedPane.addTab("INTERESTS", null, interests, null);
		interests.setLayout(null);
		
		JLabel label_2 = new JLabel("Hint!");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(673, 24, 46, 14);
		interests.add(label_2);
		
		JEditorPane dtrpnWriteABrief_1 = new JEditorPane();
		dtrpnWriteABrief_1.setText("\r\n\r\n\r\nWrite a brief paragraph about your hobbies, \r\ninterests, possibly voluntary work etc.\r\n");
		dtrpnWriteABrief_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		dtrpnWriteABrief_1.setEditable(false);
		dtrpnWriteABrief_1.setBackground(SystemColor.menu);
		dtrpnWriteABrief_1.setBounds(583, 49, 240, 163);
		interests.add(dtrpnWriteABrief_1);
		
		JTextArea interestsTxt = new JTextArea();
		interestsTxt.setLineWrap(true);
		interestsTxt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		interestsTxt.setBounds(10, 11, 563, 240);
		interests.add(interestsTxt);
		
		JButton addInterests = new JButton("Add ");
		addInterests.setBounds(583, 228, 89, 23);
		interests.add(addInterests);
		addInterests.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent add){
				cv.addParagraph(inter, interestsTxt.getText());
			}
		});
		
		
		generate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		generate.setBounds(692, 399, 191, 39);
		frmChronologicalCv.getContentPane().add(generate);
		generate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				SelectType select = new SelectType(cv);
				select.setVisible(true);
			}
		});
		
		JButton back = new JButton("Back");
		back.setBounds(45, 409, 89, 23);
		frmChronologicalCv.getContentPane().add(back);
		back.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent back){
				MainWindow mainW = new MainWindow();
				ChronologicalCV.setFrame();
			}
		});
		
	}
	
	public static void setFrame(){
		frmChronologicalCv.dispose();
	}
	
	public JButton getGen(){
		return generate;
	}
	
	public void add(JComboBox list,
	DefaultComboBoxModel dm, String input){
		dm.addElement(input);
		list.setModel(dm);
	}
	
	public void clear(JComboBox list, DefaultComboBoxModel dm){
		dm.removeAllElements();
		list.setModel(dm);
	}
}

class WarningDialog implements ActionListener{

	public void actionPerformed (ActionEvent open){
		Warning warn = new Warning();
	}
}