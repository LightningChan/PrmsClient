

/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

    package com.ucas.prms.server.service.impl;

    /*
     *  UserService java interface
     */

    public interface UserService {
          

        /**
          * Auto generated method signature
          * 
                    * @param findAll0
                
         */

         
                     public com.ucas.prms.server.service.impl.FindAllResponse findAll(

                        com.ucas.prms.server.service.impl.FindAll findAll0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param findAll0
            
          */
        public void startfindAll(

            com.ucas.prms.server.service.impl.FindAll findAll0,

            final com.ucas.prms.server.service.impl.UserServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param login2
                
         */

         
                     public com.ucas.prms.server.service.impl.LoginResponse login(

                        com.ucas.prms.server.service.impl.Login login2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param login2
            
          */
        public void startlogin(

            com.ucas.prms.server.service.impl.Login login2,

            final com.ucas.prms.server.service.impl.UserServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  save(
         com.ucas.prms.server.service.impl.Save save4

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getById5
                
         */

         
                     public com.ucas.prms.server.service.impl.GetByIdResponse getById(

                        com.ucas.prms.server.service.impl.GetById getById5)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getById5
            
          */
        public void startgetById(

            com.ucas.prms.server.service.impl.GetById getById5,

            final com.ucas.prms.server.service.impl.UserServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getByIds7
                
         */

         
                     public com.ucas.prms.server.service.impl.GetByIdsResponse getByIds(

                        com.ucas.prms.server.service.impl.GetByIds getByIds7)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getByIds7
            
          */
        public void startgetByIds(

            com.ucas.prms.server.service.impl.GetByIds getByIds7,

            final com.ucas.prms.server.service.impl.UserServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    