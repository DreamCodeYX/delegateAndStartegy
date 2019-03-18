package delegate.demo.simple;

public class EmployeeB implements  IEmployee{
    @Override
    public void doing(String message) {
        System.out.println("我是员工B从事"+message+"工作");
    }
}
