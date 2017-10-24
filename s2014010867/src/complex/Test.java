package complex;

public class Test {
	Complex A = new Complex(1,1);
	Complex B = new Complex(3,4);
	Complex addition;
	Complex substraction;
	Test(){
		System.out.println("Complex A =");
		A.print();
		System.out.println("Complex B =");
		B.print();
		Complex addition = A.add(B);
		System.out.println("Complex addition = A + B =");
		addition.print();
		Complex substraction = B.sub(A);
		System.out.println("Complex substraction = B - A =");
		substraction.print();
	}
	public static void main(String[] args){
		Test test = new Test();
	}
}
