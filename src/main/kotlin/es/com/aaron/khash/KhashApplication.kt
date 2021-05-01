package es.com.aaron.khash

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KhashApplication

fun main(args: Array<String>) {
	runApplication<KhashApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
