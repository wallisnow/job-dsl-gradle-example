package com.dslexample.util

import com.jidesoft.swing.JideSplitButton;

@Grab(group = 'com.jidesoft', module = 'jide-oss', version = '[2.2.1,2.3.0)')
public class CommonUtils {
    public static String testMethod() {
        return JideSplitButton.class.name;
    }
}