package delegate.demo.simple;

public class Boss {
    public void comment(String  message , Leader leader){
        leader.doing(message);
    }
}
