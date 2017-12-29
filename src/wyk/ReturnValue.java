package wyk;

class ReturnValue extends RuntimeException {
    Object value;

    ReturnValue(Object v) {
        value = v;
    }

    Object getValue() {
        return value;
    }
}
