resteasy-client-on-eap6
=======================

A RESTEasy client APP configured to run on EAP 6.x

When we deploy an application that isn't a JAX-RS application, but uses RESTeasy client API, we need to configure it properly to work on EAP 6 due issues with providers initialization. You must either package your own RESTEasy or manually initialize the providers using RegisterBuiltin. More information is in article https://access.redhat.com/solutions/424523

* Providers are classes used by JAX-RS to parse HTTP body(MessageBodyreaders and Writers) and others stuff;

This application is based on EAP 6.2 quickstarts and to deploy it simply start EAP 6.2 and use the following maven command to deploy it:


mvn clean package jboss-as:deploy





