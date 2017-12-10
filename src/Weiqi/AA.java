
class AAA {
private static int count=0;
public AAA(){System.out.print('a');}
public AAA(int r){System.out.print('k');}
public void AAA() {System.out.println('b');}
public String toString() {return "c";}
public void f() {
	System.out.println('d');
}
public static int getcount() {
	return count;
}
public void finalize() {
	System.out.println('e');
}

}
class BB extends AAA{
	public BB(){System.out.print('f');}
	public BB(int r) {this();System.out.println('g');System.out.println(getcount());}
	public void BB() {System.out.print('h');super.AAA();}
}

public class AA{
	public static void f() {
		BB b1=new BB(3);
		
		AAA a1=new AAA();
		System.out.println("-"+a1+"-");}
	public static void main(String args[]){
		
	System.out.println(AAA.getcount());
	f();
	System.out.println(AAA.getcount());
	System.gc();}
}