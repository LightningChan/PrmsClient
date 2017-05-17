

/**
 * ArticleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

    package com.ucas.prms.server.service.article;

    /*
     *  ArticleService java interface
     */

    public interface ArticleService {
          

        /**
          * Auto generated method signature
          * 
                    * @param findAll0
                
         */

         
                     public com.ucas.prms.server.service.article.FindAllResponse findAll(

                        com.ucas.prms.server.service.article.FindAll findAll0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param findAll0
            
          */
        public void startfindAll(

            com.ucas.prms.server.service.article.FindAll findAll0,

            final com.ucas.prms.server.service.article.ArticleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  delete(
         com.ucas.prms.server.service.article.Delete delete2

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  save(
         com.ucas.prms.server.service.article.Save save3

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getById4
                
         */

         
                     public com.ucas.prms.server.service.article.GetByIdResponse getById(

                        com.ucas.prms.server.service.article.GetById getById4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getById4
            
          */
        public void startgetById(

            com.ucas.prms.server.service.article.GetById getById4,

            final com.ucas.prms.server.service.article.ArticleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getByIds6
                
         */

         
                     public com.ucas.prms.server.service.article.GetByIdsResponse getByIds(

                        com.ucas.prms.server.service.article.GetByIds getByIds6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getByIds6
            
          */
        public void startgetByIds(

            com.ucas.prms.server.service.article.GetByIds getByIds6,

            final com.ucas.prms.server.service.article.ArticleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    