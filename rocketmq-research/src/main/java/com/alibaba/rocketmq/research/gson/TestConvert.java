/**
 * 
 */
package com.alibaba.rocketmq.research.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 */
public class TestConvert {

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.setName("张三的通信录");
        contactBook.setCode(100);

        contactBook.getCustomField().put("CustomKey1", "CustomValue1");
        contactBook.getCustomField().put("CustomKey2", "CustomValue2");
        contactBook.getCustomField().put("CustomKey3", "CustomValue3");

        contactBook.getContactList().add(new Contact("刘德华", 54, 60.56, "本科", SexType.BOY));
        contactBook.getContactList().add(new Contact("张惠妹", 41, 52.69, "研究生", SexType.GIRL));
        contactBook.getContactList().add(new Contact("周星驰", 54, 61.22, "博士", SexType.BOY));

        String json = contactBook.encode();
        System.out.println(json);

        ContactBook d = ContactBook.decode(json, ContactBook.class);
        System.out.println(d);
    }
}
