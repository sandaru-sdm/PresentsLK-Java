package com.sdm.presentslk;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

public class Main {
    public static void main(String[] args) throws LifecycleException{
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        Context context = tomcat.addWebapp("/prelk", new File("./src/main/webapp").getAbsolutePath());
        context.setAllowCasualMultipartParsing(true);

        tomcat.start();

//        WebResourceRoot root = new StandardRoot(context);
//        String path = new File("./target/classes").getAbsolutePath();
//        root.addPreResources(new DirResourceSet(root, "/WEB-INF/classes", path,"/"));
//        context.setResources(root);
//
//        try{
//            tomcat.start();
//            tomcat.getServer().await();
//        } catch (LifecycleException ex){
//            throw new RuntimeException(ex);
//        }

    }
}
