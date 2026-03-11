package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CseControllerTest {

	CseController controller = new CseController();

    @Test
    void testAdd() {
        int result = controller.cseAdd(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testMul() {
        int result = controller.cseMul(4, 2);
        assertEquals(8, result);
    }

}
