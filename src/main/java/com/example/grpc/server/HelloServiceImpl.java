package com.example.grpc.server;

import gencode.HelloRequest;
import gencode.HelloResponse;
import gencode.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
  @Override
  public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
    String greeting = new StringBuilder("Hello, ").append(request.getName()).toString();
    HelloResponse response = HelloResponse.newBuilder().setGreeting(greeting).build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
