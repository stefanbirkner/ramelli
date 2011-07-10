package com.github.ramelli.api;

/**
 * A {@code ProjectVisitor} is an algorithm for {@link Project}s.
 * 
 * @param <T>
 *            the return type of the algorithm.
 * @param <U>
 *            the supported sub type of {@link Project}.
 */
public interface ProjectVisitor<T, U extends Project> {
	/**
	 * Returns {@code true} if the visitor is applicable to the project.
	 * 
	 * @param project
	 *            the project.
	 * @return {@code true} if the visitor is applicable to the project.
	 */
	boolean isApplicableTo(Project project);

	/**
	 * Apply the visitor's algorithm to the project. You should use
	 * {@link #isApplicableTo(Project)} befores calling this method, in order to
	 * avoid an {@code IllegalArgumentException}.
	 * 
	 * @param project
	 *            the project.
	 * @return a value calculated by the algorithm.
	 * @throw IllegalArgumentException if the visitor is not applicable to the
	 *        project.
	 */
	T visit(U project);
}
