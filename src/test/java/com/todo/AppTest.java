package com.todo;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAddTask() {
        App.addTask("Test Task");
        assertEquals(1, App.getTasks().size());
    }
}
