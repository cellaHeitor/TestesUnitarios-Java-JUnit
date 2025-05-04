import org.example.ScientificCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    private ScientificCalculator calculator; // Variável para a calculadora

    // Setup: Cria uma instância da calculadora antes de cada teste
    @BeforeEach
    public void setup() {
        calculator = new ScientificCalculator(); // Inicializa o objeto antes de cada teste
    }

    // ==========================================
    // Testes de Operações Básicas (Adição, Subtração, Multiplicação, Divisão)
    // ==========================================

    @Test
    public void testAddition() {
        double result = calculator.add(5.5, 4.5); // Chama o método add
        assertEquals(10.0, result, 0.0001, "A soma de 5.5 + 4.5 deve resultar em 10.0");
    }

    @Test
    public void testSubtraction() {
        double result = calculator.subtract(10.0, 5.0); // Chama o método subtract
        assertEquals(5.0, result, 0.0001, "A subtração de 10.0 - 5.0 deve resultar em 5.0");
    }

    @Test
    public void testMultiplication() {
        double result = calculator.multiply(2.0, 3.0); // Chama o método multiply
        assertEquals(6.0, result, 0.0001, "A multiplicação de 2.0 * 3.0 deve resultar em 6.0");
    }

    @Test
    public void testDivision() {
        double result = calculator.divide(10.0, 2.0); // Chama o método divide
        assertEquals(5.0, result, 0.0001, "A divisão de 10.0 / 2.0 deve resultar em 5.0");
    }

    // ==========================================
    // Testes de Funções Matemáticas (Raiz Quadrada)
    // ==========================================

    @Test
    public void testSquareRootPositive() {
        double input = 25.0; // Número positivo para calcular a raiz quadrada
        double expectedResult = 5.0; // Resultado esperado da raiz quadrada de 25

        // Execução: Chama o método squareRoot
        double result = calculator.squareRoot(input);

        // Asserção: Verifica se o resultado está correto
        assertEquals(expectedResult, result, 0.0001, "A raiz quadrada de 25 deve ser 5.0");
    }

    @Test
    public void testSquareRootOfOne() {
        double input = 1.0;
        double expectedResult = 1.0;
        double result = calculator.squareRoot(input);
        assertEquals(expectedResult, result, 0.0001, "A raiz quadrada de 1 deve ser 1.0");
    }

    @Test
    public void testSquareRootNegative() {
        double input = -1.0; // Número negativo para testar a exceção

        // Espera que o método squareRoot lance uma IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(input); // Chama o método squareRoot com um número negativo
        }, "Deveria lançar uma IllegalArgumentException para números negativos");
    }

    // ==========================================
    // Testes de Exceções
    // ==========================================

    @Test
    public void testDivideByZero() {
        double numerator = 10.0;
        double denominator = 0.0;

        // Espera que o método divide lance uma IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(numerator, denominator); // Chama o método divide com o denominador 0
        }, "Deveria lançar uma IllegalArgumentException ao dividir por zero");
    }

    // ==========================================
    // Testes de Funções Trigonométricas
    // ==========================================

    @Test
    public void testSin() {
        double result = calculator.sin(0);
        assertEquals(0.0, result, 0.0001, "O seno de 0 graus deve ser 0.0");
    }

    @Test
    public void testCos() {
        double result = calculator.cos(90);
        assertEquals(0.0, result, 0.0001, "O cosseno de 90 graus deve ser 0.0");
    }
}
