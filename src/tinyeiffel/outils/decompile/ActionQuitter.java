/**
 * 
 */
package tinyeiffel.outils.decompile;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

final class ActionQuitter extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ActionQuitter() {
		super("Quitter");
	}

	public void actionPerformed(ActionEvent event)
	{
		System.exit(0);
	}
}