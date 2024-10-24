package com.pluralsight;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Matt", "Tech", 10.0, 41.0F);
        double totalPay = e1.getTotalPay();
        System.out.println("Total Pay: $" + totalPay);
        System.out.println("Regular Hours: " + e1.getRegularHours());
        System.out.println("Overtime Hours: " + e1.getOvertimeHours());
        Reservation r = new Reservation("king", 2, true);
        r.setNumberOfNights(3);

        try {
            System.out.println("Price per night: $" + r.getPrice());
            System.out.println("Total Reservation Cost: $" + r.getReservationTotal());
        } catch (Exception var6) {
            Exception e = var6;
            System.out.println(e.getMessage());
        }

        Room room1 = new Room(2, 150.0, false, false);
        System.out.println("Room Available: " + room1.isAvailable());
        System.out.println("Room Occupied: " + room1.isOccupied());
        System.out.println("Room Dirty: " + room1.isDirty());
        System.out.println("Room Price: $" + room1.getPrice());
    }
}