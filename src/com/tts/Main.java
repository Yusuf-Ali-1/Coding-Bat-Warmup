package com.tts;



public class Main {

    public static void main(String[] args) {


    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepIn= new boolean[weekday,vacation] sleep_in;
        boolean sleep_in;
        if (!weekday || vacation) {
            return true;
        }

        return false;

        // Solution notes: better to write "vacation" than "vacation == true"
        // though they mean exactly the same thing.
        // Likewise "!weekday" is better than "weekday == false".
        // This all can be shortened to: return (!weekday || vacation);
        // Here we just put the return-false last, or could use an if/else.
        System.out.println(sleep_in);
    }


}
