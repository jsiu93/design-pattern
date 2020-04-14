package com.xzh.designpattern.visitor.v2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> list = listAllResourceFile(args[0]);
        for (ResourceFile resourceFile : list) {
//            extractor.extract2txt(resourceFile);
            resourceFile.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : list) {
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFile(String arg) {
        List<ResourceFile> list = new ArrayList<>();
        list.add(new PdfFile("a.pdf"));
        list.add(new WordFile("b.doc"));
        return list;

    }
}
