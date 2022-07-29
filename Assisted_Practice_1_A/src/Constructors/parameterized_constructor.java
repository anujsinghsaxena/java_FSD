package Constructors;

class parameterized_constructor {
	  String languages;
	  parameterized_constructor(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }
	  public static void main(String[] args) {
		  parameterized_constructor obj1 = new parameterized_constructor("Java");
		  parameterized_constructor obj2 = new parameterized_constructor("Python");
		  parameterized_constructor obj3 = new parameterized_constructor("C");
	  }
	}