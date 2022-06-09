package com.github.qilihui.usercenter.server;

import com.github.qilihui.usercenter.grpc.TestRequest;
import com.github.qilihui.usercenter.grpc.TestResponse;
import com.github.qilihui.usercenter.grpc.TestServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Date;

/**
 * @author qilihui
 * @date 2022/6/9 11:38 下午
 */
public class TestServerImpl extends TestServiceGrpc.TestServiceImplBase {
    @Override
    public void getDate(TestRequest request, StreamObserver<TestResponse> responseObserver) {
        TestResponse testResponse = TestResponse
                .newBuilder()
                .setServerDate("Welcome " + request.getUserName() + ", " + new Date())
                .build();
        responseObserver.onNext(testResponse);
        responseObserver.onCompleted();
    }
}
