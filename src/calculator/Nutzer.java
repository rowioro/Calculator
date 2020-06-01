package calculator;

public class Nutzer {

	public static void main(String[] args) {
		
		Rechner r = new Rechner();
		
		for (;;) {
		r.eingabeZahl();
			if (r.eingabeOperator() == true) {
			r.zahlList.clear();
			r.operatorList.clear();
			}
		}
	}
}
