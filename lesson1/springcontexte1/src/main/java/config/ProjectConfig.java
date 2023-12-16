package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"beans","repositories","services"})
public class ProjectConfig {
//@Bean("A")
//@Primary
//    public MyBean myBean()
//{
//    MyBean b1 = new MyBean();
//    b1.setName("Mandal");
//    return b1;
//    //return new MyBean();
//}
//    @Bean("B")
//    public MyBean myBean2()
//    {
//        MyBean b1 = new MyBean();
//        b1.setName("Nayanthara");
//        return b1;
//        //return new MyBean();
//    }
}
