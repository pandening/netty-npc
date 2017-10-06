package io.hujian.rpc.test.application;

import io.hujian.rpc.test.client.HelloService;

/**
 * Created by hujian06 on 2017/10/6.
 *
 *
 */
public class ReferenceBeanTest {


    public static void main(String ... args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        String className = "io.hujian.rpc.test.server.HelloServiceImpl";

        HelloService helloService = (HelloService) Class.forName(className).newInstance();

        System.out.println(helloService.hello("hello"));

    }

}
