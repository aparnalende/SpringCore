package com.methodinjection;

public abstract class SingletonBean {
	private PrototypeBean prototypeBean;
    public SingletonBean()
    {
        System.out.println("Singleton Bean Instantiated !!");
    }
//    public PrototypeBean getPrototypeBean() {
//        return prototypeBean;
//    }
//    public void setPrototypeBean(PrototypeBean prototypeBean) {
//        this.prototypeBean = prototypeBean;
//    }
    public abstract PrototypeBean getPrototypeBean();  
}
