package br.com.example.bean;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * MyBean
 */
@Stateless
public class MyBean {

    private Long count = 0L;

    /**
     * @return the count
     */
    public Long getCount() {
        return count;
    }

    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void add(){
        count++;
    }
}