package com.sample.client

import com.proto.sample.Sample
import com.proto.sample.sampleGrpc
import io.grpc.ManagedChannel
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder
import io.grpc.stub.StreamObserver
import mu.KotlinLogging
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

object SampleClient {

    private val channel: ManagedChannel = NettyChannelBuilder
        .forAddress("localhost", 8080)
        .usePlaintext()
        .build()

    val logger = KotlinLogging.logger {  }

    fun save(id: Int): String {
        val latch = CountDownLatch(1)
        val client = sampleGrpc.newStub(channel)

        var saveResponse: Sample.SaveResponse? = null
        val requestObserver = client.save(object: StreamObserver<Sample.SaveResponse> {
            override fun onNext(response: Sample.SaveResponse) {
                logger.info { "CLIENT: Receiving SaveResponse from gRPC Server.." }
                logger.info { "CLIENT: This is the SaveResponse: $response" }
                saveResponse = response
            }

            override fun onError(throwable: Throwable) {
                logger.error { "CLIENT: Error in receiving response from gRPC Server.." }
                latch.countDown()
            }

            override fun onCompleted() {
                latch.countDown()
            }
        })

        val saveRequest = Sample.SaveRequest.newBuilder()
            .setId(id)
            .build()

        logger.info { "CLIENT: Sending SaveRequest from gRPC Client.." }
        logger.info { "CLIENT: This is the SaveRequest: $saveRequest" }
        requestObserver.onNext(saveRequest)
        requestObserver.onCompleted()

        try {
            latch.await(5, TimeUnit.SECONDS)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return saveResponse?.message ?: "No response from Server"
    }
}