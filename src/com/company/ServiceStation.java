package com.company;
import transport.Transport;
import transport.TransportTypeException;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport<? extends Driver>> transportQueue;

    public ServiceStation(Queue<Transport<? extends Driver>> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public void doDiagnostics() throws TransportTypeException {
        Transport<? extends Driver> transport;
        while ((transport = transportQueue.poll()) != null) {
            if (transport.passDiagnostics()) {
                System.out.println("Диагностика пройдена");
            }
            else {
                System.out.println("Диагностика проводится...");
            }
        }
    }
}
