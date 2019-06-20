# Effectice ML Summary


* TensorFlow contains multiple abstraction levels

| | |
| :------------: | -----------: | 
| tf.estimator |High-level API for distributed training | 
| tf.layers, tf.losses, tf.metrics | components useful when building custom NN models | 
| core TensorFlow(Python) | Python API gives you full control |
| core TensorFlow(C++) | C++ API is quite low level |
| CPU GPU TPU Android | TF runs on different hardware |


### To build effectiv ML, I need :
1. Big Data
2. Feature Engineering
3. Model Architectures

# Fully managed ML Summary
* Who does the preprocessing?
* Who will do the input transformations on behalf of the client code?

Input - Preprocessing - Feature creation - Train model - Model(TF) - (Deploy) - WebApp
-(Prediction || REST API call with input variables) - Clients


## Big Query is a severless data warehouse

1. Interactive analysis of petabyte scale databases.
2. Familiar, SQ: 2-11 query language and functions.
3. Many ways to ingest, transform, load, export data to/from BigQuery.
4. Nested and repeated fields, user-defined functions.
    * JSON is hierachical format.
5. Data Storage is inexpensive; queries charged on amout of data processed (or a monthly flat rate).
    * Seperated Storage and Compute.
    
 ## Datalab
 #### Datalab notebooks are developed in an iterative, collaborative process
 Phase 1. Write code in Python
 
 Phase 2. Run cell
 
 Phase 3. Examin Ouput
 
 Phase 4. Write commentary in markdown
 
 Phase 5. Share and collaborate
