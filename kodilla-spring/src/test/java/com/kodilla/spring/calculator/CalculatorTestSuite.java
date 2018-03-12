package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calc = context.getBean(Calculator.class);

        //When
        double valueAdd = calc.add(5,2);
        double valueSub = calc.sub(5,2);
        double valueMul = calc.mul(5,2);
        double valueDiv = calc.div(5,2);

        //Then
        Assert.assertEquals(7, valueAdd, 0);
        Assert.assertEquals(3, valueSub,0);
        Assert.assertEquals(10, valueMul,0);
        Assert.assertEquals(2.5, valueDiv,0);
    }

//    @Test
//    public void testCalculate() {
//        //Given
//        CalcRunner cr = new CalcRunner();
//        cr.calculate();
//    }
}
