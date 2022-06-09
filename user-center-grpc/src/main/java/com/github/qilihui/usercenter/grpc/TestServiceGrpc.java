package com.github.qilihui.usercenter.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 服务接口定义，服务端和客户端都要遵守该接口进行通信
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.2.0)",
        comments = "Source: base.proto")
public final class TestServiceGrpc {

    private TestServiceGrpc() {
    }

    public static final String SERVICE_NAME = "grpc.TestService";

    // Static method descriptors that strictly reflect the proto.
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static final io.grpc.MethodDescriptor<com.github.qilihui.usercenter.grpc.TestRequest,
            com.github.qilihui.usercenter.grpc.TestResponse> METHOD_GET_DATE =
            io.grpc.MethodDescriptor.create(
                    io.grpc.MethodDescriptor.MethodType.UNARY,
                    generateFullMethodName(
                            "grpc.TestService", "getDate"),
                    io.grpc.protobuf.ProtoUtils.marshaller(com.github.qilihui.usercenter.grpc.TestRequest.getDefaultInstance()),
                    io.grpc.protobuf.ProtoUtils.marshaller(com.github.qilihui.usercenter.grpc.TestResponse.getDefaultInstance()));

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static TestServiceStub newStub(io.grpc.Channel channel) {
        return new TestServiceStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static TestServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new TestServiceBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
     */
    public static TestServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new TestServiceFutureStub(channel);
    }

    /**
     * <pre>
     * 服务接口定义，服务端和客户端都要遵守该接口进行通信
     * </pre>
     */
    public static abstract class TestServiceImplBase implements io.grpc.BindableService {

        /**
         *
         */
        public void getDate(com.github.qilihui.usercenter.grpc.TestRequest request,
                            io.grpc.stub.StreamObserver<com.github.qilihui.usercenter.grpc.TestResponse> responseObserver) {
            asyncUnimplementedUnaryCall(METHOD_GET_DATE, responseObserver);
        }

        @Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            METHOD_GET_DATE,
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.github.qilihui.usercenter.grpc.TestRequest,
                                            com.github.qilihui.usercenter.grpc.TestResponse>(
                                            this, METHODID_GET_DATE)))
                    .build();
        }
    }

    /**
     * <pre>
     * 服务接口定义，服务端和客户端都要遵守该接口进行通信
     * </pre>
     */
    public static final class TestServiceStub extends io.grpc.stub.AbstractStub<TestServiceStub> {
        private TestServiceStub(io.grpc.Channel channel) {
            super(channel);
        }

        private TestServiceStub(io.grpc.Channel channel,
                                io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected TestServiceStub build(io.grpc.Channel channel,
                                        io.grpc.CallOptions callOptions) {
            return new TestServiceStub(channel, callOptions);
        }

        /**
         *
         */
        public void getDate(com.github.qilihui.usercenter.grpc.TestRequest request,
                            io.grpc.stub.StreamObserver<com.github.qilihui.usercenter.grpc.TestResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(METHOD_GET_DATE, getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * 服务接口定义，服务端和客户端都要遵守该接口进行通信
     * </pre>
     */
    public static final class TestServiceBlockingStub extends io.grpc.stub.AbstractStub<TestServiceBlockingStub> {
        private TestServiceBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private TestServiceBlockingStub(io.grpc.Channel channel,
                                        io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected TestServiceBlockingStub build(io.grpc.Channel channel,
                                                io.grpc.CallOptions callOptions) {
            return new TestServiceBlockingStub(channel, callOptions);
        }

        /**
         *
         */
        public com.github.qilihui.usercenter.grpc.TestResponse getDate(com.github.qilihui.usercenter.grpc.TestRequest request) {
            return blockingUnaryCall(
                    getChannel(), METHOD_GET_DATE, getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * 服务接口定义，服务端和客户端都要遵守该接口进行通信
     * </pre>
     */
    public static final class TestServiceFutureStub extends io.grpc.stub.AbstractStub<TestServiceFutureStub> {
        private TestServiceFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private TestServiceFutureStub(io.grpc.Channel channel,
                                      io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected TestServiceFutureStub build(io.grpc.Channel channel,
                                              io.grpc.CallOptions callOptions) {
            return new TestServiceFutureStub(channel, callOptions);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.github.qilihui.usercenter.grpc.TestResponse> getDate(
                com.github.qilihui.usercenter.grpc.TestRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(METHOD_GET_DATE, getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_DATE = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final TestServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(TestServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_DATE:
                    serviceImpl.getDate((com.github.qilihui.usercenter.grpc.TestRequest) request,
                            (io.grpc.stub.StreamObserver<com.github.qilihui.usercenter.grpc.TestResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @Override
        @SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static final class TestServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
        @Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.github.qilihui.usercenter.grpc.Base.getDescriptor();
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (TestServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new TestServiceDescriptorSupplier())
                            .addMethod(METHOD_GET_DATE)
                            .build();
                }
            }
        }
        return result;
    }
}
