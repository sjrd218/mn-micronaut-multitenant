## MongoDb Micronaut MultiTenancy

Testing GORM multi-tenancy with MongoDb and Micronaut

Currently a bug exists where the multitenancy settings are not applied to the
MongoDatastore, so this application does not work.

To test, boot the app with a mongodb listening on localhost at the default port,
go into the scripts folder and run `doTest.sh`

You will see an error in the app log: "Current datastore [org.grails.datastore.mapping.mongo.MongoDatastore] is not configured for Multi-Tenancy"

Look at the application.yml to verify that the datastore should be using a discriminator tenant id strategy,
with a http header tenant resolver.