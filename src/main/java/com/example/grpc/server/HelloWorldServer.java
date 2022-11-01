package com.example.grpc.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class HelloWorldServer{
  public static void main(String[] args) throws IOException, InterruptedException {
    int port = 5001;
    Server server = ServerBuilder.forPort(port).addService(new HelloServiceImpl()).build().start();
    System.out.println("Server started, listening on " + port);
    server.awaitTermination();
  }
}
