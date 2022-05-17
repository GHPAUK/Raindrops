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

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 9, 12})
  void returnPlingFactorOfThreeOnly(int test){
    // Given
    String expected = "Pling ";
    // When
    String result = Raindrops.raindrops( test );
    // Then
    Assertions.assertEquals( expected, result );
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 20, 25})
  void returnPlangFactorOfFiveOnly(int test){
    // Given
    String expected = "Plang ";
    // When
    String result = Raindrops.raindrops( test );
    // Then
    Assertions.assertEquals( expected, result );
  }

  @ParameterizedTest
  @ValueSource(ints = {7, 14, 28, 49})
  void returnPlongFactorOfSevenOnly(int test){
    // Given
    String expected = "Plong ";
    // When
    String result = Raindrops.raindrops( test );
    // Then
    Assertions.assertEquals( expected, result );
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 30, 45, 60})
  void returnPlingPlangFactorsOfThreeAndFive(int test){
    // Given
    String expected = "Pling Plang ";
    // When
    String result = Raindrops.raindrops( test );
    // Then
    Assertions.assertEquals( expected, result );
  }

  @ParameterizedTest
  @ValueSource(ints = {21, 42, 63, 84})
  void returnPlingPlongFactorsOfSThreeAndSeven(int test){
    // Given
    String expected = "Pling Plong ";
    // When
    String result = Raindrops.raindrops( test );
    // Then
    Assertions.assertEquals( expected, result );
  }
  @ParameterizedTest
  @ValueSource(ints = {35, 70, 140, 280})
  void returnPlangPlongFactorsOfFiveAndSeven(int test){
    // Given
    String expected = "Plang Plong ";
    // When
    String result = Raindrops.raindrops( test );
    // Then
    Assertions.assertEquals( expected, result );
  }

  @ParameterizedTest
  @ValueSource(ints = {105, 210, 420, 840})
  void returnPlingPlangPlongFactorsOfThreeAndFiveAndSeven(int test){
    // Given
    String expected = "Pling Plang Plong ";
    // When
    String result = Raindrops.raindrops( test );
    // Then
    Assertions.assertEquals( expected, result );
  }

}