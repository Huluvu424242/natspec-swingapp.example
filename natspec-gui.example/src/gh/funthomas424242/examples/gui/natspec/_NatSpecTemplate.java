package gh.funthomas424242.examples.gui.natspec;

import javax.swing.SwingUtilities;

import gh.funthomas424242.examples.gui.model.Model;

public class _NatSpecTemplate {

	protected static SwingSupport swingSupport = new SwingSupport();

	public static SwingSupport createSwingSupport() {
		// generated code will be inserted here
		/* @MethodBody */
		
		return swingSupport;
	}

	public Model getModel() {
		return swingSupport.getModel();
	}
	
	public  static void main(final String args[]) {
		final Runnable guiCreator = new Runnable() {
			public void run() {
				createSwingSupport();
			}
		};
		SwingUtilities.invokeLater(guiCreator);
	}
}