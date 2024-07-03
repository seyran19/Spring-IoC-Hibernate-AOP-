package Repeat.IoCAndDI.ThirdWay;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Repeat.IoCAndDI.ThirdWay")
@PropertySource("classpath:Repeat/IoCAndDI/FirstWay/myAppFirst.properties")
public class MyConfig {
}
