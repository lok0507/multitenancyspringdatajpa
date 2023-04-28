package org.example;

public class TenantContext {
    public static final ThreadLocal<String> current_tenant = new ThreadLocal<>();

    public static String getCurrentTenant() {
        return current_tenant.get();
    }

    public static void setCurrentTenant(String tenant) {
        current_tenant.set(tenant);
    }
}
