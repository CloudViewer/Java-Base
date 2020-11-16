package com.fantasia.ibase.logical;

/**
 * Created by Ale on 2020/11/16
 */
public class LogicalOperator {
    public static void main(String[] args) {
        /**
         * 逻辑运算符 用作于布尔型时
         * 1、逻辑与 & ----> 两个为true 则为true,两个为false也为false,只要其中有一个为false 则结果为false
         * 2、逻辑或 | ----> 两个操作数有一个为 true 则结果为 true
         * 3、逻辑非 ! ----> 针对一个操作数 取反 当布尔变量为 false 则为 true
         * 4、逻辑异或 ^ ----> 当两个操作数相同时 则返回 false 只有不同时才返回 true
         * 5、短路与 && ----> 与逻辑与意思一致 不过效率要比短路与高
         * 6、短路或 || ----> 与逻辑或意思一致 不过效率要比短路与高
         * 注意： 短路 与 逻辑 的区别 (包括短路与&&、逻辑与&、短路或||、逻辑或|)，短路与见名知意在进行运算时，
         *  如第一个操作数不成立则直接返回结果，后面操作树不在进行运算，从而提高效率。逻辑与则反之，每一个操作数都进行运算在返回结果
         *
         */
//        boolean b = 1 < 0 & 1 < (3 / 0);	// 逻辑与 &
        System.out.println(~3);				// 输出：程序异常数字0不能做被除数
    }
}
