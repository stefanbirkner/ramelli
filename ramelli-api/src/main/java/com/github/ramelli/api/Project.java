package com.github.ramelli.api;

/**
 * A {@code Project} is Ramelli's model of a project. Project objects are
 * immutable.
 */
public interface Project {
	/**
	 * Returns the name of the project.
	 * 
	 * @return the name of the project.
	 */
	String getName();
}