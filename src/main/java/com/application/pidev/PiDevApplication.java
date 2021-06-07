
package com.application.pidev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


@SpringBootApplication
@EntityScan(basePackageClasses = {
        PiDevApplication.class,
        Jsr310JpaConverters.class
})
public class PiDevApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiDevApplication.class, args);
    }

}
