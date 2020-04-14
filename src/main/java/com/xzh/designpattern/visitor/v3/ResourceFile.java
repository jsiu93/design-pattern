package com.xzh.designpattern.visitor.v3;

/**
 * Visitor
 * Allows for one or more operation to be applied to a set of objects at runtime, decoupling the operations from the object structure.
 */
public abstract class ResourceFile {

    private String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract void accept(Visitor visitor);

}

class PPTFile extends ResourceFile {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class PdfFile extends ResourceFile {

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}




