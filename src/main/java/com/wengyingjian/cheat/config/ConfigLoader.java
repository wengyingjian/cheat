package com.wengyingjian.cheat.config;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/6
 * @since 1.1
 */
public class ConfigLoader {

    public Properties loadProperties(String configFile) {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream(configFile));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("文件[" + configFile + "]加载失败!");
        }
        return properties;
    }

    /**
     * 加载配置文件
     *
     * @param configFile
     * @return
     */
    public Config loadConfig(String configFile) {
        Properties prop = loadProperties(configFile);
        return createConfig(prop);
    }

    private Config createConfig(Properties prop) {
        Config config = new Config();
        Class<Config> clazz = Config.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                field.set(config, prop.get(field.getName()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                throw new RuntimeException("属性[" + field.getName() + "]设置失败");
            }
        }
        return config;
    }

}
