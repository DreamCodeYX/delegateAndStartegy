package delegate.demo.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tom.
 */
public class Leader implements IEmployee {

    //使用jdk的注入的方式编写单例
    private  Map<String ,IEmployee> map = new HashMap<String ,IEmployee>();

    public  Leader(){
        this.map.put("吹牛",new EmployeeA());
        this.map.put("数钱",new EmployeeB());
    }

    @Override
    public void doing(String message) {
        //项目经理自己不干事，委派给对应职责的员工
        this.map.get(message).doing(message);
    }
}
