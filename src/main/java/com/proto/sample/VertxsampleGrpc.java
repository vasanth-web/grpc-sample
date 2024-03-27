package com.proto.sample;

import static com.proto.sample.sampleGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by VertxGrpc generator",
comments = "Source: sample.proto")
public final class VertxsampleGrpc {
    private VertxsampleGrpc() {}

    public static sampleVertxStub newVertxStub(io.grpc.Channel channel) {
        return new sampleVertxStub(channel);
    }

    
    public static final class sampleVertxStub extends io.grpc.stub.AbstractStub<sampleVertxStub> {
        private final io.vertx.core.impl.ContextInternal ctx;
        private sampleGrpc.sampleStub delegateStub;

        private sampleVertxStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = sampleGrpc.newStub(channel);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        private sampleVertxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = sampleGrpc.newStub(channel).build(channel, callOptions);
            this.ctx = (io.vertx.core.impl.ContextInternal) io.vertx.core.Vertx.currentContext();
        }

        @Override
        protected sampleVertxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new sampleVertxStub(channel, callOptions);
        }

        
        public io.vertx.core.streams.ReadStream<com.proto.sample.Sample.SaveResponse> save(io.vertx.core.Handler<io.vertx.core.streams.WriteStream<com.proto.sample.Sample.SaveRequest>> hdlr) {
            return io.vertx.grpc.stub.ClientCalls.manyToMany(ctx, hdlr, delegateStub::save);
        }
    }

    
    public static abstract class sampleVertxImplBase implements io.grpc.BindableService {
        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public sampleVertxImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        
        public void save(io.vertx.core.streams.ReadStream<com.proto.sample.Sample.SaveRequest> request, io.vertx.core.streams.WriteStream<com.proto.sample.Sample.SaveResponse> response) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.proto.sample.sampleGrpc.getSaveMethod(),
                            asyncBidiStreamingCall(
                                    new MethodHandlers<
                                            com.proto.sample.Sample.SaveRequest,
                                            com.proto.sample.Sample.SaveResponse>(
                                            this, METHODID_SAVE, compression)))
                    .build();
        }
    }

    private static final int METHODID_SAVE = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final sampleVertxImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(sampleVertxImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SAVE:
                    return (io.grpc.stub.StreamObserver<Req>) io.vertx.grpc.stub.ServerCalls.manyToMany(
                            (io.grpc.stub.StreamObserver<com.proto.sample.Sample.SaveResponse>) responseObserver,
                            compression,
                            serviceImpl::save);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
