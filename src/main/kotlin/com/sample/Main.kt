package com.sample

import com.sample.client.SampleClient
import com.sample.server.SampleServer
import mu.KLogger
import mu.KotlinLogging

fun main() {
    val logger: KLogger = KotlinLogging.logger {  }
    logger.info { "Starting the sample application.." }

    // Start the gRPC Server
    val sampleServer = SampleServer()
    sampleServer.createServer()

    // Sleep for 3 seconds
    Thread.sleep(3 * 1000)

    // Send the client request
    logger.info { "Requesting to save the id 12" }
    SampleClient.save(12)
}