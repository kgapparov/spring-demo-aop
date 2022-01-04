package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring containter
        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
        MembershipDAO member = context.getBean("membershipDAO", MembershipDAO.class);
        //call the buisiness method
        accountDAO.addAccount();
        member.addAccount();
        //close the context
        context.close();
    }
}
