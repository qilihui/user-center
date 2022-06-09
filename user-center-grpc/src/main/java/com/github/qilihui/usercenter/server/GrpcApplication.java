package com.github.qilihui.usercenter.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcApplication {

    private static final int port = 9999;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GrpcApplication.class, args);
        startGrpc();
    }

    public static void startGrpc() throws Exception {
        Server server = ServerBuilder.
                forPort(port)
                .addService(new TestServerImpl())
                .build().start();
        server.awaitTermination();
    }
}
