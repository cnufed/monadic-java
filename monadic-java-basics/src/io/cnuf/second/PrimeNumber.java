package io.cnuf.second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        List<int[]> collect = Stream.iterate(0, i -> i + 1).limit(10)
                .flatMap(i -> Stream.iterate(1, j -> j + 2).limit(20)
                        .map(k -> new int[]{i, k}))
                .filter(p -> PrimeNumber.isPrime(p[0] + p[1]))
                .collect(Collectors.toList());

        System.out.println(Arrays.deepToString(collect.toArray()));
    }

    public static boolean isPrime(int n) {
        return Stream.iterate(2, i -> i+1)
                .limit((long) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }
}
