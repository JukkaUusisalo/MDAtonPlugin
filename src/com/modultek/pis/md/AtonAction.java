package com.modultek.pis.md;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.net.URI;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectsManager;

public class AtonAction extends MDAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AtonAction(String id, String name) {
		super(id, name, null, null);
	}

	@Override
	public void actionPerformed(ActionEvent eevent) {
        try {
        	ProjectsManager projectsManager = Application.getInstance().getProjectsManager();
        	Project project = projectsManager.getActiveProject();
        	String fileName = project.getFileName();
        	fileName = fileName.replace("\\", "/");
        	Desktop dt = Desktop.getDesktop();
        	URI uri = new URI("aton://document/new?file="+fileName);
        	dt.browse(uri);
		} catch (Throwable e) {
			e.printStackTrace(System.err);
		}
	}

}
