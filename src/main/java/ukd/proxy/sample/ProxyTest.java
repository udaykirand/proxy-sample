package ukd.proxy.sample;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ProxyTest {

    public static void main(String[] s) {
        Map proxyInstance = (Map) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), new Class[] { Map.class },
                new ProxyInvocationHandler(new HashMap<>()));

        System.out.println(proxyInstance.put("hello", "world"));
        System.out.println(proxyInstance.get("hello"));
    }
}
