package com.gooddata.test;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.stream.Collectors;

public class zzz {

    public void printResource() throws URISyntaxException {
        File fixture = new File(zzz.class.getResource("/fixtures").toURI());
        String[] files = fixture.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }

    public File getResourceFile() throws URISyntaxException {
        return new File(zzz.class.getResource("/fixtures").toURI());
    }

    public void printResource2() {
        InputStream is = zzz.class.getResourceAsStream("/fixtures");

        String result = new BufferedReader(new InputStreamReader(is))
                .lines().collect(Collectors.joining("\n"));
        System.out.println(result);
    }

    public static void main(String[] args) throws URISyntaxException {
        zzz z = new zzz();
        z.printResource2();
    }
}
