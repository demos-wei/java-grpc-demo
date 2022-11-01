# Java gRPC demo
A gRPc demo, this demo includes a gRPC server and a gRPC client.


Build the server side by running:
```shell
$ bazel build //:hello-world-server
$ bazel-bin/hello-world-server
#(print logs)
```

Build the client side by running:
```shell
$ bazel build //:hello-world-client
$ bazel-bin/hello-world-client
#(print logs)
```
