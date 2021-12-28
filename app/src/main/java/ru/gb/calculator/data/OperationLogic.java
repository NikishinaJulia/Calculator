package ru.gb.calculator.data;

public class OperationLogic implements SymbolLogic{

    private final char operator;

    public OperationLogic(char ch) {
        this.operator = ch;
    }

    public char getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return operator+"";
    }
}
