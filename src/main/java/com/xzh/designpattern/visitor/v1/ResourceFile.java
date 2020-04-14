package com.xzh.designpattern.visitor.v1;

public abstract class ResourceFile {

    private String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract void extract2txt();
}

class PPTFile extends ResourceFile {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.err.println("Extract PPT.");

    }
}

class PdfFile extends ResourceFile {

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.err.println("Extract Pdf.");

    }
}

class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.err.println("Extract Word.");

    }
}




