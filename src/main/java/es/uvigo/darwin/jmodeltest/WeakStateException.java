/*
Copyright (C) 2011  Diego Darriba, David Posada

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package es.uvigo.darwin.jmodeltest;

public class WeakStateException extends RuntimeException {

	private static final long serialVersionUID = 201104031313L;

	public WeakStateException(String message) {
		super(message);
	}
	
	public static class UninitializedCriterionException extends WeakStateException {
	
		private static final long serialVersionUID = 201104031313L;
		
		public UninitializedCriterionException(String criterion) {
			super("Attempting to get an uninitialized criterion: " + criterion); 
			}

	}
}
