# Caculadora-Java-Swing

CODIGO DE XML 


   <dependencies>
        <dependency>
            <groupId>net.objecthunter</groupId>
            <artifactId>exp4j</artifactId>
            <version>0.4.8</version>
        </dependency>

    </dependencies>


CODIDO DE EJEMPLO PARA USAR LA LIBRERIA EXP4J


import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculadora {

    public static void main(String[] args) {
        // Expresión matemática
        String expresion = "3*8/2+100^3";

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
