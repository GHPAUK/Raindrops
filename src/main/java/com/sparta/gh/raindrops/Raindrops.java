package com.sparta.gh.raindrops;

public class Raindrops {
// Static function to evaluate the correct response based on the input given
  public static String raindrops( int n ) {
    // Instantiate a variable with the string representation of the integer value passed as an argument
    String string = String.valueOf( n );

    // If 'n' divided by three equals zero then 'n' is a multiple of three and earns the 'Pling' response
    if ( n % 3 == 0 ) {
      string = "Pling ";
    }

    // If 'n' divided by five equals zero then 'n' is a multiple of five and earns the 'Plang' response
    if ( n % 5 == 0 ) {
      // Checks if 'n' has already earned the previous tag, if so it appends the next tag 'Plang'
      if ( string.contains( "Pling " ) ) {
        string = string + "Plang ";
      } else {
        string = "Plang ";
      }
    }

    // If 'n' divided by seven equals zero then 'n' is a multiple of seven and earns the 'Plong' response
    if ( n % 7 == 0 ) {
      // Checks if 'n' has already earned any of the previous tags, if so it appends the next tag 'Plong'
      if ( string.contains( "Pling Plang " ) || string.contains( "Pling " ) || string.contains( "Plang " ) ) {
        string = string + "Plong ";
      } else {
        string = "Plong ";
      }
    }

    return string;
  }
}
