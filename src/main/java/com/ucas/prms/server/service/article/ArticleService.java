

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
        public void  save(
         com.ucas.prms.server.service.article.Save save2

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getById3
                
         */

         
                     public com.ucas.prms.server.service.article.GetByIdResponse getById(

                        com.ucas.prms.server.service.article.GetById getById3)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getById3
            
          */
        public void startgetById(

            com.ucas.prms.server.service.article.GetById getById3,

            final com.ucas.prms.server.service.article.ArticleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getByIds5
                
         */

         
                     public com.ucas.prms.server.service.article.GetByIdsResponse getByIds(

                        com.ucas.prms.server.service.article.GetByIds getByIds5)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getByIds5
            
          */
        public void startgetByIds(

            com.ucas.prms.server.service.article.GetByIds getByIds5,

            final com.ucas.prms.server.service.article.ArticleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    