
public class MathSingleton {
	private static MathSingleton mathinstance;
	private int variable1;
	private int variable12;
	
	public static MathSingleton getMathinstance() {
		if(mathinstance == null) {
			mathinstance = new MathSingleton();
		}
		return mathinstance;
	}

	public class MathUnits{
		private int variable1;
		private int variable12;
		
		public int add() {
			return this.variable1 + this.variable12;
		}
		
		public int multiply() {
			return this.variable1 * this.variable12;
		}
		
		public int divide() {
			return this.variable1 / this.variable12;
		}
	}
	
	public String add(int i, int j) {
		return null;
	}
	
	public int getVariable1() {
		return variable1;
	}
	
	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}
	public int getVariable2() {
		return variable12;
	}
	
	public void setVariable2(int variable2) {
		this.variable12 = variable2;
	}
	
	public char[] add() {
		return null;
	}
}
