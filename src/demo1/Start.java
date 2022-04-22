package demo1;

public class Start {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World!!!");
		Second.method();  //добавим метод из другого файла
		
		//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
		double a, b; // два катета
		double c = 0; // гипотенуза
		double p; // периметр
		double s; // площадь
		a = 10;
		b = 20;
		c = Math.sqrt(a * a + b * b);
		p = a + b + c;
		s = 0.5 * a * b;
		System.out.println("Вычислить периметр и площадь прямоугольного треугольника");
		System.out.println("Периметр = " + p + " площадь = " + s);
		
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		double x = 0, y = 0, z;
		x = 10.2;
		y = 13.6;
		double temp;
		temp = Math.cos(x) - x / 3;
		if (temp != 0) {
		z = x * Math.log(x) + y / temp;
		} else {
		System.out.println("Знаменатель равен нулю.");
		z = Double.NaN;
		}
		System.out.println("Вычислить значение выражения по формуле");
		System.out.println("z=" + z);
				
	}
	
}
