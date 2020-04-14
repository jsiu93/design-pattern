package com.xzh.designpattern.visitor.v3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ResourceFile> list = listAllResourceFiles(args[0]);
        Visitor compressor = new Compressor();
        for (ResourceFile resourceFile : list) {
            resourceFile.accept(compressor);
        }

        Visitor extractor = new Extractor();
        for (ResourceFile resourceFile : list) {
            resourceFile.accept(extractor);
        }

    }

    private static List<ResourceFile> listAllResourceFiles(String arg) {

        return null;
    }

}
