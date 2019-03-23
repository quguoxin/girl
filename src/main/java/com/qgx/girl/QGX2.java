package com.qgx.girl;

import lombok.Data;

import java.util.List;

@Data
public class QGX2 {

    private int age;

    private String name;

    private List<String> idList;

    private List<GirlEntity> girlLists;
}
