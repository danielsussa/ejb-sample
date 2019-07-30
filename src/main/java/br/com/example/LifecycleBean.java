package br.com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import br.com.example.bean.MyBean;

/**
 * Singleton
 */
@Startup
@Singleton
public class LifecycleBean {

  @Inject
  private MyBean bean;

  @PostConstruct
  public void init() {
 
  }

  @PreDestroy
  public void destroy() {
    /* Shutdown stuff here */
    System.out.println("logging: "+bean.getCount());
  }

}