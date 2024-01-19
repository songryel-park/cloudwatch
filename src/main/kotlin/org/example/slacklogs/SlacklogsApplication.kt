package org.example.slacklogs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SlacklogsApplication

fun main(args: Array<String>) {
	runApplication<SlacklogsApplication>(*args)
}
