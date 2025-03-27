package com.alibaba.easyexcel.test.core.aliases;

import com.alibaba.easyexcel.test.util.TestFileUtil;
import com.alibaba.excel.EasyExcel;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @author Jiaju Zhuang
 */
public class AliasesDataTest {

    @Test
    public void aliases() throws Exception {
        File file = TestFileUtil.readFile("aliases" + File.separator + "aliases.xlsx");
        List<IndexOrNameData> data = EasyExcel.read(file).head(IndexOrNameData.class).headRowNumber(0).doReadAllSync();
        System.out.println(data);
    }
}
