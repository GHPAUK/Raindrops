package com.sparta.gh.raindrops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RaindropsTest {

  @ParameterizedTest
  @ValueSource(ints = {1, 4, 8, 11})
  void returnDigitsOfNumberNoFactorRelation(int test){
    // Given
    String expected = String.valueOf( test );
    // When
    String result = Raindrops.raindrops(test);
    // Then
    Assertions.assertEquals( expected, result );
  }

  
}