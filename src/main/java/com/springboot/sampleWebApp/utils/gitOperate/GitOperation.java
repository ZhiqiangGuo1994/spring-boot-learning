package com.springboot.sampleWebApp.utils.gitOperate;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

/**
 * @author 10361
 */
public class GitOperation {

    public CredentialsProvider createCredenTials(String username, String password) {
        CredentialsProvider credentialsProvider = new UsernamePasswordCredentialsProvider(username, password);
        return credentialsProvider;
    }

    public void cloneDemo(){}
}
