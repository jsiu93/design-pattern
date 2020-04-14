package com.xzh.designpattern.visitor.v3;

public class Extractor implements Visitor {
    @Override
    public void visit(PPTFile pptFile) {
        System.err.println("extract ppt");
    }

    @Override
    public void visit(PdfFile file) {

        System.err.println("extract pdf");
    }

    @Override
    public void visit(WordFile file) {

        System.err.println("extract word");
    }
}
