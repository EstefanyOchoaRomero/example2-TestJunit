package org.factoriaestefany.example2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class Example2Test {
    @Test
    public void testSumar() {
        Example2 example2 =  new Example2();
        // Given - Teniendo
        int num1 = 35; // parametros
        int num2 = 79;

        // When - Cuando
        int result = example2.sumar(num1, num2);

        // Then - Entonces
        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }


    @Test
    public void givenNumeroPositivo_whenCheckPositivo_thenRetornaTrue() {

        Example2 example2 = new Example2();
        // Given
        int numeroPositivo = 5;

        // When
        boolean resultado = example2.checkPositivo(numeroPositivo);

        // Then
        assertTrue(resultado, "El método debería retornar true para el positivo.");
    }

    @Test
    public void givenNumeroCero_whenCheckPositivo_thenRetornaTrue() {
        Example2 example2 = new Example2();
        // Given
        int numeroCero = 0;

        // When
        boolean resultado = example2.checkPositivo(numeroCero);

        // Then
        assertTrue(resultado, "El método debería retornar true para el cero.");
    }

    @Test
    public void givenNumeroNegativo_whenCheckPositivo_thenLanzaExcepcion() {
        Example2 example2 = new Example2();
        // Given
        int numeroNegativo = -1;

        // When & Then
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            example2.checkPositivo(numeroNegativo);
        });

        // Verifica el mensaje de la excepción
        assertEquals("El número no puede ser negativo", thrown.getMessage());
    }

    @Test
    public void givenCadenaWithA_whenContarLetrasA_thenReturnCorrectCount() {
        // Given
        Example2 example2 = new Example2();
        String cadena = "banana";

        // When
        int result = example2.contarLetrasA(cadena);

        // Then
        assertEquals(3, result, "El método debería retornar 3 porque hay tres 'a' en la cadena 'banana'.");
    }

    @Test
    public void givenCadenaWithoutA_whenContarLetrasA_thenReturnZero() {
        // Given
        Example2 example2 = new Example2();
        String cadena = "hello";

        // When
        int result = example2.contarLetrasA(cadena);

        // Then
        assertEquals(0, result, "El método debería retornar 0 porque no hay 'a' en la cadena 'hello'.");
    }

    @Test
    public void givenEmptyString_whenContarLetrasA_thenReturnZero() {
        // Given
        Example2 example2 = new Example2();
        String cadena = "";

        // When
        int result = example2.contarLetrasA(cadena);

        // Then
        assertEquals(0, result, "El método debería retornar 0 para una cadena vacía.");
    }

    @Test
    public void givenNullString_whenContarLetrasA_thenThrowException() {
        // Given
        Example2 example2 = new Example2();
        String cadena = null;

        // When & Then
        assertThrows(NullPointerException.class, () -> example2.contarLetrasA(cadena),"El método debería lanzar una NullPointerException si la cadena es null.");
    }
    @Test
    public void givenListContainsElement_whenContieneElemento_thenReturnTrue() {
        // Given
        Example2 example2 = new Example2();
        List<String> lista = Arrays.asList("apple", "banana", "cherry");
        String elemento = "banana";

        // When
        boolean result = example2.contieneElemento(lista, elemento);

        // Then
        assertTrue(result, "El método debería retornar true porque 'banana' está en la lista.");
    }

    @Test
    public void givenListDoesNotContainElement_whenContieneElemento_thenReturnFalse() {
        // Given
        Example2 example2 = new Example2();
        List<String> lista = Arrays.asList("apple", "banana", "cherry");
        String elemento = "orange";

        // When
        boolean result = example2.contieneElemento(lista, elemento);

        // Then
        assertFalse(result, "El método debería retornar false porque 'orange' no está en la lista.");
    }

    @Test
    public void givenEmptyList_whenContieneElemento_thenReturnFalse() {
        // Given
        Example2 example2 = new Example2();
        List<String> lista = Arrays.asList(); // Lista vacía
        String elemento = "apple";

        // When
        boolean result = example2.contieneElemento(lista, elemento);

        // Then
        assertFalse(result, "El método debería retornar false porque la lista está vacía.");
    }

    @Test
    public void givenNullList_whenContieneElemento_thenThrowException() {
        // Given
        Example2 example2 = new Example2();
        List<String> lista = null;
        String elemento = "apple";

        // When & Then
        assertThrows(NullPointerException.class, () -> example2.contieneElemento(lista, elemento),"El método debería lanzar una NullPointerException cuando la lista es null.");
    }

    @Test
    public void givenListAndNullElement_whenContieneElemento_thenReturnFalse() {
        // Given
        Example2 example2 = new Example2();
        List<String> lista = Arrays.asList("apple", "banana", "cherry");
        String elemento = null;

        // When
        boolean result = example2.contieneElemento(lista, elemento);

        // Then
        assertFalse(result, "El método debería retornar false porque 'null' no es un elemento de la lista.");
    }

     // Caso 1: Cadena normal

    @Test
    public void givenNormalString_whenRevertirCadena_thenReturnReversedString() {
        // Given
        Example2 example2 = new Example2();
        String cadena = "abcdef";
    
        // When
        String resultado = example2.revertirCadena(cadena);
    
        // Then
        assertEquals("fedcba", resultado, "La cadena revertida debería ser 'fedcba'.");
    }
