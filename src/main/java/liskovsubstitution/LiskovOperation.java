package liskovsubstitution;

// Base class
abstract class LiskovOperation {

    protected double operator1;
    protected double operator2;

    public void setOperator1(double operator1) {
        this.operator1 = operator1;
    }

    public void setOperator2(double operator2) {
        this.operator2 = operator2;
    }

    public abstract double calcular();
}

class SumOperation extends LiskovOperation {

    @Override
    public double calcular() {
        double result = this.operator1 + this.operator2;
        return result;
    }
}

class MultOperation extends LiskovOperation {

    @Override
    public double calcular() {
        double result = this.operator1 * this.operator2;
        return result;
    }
}

class Calculator {
    public double calcular(LiskovOperation operation) {
        return operation.calcular();
    }
}


