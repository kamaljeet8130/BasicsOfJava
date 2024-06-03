package ObjectOrientedProgrammingConcepts;

class Employee{

    String name;
    Address address;

    public Employee(String name,Address address){
        this.name = name;
        this.address  = address;
    }
    public void getDetails(){
        System.out.println(name + " " + address.houseNumber + " " + address.city + " " + address.pinCode);
    }

}

class Address{
    String houseNumber;
    String city;
    String pinCode;
    public Address(String houseNumber,String city,String pinCode){
        this.city =city;
        this.houseNumber =houseNumber;
        this.pinCode =pinCode;
    }

}


public class AggregationExample {
    public static void main(String[] args) {
        Address address = new Address("E-66 first floor" ,"Faridabad","121009");
        Employee employee = new Employee("kamal",address);
        employee.getDetails();
    }



}
