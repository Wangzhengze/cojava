package 代码的副本.chap06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;

public class ReflectTest2 {
    public static void main(String[] args) {
        UDao dao = new UDaoImple();
        MyProxy proxy = new MyProxy();
        proxy.setTarget(dao);
        Object o = Proxy.newProxyInstance(
                dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces(),
                proxy
        );
        if(o instanceof UDao) {
            UDao d = (UDao) o;
            System.out.println(d.getClass().getName());
            ReflectTest.getFiled(d.getClass());
            ReflectTest.getConstruct(d.getClass());
            ReflectTest.getMethod(d.getClass());
        }
    }
}

//代理类
class MyProxy implements InvocationHandler {
    private Object target;
    public Object getTarget() {
        return target;
    }
    public void setTarget(Object target) {
        this.target = target;
    }
    public static void getTime() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        month+=1;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        getTime();
        //method:执行方法save delete update
        //invoke:调用执行
        //target: UDaoImple
        //args:方法参数列表
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}

//连接委托类和代理类
interface  UDao {
    public void save();
    public void delete();
    public void update();
}

//委托类
class UDaoImple implements UDao {
    @Override
    public void save() {
        System.out.println("张三保存成功");
    }
    @Override
    public void delete() {
        System.out.println("张三删除成功");
    }
    @Override
    public void update() {
        System.out.println("张三更新成功");
    }
}
