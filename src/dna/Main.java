package dna;

public class Main {
	  
	  public static void main(String[] args) {
	             
	    String dna1 = "ATGCGATACGCTTGA";
	    String dna2 = "ATGCGATACGTGA";
	    String dna3 = "ATTAATATGTACTGA";
	    String dna = dna3;

	    int length = dna.length();
	    System.out.println(length + " length");

	    int start = dna.indexOf("ATG"); 
	    System.out.println(start);

	    int stop = dna.indexOf("TGA");
	    System.out.println(stop);

	    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
	      System.out.println("Conditions are satisfied");
	      String protein = dna.substring(start, stop+3);
	      System.out.println("Protein: " + protein);
	    } else {
	      System.out.println("No protein");
	    }


	  }
	  
	}