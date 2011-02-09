/*
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2007-2011 Sun Microsystems, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 *
 * Contributor(s):
 *
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package com.sun.hk2.component;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;

import org.jvnet.hk2.component.ComponentException;
import org.jvnet.hk2.component.Inhabitant;

public interface InjectionResolverQuery {

  /**
   * Returns the value to inject in the field or method of component annotated with
   * the annotated annotation.
   *
   * @param component injection target instance
   * @param onBehalfOf inhabitant doing the injection for
   * @param annotated is the annotated java element {@link java.lang.reflect.Method}
   * or {@link java.lang.reflect.Field}
   * @param genericType the generic type of the expected return
   * @param type type of the expected return
   * @return the resource to be injected
   * @throws ComponentException if the resource cannot be located.
   */
  <V> V getValue(Object component,
      Inhabitant<?> onBehalfOf,
      AnnotatedElement annotated,
      Type genericType,
      Class<V> type) throws ComponentException;
  
}
