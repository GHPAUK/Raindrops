package com.sparta.gh.raindrops;

public class Raindrops {

  public static String raindrops( int n ) {
    String string = String.valueOf( n );

    if ( n % 3 == 0 ) {
      string = "Pling ";
    }

    if ( n % 5 == 0 ) {
        string = "Plang ";
    }

    if ( n % 7 == 0 ) {
        string = "Plong ";
    }

    return string;
  }
}
