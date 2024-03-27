package com.proto.sample;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: sample.proto")
public final class sampleGrpc {

  private sampleGrpc() {}

  public static final String SERVICE_NAME = "sample.sample";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.sample.Sample.SaveRequest,
      com.proto.sample.Sample.SaveResponse> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = com.proto.sample.Sample.SaveRequest.class,
      responseType = com.proto.sample.Sample.SaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.sample.Sample.SaveRequest,
      com.proto.sample.Sample.SaveResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.proto.sample.Sample.SaveRequest, com.proto.sample.Sample.SaveResponse> getSaveMethod;
    if ((getSaveMethod = sampleGrpc.getSaveMethod) == null) {
      synchronized (sampleGrpc.class) {
        if ((getSaveMethod = sampleGrpc.getSaveMethod) == null) {
          sampleGrpc.getSaveMethod = getSaveMethod =
              io.grpc.MethodDescriptor.<com.proto.sample.Sample.SaveRequest, com.proto.sample.Sample.SaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sample.Sample.SaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sample.Sample.SaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new sampleMethodDescriptorSupplier("save"))
              .build();
        }
      }
    }
    return getSaveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static sampleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sampleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sampleStub>() {
        @java.lang.Override
        public sampleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sampleStub(channel, callOptions);
        }
      };
    return sampleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static sampleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sampleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sampleBlockingStub>() {
        @java.lang.Override
        public sampleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sampleBlockingStub(channel, callOptions);
        }
      };
    return sampleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static sampleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sampleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sampleFutureStub>() {
        @java.lang.Override
        public sampleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sampleFutureStub(channel, callOptions);
        }
      };
    return sampleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class sampleImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.sample.Sample.SaveRequest> save(
        io.grpc.stub.StreamObserver<com.proto.sample.Sample.SaveResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSaveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.sample.Sample.SaveRequest,
                com.proto.sample.Sample.SaveResponse>(
                  this, METHODID_SAVE)))
          .build();
    }
  }

  /**
   */
  public static final class sampleStub extends io.grpc.stub.AbstractAsyncStub<sampleStub> {
    private sampleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sampleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sampleStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.sample.Sample.SaveRequest> save(
        io.grpc.stub.StreamObserver<com.proto.sample.Sample.SaveResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class sampleBlockingStub extends io.grpc.stub.AbstractBlockingStub<sampleBlockingStub> {
    private sampleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sampleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sampleBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class sampleFutureStub extends io.grpc.stub.AbstractFutureStub<sampleFutureStub> {
    private sampleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sampleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sampleFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final sampleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(sampleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.save(
              (io.grpc.stub.StreamObserver<com.proto.sample.Sample.SaveResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class sampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    sampleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.sample.Sample.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("sample");
    }
  }

  private static final class sampleFileDescriptorSupplier
      extends sampleBaseDescriptorSupplier {
    sampleFileDescriptorSupplier() {}
  }

  private static final class sampleMethodDescriptorSupplier
      extends sampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    sampleMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (sampleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new sampleFileDescriptorSupplier())
              .addMethod(getSaveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
