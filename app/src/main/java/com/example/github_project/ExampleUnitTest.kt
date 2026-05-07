package com.example.github_project

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun suma_esCorrecta() {
        // Aquest test ha de passar
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_forcar_error() {
        // Aquest test fallarà (com demana l'apartat 3 i 7)
        // Canvia el 5 per un 4 quan vulguis que tot estigui verd
        assertEquals(5, 2 + 2)
    }
}