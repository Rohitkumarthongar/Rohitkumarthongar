package com.company;
 class Employee {
    String empId;
    String empName;
    String empMobNo;
    String address;

    Employee(String empID, String empNAme, String EmpMoNo, String address) {
        this.empId = "qwe123";
        this.empName = "Rohit";
        this.empMobNo = "9235398456570694";
        this.address = "dkfedbfvjhdufviusdfbvdfkjvjjk";
    }


    public void displayDetails() {
        System.out.println("Employee ID :: " + empId + "EMp NAme :: " + empName + " Number :: " + empMobNo + "Address  :: " + address);
    }
}

