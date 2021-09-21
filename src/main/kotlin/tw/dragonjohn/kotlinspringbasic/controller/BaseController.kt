package tw.dragonjohn.kotlinspringbasic.controller

import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RestController

@RestController
class BaseController {

    @GetMapping("/")
    fun home(): String? {
        return "Hello Docker World with Kotlin and Spring Framework"
    }
}