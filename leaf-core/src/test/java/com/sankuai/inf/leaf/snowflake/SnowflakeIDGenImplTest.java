package com.sankuai.inf.leaf.snowflake;

import com.sankuai.inf.leaf.IDGen;
import com.sankuai.inf.leaf.common.PropertyFactory;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import org.junit.Test;

import java.util.Properties;

public class SnowflakeIDGenImplTest {
    @Test
    public void testGetId() {
        Properties properties = PropertyFactory.getProperties();

        IDGen idGen = new SnowflakeIDGenImpl(properties.getProperty("leaf.zk.list"), 8080);
        long start = System.currentTimeMillis();
        for (long i = 1; i < 100000l; ++i) {
            Result r = idGen.get("a");
//            if (r.getId())
//            if ((r.getId() + "").length() != 18 || r.getStatus() != Status.SUCCESS) {
                System.out.println(r);
//            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
