package com.example.grpc.client;

import java.util.concurrent.TimeUnit;

import gencode.HelloRequest;
import gencode.HelloResponse;
import gencode.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HelloWorldClient{
  public static void main(String[] args) throws InterruptedException {
    String host = "localhost";
    int port = 5001;
    ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
    HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
    HelloRequest request = HelloRequest.newBuilder().setName("wei").build();
    HelloResponse response = stub.hello(request);
    System.out.println(((HelloResponse)response).getGreeting());
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }
}
