/*
 * 创建一个大整数类HugeInteger，该类用一个40个元素的数组来存放一个大整数（最多不超过40位）。
 * 构造函数原型：
 * HugeInteger(String);
 * （1）定义几个大整数算术运算的成员函数，包括inputHugeInteger、outputHugeInteger、addHugeInteger和subHugeInteger
 * 函数原型为 HugeInteger operation(HugeInteger)
 * inputHugeInteger的函数原型为 void inputHugeInteger(String) 功能是改变大数的值为String的值。
 * outputHugeInteger的函数原型为void outputHugeInteger()  功能是将大数输出,即打印到屏幕上。
 * （2）定义几个大整数关系运算的成员函数，包括isEqualTo、isNotEqualTo、isGreaterThan、isLessThan、isGreaterThanOrEqualTo和isLessThanOrEqualTo。每个函数的返回值为布尔类型。
 * 函数原型为 boolean operation(HugeInteger)
 * 注意:  
 * 1.	大数运算需要考虑到正负，使用单独的变量存储符号位。
 * 2.	大数的输入: 正数形式为”12345”，负数形式为”-123456”
 * 3.	如果运算溢出，截取低40位结果。
 */
package hugeInteger;

public class Test {
	public static void main(String[] args){
//		String a = "-1234567890123456789012345678901234567890";
//		String b = "9876543210987654321098765432109876543210";
		String a = "-122";
		String b = "478";
		HugeInteger A=new HugeInteger(a);
		HugeInteger B=new HugeInteger(b);
		System.out.println("HugeInteger A:");
		A.outputHugeInteger();
		System.out.println("HugeInteger B:");
		B.outputHugeInteger();
		System.out.println("A is equal to B:");
		System.out.println(A.isEqualTo(B));
		System.out.println("A is not equal to B:");
		System.out.println(A.isNotEqualTo(B));
		System.out.println("A is greater than B:");
		System.out.println(A.isGreaterThan(B));
		System.out.println("A is less than B:");
		System.out.println(A.isLessThan(B));
		System.out.println("A is greater than or equal to B:");
		System.out.println(A.isGreaterThanOrEqualTo(B));
		System.out.println("A is less than or equal to B:");
		System.out.println(A.isLessThanOrEqualTo(B));
		System.out.println("A + B = ");
		A.addHugeInteger(B);
//		A.outputHugeInteger();
//		B.outputHugeInteger();
		System.out.println("A - B = ");
//		A.outputHugeInteger();
//		B.outputHugeInteger();
		A.subHugeInteger(B);
	}
}
