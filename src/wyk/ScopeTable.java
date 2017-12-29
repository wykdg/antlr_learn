package wyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ScopeTable {
    private Stack<Scope> scopeList;

    ScopeTable() {
        scopeList = new Stack<Scope>();
        pushScope("global");
    }

    public void pushScope(String name) {
        Scope scope = new Scope(name);
        scopeList.push(scope);
    }

    public void popScope() {
        scopeList.pop();
    }

    public String getCurrentScopeName() {
        return scopeList.peek().getScope_name();
    }

    public Integer getVariable(String key) {
        for (int index = scopeList.size() - 1; index >= 0; --index) {
            Scope scope = scopeList.get(index);
            Integer value = scope.get(key);
            if (value != null) return value;

        }
        return null;
    }

    public void setVaribale(String key, Integer value) {
        Scope scope = scopeList.peek();
        scope.put(key, value);
    }


}

class Scope {
    private String scope_name;
    private HashMap<String, Integer> scope;

    Scope(String name) {
        scope_name = name;
        scope = new HashMap<String, Integer>();
    }

    public Integer get(String key) {
        return scope.get(key);
    }

    public void put(String key, Integer value) {
        scope.put(key, value);
    }

    public String getScope_name() {
        return scope_name;
    }
}
