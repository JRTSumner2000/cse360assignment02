package cse360assignment02;

/*
    This class is an adding machine that takes inputs and then computes a total. This also creates a toString to take
    in print all the commands and an int to hold the total.
*/
public class AddingMachine {
  private int total;
  private String toString;
  /*
    This method declares the total to be zero and declares toString to be a string with zero in it.
  */
  public AddingMachine () { // Initializes the adding machine
    total = 0;  // not needed - included for clarity
    toString = "0";
  }

  /*
    This method returns the total when called
  */
  public int getTotal () { // Retrieves the total
    return total;
  }

  /*
    This method takes a value as a parameter and then adds it to the total. Additionally, this method adds to the
    toString a plus sign and a value
  */
  public void add (int value) { // Adds value to the total
    toString = toString + " + " + value;
    total += value;
  }

  /*
    This method takes a value as a parameter and then subtracts it from the total. Additionally, this method adds to
    the toString a minus sign and the value
  */
  public void subtract (int value) { // Subtracts value from total
    toString = toString + " - " + value;
    total -= value;
  }

  /*
    This method prints out the toString which has been compiling all of the operations performed
  */
  public String toString () { // Prints the total
    return toString;
  }

  /*
      This method clears the total and the toString returning them both to 0
  */
  public void clear() { // Clears total
    total = 0;
    toString = "0";
  }
}