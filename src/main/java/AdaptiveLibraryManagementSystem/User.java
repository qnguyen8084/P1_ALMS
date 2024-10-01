/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * User.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

public abstract class User implements Transactions{
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void add() {
        DBUserManager.add(this.name);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void search() {

    }
}

interface FetchId {
    int getId();
}

class Member extends User implements FetchId {
    private int memberId;

    public Member(String name) {
        super(name);
    }

    public Member(int memberId, String name) {
        super(name);
        this.memberId = memberId;
    }

    @Override
    public int getId() {
        return memberId;
    }
}

class Employee extends User implements FetchId {
    private int employeeId;

    public Employee(String name) {
        super(name);}

    public Employee(int employeeId, String name) {
        super(name);
        this.employeeId = employeeId;
    }

    @Override
    public int getId() {
        return employeeId;
    }
}