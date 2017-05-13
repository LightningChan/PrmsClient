

/**
 * ReplyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

    package com.ucas.prms.server.service.reply;

    /*
     *  ReplyService java interface
     */

    public interface ReplyService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getAllByArticleId0
                
         */

         
                     public com.ucas.prms.server.service.reply.GetAllByArticleIdResponse getAllByArticleId(

                        com.ucas.prms.server.service.reply.GetAllByArticleId getAllByArticleId0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllByArticleId0
            
          */
        public void startgetAllByArticleId(

            com.ucas.prms.server.service.reply.GetAllByArticleId getAllByArticleId0,

            final com.ucas.prms.server.service.reply.ReplyServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  save(
         com.ucas.prms.server.service.reply.Save save2

        ) throws java.rmi.RemoteException
        
        ;

        

        
       //
       }
    