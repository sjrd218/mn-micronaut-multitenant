package mn.monog.multitenant

import grails.gorm.multitenancy.CurrentTenant
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.grails.datastore.mapping.mongo.MongoDatastore

@Singleton
@CurrentTenant
class MyTenantedService {

    @Inject
    MongoDatastore datastore

    MyTenantedData create(String name) {
        MyTenantedData data = new MyTenantedData()
        data.name = name
        data.save()
        return data
    }

}
