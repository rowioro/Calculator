package calculator;

import java.util.ArrayList;
import java.util.Scanner;

class Rechner {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Double> zahlList = new ArrayList<Double>();
	ArrayList<String> operatorList = new ArrayList<String>();
	
	void eingabeZahl() {
		
		System.out.print("Gib eine Zahl: ");
		double zahl = scanner.nextDouble();
		zahlList.add(zahl);
	}
	
	boolean eingabeOperator() {
		
		boolean finisch = false;
		System.out.print("Gib ein operator (+, -, *, :, =) ein: ");
		String operator = scanner.next();
		operatorList.add(operator);
		if (operator.equals("=")) {
			finisch = rechnen();
		}
		return finisch;
	}
	
	boolean rechnen() {
	
		Double [] zahlen = zahlList.toArray(new Double[0]);
//		System.out.println(Arrays.toString(zahlen));
		String [] operators = operatorList.toArray(new String[0]);
//		System.out.println(Arrays.toString(operators));
	
		Double ergebnis = zahlen[0];
		int j = 0;
		for (int i = 1; i < zahlen.length; i++) {
			if (operators[j].equals("+")){
				ergebnis += zahlen[i];
			}
			if (operators[j].equals("-")) {
				ergebnis -= zahlen[i];
			}
			if (operators[j].equals("*")) {
				ergebnis *= zahlen[i];
			}
			if (operators[j].equals(":")) {
				if (zahlen[i] !=  0)
				ergebnis /= zahlen[i];
				else {
					System.out.println("Wir teilen nicht durch 0!");
					return true;
				}
			}
			j++;
		}
		System.out.println("Der Rechner hat gerechnet: " + ergebnis);
		return true;
	}
}
