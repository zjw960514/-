package com.situ.cashmachine;


public class Input {
	int options ;
	int inputNumber;
	double sum;
	
	/**
	 * @param sum the sum to set
	 */
	public void setSum(double sum) {
		this.sum = sum;
	}

	protected double QuKuan(int quKuanShu) {
		// TODO Auto-generated method stub
		return sum - quKuanShu;
	}
	
	protected double CunKuan(int cunKuanShu) {
		// TODO Auto-generated method stub
		return sum += sum + cunKuanShu ;
	}
	/**
	 * @return the options
	 */
	public int getOptions() {
		return options;
	}
	/**
	 * @return the sum
	 */
	public double getSum() {
		return sum;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(int options) {
		this.options = options;
	}
	/**
	 * @return the inputNumber
	 */
	public int getInputNumber() {
		return inputNumber;
	}
	/**
	 * @param inputNumber the inputNumber to set
	 */
	public void setInputNumber(int inputNumber) {
		this.inputNumber = inputNumber;
	}
	public Input(int options, int inputNumber) {
		super();
		this.options = options;
		this.inputNumber = inputNumber;
	}
	public Input() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Input [options=" + options + ", inputNumber=" + inputNumber + ", sum=" + sum + "]";
	}
	
}
