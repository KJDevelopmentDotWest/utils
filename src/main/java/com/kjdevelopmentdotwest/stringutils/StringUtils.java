package com.kjdevelopmentdotwest.stringutils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public boolean isPositiveNumber(String str){
        if(NumberUtils.isParsable(str)){
            return Integer.parseInt(str) > 0;
        } else {
            throw new NumberFormatException();
        }
    }

}
