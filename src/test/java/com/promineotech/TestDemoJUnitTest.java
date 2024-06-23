package com.promineotech;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.*;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
private TestDemo td;
	@BeforeEach
	void setUp() throws Exception{
		td = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource()
	void assertThatAddPostiveWorks(int a, int b, int expected, boolean expectException) {
		//Given: two numbers
		
		if(!expectException) {
			//when: if the numbers are positive, you add the two numbers together
			//then: return the sum of the two positive numbers
			assertThat(td.addPositive(a, b)).isEqualTo(expected);
		}
		//when: if the numbers are negative or zero, you don't add the numbers
		//then: throw an IllegalArgumentException.
		assertThatThrownBy(() -> td.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
	}

private Stream<Arguments> addPositiveArguments() {
	//formatter:off
	return Stream.of(
			arguments()
	);
	//formatter:on
}
	
}
