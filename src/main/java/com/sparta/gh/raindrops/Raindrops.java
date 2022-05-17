package com.sparta.gh.raindrops;

public class Raindrops {

  public static String raindrops( int n ) {
    String string = String.valueOf( n );

    if ( n % 3 == 0 ) {
      string = "Pling ";
    }

    if ( n % 5 == 0 ) {
      if ( string.contains( "Pling " ) ) {
        string = string + "Plang ";
      } else {
        string = "Plang ";
      }
    }

    if ( n % 7 == 0 ) {
      if ( string.contains( "Pling Plang " ) || string.contains( "Pling " ) || string.contains( "Plang " ) ) {
        string = string + "Plong ";
      } else {
        string = "Plong ";
      }
    }

    return string;
  }
}
