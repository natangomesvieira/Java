package model;

public class MaiorValor implements ICalculadora {

	public Float fazerCalculo( Float a, Float b ) {
		return Math.max( a, b );
	}

}
