package com.github.stanislavnikles.factorymethod;

import com.github.stanislavnikles.factorymethod.developers.Developer;
import com.github.stanislavnikles.factorymethod.developers.JuniorDeveloper;
import com.github.stanislavnikles.factorymethod.developers.MiddleDeveloper;
import com.github.stanislavnikles.factorymethod.developers.SeniorDeveloper;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeveloperFactoryTest {

    @Test
    public void getDeveloperTest() {
        DeveloperFactory factory = DeveloperFactory.getInstance();

        Developer junior = factory.getDeveloper("Junior");
        assertEquals(JuniorDeveloper.class, junior.getClass());

        Developer middle = factory.getDeveloper("Middle");
        assertEquals(MiddleDeveloper.class, middle.getClass());

        Developer senior = factory.getDeveloper("Senior");
        assertEquals(SeniorDeveloper.class, senior.getClass());
    }
}