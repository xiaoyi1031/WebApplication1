/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Xiaoyi
 */
@ManagedBean
@RequestScoped
public class shoppingMB {

    private String objectName;
    private String storeName;
    
    public shoppingMB() {
    }
    
    public shoppingMB(String objectName){
        this.objectName = objectName;
        //this.storeName = null;
    }

    public shoppingMB(String objectName, String storeName) {
        this.objectName = objectName;
        this.storeName = storeName;
    }
    
    
    
}
