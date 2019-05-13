package demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
    public HelloServiceImpl() throws RemoteException {
        super();
    }

    public HelloServiceImpl(int port) throws RemoteException {
        super(port);
    }

    @Override
    public String sayHello(String msg) throws RemoteException{
        return "hello " + msg;
    }
}
