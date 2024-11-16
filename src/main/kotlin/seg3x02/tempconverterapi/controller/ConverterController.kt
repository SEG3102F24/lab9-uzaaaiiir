package seg3x02.tempconverterapi.controller

import org.apache.logging.log4j.Logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("temperature-converter")
class ConverterController {
    @GetMapping("/celsius-fahrenheit/{celsius}")
    fun getFahrenheit(@PathVariable celsius: Double): Double {
        return ((celsius * 9) / 5 + 32)
    }

    @GetMapping("/fahrenheit-celsius/{fahrenheit}")
    fun getCelsius(@PathVariable fahrenheit: Double): Double {
        println("Fahrenheit: $fahrenheit")
        return ((fahrenheit - 32) * 5) / 9
    }

}
