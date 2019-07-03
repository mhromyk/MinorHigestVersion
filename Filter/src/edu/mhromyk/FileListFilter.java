package edu.mhromyk;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Maks on 7/3/2019.
 */
public class FileListFilter {

    public static void main(String[] args) {
        List<FileEntity> fileEntityList = Arrays.asList(
                new FileEntity(1,1,0),
                new FileEntity(2,1,0),
                new FileEntity(2,2,0),
                new FileEntity(3,1,0),
                new FileEntity(3,1,0),
                new FileEntity(3,3,0),
                new FileEntity(4,1,0),
                new FileEntity(4,1,2),
                new FileEntity(4,2,2),
                new FileEntity(4,2,1),

                new FileEntity(5,1,0),
                new FileEntity(5,1,2),
                new FileEntity(5,2,1),
                new FileEntity(5,2,2)
        );

        fileEntityList.forEach(System.out::println);

        applyMinorHighestVersionFilter(fileEntityList);
//        System.out.println("after filtering");
//        fileEntityList.forEach(System.out::println);

    }

    private static void applyMinorHighestVersionFilter(List<FileEntity> input) {
        Collection<FileEntity> result = input.stream().collect(
                Collectors.toMap(FileEntity::getMajorVersion, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparingInt(v->v.getMinorVersion()*1000+v.getPatchVersion())))
                ).values();
        System.out.println("result:");
        result.forEach(System.out::println);
    }
}
