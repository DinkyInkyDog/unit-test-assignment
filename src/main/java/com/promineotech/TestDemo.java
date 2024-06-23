package com.promineotech;

import com.google.common.annotations.VisibleForTesting;

public class TestDemo {
private boolean done = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * If both parameters are positive (greater than zero) return the sum of the
	 * parameters. If either parameter is zero or negative, throw an
	 * IllegalArgumentException with the message "Both parameters must be
	 * positive!". IllegalArgumentException is in the java.lang package so you won't
	 * need an import statement.
	 * 
	 * @param a
	 * @param b
	 * @return 
	 */
	@VisibleForTesting
	int addPositive(int a, int b) {
		if (!(a <= 0) && !(b <= 0)) {
			return a + b;
		} else {
		throw new IllegalArgumentException("Both parameters must be positive!");
		}
}
	public boolean getDone() {
		return done;
	}
	@VisibleForTesting
	void quitMenu() {
		done = true;
	}
	
	
}
