package model;

public class Valores {

	private Float valorA;
	private Float valorB;
	private ICalculadora calculadora;

	public Valores( Float valorA, Float valorB, ICalculadora calculadora ) {
		this.valorA = valorA;
		this.valorB = valorB;
		this.calculadora = calculadora;
	}

	public Float getValorA() {
		return valorA;
	}

	public void setValorA( Float valorA ) {
		this.valorA = valorA;
	}

	public Float getValorB() {
		return valorB;
	}

	public void setValorB( Float valorB ) {
		this.valorB = valorB;
	}

	public Float calcular( Float valorA, Float valorB ) {
		return this.calculadora.fazerCalculo( valorA, valorB );
	}

}
