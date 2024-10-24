package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return this.getRegularPay() + this.getOvertimePay();
    }

    public double getRegularPay() {
        return (double)this.getRegularHours() * this.payRate;
    }

    public double getOvertimePay() {
        return (double)this.getOvertimeHours() * this.payRate * 1.5;
    }

    public float getRegularHours() {
        return this.hoursWorked > 40.0F ? 40.0F : this.hoursWorked;
    }

    public float getOvertimeHours() {
        return this.hoursWorked > 40.0F ? this.hoursWorked - 40.0F : 0.0F;
    }
}