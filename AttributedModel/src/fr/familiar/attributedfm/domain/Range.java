/*
	This file is part of FaMaTS.

    FaMaTS is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FaMaTS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with FaMaTS.  If not, see <http://www.gnu.org/licenses/>.

 */
package fr.familiar.attributedfm.domain;

import java.util.Collection;

/**
 * Represents a Range
 */
public abstract class Range {

	boolean bounded;

	public abstract Object getMax();

	public abstract Object getMin();

	public void setBounded(boolean b) {
		this.bounded = b;
	}

	public boolean isBounded() {
		return bounded;
	}

	public abstract Collection getItems();

	public abstract void add(Object o);

}