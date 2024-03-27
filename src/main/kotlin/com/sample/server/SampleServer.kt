package com.sample.server

import io.vertx.core.Vertx
import io.grpc.netty.NettyServerBuilder
import mu.KLogger
import mu.KotlinLogging
import java.net.InetSocketAddress


class SampleServer {
    val logger: KLogger = KotlinLogging.logger {  }

    fun createServer() {
        val server = NettyServerBuilder.forAddress(
            InetSocketAddress(
                "localhost",
                8080
            ))
            .addService(SampleServiceImpl)
            .build()

        logger.info { "Starting the gRPC Server.." }
        server.start()
    }
}