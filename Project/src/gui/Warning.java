/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Warning extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Warning dialog = new Warning();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Warning() {
		setTitle("Warning!!!");
		setBounds(100, 100, 453, 203);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 131, 437, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnNewButton = new JButton("OK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				buttonPane.add(btnNewButton);
			}
		}
		{
			JTextPane txtpnWarningtheInfoYou = new JTextPane();
			txtpnWarningtheInfoYou.setBounds(0, 33, 437, 48);
			txtpnWarningtheInfoYou.setBackground(SystemColor.menu);
			txtpnWarningtheInfoYou.setEditable(false);
			txtpnWarningtheInfoYou.setText("Warning!The info you inserted are not valid.\r\nClick the \"Clear All\" button to delete all contents stored.\r\n");
			getContentPane().add(txtpnWarningtheInfoYou);
		}
	}
}