// Caso 2: Cadena vacía
@Test
public void givenEmptyString_whenRevertirCadena_thenReturnEmptyString() {
    // Given
    Example2 example2 = new Example2();
    String cadena = "";

    // When
    String resultado = example2.revertirCadena(cadena);

    // Then
    assertEquals("", resultado, "La cadena revertida de una cadena vacía debería ser vacía.");
}

     // Caso 3: Cadena con un solo carácter
    @Test
    public void givenSingleCharacterString_whenRevertirCadena_thenReturnSameCharacter() {
         // Given
        Example2 example2 = new Example2();
        String cadena = "a";

         // When
        String resultado = example2.revertirCadena(cadena);
         // Then
        assertEquals("a", resultado, "La cadena revertida con un solo carácter debería ser la misma.");
    }

     // Caso 4: Cadena con espacios
    @Test
    public void givenStringWithSpaces_whenRevertirCadena_thenReturnReversedString() {
         // Given
        Example2 example2 = new Example2();
        String cadena = "abc def";

         // When
        String resultado = example2.revertirCadena(cadena);

         // Then
        assertEquals("fed cba", resultado, "La cadena con espacios debería revertirse correctamente.");
    }

     // Caso 5: Cadena con caracteres especiales
    @Test
    public void givenStringWithSpecialCharacters_whenRevertirCadena_thenReturnReversedString() {
         // Given
        Example2 example2 = new Example2();
        String cadena = "a!b@c";

         // When
        String resultado = example2.revertirCadena(cadena);

         // Then
        assertEquals("c@b!a", resultado, "La cadena con caracteres especiales debería revertirse correctamente.");
    }




    // Caso 1: Factorial de un número positivo (ejemplo: 5)
    @Test
    public void givenPositiveNumber_whenFactorial_thenReturnFactorial() {
        // Given
        Example2 example2 = new Example2();
        int numero = 5;

        // When
        long resultado = example2.factorial(numero);

        // Then
        assertEquals(120, resultado, "El factorial de 5 debería ser 120.");
    }

    // Caso 2: Factorial de 0 (debería ser 1)
    @Test
    public void givenZero_whenFactorial_thenReturnOne() {
        // Given
        Example2 example2 = new Example2();
        int numero = 0;

        // When
        long resultado = example2.factorial(numero);

        // Then
        assertEquals(1, resultado, "El factorial de 0 debería ser 1.");
    }

    // Caso 3: Factorial de 1 (debería ser 1)
    @Test
    public void givenOne_whenFactorial_thenReturnOne() {
        // Given
        Example2 example2 = new Example2();
        int numero = 1;

        // When
        long resultado = example2.factorial(numero);

        // Then
        assertEquals(1, resultado, "El factorial de 1 debería ser 1.");
    }

    // Caso 4: Factorial de un número negativo (debería lanzar excepción)
    @Test
    public void givenNegativeNumber_whenFactorial_thenThrowIllegalArgumentException() {
        // Given
        Example2 example2 = new Example2();
        int numero = -3;

        // When & Then
    assertThrows(IllegalArgumentException.class, () -> example2.factorial(numero));
    }

    

    // Caso 1: Número primo (ejemplo: 7)
    @Test
    public void givenPrimeNumber_whenEsPrimo_thenReturnTrue() {
        // Given
        Example2 example2 = new Example2();
        int numero = 7;

        // When
        boolean resultado = example2.esPrimo(numero);
        // Then
        assertTrue(resultado, "7 debería ser un número primo.");
    }

    // Caso 2: Número no primo (ejemplo: 4)
    @Test
    public void givenNonPrimeNumber_whenEsPrimo_thenReturnFalse() {
        // Given
        Example2 example2 = new Example2();
        int numero = 4;

        // When
        boolean resultado = example2.esPrimo(numero);

        // Then
        assertFalse(resultado, "4 no debería ser un número primo.");
    }

    // Caso 3: Número 1 (no primo)
    @Test
    public void givenOne_whenEsPrimo_thenReturnFalse() {
        // Given
        Example2 example2 = new Example2();
        int numero = 1;

        // When
        boolean resultado = example2.esPrimo(numero);

        // Then
        assertFalse(resultado, "1 no debería ser un número primo.");
    }

    // Caso 4: Número 0 (no primo)
    @Test
    public void givenZero_whenEsPrimo_thenReturnFalse() {
        // Given
        Example2 example2 = new Example2();
        int numero = 0;

        // When
        boolean resultado = example2.esPrimo(numero);

        // Then
        assertFalse(resultado, "0 no debería ser un número primo.");
    }

    // Caso 5: Número primo (ejemplo: 13)
    @Test
    public void givenAnotherPrimeNumber_whenEsPrimo_thenReturnTrue() {
        // Given
        Example2 example2 = new Example2();
        int numero = 13;

        // When
        boolean resultado = example2.esPrimo(numero);

        // Then
        assertTrue(resultado, "13 debería ser un número primo.");
    }




    // Caso de prueba: verificar el mensaje después del retraso
    @Test
    public void whenMensajeConRetraso_thenReturnExpectedMessage() throws InterruptedException {
        // Usa un temporizador para asegurarte de que la prueba no se demore más de 6 segundos
        Example2 example2 = new Example2();
        String mensajeEsperado = "Listo después de retraso";
        
        // When & Then
        String resultado = example2.mensajeConRetraso();
        // Then
        assertEquals(mensajeEsperado, resultado, "El mensaje devuelto debería ser el esperado.");
    }

     // Caso de prueba: verificar la conversión de una lista de enteros a una lista de strings
    @Test
    public void whenConvertirAString_thenReturnListOfStrings() {
        // Given
        Example2 example2 = new Example2();
        List<Integer> listaEnteros = Arrays.asList(1, 2, 3, 4, 5);
        List<String> listaEsperada = Arrays.asList("1", "2", "3", "4", "5");

        // When
        List<String> resultado = example2.convertirAString(listaEnteros);

        // Then
        assertNotNull(resultado, "La lista resultante no debe ser nula.");
        assertEquals(listaEsperada.size(), resultado.size(), "Las listas deben tener el mismo tamaño.");
        assertEquals(listaEsperada, resultado, "La lista convertida debe ser igual a la lista esperada.");
    }


    // Caso de prueba: calcular la media de una lista de enteros
    @Test
    public void whenCalcularMedia_thenReturnAverage() {
        // Given
        Example2 example2 = new Example2();
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        double mediaEsperada = 3.0;

        // When
        double resultado = example2.calcularMedia(lista);
        
                // Then
                assertEquals(mediaEsperada, resultado, 0.0001, "La media calculada debe ser correcta.");
            }
        

        
            // Caso de prueba: verificar que se lanza una excepción para lista nula
        @Test
        public void whenListaEsNula_thenThrowException() {
            Example2 example2 = new Example2();
            try {
                example2.calcularMedia(null);
                fail("No exception was thrown");
            } catch (IllegalArgumentException e) {
                assertEquals("La lista no puede ser nula o vacía", e.getMessage());
            }
        }
    // Caso de prueba: verificar que se lanza una excepción para lista vacía
    @Test
    public void whenListaEsVacia_thenThrowException() {

        // When & Then
        Example2 example2 = new Example2();
        assertThrows(IllegalArgumentException.class, () -> example2.calcularMedia(Collections.emptyList()), "La lista no puede ser nula o vacía");    }



    // Caso de prueba: convertir una lista de cadenas a una cadena
    @Test
    public void whenConvertirListaAString_thenReturnConcatenatedString() {
        Example2 example2 = new Example2();
        // Given
        
        List<String> lista = Arrays.asList("hola", "mundo", null, "java");
        String resultadoEsperado = "HOLA,MUNDO,NULL,JAVA";

        // When
        String resultado = example2.convertirListaAString(lista);

        // Then
        assertEquals(resultadoEsperado, resultado, "La cadena resultante debe ser correcta.");
    }

    // Caso de prueba: convertir una lista vacía
    @Test
    public void whenListaEsVacia_thenReturnEmptyString() {
        
        Example2 example2 = new Example2();
        // Given
        List<String> listaVacia = Collections.emptyList();
        String resultadoEsperado = "";

        // When
        String resultado = example2.convertirListaAString(listaVacia);

        // Then
        assertEquals(resultadoEsperado, resultado, "La cadena resultante de una lista vacía debe ser vacía.");
    }

}










