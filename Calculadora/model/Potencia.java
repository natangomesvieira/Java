package model;

public class Potencia implements ICalculadora {

	public Float fazerCalculo( Float a, Float b ) {
		return ( float ) Math.pow( a, b );
	}

}
