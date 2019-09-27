package com.effective.item1;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.*;

/**
 * 第1条：考虑用静态方法而不是构造器
 *
 * 静态工厂方法的第优势:
 * 优势一，它们有名字。
 * 优势二，不像构造器，静态工厂方法不必在每次被调用时都产生一个新的对象。
 * 优势三，不像构造器，静态工厂方法能返回原返回类型的任意子类型的对象。
 * 优势四，可以根据调用时传入的不同参数而返回不同类的对象。
 * 优势五，在编写包含该方法的类时，返回对象的类不需要存在。
 *
 * 静态工厂方法和公有构造器都有它们各自的用途，我们需要了解它们各自的优点。
 * 通常情况下静态工厂更可取，因此尽量避免第一反应就是用公有构造器，而不是先考虑静态工厂。
 */
public class StaticFactoryDemo {

    public enum Rank {
        JACK, QUEEN, KING
    }

    /**
     * 通用的命名规则
     */
    public static void main(String[] args) throws IOException {

        // from—A type-conversion method that takes a single parameter and returns a corresponding
        // instance of this type.
        // from—这种方式通过给方法传入单个参数，然后返回该类型的相应实例。
        Date d = Date.from(Instant.now());
        System.out.println(d);

        // of—An aggregation method that takes multiple parameters and returns an instance of this
        // type that incorporates them.
        // of—这种方式通过给方法传入多个参数，然后返回一个包含了这些参数的该类型实例。
        Set<Rank> faceCards = EnumSet.of(Rank.JACK, Rank.QUEEN, Rank.KING);
        System.out.println(faceCards);

        // valueOf—A more verbose alternative to from and of.
        // valueOf—from和of更为详细的替代方式。
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
        System.out.println(prime);

        // instance or getInstance—Returns an instance that is described by its parameters (if any)
        // but cannot be said to have the same value
        // instance or getInstance—返回一个由参数（如果有的话）描述的实例，但不能说具有相同的值。
        StackWalker luke = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
        luke.forEach(System.out::println);

        // create or newInstance—Like instance or getInstance, except that the method guarantees that
        // each call returns a new instance.
        // create or newInstance—类似于instance或getInstance, 只不过保证每次调用都返回一个新的实例。
        Object newArray = Array.newInstance(String.class, 3);
        Array.set(newArray, Array.getLength(newArray) - 1, "INDEX 3");
        System.out.println(Array.get(newArray, Array.getLength(newArray) - 1));

        // getType—Like getInstance, but used if the factory method is in a different class.
        // Type is the type of object returned by the factory method.
        // getType—类似于getInstance，但一般在工厂方法包含在不同类的情况下使用。Type是工厂方法返回的对象的类型。
        FileStore fs = Files.getFileStore(Paths.get("./"));
        System.out.println(fs.getBlockSize());

        // newType—Like newInstance, but used if the factory method is in a different class.
        // Type is the type of object returned by the factory method.
        // newType—类似于newInstance，但一般在工厂方法包含在不同类的情况下使用。Type是工厂方法返回的对象的类型。
        BufferedReader br = Files.newBufferedReader(Paths.get("./"));
        br.close();

        // type—A concise alternative to getType and newType.
        // type—getType和newType简洁的替换方式。
        List<Rank> ranks = Collections.list(new Vector<>(faceCards).elements());
        ranks.forEach(rank -> System.out.print(rank + "\t"));
        System.out.print("\n");
    }
}
