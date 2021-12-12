package com.practica.cajablanca;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class sustituirPalabraTest {
    @Test
    public void emptyTest() {
        Editor empty = new Editor();
        Editor empty2 = empty;
        empty.sustituirPalabra("Chocolate", "Fresa");
        assertEquals(empty, empty2);
    }
    @Test
    public void singleWordTest() throws EmptyCollectionException {
        Editor editor = new Editor();
        editor.leerFichero("sustituirPalabra1.txt");
        editor.sustituirPalabra("Chocolate", "Fresa");
        assertEquals(editor.getLinea(1).toString(), "[Fresa]");
    }
    @Test
    public void notFoundSingleWordTest() throws EmptyCollectionException {
        Editor editor = new Editor();
        editor.leerFichero("sustituirPalabra2.txt");
        editor.sustituirPalabra("Fresa", "Chocolate");
        assertEquals(editor.getLinea(1).toString(), "[Vainilla]");
    }




}
