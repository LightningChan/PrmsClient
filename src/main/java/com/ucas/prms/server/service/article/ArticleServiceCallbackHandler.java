
/**
 * ArticleServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

    package com.ucas.prms.server.service.article;

    /**
     *  ArticleServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ArticleServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ArticleServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ArticleServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for findAll method
            * override this method for handling normal response from findAll operation
            */
           public void receiveResultfindAll(
                    com.ucas.prms.server.service.article.FindAllResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findAll operation
           */
            public void receiveErrorfindAll(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getById method
            * override this method for handling normal response from getById operation
            */
           public void receiveResultgetById(
                    com.ucas.prms.server.service.article.GetByIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getById operation
           */
            public void receiveErrorgetById(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getByIds method
            * override this method for handling normal response from getByIds operation
            */
           public void receiveResultgetByIds(
                    com.ucas.prms.server.service.article.GetByIdsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getByIds operation
           */
            public void receiveErrorgetByIds(java.lang.Exception e) {
            }
                


    }
    