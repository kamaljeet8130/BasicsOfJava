package ObjectOrientedProgrammingConcepts;

// dataHiding and abstraction : encapsulation;


//public class Test {
//    private int userId;
//    private String name;
//    private  String department;
//
//    public Test(String name,int userId,String department){
//        this.name =name;
//        this.userId = userId;
//        this.department = department;
//    }
//    public String getName(){
//        return name;
//    }
//    public int getUserId(){
//        return userId;
//    }
//    public String getDepartment(){
//        return  department;
//    }
//    public void  setDepartment(String department){
//        this.department = department;
//    }
//}
//
//class Employee {
//    public static void main(String[] args) {
//        Test test = new Test("kamal",101,"HR");
//
//        test.setDepartment("software Engineer");
//        System.out.println(test.getUserId());
//        System.out.println(test.getDepartment());
//        System.out.println(test.getName());
//
//    }
//
//}

//class Parent {
//    public void m1(){
//        System.out.println("parent class method");
//    }
//}
//class child extends Parent{
//    public void m2(){
//        System.out.println("child class method");
//    }
//}
//
//class  Main{
//    public static void main(String[] args) {
//      child child1 = new Parent();
//      child1.m2();;
//    }
//}

//interface parent1{
//    void m1();
//}
//interface parent2{
//    void m1();
//}
//interface child extends parent1,parent2{
//    @Override
//    void m1();
//}
//
//class Test implements child{
//    @Override
//    public void m1() {
//        System.out.println("Hello m1 method");
//    }
//}

//abstract class Animal{
//    abstract void methodSound();
//}
//class Cat extends Animal{
//    @Override
//    void methodSound() {
//        System.out.println("Bark");
//    }
//
//    public static void main(String[] args) {
//        Animal animal = new Cat();
//        animal.methodSound();
//    }
//}

//class Vehicle{
//    void  drive(){
//        System.out.println("vehicle is drive by driver");
//    }
//}
//class Car extends Vehicle{
//    @Override
//    void drive() {
//        System.out.println("Reparing a Car");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Vehicle vehicle1 = new Car();
//        vehicle1.drive();
//
//    }
//
//
//}

//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;

//class Bank{
//    private String bankName;
//    private Set<Employee> employees;
//
//    public Bank(String bankName){
//        this.bankName = bankName;
//    }
//    public String getBankName(){
//        return this.bankName;
//    }
//    public void setEmployees(Set<Employee> employees){
//        this.employees = employees;
//    }
//    public Set<Employee> getEmployees(){
//        return this.employees;
//    }
//}
//class Employee{
//    private String name;
//    public Employee(String name){
//        this.name = name;
//    }
//    public String getEmployeeName(){
//        return this.name;
//    }
//}
//
//class AssociationExample{
//    public static void main(String[] args) {
//        Employee employee1 = new Employee("Ridhi");
//        Employee employee2 = new Employee("vijay");
//        Set<Employee> employees = new HashSet<>();
//        employees.add(employee1);
//        employees.add(employee2);
//
//        Bank bank = new Bank("ICICI");
//        bank.setEmployees(employees);
//
//        for (Employee emp : bank.getEmployees()){
//            System.out.println(emp.getEmployeeName() + " belongs to bank" + bank.getBankName());
//        }
//
//
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//
//class Department{
//    public String departmentName;
//    public Department(String departmentName){
//        this.departmentName=departmentName;
//    }
//    public String getDepartmentName(){
//        return departmentName;
//    }
//}
//
//class Company{
//    private String companyName;
//    private List<Department> departments ;
//
//    public Company(String companyName){
//        this.companyName = companyName;
//        this.departments = new ArrayList<Department>();
//    }
//    public void addDepartment(Department department){
//        departments.add(department);
//    }
//    public List<Department> getDepartments(){
//        return new ArrayList<>(departments);
//    }
//    public int getTotalDepartments(){
//        return departments.size();
//    }
//}
//class A {
//    int x =10;
//}
//class B extends A{
//    private int y = 10;
//
//    public int getY() {
//        return y;
//    }
//}
//class C extends B{
//    private int z =20;
//
//    public int getZ() {
//        return z;
//    }
//}
//
//class Test extends Object{
//    public static void main(String[] args) {
//        C c = new C();
//        System.out.println(c.getZ());
//        System.out.println(c.getY());
//        System.out.println(c.x);
//        int x = 10;
//        int y = 20;
//
//    }
//}

//class Parent {
//    public void property(){
//        System.out.println("Land + cash");
//    }
//    public void marry(){
//        System.out.println("abc");
//    }
//}
//
//class child extends Parent{
//    @Override
//    public void marry() {
//        System.out.println("xyx");
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        Parent parent = new child();
//        parent.marry();
//    }
//}
//
//class Parent {
//    public Object m1(){
//        return null;
//    }
//}
//class Child extends Parent{
//    @Override
//        public String m1(){
//        return "hello world";
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        Parent p = new Child();
//        System.out.println(p.m1());
//    }
//
//
//}

//class A {}
//class B extends A{}
//
//class Base{
//    B fun(){
//        System.out.println("Base fun");
//        return new B();
//    }
//}
//class Drived extends Base{
//    @Override
//        A fun(){
//        System.out.println("Drived Fun");
//        return new A();
//    }
//}
//class Test{
//    public static void main(String[] args) {
//        Base base = new Base();
//        base.fun();
//
//        Drived drived = new Drived();
//        drived.fun();
//
//
//    }
//}

//class Parent{
//    public final void m1(){
//        System.out.println("parent specific method");
//
//    }
//}
//class Child extends Parent{
//    public final void m1(){
//        System.out.println("child private method");
//    }
//
//
//}
//
//class Test{
//    public static void main(String[] args) {
//        Parent p  = new Parent();
//
//    }
//
//}

//class Parent{
//    public void m1(){
//
//    }
//}
//abstract class Child extends Parent{
//    @Override
//    public abstract void m1();
//}

//class Parent{
//     void m1(){
//
//    }
//}
//class Child extends Parent{
//    public void m1(){
//
//    }
//}

//import java.io.EOFException;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//class Parent{
////    public void m1() throws Exception{
//
////    }
////    public void m2(){
////
////    }
////    public void m3 () throws Exception{
////
////    }
//
////    public void m4() throws IOException{
////
////    }
//    public void m5() throws IOException{
//
//    }
//}
//class Child extends Parent{
////    @Override
////        public void m1(){
////
////    }
////    @Override
////        public void m2() throws Exception{
////
////    }
////    @Override
////        public void m3() throws IOException{
////
////    }
////    @Override
////        public void m4() throws Exception{
////
////    }
//    @Override
//    public void m5() throws EOFException,InterruptedException{
//
//    }
//
//
//}

//class Parent{
//    public static   void m1(){
//
//    }
//}
//
//class Child extends Parent{
//    public static void m1(){
//
//    }
//}

class Parent{
    public static void m1(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    public static void m1(){
        System.out.println("child");
    }
}

class Test {
    public static void main(String[] args) {
        Parent parent = new Child();
        Parent.m1();
        Child c = new Child();
        Child.m1();
    }
}
