/*
 * 功能类(FunctionClass) : 负责类的设计和功能的实现
 * 测试类(Test) : 负责编写测试用例，实例化功能类的对象，并通过该对象调用功能类的函数。
 * main 函数编写在测试类中，功能类没有main函数
 */
package complex;

public class Complex {
	double realPart;
	double imaginaryPart;
	Complex add(Complex plusNumber){
		double r = this.realPart + plusNumber.realPart;
		double i = this.imaginaryPart + plusNumber.imaginaryPart;
		Complex addition = new Complex(r,i);
		return addition;
	}
	Complex sub(Complex substraction){
		double r = this.realPart - substraction.realPart;
		double i = this.imaginaryPart - substraction.imaginaryPart;
		Complex difference = new Complex(r,i);
		return difference;
	}
	void print(){
		System.out.println(realPart + "+" + imaginaryPart + "i");
	}
	Complex(double r, double i){
		realPart = r;
		imaginaryPart = i;
	}
}
