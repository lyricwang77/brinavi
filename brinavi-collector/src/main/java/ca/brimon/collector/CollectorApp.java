package ca.brimon.collector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class CollectorApp
{
    public static void main( String[] args )
    {
        System.setProperty("spring.config.location", "/etc/brimon/brinavi-collector.yml");
        SpringApplication.run(CollectorApp.class, args);
    }
}
