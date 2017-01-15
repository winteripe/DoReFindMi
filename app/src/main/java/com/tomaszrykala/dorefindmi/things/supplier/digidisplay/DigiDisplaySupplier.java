package com.tomaszrykala.dorefindmi.things.supplier.digidisplay;

import com.tomaszrykala.dorefindmi.things.supplier.BaseSupplier;

public interface DigiDisplaySupplier extends BaseSupplier {

    void display(int n);

    void display(String s);
}