public class OperationsTest {
    public void pruebaCrearFormula(){
        String formula = Operations.MakeFormula();
        assertNotNull(formula, "La formula no debe ser nula.");
        assertTrue(formula.matches("\\d+([+\\-*/]\\d+)*"), "La formula debe coincidir con el patron de una expresion matematica valida.");
    }
    
    public void pruebaResolverSuma(){
        String formula = "3+5";
        String resultado = Operations.Solve(formula);
        assertEquals("3+5=8", resultado, "El resultado de 3+5 debe ser 8.");
    }
}
