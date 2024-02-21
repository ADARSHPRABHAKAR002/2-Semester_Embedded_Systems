package example;

class BasicCalculator implements Calculator {
    
    int cells[];
    int t;

    private BasicCalculator() {
        cells = new int[2];
    }

    public Calculator clear() {
       	return this;
    }

    public Calculator clearAll() {
    	return this;
    }

    public Calculator put(int n) {
    	return this;
    }

    public int read() {
    	return 0;
    }

    public Calculator neg() {
    	return this;
    }

    public Calculator add() {
    	return this;
    }

    public Calculator sub() {
    	return this;
    }
    
    public Calculator mul() {
    	return this;
    }

    public Calculator div() {
    	return this;
    }

    public static Calculator getInstance() {
        Calculator calc = new BasicCalculator();
        calc.clearAll();

        return calc;
    }
}