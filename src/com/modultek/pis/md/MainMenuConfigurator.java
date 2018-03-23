package com.modultek.pis.md;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.MDActionsCategory;

public class MainMenuConfigurator implements AMConfigurator {

	String ATON = "Aton";

	private NMAction action;

	public MainMenuConfigurator(NMAction action) {
		this.action = action;
	}

	@Override
	public void configure(ActionsManager manager) {
		// searching for Examples action category
		ActionsCategory category = (ActionsCategory) manager.getActionFor(ATON);

		if (category == null) {
			// creating new category
			category = new MDActionsCategory(ATON, ATON);
			category.setNested(true);
			manager.addCategory(category);
		}
		category.addAction(action);
	}

	@Override
	public int getPriority() {
		return AMConfigurator.MEDIUM_PRIORITY;
	}

}
