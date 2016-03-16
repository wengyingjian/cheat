package com.wengyingjian.cheat.config;

/**
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 16/3/6
 * @since 1.1
 */
public class Config {
    String rootDir;
    String user;
    String host;
    String filePrefix;
    String fileSuffix;

    public String getRootDir() {
        return rootDir;
    }

    public void setRootDir(String rootDir) {
        this.rootDir = rootDir;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }


    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }
}
