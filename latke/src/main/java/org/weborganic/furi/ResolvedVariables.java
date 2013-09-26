/*
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is part of the URI Template library.
 *
 * For licensing information please see the file license.txt included in the release.
 * A copy of this licence can also be found at 
 *   http://www.opensource.org/licenses/artistic-license-2.0.php
 */
package org.weborganic.furi;


import java.util.Set;


/**
 * Holds the values of a resolved variables.
 * 
 * @author Christophe Lauret
 * @version 27 May 2009
 */
public interface ResolvedVariables {

    /**
     * Returns the names of the variables which have been resolved.
     * 
     * @return The names of the variables which have been resolved.
     */
    public Set<String> names();

    /**
     * Returns the object corresponding to the specified variable name.
     * 
     * @param name The name of the variable.
     * 
     * @return The object corresponding to the specified variable; may be <code>null</code>.
     */
    public Object get(String name);

}