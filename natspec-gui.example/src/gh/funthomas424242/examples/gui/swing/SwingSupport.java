package gh.funthomas424242.examples.gui.swing;

import gh.funthomas424242.examples.lib.utils.StringConcatinator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

import de.devboost.natspec.annotations.TextSyntax;
import de.devboost.natspec.annotations.TextSyntaxes;

public class SwingSupport { 

	protected SwingDialog dialog; 

	public SwingDialog getDialog() {
		return dialog;
	}
 
	@TextSyntax("Beschreibung des Dialoges #1 wie folgt:")
	public JFrame createDialog(final String dialogId) {
		final JFrame frame = new JFrame();
		this.dialog = new SwingDialog(dialogId, frame);
		return frame;
	}

	@TextSyntax("Breite: #1 Höhe: #2")
	public void setSize(final Integer breite, final Integer hoehe,
			final JFrame frame) {
		frame.setSize(breite, hoehe);
	}

	@TextSyntax("Titel: #1")
	public void setTitel(final List<String> titles, final JFrame frame) {
		final String title = new StringConcatinator(titles).getString();
		frame.setTitle(title);
	}

	@TextSyntax("Sichtbarkeit: #1")
	public void setVisibility(final String sichtbarkeit, final JFrame frame) {
		if ("JA".equals(sichtbarkeit) || "Ja".equals(sichtbarkeit)
				|| "ja".equals(sichtbarkeit)) {
			frame.setVisible(true);
		} else {
			frame.setVisible(false);
		}
	}

	@TextSyntax("Beende die Anwendung beim Schliessen des Dialoges.")
	public void setExitOnClose(final JFrame frame) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@TextSyntax("Verwende das Gridlayout mit #1 Spalten und #2 Zeilen.")
	public GridLayout setGridLayout( final Integer spalten, final Integer zeilen,final JFrame frame) {
		final GridLayout gl=new GridLayout();
		gl.setColumns(spalten);
		gl.setRows(zeilen);
		frame.setLayout(gl);
		return gl;
	}
		
	@TextSyntax("Verwende das Borderlayout.")
	public BorderLayout setBorderLayout( final JFrame frame) {
		final BorderLayout borderLayout= new BorderLayout();
		frame.setLayout(borderLayout);
		return borderLayout;
	}
	
	@TextSyntax("Verwende das Flowlayout.")
	public FlowLayout setFlowLayout( final JFrame frame) {
		final FlowLayout flowLayout= new FlowLayout();
		frame.setLayout(flowLayout);
		return flowLayout;
	}
			
	
	@TextSyntax("Füge hinzu das Label #1 mit dem Text #2")
	public void addLabel(final String labelId, final List<String> labeltokens,final JFrame frame) {
		final String labelText=new StringConcatinator(labeltokens).getString();
		final JLabel label = new JLabel(labelText);
		dialog.putElement(labelId,label);
        frame.getContentPane().add(label);
	}

	
}
