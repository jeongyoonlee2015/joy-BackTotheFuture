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
