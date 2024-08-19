package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class String1Test. Dont edit or it will mess up your grade :)
 *
 * @author Mr. Johnson
 * @version 8/12/24 v1 (a version number or a date)
 */
public class TestString1
{
    private String1 testStrings = new String1();

    @Test
    public void helloNameTest(){
        assertEquals("Hello Bob!", testStrings.helloName("Bob"));
        assertEquals("Hello Alice!", testStrings.helloName("Alice"));
        assertEquals("Hello X!", testStrings.helloName("X"));
    }

    @Test
    public void makeAbbaTest(){
        assertEquals("HiByeByeHi", testStrings.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", testStrings.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", testStrings.makeAbba("What", "Up"));

    }

    @Test
    public void makeTagsTest(){
        assertEquals("<i>Yay</i>", testStrings.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", testStrings.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", testStrings.makeTags("cite", "Yay"));
    }

    @Test
    public void makeOutWordTest(){
        assertEquals("<<Yay>>", testStrings.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", testStrings.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", testStrings.makeOutWord("[[]]", "word"));
    }

    @Test
    public void extraEndTest(){
        assertEquals("lololo", testStrings.extraEnd("Hello"));
        assertEquals("ababab", testStrings.extraEnd("ab"));
        assertEquals("HiHiHi", testStrings.extraEnd("Hi"));
    }

    @Test
    public void firstTwoTest(){
        assertEquals("He", testStrings.firstTwo("Hello"));
        assertEquals("ab", testStrings.firstTwo("abcdefg"));
        assertEquals("ab", testStrings.firstTwo("ab"));
    }

    @Test
    public void firstHalfTest(){
        assertEquals("Woo", testStrings.firstHalf("WooHoo"));
        assertEquals("Hello", testStrings.firstHalf("HelloThere"));
        assertEquals("abc", testStrings.firstHalf("abcdef"));
    }

    @Test
    public void withoutEndTest(){
        assertEquals("ell", testStrings.withoutEnd("Hello"));
        assertEquals("av", testStrings.withoutEnd("java"));
        assertEquals("odin", testStrings.withoutEnd("coding"));
    }

    @Test
    public void comboStringTest(){
        assertEquals("hiHellohi", testStrings.comboString("hi", "Hello"));
        assertEquals("hiHellohi", testStrings.comboString("Hello", "hi"));
        assertEquals("baaab", testStrings.comboString("aaa", "b"));
    }

    @Test
    public void middleThreeTest(){
        assertEquals("and", testStrings.middleThree("Candy"));
        assertEquals("and", testStrings.middleThree("and"));
        assertEquals("lvi", testStrings.middleThree("solving"));
    }

    @Test
    public void extraFrontTest(){
        assertEquals("HeHeHe", testStrings.extraFront("Hello"));
        assertEquals("ababab", testStrings.extraFront("ab"));
        assertEquals("HHH", testStrings.extraFront("H"));
    }

    @Test
    public void left2Test(){
        assertEquals("lloHe", testStrings.left2("Hello"));
        assertEquals("vaja", testStrings.left2("java"));
        assertEquals("Hi", testStrings.left2("Hi"));
    }

    @Test
    public void hasBadTest(){
        assertEquals(true, testStrings.hasBad("badxx"));
        assertEquals(true, testStrings.hasBad("xbadxx"));
        assertEquals(false , testStrings.hasBad("xxbadxx"));
    }

    @Test
    public void conCatTest(){
        assertEquals("abcat", testStrings.conCat("abc", "cat"));
        assertEquals("dogcat", testStrings.conCat("dog", "cat"));
        assertEquals("abc", testStrings.conCat("abc", ""));
    }

    @Test
    public void minCatTest(){
        assertEquals("loHi", testStrings.minCat("Hello", "Hi"));
        assertEquals("ellojava", testStrings.minCat("Hello", "java"));
        assertEquals("javaello", testStrings.minCat("java", "Hello"));
    }

    @Test
    public void withoutXTest(){
        assertEquals("Hi", testStrings.withoutX("xHix"));
        assertEquals("Hi", testStrings.withoutX("xHi"));
        assertEquals("Hxi", testStrings.withoutX("Hxix"));
    }

    @Test
    public void deFrontTest(){
        assertEquals("llo", testStrings.deFront("Hello"));
        assertEquals("va", testStrings.deFront("java"));
        assertEquals("aay", testStrings.deFront("away"));
    }
}
