package org.acme.getting.started;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerService {
    public String disccount(String categorie){
        String disccount = "0";
        if (categorie.equals("A")){
            disccount = "10.00";
        }else{
            disccount = "15.00";
        }
        return disccount;
    }
}
