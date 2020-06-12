package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;

public class test {
    @Value("${bpm.api.url.taskDetail}")
    private String taskDetailUrl;
    public static void main(String[] args) {


        String str =  "http://10.0.20.102:8271/task/%s";

        String newTaskDetailUrl = String.format(str, "17888");

        String newTaskDetailUrl2 = String.format(newTaskDetailUrl, "17888");

        test t =new test();
        System.out.println(newTaskDetailUrl);
    }
}
