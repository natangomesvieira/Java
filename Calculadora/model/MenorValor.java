package model;

public class MenorValor implements ICalculadora {

	public Float fazerCalculo( Float a, Float b ) {

		return Math.min( a, b );
	}

}
