package ru.gb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static ru.gb.lesson3.Hw4.triangleArea;

public class Hw4Test {
    @Test
    void Hw4Test() {

        Assertions.assertEquals(5.562148865321747, triangleArea(3, 4, 4));

         }


}
