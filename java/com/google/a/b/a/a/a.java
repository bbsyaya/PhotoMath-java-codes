/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.util.Date
 *  java.util.TimeZone
 */
package com.google.a.b.a.a;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

public class a {
    private static final TimeZone a = TimeZone.getTimeZone((String)"UTC");

    private static int a(String string, int n2) {
        while (n2 < string.length()) {
            char c2 = string.charAt(n2);
            if (c2 < '0' || c2 > '9') {
                return n2;
            }
            ++n2;
        }
        return string.length();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int a(String string, int n2, int n3) throws NumberFormatException {
        int n4;
        int n5;
        if (n2 < 0 || n3 > string.length() || n2 > n3) {
            throw new NumberFormatException(string);
        }
        if (n2 < n3) {
            n4 = n2 + 1;
            int n6 = Character.digit((char)string.charAt(n2), (int)10);
            if (n6 < 0) {
                throw new NumberFormatException("Invalid number: " + string.substring(n2, n3));
            }
            n5 = - n6;
        } else {
            n4 = n2;
            n5 = 0;
        }
        while (n4 < n3) {
            int n7 = n4 + 1;
            int n8 = Character.digit((char)string.charAt(n4), (int)10);
            if (n8 < 0) {
                throw new NumberFormatException("Invalid number: " + string.substring(n2, n3));
            }
            n5 = n5 * 10 - n8;
            n4 = n7;
        }
        return - n5;
    }

    /*
     * Exception decompiling
     */
    public static Date a(String var0, ParsePosition var1_1) throws ParseException {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:366)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:422)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:220)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:165)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:91)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:354)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:751)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:683)
        // org.benf.cfr.reader.Main.doJar(Main.java:128)
        // com.njlabs.showjava.processor.JavaExtractor$1.run(JavaExtractor.java:100)
        // java.lang.Thread.run(Thread.java:841)
        throw new IllegalStateException("Decompilation failed");
    }

    private static boolean a(String string, int n2, char c2) {
        if (n2 < string.length() && string.charAt(n2) == c2) {
            return true;
        }
        return false;
    }
}

