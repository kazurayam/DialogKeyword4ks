package com.kazurayam.ks.dialog

import java.awt.Font

import javax.swing.JFileChooser
import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.UIManager
import javax.swing.filechooser.FileSystemView

import com.kms.katalon.core.annotation.Keyword

public class DialogKeyword {

	@Keyword
	public static Tuple showFileChooser(String filePath, String title="title"){
		int returnValue = 0;
		JFrame frame = new JFrame(title)
		frame.setAlwaysOnTop(true)
		frame.requestFocus()
		File file=new File(filePath)
		JFileChooser chooser = new JFileChooser(file, FileSystemView.getFileSystemView())
		Integer ret = chooser.showOpenDialog(frame)
		return new Tuple(ret, chooser.getSelectedFile())
	}

	@Keyword
	public static int showConfirmationDialog(String message, String title="title") {
		int returnValue = 0;
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 24);
		UIManager.put("OptionPane.messageFont", font);
		UIManager.put("OptionPane.buttonFont", font);
		JFrame frame = new JFrame(title)
		frame.setAlwaysOnTop(true)
		frame.requestFocus()
		return JOptionPane.showConfirmDialog(frame, message, title, JOptionPane.YES_NO_OPTION);
	}
}

