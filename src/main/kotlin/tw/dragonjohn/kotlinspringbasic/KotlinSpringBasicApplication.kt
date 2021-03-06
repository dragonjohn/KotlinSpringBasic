package tw.dragonjohn.kotlinspringbasic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class KotlinSpringBasicApplication


fun main(args: Array<String>) {
	runApplication<KotlinSpringBasicApplication>(*args)
}
