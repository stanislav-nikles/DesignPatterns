package com.github.stanislavnikles.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void singleInstanceTest() {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        assertEquals(object1, object2);
    }
}