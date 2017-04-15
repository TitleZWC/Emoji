package com.titlezwc.emoji;

/**
 * Created by TitleZWC on 2017/4/15.
 */

public class EmojiUtils {
    public static String getEmojiStringByUnicode(int unicode) {
        return new String(Character.toChars(unicode));
    }
}
