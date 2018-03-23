package com.modultek.pis.md;

import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;

public class AtonPlugin extends com.nomagic.magicdraw.plugins.Plugin {

	@Override
	public boolean close() {
		return true;
	}

	@Override
	public void init() {
		ActionsConfiguratorsManager manager = ActionsConfiguratorsManager.getInstance();
		// adding actions with separator
		manager.addMainMenuConfigurator(new MainMenuConfigurator(getSeparatedActions()));

		javax.swing.JOptionPane.showMessageDialog(null, "Yes I have Aton Plugin installed!");

	}

	@Override
	public boolean isSupported() {
		return true;
	}

	private NMAction getSeparatedActions() {
		ActionsCategory category = new ActionsCategory(null, null);
		category.addAction(new AtonAction(null, "Save to Aton"));
		return category;
	}

}
