package edu.escuelaing.app.webapps;

import edu.escuelaing.app.HttpServer;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Inicio de la APP!");
        HttpServer server = HttpServer.getInstance();
        server.run(args);
    }
}
