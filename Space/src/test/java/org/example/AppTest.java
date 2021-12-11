package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.commons.logging.LoggerFactory;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class AppTest {
    double a;
    double b;
    double c;
    double s;
    double actual;

    //private static Logger Logger = (Logger) LoggerFactory.getLogger(AppTest.class);

    @Test
    public void triangle(){
        a = 4;
        b = 4;
        c = 5;
        assertTrue((a + b) > c && (b + c) > a  && (a + c) > b);
        }

        @Test
   public void triangleArea(){
        actual = 853.125;
            a = 4;
            b = 4;
            c = 5;
         s = (((a + b + c) / 2) * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) * 2 - c));
     assertEquals(s,actual);

    }

}


