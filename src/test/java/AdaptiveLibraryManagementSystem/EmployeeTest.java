/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * EmployeeTest.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testEmployeeIdWithConstructor1() {
        Employee employee = new Employee("TestUser");
        assertEquals(0, employee.getId());
    }

    @Test
    void testEmployeeIdWithConstructor2() {
        Employee employee = new Employee(10, "TestUser");
        assertEquals(10, employee.getId());
    }

    @Test
    void testEmployeeNameWithConstructor1() {
        Employee employee = new Employee("TestUser");
        assertEquals("TestUser", employee.getName());
    }

    @Test
    void testEmployeeNameWithConstructor2() {
        Employee employee = new Employee(10, "TestUser1");
        assertEquals("TestUser1", employee.getName());
    }
}
