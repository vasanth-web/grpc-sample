package com.sample.server

import com.proto.sample.Sample
import mu.KotlinLogging
import com.proto.sample.sampleGrpc
import io.grpc.stub.StreamObserver

object SampleServiceImpl: sampleGrpc.sampleImplBase() {
    val logger = KotlinLogging.logger {  }

    override fun save(responseObserver: StreamObserver<Sample.SaveResponse>): StreamObserver<Sample.SaveRequest> {
        return object: StreamObserver<Sample.SaveRequest> {
            override fun onNext(request: Sample.SaveRequest) {
                logger.info { "SERVER: Receiving SaveRequest from the gRPC Client.." }
                logger.info { "SERVER: This is the SaveRequest: $request" }

                val saveResponse = Sample.SaveResponse.newBuilder()
                    .setId(request.id)
                    .setStatus(Sample.Status.SUCCESS)
                    .setMessage("Save successful")
                    .build()

                logger.info { "SERVER: Preparing the SaveResponse.." }
                logger.info { "SERVER: This is the SaveResponse: $saveResponse" }
                logger.info { "SERVER: Sending the SaveResponse to the gRPC Client.." }
                responseObserver.onNext(saveResponse)
            }

            override fun onError(throwable: Throwable) {
                logger.error { "SERVER: Error in receiving request from gRPC Client.." }
            }

            override fun onCompleted() {
                responseObserver.onCompleted()
            }
        }
    }

}