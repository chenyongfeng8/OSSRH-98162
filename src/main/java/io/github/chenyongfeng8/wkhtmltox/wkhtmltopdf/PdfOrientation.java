package io.github.chenyongfeng8.wkhtmltox.wkhtmltopdf;

import io.github.chenyongfeng8.wkhtmltox.WkValue;

public enum PdfOrientation implements WkValue {
    PORTRAIT("Portrait"),
    LANDSCAPE("Landscape");

    private final String wkValue;

    PdfOrientation(String wkValue) {
        this.wkValue = wkValue;
    }

    @Override
    public String getWkValue() {
        return wkValue;
    }
}
