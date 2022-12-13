package com.lzc.demo;

/**
 * @Description:
 * @ClassName: Test
 * @Author lzc
 * @Date: 2022/12/8 11:49
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int i = switch (1) {
            case 2,1 -> {
                yield 2;
            }
            case 3, 4 -> {
                yield 2;
            }
            default -> {
                yield 2;
            }
        };

       var per =  new Person("1","2");

        System.out.println();
    }


    public record Person (String firstName, String lastName) {}



}
