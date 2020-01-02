package org.competition.mapper;

import org.junit.Test;

import java.net.URLDecoder;

public class AsciiTest {
    @Test
    public void testAscii(){
        String name = "%E6%B5%99%E6%B1%9F%E7%9C%81%E7%94%B5%E4%BF%A1%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8";
        name = URLDecoder.decode(name);
        System.out.println(name);

    }
}
