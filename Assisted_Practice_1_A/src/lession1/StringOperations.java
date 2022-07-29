package lession1;

public class StringOperations {

	public static void main(String[] args) {
		String string_var1 = "String functions peogram";
		String string_var2 = "string functions";
		System.out.println("String Operations are: ");
		System.out.println(string_var1.charAt(2));
		System.out.println(string_var1.codePointAt(3));
		System.out.println(string_var1.codePointBefore(1));
		System.out.println(string_var1.codePointCount(0, 5));
		System.out.println("\nString comparsion function");
		System.out.println(string_var1.compareTo(string_var2));
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		System.out.println("\nString Concatenate");
		System.out.println(string_var1.concat(string_var2));
		System.out.println(string_var1.endsWith("gram"));
		System.out.println(string_var1.contains(string_var2));
		System.out.println(string_var1.equals(string_var2));
		System.out.println(string_var1.equalsIgnoreCase(string_var2));
		System.out.println(string_var1.hashCode());
		System.out.println(string_var1.indexOf("program"));
		String string_var3 = "demo";
		System.out.println(string_var3.isEmpty());
		string_var3 = "functions program functions";
		System.out.println("\nLast occurrence position");
		System.out.println(string_var3.lastIndexOf("functions"));
		System.out.println(string_var1.length());
		System.out.println(string_var3.replace("functions", "java"));
		System.out.println(string_var3);
		System.out.println(string_var1.startsWith("string"));
		string_var1 = "HELLO WORLD";
		System.out.println(string_var1.toLowerCase());
		System.out.println(string_var1.toUpperCase());
		String string_var4 = "    Hello World   ";
		System.out.println(string_var4.trim());
		

	}

}
