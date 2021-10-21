package de.webtech.quackr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class QuackrApplicationTest {

    /**
     * Tests if an application context can be successfully created.
     */
    @Test
    public void contextLoads() {
    }

}