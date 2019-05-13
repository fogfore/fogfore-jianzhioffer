package demo.server;

import demo.HelloService;
import demo.HelloServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        HelloService helloService = new HelloServiceImpl();
        LocateRegistry.createRegistry(7910);
        Naming.rebind("rmi://127.0.0.1/hello", helloService);
        System.out.println("绑定服务成功");
    }
}
