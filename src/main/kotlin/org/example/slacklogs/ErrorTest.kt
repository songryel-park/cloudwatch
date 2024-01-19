package org.example.slacklogs

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ErrorTest {
    private val logger = LoggerFactory.getLogger(ErrorTest::class.java)

    @GetMapping("/test")
    fun doSomething() {
        logger.error("에러")
        logger.warn("경고")
        logger.info("정보")
        logger.debug("디버그")
    }
}