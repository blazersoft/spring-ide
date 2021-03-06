/*******************************************************************************
 * Copyright (c) 2015, 2017 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.boot.dash.views;

import org.springframework.ide.eclipse.boot.dash.BootDashActivator;
import org.springframework.ide.eclipse.boot.dash.dialogs.ToggleFiltersDialogModel;
import org.springframework.ide.eclipse.boot.dash.livexp.MultiSelection;
import org.springframework.ide.eclipse.boot.dash.model.BootDashElement;
import org.springframework.ide.eclipse.boot.dash.model.ToggleFiltersModel;
import org.springframework.ide.eclipse.boot.dash.model.UserInteractions;

/**
 * @author Kris De Volder
 */
public class OpenToggleFiltersDialogAction extends AbstractBootDashElementsAction {

	/**
	 * Represents the filters in the view (i.e. the ones currently in effect when dlg opens).
	 */
	private ToggleFiltersModel viewModel;

	public OpenToggleFiltersDialogAction(ToggleFiltersModel model, MultiSelection<BootDashElement> selection, UserInteractions ui) {
		super(selection, ui);
		this.viewModel = model;
		setText("Filters...");
		setImageDescriptor(BootDashActivator.getImageDescriptor("icons/filter.png"));
		setDisabledImageDescriptor(BootDashActivator.getImageDescriptor("icons/filter_disabled.png"));
	}

	@Override
	public void updateEnablement() {
		setEnabled(true);
	}

	@Override
	public void run() {
		ToggleFiltersDialogModel dlg = new ToggleFiltersDialogModel(viewModel);
		ui.openDialog(dlg);
	}

}
