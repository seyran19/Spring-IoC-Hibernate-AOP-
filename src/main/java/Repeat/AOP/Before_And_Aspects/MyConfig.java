package Repeat.AOP.Before_And_Aspects;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Repeat.AOP")
@EnableAspectJAutoProxy
public class MyConfig {
}
