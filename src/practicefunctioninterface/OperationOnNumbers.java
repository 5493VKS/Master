package practicefunctioninterface;

@FunctionalInterface
interface AddOperation{
	public void sum(int a, int b);
}
@FunctionalInterface
interface MultiplyOperation{
	public int mul(int a, int b);
}
public class OperationOnNumbers {

	public static void main(String[] args) {

		System.out.println("Add the numbers");
		AddOperation add = (a,b)->{
			int sum = a+b;
			System.out.println("Add two number: "+sum);
		};
		add.sum(10, 20);
		
		System.out.println("Multply the number");
		MultiplyOperation mul = (a,b)-> a*b;
		
		System.out.println("Multiply two number: "+mul.mul(10, 20));

	}

}
