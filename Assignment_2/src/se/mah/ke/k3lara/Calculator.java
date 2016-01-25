package se.mah.ke.k3lara;

public class Calculator {
	private String operator;
	private int result;
	private int operand;
	
	public Calculator() {
		this.operator = "";
		this.result = 0;
		this.operand = 0;
	}
	
	/** returns the operator */
	public String getOperator(){
		return this.operator;
	}
	
	/**returns result*/
	public int getResult(){
		return this.result;
	}
	
	public int getOperand(){
		return this.operand;	
	}
	
	 
	public void numberButtonPressed(int number){
	  this.operand = this.operand*10 + number;
	}
	
	/**clears all including operand and result*/
	public void clear(){
		this.operator = "";
		this.result = 0;
		this.operand = 0;
	}
	
	public void plus(){
	   this.result = this.operand;
	   this.operand = 0;
	   this.operator = "+";
	}
	
	public void minus(){
		result = operand;
		operand = 0;
		operator = "-";
	}
	
	public void mult(){
		result = operand;
		operand = 0;
		operator = "*";
	}
	
	public void equals(){
		if (operator.equals("*")){
			result= result * operand;
		}else if(operator.equals("-")){
			result= result - operand;
		}else if(operator.equals("+")){
			result= result + operand;
		}
		operand = 0;
	}
}

