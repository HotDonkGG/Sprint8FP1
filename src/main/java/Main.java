package main.java;

import main.java.server.HttpTaskServer;
import main.java.server.KVServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        KVServer kvServer = new KVServer();
        kvServer.start();
        HttpTaskServer httpTaskServer = new HttpTaskServer("/tasks/");
        httpTaskServer.start();

    }
}
//http://localhost:8078/save/1?API_TOKEN=1680362422576
// http://localhost:8078/load/1?API_TOKEN=1680362422576
//1680457106310