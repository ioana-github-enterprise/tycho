/*******************************************************************************
 * Copyright (c) 2012 SAP SE and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP SE - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.repository.streaming.testutil;

import java.io.IOException;
import java.io.OutputStream;

public class NoopOutputStream extends OutputStream {

    @Override
    public void write(int b) throws IOException {
        // ignore
    }

}
