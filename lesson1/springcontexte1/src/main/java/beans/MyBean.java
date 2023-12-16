package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean {
 private String name;
    @PostConstruct
     public void init(){
        this.name = "HELLO";
     }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
