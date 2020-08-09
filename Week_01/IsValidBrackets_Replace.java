package com.ruoyi.grokking.algorithms.string;

public class IsValidBrackets_Replace {

    public boolean isValid(String s) {
        String newS = s;
        while(newS.indexOf("()") > -1 || newS.indexOf("{}") > -1 || newS.indexOf("[]") > -1){
            newS = newS.replace("()","").replace("{}","").
                    replace("[]","");
        }
        return newS.length() == 0;
    }

}
