package com.alibaba.easyexcel.test.core.aliases;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
public class IndexOrNameData {

//    @ExcelProperty(aliases = {"数学标题2", "数学标题3"})
//    private String name;
//
    @ExcelProperty(aliases = {"字符串标题", "字符串标题2"})
    private String title;

    @ExcelProperty(aliases = {"日期标题", "日期标题2"})
    private Date date;
}
