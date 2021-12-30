package ru.gb.calculator.data;

import java.math.BigDecimal;

public class NumberLogic implements SymbolLogic{

    private String number;

    public NumberLogic(char ch) {
        number = String.valueOf(ch);
    }

    public void addSymbol(char ch) {
        number = number+ch;
    }

    public void reverse(char ch) {
        number="-"+number;
    }

    public BigDecimal getNumber(){
        return new BigDecimal(number);
    }

    @Override
    public String toString() {
        return number;
    }
}
