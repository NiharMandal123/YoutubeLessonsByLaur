package org.example;


import beans.Cat;
import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Cat c = context.getBean(Cat.class);
            Owner o = context.getBean(Owner.class);
            c.setName("Leo");
            System.out.println(c);   System.out.println(o);

        }

    }
}