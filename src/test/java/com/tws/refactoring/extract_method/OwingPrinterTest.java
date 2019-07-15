package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private OwingPrinter owingPrinter = new OwingPrinter();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
//        System.out.print("hello");
//        assertEquals("hello", outContent.toString());
        Order order = new Order(12.2);
        List<Order> list = new ArrayList<>();
        list.add(order);
        owingPrinter.printOwing("aaaa", list);
        assertEquals("name: aaaa\r\n" +
                "amount: 12.2\r\n", outContent.toString());
    }
}