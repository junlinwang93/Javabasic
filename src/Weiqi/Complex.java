/**
 * 
 * @author Junlin Wang
 *
 */
public class Complex {

private double real,imag;
	public  Complex(double r,double i) {
		real=r; imag=i;
	}
	public String toString() {
		return "("+real+","+imag+")";
	}
	public Complex add(Complex a) {
		return new Complex(real+a.real,imag+a.imag);
	}
	public Complex mult(Complex x) {
		return new Complex(real*x.real-imag*x.imag,real*x.imag+x.real*imag);
	}
	public Complex sub(Complex a) {
		return new Complex(real-a.real,imag-a.imag);
	}
	public Complex neg() {
		return new Complex(-real,-imag);
	}
	public Complex conj() {
		return new Complex(real,-imag);
	}
	public static void main(String[] args) {
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(1.5,2);
		Complex c3 = c1.add(c2);                                                   
		Complex c4 = c1.mult(c2);
		Complex c5 = c1.sub(c2);
		Complex c6 = c1.neg(); // -c1
		Complex c7 = c1.conj();
		System.out.println(c1); // 1+2i  (1,2)  choose one representation
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
	}
}
