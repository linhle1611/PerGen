/* Copyright 2007 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.jberger.pergen.domain;

import org.jberger.pergen.exceptions.AmbiguousEntityNameException;
import static org.junit.Assert.*;
import org.junit.Test;

public class GlobalInformationsTest {

    @Test
    public final void testIsEntityDefined() {
        String entityName = "cheese";
        GlobalInformations global = new GlobalInformations();

        Entity entity = new Entity(entityName);
        global.addEntity(entity);

        assertTrue(global.isEntityDefined(entityName));
    }

    @Test
    public final void testGetEntity() {
        String entityName = "cheese";
        GlobalInformations global = new GlobalInformations();

        Entity entity = new Entity(entityName);
        global.addEntity(entity);

        assertSame(entity, global.getEntity(entityName));
    }

    @Test
    public final void testGetEntities() {
        GlobalInformations global = new GlobalInformations();
        global.addEntity(new Entity("first"));
        global.addEntity(new Entity("second"));
        global.addEntity(new Entity("third"));
        assertEquals(3, global.getEntities().size());
    }
    
    @Test(expected=AmbiguousEntityNameException.class)
    public final void testDuplicateEntityName() {
        GlobalInformations global = new GlobalInformations();
        global.addEntity(new Entity("entity_name"));
        global.addEntity(new Entity("entity__name"));
    }
}
