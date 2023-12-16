package org.example;


import beans.MyBean;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductDeliveryService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                 //try commenting out the try with resources...
        /*
        * Whenever we create an object with the new keyword and not using the context ,
        * spring is not aware of it . So spring does not call the post construct .
        *          *
        * */
        try(var context = new  AnnotationConfigApplicationContext(ProjectConfig.class)){
//            MyBean b1 = context.getBean(MyBean.class);
//            //b1.setName("Nihar");
//            System.out.println(b1.getName());
//            MyBean b2 = context.getBean(MyBean.class);
//            System.out.println(b2.getName());
            ProductDeliveryService productDeliveryService = context.getBean(ProductDeliveryService.class);
            productDeliveryService.addSomeProducts();;
        }

    }
}