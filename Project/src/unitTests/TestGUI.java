/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package unitTests;

import gui.*;
import data.*;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.junit.Test;
import javax.swing.*;


public class TestGUI {

	@Test
	public void testGenerateButton() {
		CombinedCV testCom = new CombinedCV();
		testCom.getGen().doClick();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ChronologicalCV testChr = new ChronologicalCV();
		testChr.getGen().doClick();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FunctionalCV testFunc = new FunctionalCV();
		testFunc.getGen().doClick();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
