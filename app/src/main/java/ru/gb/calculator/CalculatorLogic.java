package ru.gb.calculator;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;

import ru.gb.calculator.data.NumberLogic;
import ru.gb.calculator.data.OperationLogic;
import ru.gb.calculator.data.SymbolLogic;

public class CalculatorLogic implements Serializable {

    private String str = "";
    private LinkedList<SymbolLogic> listOperation = new LinkedList<>();

    public String getCurrentText() {
        if(!listOperation.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (SymbolLogic logic : listOperation) {
                stringBuilder.append(logic.toString());
            }
            return stringBuilder.toString();
        }else {
            return str;
        }
    }

    public String addSymbol(char ch) {
        str = "";
        SymbolLogic symbolLogic = listOperation.peekLast();
        switch (ch){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                if(symbolLogic instanceof NumberLogic){
                    ((NumberLogic)symbolLogic).addSymbol(ch);
                }else {
                    listOperation.addLast(new NumberLogic(ch));
                }
                break;
            case '+':
            case '-':
            case '*':
            case '/':
                if(symbolLogic instanceof NumberLogic){
                    listOperation.addLast(new OperationLogic(ch));
                }
                break;
            case 'C':
                str="";
                listOperation.clear();
                break;
            case '.':
                if(symbolLogic instanceof NumberLogic){
                    ((NumberLogic)symbolLogic).addSymbol(ch);
                }
                break;
            case '|':
                if(symbolLogic instanceof NumberLogic){
                    ((NumberLogic)symbolLogic).reverse(ch);
                }
                break;
            case '=':
                if(symbolLogic instanceof NumberLogic){
                    str = calculate(listOperation);
                    listOperation.clear();
                }
                break;
        }
        return getCurrentText();
    }

    private String calculate(LinkedList<SymbolLogic> listOperation) {
        BigDecimal left = null;
        char operation = '\u0000';
        for (SymbolLogic logic: listOperation) {
           if(logic instanceof NumberLogic){
               if (left == null) {
                   left = ((NumberLogic) logic).getNumber();
               }else {
                   switch (operation){
                       case '+':
                            left = left.add(((NumberLogic) logic).getNumber());
                            break;
                       case '-':
                           left = left.subtract(((NumberLogic) logic).getNumber());
                           break;
                       case '*':
                           left = left.multiply(((NumberLogic) logic).getNumber());
                           break;
                       case '/':
                           left = left.divide(((NumberLogic) logic).getNumber());
                           break;
                   }
                   operation = '\u0000';
               }
           }else{
               operation =((OperationLogic) logic).getOperator();
           }
        }
        return left.toPlainString();
    }
}
