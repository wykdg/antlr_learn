package wyk;

import java.util.HashMap;
import java.util.Stack;

public class ScopeTable {
    protected Stack<Scope> scopeList;

    ScopeTable() {
        scopeList = new Stack<Scope>();
        pushScope("global");
    }

    public void pushScope(String name) {
        Scope scope = new Scope(name);
        scopeList.push(scope);
    }

    public void pushScope(Scope scope) {
        scopeList.push(scope);
    }
    public void popScope() {
        scopeList.pop();
    }

    public String getCurrentScopeName() {
        return scopeList.peek().getScopeName();
    }
    public Scope top()
    {
        return scopeList.peek();
    }

    public Variable getVariable(String key) {
        for (int index = scopeList.size() - 1; index >= 0; --index) {
            Scope scope = scopeList.get(index);
            Variable value = scope.get(key);
            if (value != null) return value;

        }
        return null;
    }

    public void setVaribale(String key, Variable value) {
        Scope scope = scopeList.peek();
        scope.put(key, value);
    }
}

class ClassStruct extends ScopeTable {
    public Variable getVariable(String key) {
        int index = scopeList.size() - 1;
        Scope scope = scopeList.get(index);
        return scope.get(key);
    }
}

class Scope {
    private String scope_name;
    private HashMap<String, Variable> scope;

    Scope(String name) {
        scope_name = name;
        scope = new HashMap<>();
    }

    public Variable get(String key) {
        return scope.get(key);
    }

    public void put(String key, Variable value) {
        scope.put(key, value);
    }

    public String getScopeName() {
        return scope_name;
    }

    public Scope getScopeCopy() {

        Scope newScope = new Scope(scope_name);

        newScope.scope = (HashMap<String, Variable>) scope.clone();
        return newScope;

    }
}

class Variable {
    private String type;
    private Object value;

    Variable(Object value, String type) {
        this.type = type;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}