package com.wengyingjian.cheat;

import com.wengyingjian.cheat.config.Config;
import com.wengyingjian.cheat.config.ConfigLoader;

import java.io.IOException;

/**
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/6
 * @since 1.1
 */
public class Cheat {

    private static final String DEFAULT_CONFIG_FILE = "config.properties";

    /**
     * 启动项目
     */
    public static void run() throws IOException {
        Config config = new ConfigLoader().loadConfig(DEFAULT_CONFIG_FILE);

        String sourceFile = "/Users/wengyingjian/Desktop/a.png";
        String user = config.getUser();
        String host = config.getHost();
        String destFile = "test.png";
        String cmd = String.format("scp %s %s@%s:%s", sourceFile, user, host, destFile);
        System.out.println("执行命令:" + cmd);
        Runtime.getRuntime().exec(cmd);

    }


}
