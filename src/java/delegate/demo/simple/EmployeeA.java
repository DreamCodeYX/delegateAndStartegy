package java.delegate.demo.simple;

public class EmployeeA implements  IEmployee{
    @Override
    public void doing(String message) {
        System.out.println("我是员工A从事"+message+"工作");
    }
}
