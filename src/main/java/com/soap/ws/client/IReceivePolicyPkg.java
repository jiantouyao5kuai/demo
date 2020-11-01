
package com.soap.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IReceivePolicyPkg", targetNamespace = "http://cxfcenter.web.com/")
@XmlSeeAlso({
    SoapObjectFactory.class
})
public interface IReceivePolicyPkg {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.soap.ws.client.generated.GetBestPolicyForPNRResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBestPolicyByPnrContext", targetNamespace = "http://cxfcenter.web.com/", className = "com.soap.ws.client.generated.GetBestPolicyByPnrContext")
    @ResponseWrapper(localName = "getBestPolicyByPnrContextResponse", targetNamespace = "http://cxfcenter.web.com/", className = "com.soap.ws.client.generated.GetBestPolicyByPnrContextResponse")
    public GetBestPolicyForPNRResponse getBestPolicyByPnrContext(
        @WebParam(name = "arg0", targetNamespace = "")
        GetBestPolicyForPNRRequest arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.soap.ws.client.generated.GetBestPolicyForPNRResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBestPolicyByPnr", targetNamespace = "http://cxfcenter.web.com/", className = "com.soap.ws.client.generated.GetBestPolicyByPnr")
    @ResponseWrapper(localName = "getBestPolicyByPnrResponse", targetNamespace = "http://cxfcenter.web.com/", className = "com.soap.ws.client.generated.GetBestPolicyByPnrResponse")
    public GetBestPolicyForPNRResponse getBestPolicyByPnr(
        @WebParam(name = "arg0", targetNamespace = "")
        GetBestPolicyForPNRRequest arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.soap.ws.client.generated.PolicyResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPolicyDateAll", targetNamespace = "http://cxfcenter.web.com/", className = "com.soap.ws.client.generated.GetPolicyDateAll")
    @ResponseWrapper(localName = "getPolicyDateAllResponse", targetNamespace = "http://cxfcenter.web.com/", className = "com.soap.ws.client.generated.GetPolicyDateAllResponse")
    public PolicyResponse getPolicyDateAll(
        @WebParam(name = "arg0", targetNamespace = "")
        PolicyFormRequest arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.soap.ws.client.generated.RefundApplyResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "refundApplyRequestBack", targetNamespace = "http://cxfcenter.web.com/", className = "com.soap.ws.client.generated.RefundApplyRequestBack")
    @ResponseWrapper(localName = "refundApplyRequestBackResponse", targetNamespace = "http://cxfcenter.web.com/", className = "com.soap.ws.client.generated.RefundApplyRequestBackResponse")
    public RefundApplyResponse refundApplyRequestBack(
        @WebParam(name = "arg0", targetNamespace = "")
        RefundApplyRequest arg0);

}