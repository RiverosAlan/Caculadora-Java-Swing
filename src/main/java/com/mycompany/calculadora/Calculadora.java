package com.mycompany.calculadora;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculadora {

    public static void main(String[] args) {
        // Expresión matemática
        String expresion = "sqrt(25)";

        try {
            // Crear un objeto ExpressionBuilder y compilar la expresión
            Expression expression = new ExpressionBuilder(expresion).build();

            // Evaluar la expresión
            double result = expression.evaluate();

            // Imprimir el resultado
            System.out.println("Resultado: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
