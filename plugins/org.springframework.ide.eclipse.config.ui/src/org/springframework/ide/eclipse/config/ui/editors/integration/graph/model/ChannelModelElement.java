/*******************************************************************************
 *  Copyright (c) 2012 VMware, Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      VMware, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.config.ui.editors.integration.graph.model;

import org.eclipse.wst.xml.core.internal.provisional.document.IDOMElement;
import org.springframework.ide.eclipse.config.graph.model.AbstractConfigGraphDiagram;


/**
 * @author Leo Dos Santos
 */
@SuppressWarnings("restriction")
public class ChannelModelElement extends AbstractChannelModelElement {

	public ChannelModelElement() {
		super();
	}

	// @Override
	// protected String getContainerInputName() {
	// return IntegrationSchemaConstants.ELEM_INTERCEPTORS;
	// }

	public ChannelModelElement(IDOMElement input, AbstractConfigGraphDiagram diagram) {
		super(input, diagram);
	}

}