/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * MemberTest.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void testGetNameForMember() {
        Member member = new Member("John Doe");
        assertEquals("John Doe", member.getName());
    }

    @Test
    void testGetIdForMemberWithId() {
        Member member = new Member(999, "John Doe");
        assertEquals(999, member.getId());
    }

    @Test
    void testGetNameForEmployee() {
        Employee employee = new Employee("Jane Doe");
        assertEquals("Jane Doe", employee.getName());
    }

    @Test
    void testGetIdForEmployeeWithId() {
        Employee employee = new Employee(999, "Jane Doe");
        assertEquals(999, employee.getId());
    }
}
