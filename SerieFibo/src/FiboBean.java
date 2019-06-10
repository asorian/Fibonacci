
public class FiboBean implements Fibo {

	public FiboBean() {
		super();
	}

	public int fibonacci(int n) throws NotNaturalException {

		if (n > 1) {
			return fibonacci(n - 1) + fibonacci(n - 2);
		} else if (n == 1) {
			return 1;
		} else if (n == 0) {
			return 0;
		}
		throw new NotNaturalException("El número introducido es menor de cero");
	}
}