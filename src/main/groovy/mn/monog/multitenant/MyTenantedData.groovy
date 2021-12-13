package mn.monog.multitenant

import grails.gorm.MultiTenant
import grails.gorm.annotation.Entity
import io.micronaut.core.annotation.Introspected

@Entity
@Introspected
class MyTenantedData implements MultiTenant<MyTenantedData> {
    String tenantId
    String name
}
