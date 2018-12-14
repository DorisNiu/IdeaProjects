package com.niu;


import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 */
public class Demo {

    //ncd到此一游
    
    private String lastName;//Field

    /**
     * @Description:    获取全名
     * @Author:         Ncd
     * @CreateDate:     2018/11/27 16:05
     * @UpdateUser:     Ncd
     * @UpdateDate:     2018/11/27 16:05
     * @UpdateRemark:   修改内容
     * @Version:        1.0
     */
    public String getFullName(String firstName) {

        System.out.println("your firstName is " + firstName);
        System.out.println("your lastName is " + this.lastName);

        String fullName = this.lastName + firstName;
        System.out.println(fullName);

        this.sayHello(firstName, lastName);

        return fullName;
    }

    /**
     * @Description:    对某某打招呼
     * @Author:         Ncd
     * @CreateDate:     2018/11/27 16:14
     * @UpdateUser:     Ncd
     * @UpdateDate:     2018/11/27 16:14
     * @UpdateRemark:   修改内容
     * @Version:        1.0
     */
    private  void sayHello(String firstName, String lastName) {
        System.out.println("Hello ，Mr/Mis " + firstName + lastName);
    }

    /**
     * Main函数
     */
    public static void main(String[] args) {
        System.out.println(args[0]);
        List list = new ArrayList<>();
        for (int i = 0; i < 100; i++) { System.out.println(i);
            try {
                Thread.sleep(1000L);
                System.out.println(System.currentTimeMillis() / 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public void foo(String firstName){
        validate();
        String lastName = "浩宇";
        sayHello(firstName, lastName);
        sayHello("刘","烨");
        sayHello("李","超");
        sayHello("赵","慧");


    }

    private void validate() {
        sayHello(lastName,"承栋");
        sayHello("宗","李丽华");
    }


}
