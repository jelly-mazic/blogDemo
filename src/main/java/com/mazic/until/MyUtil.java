package com.mazic.until;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;

public class MyUtil {
    public static String tranfer(String content){
        MutableDataSet option = new MutableDataSet();
        Parser parser = Parser.builder(option).build();
        HtmlRenderer renderer = HtmlRenderer.builder(option).build();
        Node document = parser.parse(content);
        return renderer.render(document);
    }
}
