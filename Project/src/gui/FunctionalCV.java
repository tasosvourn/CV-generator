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

import data.*;

import java.awt.Component;

import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.*;

public class FunctionalCV {

	private static JFrame frmFunctionalCv;
	private JTextField name;
	private JTextField address;
	private JTextField telHome;
	private JTextField telMob;
	private JTextField email;
	private JTextField skillsOn;
	private JTextField qualification;
	private JTextField careerTxt;
	private JTextField coursesTxt;
	JButton generate = new JButton("Generate my CV");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FunctionalCV window = new FunctionalCV();
					window.frmFunctionalCv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FunctionalCV() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFunctionalCv = new JFrame();
		frmFunctionalCv.setTitle("Functional CV");
		frmFunctionalCv.setBounds(100, 100, 940, 488);
		frmFunctionalCv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFunctionalCv.getContentPane().setLayout(null);
		frmFunctionalCv.setVisible(true);
		CV cv = new CV();
		cv.setType("funCV");
		Section genInfo = new Section("GENERAL INFORMATION");
        cv.addSection(genInfo);
        Section pProfile = new Section("PROFESSIONAL PROFILE");
        cv.addSection(pProfile);
        Section skillsExp = new Section("SKILLS AND EXPERIENCE");
        cv.addSection(skillsExp);
        Section carSum = new Section("CAREER SUMMARY");
        cv.addSection(carSum);
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
		frmFunctionalCv.getContentPane().add(tabbedPane);
		
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
		
		JLabel label_3 = new JLabel("Hint!");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(673, 24, 46, 14);
		profProfile.add(label_3);
		
		JEditorPane dtrpnWriteABrief_2 = new JEditorPane();
		dtrpnWriteABrief_2.setText("\r\n\r\n\r\nWrite a brief paragraph about your career, your professional goals etc.");
		dtrpnWriteABrief_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		dtrpnWriteABrief_2.setEditable(false);
		dtrpnWriteABrief_2.setBackground(SystemColor.menu);
		dtrpnWriteABrief_2.setBounds(583, 49, 240, 171);
		profProfile.add(dtrpnWriteABrief_2);
		
		JTextArea pProfTxt = new JTextArea();
		pProfTxt.setLineWrap(true);
		pProfTxt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pProfTxt.setBounds(10, 11, 563, 240);
		profProfile.add(pProfTxt);
		
