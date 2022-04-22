package calculator_01;

public class calculator {
	
	public static void main(String[] args) {
		double x, y, sum, dif, mul, div;
		System.out.print("Калькулятор \n");
		x = readFromConsole.firstD(args);
		y = readFromConsole.secondD(args);
		sum = calcSum.main(x, y);
		dif = calcDif.main(x, y);
		mul = calcMul.main(x, y);
		div = calcDiv.main(x, y);
		printResult.main(x, y, sum, dif, mul, div);
	}

}
