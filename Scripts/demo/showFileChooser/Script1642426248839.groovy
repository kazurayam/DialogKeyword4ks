import javax.swing.JFileChooser

Tuple tp = CustomKeywords."com.kazurayam.ks.dialog.DialogKeyword.showFileChooser"("./Include/web", "Contents")

if (tp.get(0) == JFileChooser.APPROVE_OPTION) {
	println("You chose a file: " + tp.get(1))
} else {
	println("You canceled it.")
}
