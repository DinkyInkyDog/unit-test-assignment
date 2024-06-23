package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
private TestDemo td;
	@BeforeEach
	void setUp() throws Exception{
		td = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	@Disabled
	void assertThatAddPostiveWorks(int a, int b, int expected, boolean expectException) {
		//Given: two numbers
		
		if(!expectException) {
			//when: if the numbers are positive, you add the two numbers together
			//then: return the sum of the two positive numbers
			assertThat(td.addPositive(a, b)).isEqualTo(expected);
		} else {
		//when: if the numbers are negative or zero, you don't add the numbers
		//then: throw an IllegalArgumentException.
		assertThatThrownBy(() -> td.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
	}

private static Stream<Arguments> argumentsForAddPositive() {
	//formatter:off
	return Stream.of(
			arguments(2, 4, 6, false),
			arguments(0, 1, 0, true),
			arguments(3, -2, 0, true)
	);
	//formatter:on
}


	@Test
	@Disabled
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		//Given: two known positive pairs
		int a = 40;
		int b = 20;
		int expected = 60;
		//when: the method activates
		//then: the pair is added together correctly
		assertThat(td.addPositive(a, b)).isEqualTo(expected);
	}
	
	@Test
	@Disabled
	void assertThatQuitMenuTrue() {
		//Given: the method
		TestDemo testMock = spy(new TestDemo());
		//when: the method accesses the done variable
		testMock.quitMenu();
		//then: done is set to true
		assertThat(testMock.getDone()).isEqualTo(true);
	}
	
	
	
	
	
}
