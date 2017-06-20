package com.gooddata.test;
import java.io.File;
import java.net.URISyntaxException;

public class zzz {

    public void printResource() throws URISyntaxException {
        File fixture = new File(zzz.class.getResource("/fixtures").toURI());
        String[] files = fixture.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
