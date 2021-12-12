package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class numPalabrasTest {
    @Test
    public void wrongFin() throws java.lang.IllegalArgumentException {
        Editor empty = new Editor();
        empty.leerFichero("numPalabras3.txt");
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            empty.numPalabras(1, 5, "Chocolate");
        });
    }
    @Test
    public void wrongInicio() throws java.lang.IllegalArgumentException {
        Editor empty = new Editor();
        empty.leerFichero("numPalabras3.txt");
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            empty.numPalabras(0, 1, "Chocolate");
        });
    }
    @Test
    public void wrongCountIn()  {
        Editor editor = new Editor();
        editor.leerFichero("numPalabras2.txt");
        Integer result = editor.numPalabras(1, 2, "Chocolate");
        assertEquals(2, result);
    }

    @Test
    public void commonCountIn()  {
        Editor editor = new Editor();
        editor.leerFichero("numPalabras4.txt");
        Integer result = editor.numPalabras(1, 3, "Chocolate");
        assertEquals(2, result);
    }
    @Test
    public void commonCountNotIn()  {
        Editor editor = new Editor();
        editor.leerFichero("numPalabras4.txt");
        Integer result = editor.numPalabras(1, 3, "Fresa");
        assertEquals(0, result);
    }


}
