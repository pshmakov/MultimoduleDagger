package com.example.baz_public;

public class BazProvider {

    public static BazComponent getComponent() {
        try {
            return (BazComponent) Class.forName("com.example.baz_internal.BazProviderImpl")
                    .getMethod("getComponent").invoke(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
