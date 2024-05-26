package com.example.study;

import android.os.Parcel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DailyTaskTest {
    private DailyTask task;

    @Before
    public void setUp() {
        task = new DailyTask("Test Task");
    }

    @Test
    public void testConstructor() {
        assertEquals("Test Task", task.getName());
        assertEquals("", task.getNotes());
        assertFalse(task.isCompleted());
    }

    @Test
    public void testSetNotes() {
        task.setNotes("Test Notes");
        assertEquals("Test Notes", task.getNotes());
    }

    @Test
    public void testSetCompleted() {
        task.setCompleted(true);
        assertTrue(task.isCompleted());
    }

}
