package rational;

public class Rational {
	int numerator;
	int denominator;
	Rational add(Rational plusNumber){
		int newDenominator = this.denominator * plusNumber.denominator;
		int newNumerator = this.numerator * plusNumber.denominator + plusNumber.numerator * this.denominator;
		Rational addition = new Rational(newNumerator,newDenominator);
		return addition;
	}
	Rational sub(Rational substraction){
		int newDenominator = this.denominator * substraction.denominator;
		int newNumerator = this.numerator * substraction.denominator - substraction.numerator * this.denominator;
		Rational difference = new Rational(newNumerator,newDenominator);
		return difference;
	}
	Rational mul(Rational multiplier){
		int newDenominator = this.denominator * multiplier.denominator;
		int newNumerator = multiplier.numerator * this.numerator;
		Rational product = new Rational(newNumerator,newDenominator);
		return product;
	}
	Rational div(Rational divisor){
		int newDenominator = this.denominator * divisor.numerator;
		int newNumerator = this.numerator * divisor.denominator;
		Rational quotient = new Rational(newNumerator,newDenominator);
		return quotient;
	}
	void printRational(){
		if (denominator != 1){
			System.out.println(numerator + "/" + denominator);
		}else{
			System.out.println(numerator);
		}
	}
	void printReal(){
		float result = (float)numerator / (float)denominator;
		System.out.println(result);
	}
	Rational(int i, int j){
		numerator = i;
		denominator = j;
		while(true){
			if (i > j){
				int r = i % j;
				if( r != 0){
					i = j;
					j = r;
				}else {
					numerator = numerator / j;
					denominator = denominator / j;
					break;
				}
			}else {
				int r = j % i;
				if (r != 0){
					j = i;
					i = r;
				}else {
					numerator = numerator / i;
					denominator = denominator / i;
					break;
				}
			}
		}
	}
}
