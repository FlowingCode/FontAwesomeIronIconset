/*-
 * #%L
 * FontAwesome Iron Iconset
 * %%
 * Copyright (C) 2019 - 2023 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.flowingcode.vaadin.addons.fontawesome;


import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;
import java.util.List;

import com.flowingcode.vaadin.addons.fontawesome.FontAwesome.Brands;
import com.flowingcode.vaadin.addons.fontawesome.FontAwesome.Regular;
import com.flowingcode.vaadin.addons.fontawesome.FontAwesome.Solid;
import com.vaadin.flow.component.icon.Icon;

/**
 * Reflection utilities for FontAwesome demo.
 * @author Javier Godoy / Flowing Code
 */
public abstract class FontAwesomeReflect {
	
	private FontAwesomeReflect() {}
		
	/**Return a list of all the {@code FontAwesome} icon types defined in the addon.*/
	public static List<Class<?>> getIconTypes() {
		return Arrays.asList(Solid.class, Regular.class, Brands.class);
	}
	
	/**Return the iconset name of the given {@code FontAwesome} icon type.*/
	public static String getIconset(Class<?> type) {
		return getStaticField("ICONSET", type); 
	}
	
	/**Return the iconset name of the given {@link Icon}.*/
	public static Icon create(Object _icon) {
		try {
			return (Icon) _icon.getClass().getMethod("create").invoke(_icon);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new UndeclaredThrowableException(e);
		} 
	}
	
	public static String getIconName(Object _icon) {
		try {
			return (String) _icon.getClass().getMethod("getIconName").invoke(_icon);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new UndeclaredThrowableException(e);
		}
	}
	
	private static String getStaticField(String fieldName, Class<?> type) {
		try {
			return (String) type.getField(fieldName).get(null);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new UndeclaredThrowableException(e);
		}
	}

	
}
