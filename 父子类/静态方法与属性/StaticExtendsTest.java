
public class StaticExtendsTest{
 
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.nonStaticStr);
		System.out.println(c.staticStr);
		c.staticMethod();//输出的结果都是父类中的非静态属性、静态属性和静态方法,推出静态属性和静态方法可以被继承
		
		System.out.println("-------------------------------");
		
		A c1 = new C();
		System.out.println(c1.nonStaticStr);
		System.out.println(c1.staticStr);
		c1.staticMethod();//结果同上，输出的结果都是父类中的非静态属性、静态属性和静态方法,推出静态属性和静态方法可以被继承
	
		System.out.println("-------------------------------");
		B b = new B();
		System.out.println(b.nonStaticStr);
		System.out.println(b.staticStr);
		System.out.println(b.newStr);
		b.staticMethod();
		
		System.out.println("-------------------------------");
		A b1 = new B();
		System.out.println(b1.nonStaticStr);
		System.out.println(b1.staticStr);
		//System.out.println(b1.newStr);
		b1.staticMethod();//结果都是父类的静态方法，说明静态方法不可以被重写，不能实现多态
	}
 
}
class A { //父类
	public static String staticStr = "A静态属性";
	public String nonStaticStr = "A非静态属性";
	public static void staticMethod(){
		System.out.println("A静态方法");
	}
	public void nonStaticMethod(){
		System.out.println("A非静态方法");
	}
}
class B extends A{//子类B
	public static String staticStr = "B改写后的静态属性";
	public String nonStaticStr = "B改写后的非静态属性";
	public String newStr="B新的属性";
	public static void staticMethod(){
		System.out.println("B改写后的静态方法");
	}
}
class C extends A{//子类C继承A中的所有属性和方法

}
