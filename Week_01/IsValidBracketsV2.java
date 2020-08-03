package com.ruoyi.grokking.algorithms.string;

public class IsValidBracketsV2 {

    public boolean isValid(String s) {
        String newStr = s;
        while (newStr.indexOf("{}") > -1 || newStr.indexOf("[]") > -1
                || newStr.indexOf("()") > -1) {
            newStr = newStr.replace("{}", "").replace("()", "").
                    replace("[]", "");
        }
        return newStr.length() == 0;
    }

}
