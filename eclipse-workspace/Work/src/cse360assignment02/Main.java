package cse360assignment02;

public class Main {

	public static void main(String[] args)
	  {
	    AddingMachine machine = new AddingMachine();
	    
	    machine.add(7);
	    machine.subtract(3);
	    int total = machine.getTotal();
	    System.out.println(total);
	    String ender = machine.toString();
	    System.out.println(ender);
	  }
}