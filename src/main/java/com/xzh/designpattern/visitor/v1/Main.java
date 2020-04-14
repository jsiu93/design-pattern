package com.xzh.designpattern.visitor.v1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ResourceFile> list = listAllResourceFile(args[0]);
        for (ResourceFile resourceFile : list) {
            resourceFile.extract2txt();
        }
    }

    private static List<ResourceFile> listAllResourceFile(String arg) {
        List<ResourceFile> list = new ArrayList<>();
        list.add(new PdfFile("a.pdf"));
        list.add(new WordFile("b.doc"));
        list.add(new PPTFile("c.ppt"));
        return list;
    }
}
