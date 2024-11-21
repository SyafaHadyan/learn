package syafa.java.adventofcode.adventofcode2017.Day08;

import java.util.function.BiFunction;

public enum ArithmeticOperator implements BiFunction<Integer,Integer,Integer>
{
    PLUS("+",(a,b) -> a + b),
    MINUS("-",(a,b) -> a - b),
    MULTIPLY("*",(a,b) -> a * b),
    DIVIDE("/",(a,b) -> a / b);
    private final String symbol;
    private final BiFunction<Integer,Integer,Integer> operation;
    ArithmeticOperator(String symbol,BiFunction<Integer,Integer,Integer> operation)
    {
        this.symbol = symbol;
        this.operation = operation;
    }
    public Integer apply (Integer a,Integer b)
    {
        return operation.apply(a,b);
    }
    public String toString()
    {
        return symbol;
    }
}