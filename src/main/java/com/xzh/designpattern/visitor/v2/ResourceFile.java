package com.xzh.designpattern.visitor.v2;

public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract void accept(Extractor extractor);
    abstract void accept(Compressor compressor);
}

class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }

    @Override
    void accept(Compressor compressor) {
        compressor.compress(this);
    }
}

class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }

    @Override
    void accept(Compressor compressor) {
        compressor.compress(this);
    }
}


class Extractor {
    public void extract2txt(PdfFile file) {
        System.err.println("pdf file");
    }

    public void extract2txt(WordFile file) {
        System.err.println("word file");
    }
}

class Compressor {
    public void compress(PdfFile file) {
        System.err.println("pdf file");
    }

    public void compress(WordFile file) {
        System.err.println("word file");
    }
}


