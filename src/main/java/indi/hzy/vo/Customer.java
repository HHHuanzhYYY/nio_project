/**
 * Copyright (c) 2017,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:nio_project
 * Package Name:indi.hzy.vo
 * File Name:Customer.java
 * Date:2017年2月21日 下午3:23:53
 * 
 */
package indi.hzy.vo;

import java.io.Serializable;

/**
 * ClassName: Customer <br/>
 * Description: TODO <br/>
 * Date: 2017年2月21日 下午3:23:53 <br/>
 * <br/>
 * 
 * @author HZY(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class Customer implements Serializable {

    /**
     * serialVersionUID:TODO(描述这个变量用途).
     * 
     */
    private static final long serialVersionUID = -1023000449362887484L;

    private String name;
    
    private String gender;
    
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
