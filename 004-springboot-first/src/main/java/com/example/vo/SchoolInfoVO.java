package com.example.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wangmufan
 * @date 2021/11/23
 * @apiNote
 */
@Component
@ConfigurationProperties(prefix = "school")
public class SchoolInfoVO {

    @Value("${school.name}")
    private String name;

    @Value("${school.website}")
    private String webSite;

    @Value("${school.address}")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SchoolInfoVO{" +
                "name='" + name + '\'' +
                ", webSite='" + webSite + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
