package fixtures;

public class Calculator {
    private final production.Calculator calculator = new production.Calculator();
    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber){
        this.secondNumber = secondNumber;
    }

    public int resultOfAddition(){
        return calculator.add(firstNumber, secondNumber);
    }

    public int resultOfMultiplication(){
        return calculator.multiply(firstNumber, secondNumber);
    }
}
