# GraphQLusingApacheSolr
GraphQL Demo using Apache Solr


The steps to run and test the application:
1. Run the application as a Spring Maven Application
2. You can use postman to run the endpoints
3. You can use the solr interface to execute GraphQL queries at "http://localhost:8983/solr"

#Sample Solr Queries/Mutations:
 ### Select core on the left menu
    (in our case Order)
 
1. Mutation:<br />
  a. Select `Documents` option under the selected core<br />
  b. You can now add documents either by adding it in JSON or uploading a json file<br />
  c. Hit `Submit Document`<br /><br />
  
2. Query:<br />
  a. Select the `Query` option under the selected core<br />
  b. You can specify the parameters which you want to query in  `q` textbox
  c. Sample queries as below:

```Query
orderDescription:abc
```

```Query
orderDescription:abc
OR
productName:qwerty
```
  You can try various combinations like above using keywords like AND, OR, etc.

Reference link for Apache Solr Querying Documentation: "https://lucene.apache.org/solr/guide/6_6/common-query-parameters.html"
