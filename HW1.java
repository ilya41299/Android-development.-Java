package com.company;

public
class Main
{
public
    static void main(String[] args)
    {
        byte myByte = 127;
        short myShort = 423;
        long myLong = 1234567890L;
        float myFloat = 52.13f;
        double myDouble = 3452892.5;
        char myChar = 'K';
        boolean myBoolean = true;
        int a = 4, b = 6, c = 10, d = 5;
        String myString = a + " + " + b + " in [10;20] is ";
        System.out.println("calculation " + calculation(a, b, c, d));
        System.out.println(myString + sumInRange(a, b));
        isNatural(0);
        leapYear(2020);
    }

public
    static int calculation(int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }

public
    static boolean sumInRange(int a, int b)
    {
        if ((a + b) >= 10 && (a + b) <= 20)
            return true;
        else
            return false;
    }

public
    static void isNatural(int a)
    {
        if (a >= 0)
            System.out.println(a + " is natural!");
        else
            System.out.println(a + " is not natural!");
    }

public
    static void leapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is leep year!");
        else
            System.out.println(year + " is not leep year!");
    }
}
package com.company;

public
class Main
{
public
    static void main(String[] args)
    {
        byte myByte = 127;
        short myShort = 423;
        long myLong = 1234567890L;
        float myFloat = 52.13f;
        double myDouble = 3452892.5;
        char myChar = 'K';
        boolean myBoolean = true;
        int a = 4, b = 6, c = 10, d = 5;
        String myString = a + " + " + b + " in [10;20] is ";
        System.out.println("calculation " + calculation(a, b, c, d));
        System.out.println(myString + sumInRange(a, b));
        isNatural(0);
        leapYear(2020);
    }

public
    static int calculation(int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }

public
    static boolean sumInRange(int a, int b)
    {
        if ((a + b) >= 10 && (a + b) <= 20)
            return true;
        else
            return false;
    }

public
    static void isNatural(int a)
    {
        if (a >= 0)
            System.out.println(a + " is natural!");
        else
            System.out.println(a + " is not natural!");
    }

public
    static void leapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is leep year!");
        else
            System.out.println(year + " is not leep year!");
    }
}
