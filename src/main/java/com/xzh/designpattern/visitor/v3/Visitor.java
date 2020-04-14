package com.xzh.designpattern.visitor.v3;

public interface Visitor {

    void visit(PPTFile pptFile);
    void visit(PdfFile file);
    void visit(WordFile file);
}

