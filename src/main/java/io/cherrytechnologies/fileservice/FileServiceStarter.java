package io.cherrytechnologies.fileservice;


import static io.cherrytechnologies.fileservice.util.Util.faker;

public class FileServiceStarter {
    public static void main(String[] args) {
        System.out.println("Running");
        System.out.println(faker().name().fullName());
    }
}
