package cn.jfliu.jdk.impl;



import java.lang.annotation.Target;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        TargetInterfaceImpl target = new TargetInterfaceImpl();
//
//        Proxy.newProxyInstance(
//                target.getClass().getClassLoader(), // 目标对象类加载器
//                // 目标对象相同的接口字节码对象数组
//        )
    }
}
