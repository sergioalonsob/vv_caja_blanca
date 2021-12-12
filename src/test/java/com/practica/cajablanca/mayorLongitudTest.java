package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class mayorLongitudTest {
    @Test
    public void emptyTest() throws EmptyCollectionException {
        Editor empty = new Editor();
        String result = empty.mayorLongitud();
        assertNull(result);
    }
    @Test
    public void singleWordTest() throws EmptyCollectionException {
        Editor editor = new Editor();
        editor.leerFichero("mayorLongitud1.txt");
        String result = editor.mayorLongitud();
        assertEquals("Fresa", result);
    }
    @Test
    public void majorFirstTest() throws EmptyCollectionException {
        Editor editor = new Editor();
        editor.leerFichero("mayorLongitud2.txt");
        String result = editor.mayorLongitud();
        assertEquals("Chocolate", result);
    }

    @Test
    public void majorSecondTest() throws EmptyCollectionException {
        Editor editor = new Editor();
        editor.leerFichero("mayorLongitud3.txt");
        String result = editor.mayorLongitud();
        assertEquals("Chocolate", result);
    }




}
