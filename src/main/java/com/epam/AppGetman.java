package com.epam;

import com.epam.getmans.Getman;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by Maksym_Mazurkevych on 3/29/2016.
 */
public class AppGetman {

    public static void main(String[] args) throws Exception {

        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(System.getProperty("user.dir") + "\\src\\main\\resources\\spring-config.xml"));
        Getman getman = (Getman) factory.getBean("SagayToCrimea");
        getman.GoToCampaign();
    }

//    @Before
//    public void initSpringConfig() {
//        context = new ClassPathXmlApplicationContext("spring-config.xml");
//    }

}
