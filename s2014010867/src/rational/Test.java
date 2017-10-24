package rational;

public class Test {
	Rational A = new Rational(3,4);
	Rational B = new Rational(2,5);
	Rational addition;
	Rational substraction;
	Rational product;
	Rational quotient;
	Test(){
		System.out.println("Rational A =");
		A.printRational();
		A.printReal();
		
		System.out.println("Rational B =");
		B.printRational();
		B.printReal();
		
		Rational addition = A.add(B);
		System.out.println("Rational addition = A + B =");
		addition.printRational();
		addition.printReal();
		
		Rational substraction = A.sub(B);
		System.out.println("Rational substraction = A - B =");
		substraction.printRational();
		substraction.printReal();
		
		Rational product = A.mul(B);
		System.out.println("Rational product = A * B =");
		product.printRational();
		product.printReal();
		
		Rational quotient = A.div(B);
		System.out.println("Rational quotient = A / B =");
		quotient.printRational();
		quotient.printReal();	
	}
	public static void main(String[] args){
		Test test = new Test();
	}
}
