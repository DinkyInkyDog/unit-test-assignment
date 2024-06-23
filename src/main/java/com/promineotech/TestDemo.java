package com.promineotech;

import java.util.Random;

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
	
	/**
	 * TestDemo.java, add another method named randomNumberSquared. This method
	 * obtains a random int between 1 and 10 and then returns the square of the
	 * number.
	 * 
	 * a. randomNumberSquared should return an int and not take any parameters.
	 */
	@VisibleForTesting
	int randomNumberSquared() {
		int randomNum = getRandomInt();
		return randomNum * randomNum;
	}

	private int getRandomInt() {

		Random random = new Random();

		return random.nextInt(10) + 1;

	}
}
