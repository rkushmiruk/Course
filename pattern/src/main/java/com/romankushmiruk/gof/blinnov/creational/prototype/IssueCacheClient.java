package com.romankushmiruk.gof.blinnov.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class IssueCacheClient implements Client<Issue> {
    private List<Issue> cache;

    public IssueCacheClient() {
        cache = new ArrayList<>();
    }

    public IssueCacheClient(List<Issue> cache) {
        this.cache = cache;
    }

    @Override
    public Issue cloneElementById(Integer id) {
        for (Issue issue : cache) {
            if (issue.getId().equals(id)) {
                return issue.clone();
            }
        }
        throw new IllegalArgumentException("illegal ID " + id);
    }

    @Override
    public List cloneElements(Object... param) {
        return null;
    }
}