		JButton pProfAdd = new JButton("Add ");
		pProfAdd.setBounds(583, 228, 89, 23);
		profProfile.add(pProfAdd);
		pProfAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent add){
				cv.addParagraph(pProfile, pProfTxt.getText());
			}
		});
				
		JPanel skills = new JPanel();
		tabbedPane.addTab("SKILLS AND EXPERIENCE", null, skills, null);
		skills.setLayout(null);
				
		JLabel label = new JLabel("Skills and Experience on : ");
		label.setBounds(10, 11, 169, 14);
		skills.add(label);
			
		skillsOn = new JTextField();
		skillsOn.setColumns(10);
		skillsOn.setBounds(10, 36, 354, 20);
		skills.add(skillsOn);
				
		JLabel label_14 = new JLabel("Describe your skill and experience :");
		label_14.setBounds(10, 103, 216, 14);
		skills.add(label_14);
		
		JComboBox skillsList = new JComboBox();
		skillsList.setBounds(10, 67, 354, 20);
		skills.add(skillsList);
		DefaultComboBoxModel dm1 = new DefaultComboBoxModel();
		
		JTextArea skillsDescr = new JTextArea();
		skillsDescr.setLineWrap(true);
		skillsDescr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		skillsDescr.setBounds(10, 128, 482, 123);
		skills.add(skillsDescr);
		
		JButton addSkill = new JButton("Add skill & experience");
		addSkill.setBounds(496, 228, 137, 23);
		skills.add(addSkill);
		addSkill.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				add(skillsList, dm1, skillsOn.getText());
				skillsExp.addBulletListItem(new BulletListItem(null, skillsOn.getText() + "\n" + skillsDescr.getText()));
				skillsOn.setText("");
				skillsDescr.setText("");
			}
		});
				
		JLabel label_15 = new JLabel("Hint!");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_15.setBounds(597, 37, 46, 14);
		skills.add(label_15);
				
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText("\r\n\r\n\r\nWrite your Skills and Experience on every \r\nsubject in points seperating each one by \r\npressing Enter.");
		editorPane.setFont(new Font("Tahoma", Font.ITALIC, 11));
		editorPane.setEditable(false);
		editorPane.setBackground(SystemColor.menu);
		editorPane.setBounds(496, 67, 240, 150);
		skills.add(editorPane);
				
		JButton clearSkills = new JButton("Clear skills list");
		clearSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear(skillsList, dm1);
				skillsExp.clearBulletList();
			}
		});
		clearSkills.setBounds(686, 228, 137, 23);
		skills.add(clearSkills);
		
		JPanel career = new JPanel();
		career.setBorder(null);
		career.setToolTipText("");
		tabbedPane.addTab("CAREER SUMMARY", null, career, null);
		career.setLayout(null);
		
		careerTxt = new JTextField();
		careerTxt.setColumns(10);
		careerTxt.setBounds(10, 91, 750, 20);
		career.add(careerTxt);
		
		JComboBox careerList = new JComboBox();
		careerList.setBounds(10, 129, 750, 20);
		career.add(careerList);
		DefaultComboBoxModel dm4 = new DefaultComboBoxModel();
		ArrayList<Date> carDateList = new ArrayList<Date>();
		
		JButton addCareer = new JButton("Add ");
		addCareer.setBounds(438, 228, 89, 23);
		career.add(addCareer);
		addCareer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String[] info = careerTxt.getText().split(", ");
				String contents = info[0] + ", " + info[1] + ", " + info[2];
				DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = format.parse(info[2]);
					carDateList.add(date);
					add(careerList, dm4, careerTxt.getText());
					BulletListItem bli = new BulletListItem(date, contents);
					carSum.addBulletListItem(bli);
					boolean j = false;
					for(int i = 0; i < carDateList.size(); i++){
						if (date.after(carDateList.get(i))){
							j = true;
						}
					}
					Warning war = new Warning();
					war.setVisible(j);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					careerTxt.setText("");
				}
			});
		
		
		JButton clearCareer = new JButton("Clear career list");
		clearCareer.setToolTipText("Pressing this button will delete all contents stored");
		clearCareer.setBounds(670, 228, 153, 23);
		career.add(clearCareer);
		clearCareer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clear(careerList, dm4);
				carDateList.clear();
				carSum.clearBulletList();
			}
		});
		
		JLabel lblFillThisField_1 = new JLabel("Fill this field in the following form (Company Name, Job Title, Date):");
		lblFillThisField_1.setBounds(10, 66, 589, 14);
		career.add(lblFillThisField_1);
		
		JPanel education = new JPanel();
		tabbedPane.addTab("EDUCATION AND TRAINING", null, education, null);
		education.setLayout(null);
		
		JLabel lblFillThisField = new JLabel("Fill this field in the following form (Qualification, Establishment, Location, Date):");
		lblFillThisField.setBounds(10, 66, 607, 14);
		education.add(lblFillThisField);
		
		JComboBox qualList = new JComboBox();
		qualList.setBounds(10, 129, 750, 20);
		education.add(qualList);
		DefaultComboBoxModel dm2 = new DefaultComboBoxModel();
		ArrayList<Date> educDateList = new ArrayList<Date>();
		
		qualification = new JTextField();
		qualification.setColumns(10);
		qualification.setBounds(10, 91, 750, 20);
		education.add(qualification);
		
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

		
		JPanel courses = new JPanel();
		tabbedPane.addTab("FURTHER COURSES", null, courses, null);
		courses.setLayout(null);
		
		coursesTxt = new JTextField();
		coursesTxt.setColumns(10);
		coursesTxt.setBounds(10, 91, 750, 20);
		courses.add(coursesTxt);
		
		JComboBox coursesList = new JComboBox();
		coursesList.setBounds(10, 129, 750, 20);
		courses.add(coursesList);
		DefaultComboBoxModel dm3 = new DefaultComboBoxModel();
		ArrayList<Date> courDateList = new ArrayList<Date>();
		
		JButton addCourse = new JButton("Add ");
		addCourse.setBounds(382, 228, 89, 23);
		courses.add(addCourse);
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
		courses.add(clearCourse);
		clearCourse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clear(coursesList, dm3);
				courDateList.clear();
				cours.clearBulletList();
			}
		});
		
		JLabel lblFillThisField_2 = new JLabel("Fill this field in the following form (Course, Establishment, Location, Date):");
		lblFillThisField_2.setBounds(10, 66, 592, 14);
		courses.add(lblFillThisField_2);
		
		JPanel additionalInfo = new JPanel();
		tabbedPane.addTab("ADDITIONAL INFORMATION", null, additionalInfo, null);
		additionalInfo.setLayout(null);
		
		JLabel label_1 = new JLabel("Hint!");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(673, 24, 46, 14);
		additionalInfo.add(label_1);
		
		JTextArea addInfo = new JTextArea();
		addInfo.setLineWrap(true);
		addInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addInfo.setBounds(10, 11, 563, 240);
		additionalInfo.add(addInfo);
		
		JButton addAddInfo = new JButton("Add ");
		addAddInfo.setBounds(583, 228, 89, 23);
		additionalInfo.add(addAddInfo);
		additionalInfo.add(addAddInfo);
		addAddInfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent add){
				cv.addParagraph(addInformation, addInfo.getText());
			}
		});
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setText("\r\n\r\n\r\nWrite a brief paragraph about yourself.\r\n");
		editorPane_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		editorPane_1.setEditable(false);
		editorPane_1.setBackground(SystemColor.menu);
		editorPane_1.setBounds(583, 47, 240, 170);
		additionalInfo.add(editorPane_1);
		
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
		dtrpnWriteABrief_1.setBounds(583, 49, 240, 172);
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
		frmFunctionalCv.getContentPane().add(generate);
		generate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				SelectType select = new SelectType(cv);
				select.setVisible(true);
			}
		});
		
		JButton back = new JButton("Back");
		back.setBounds(45, 409, 89, 23);
		frmFunctionalCv.getContentPane().add(back);
		back.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent back){
				MainWindow mainW = new MainWindow();
				ChronologicalCV.setFrame();
			}
		});
	}
	
	public JButton getGen(){
		return generate;
	}
	
	public static void setFrame(){
		frmFunctionalCv.dispose();
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