
package com.example.soap.ws.client.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soap.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStudent_QNAME = new QName("http://demo.example.com/", "getStudent");
    private final static QName _GetStudentResponse_QNAME = new QName("http://demo.example.com/", "getStudentResponse");
    private final static QName _SayGreeting_QNAME = new QName("http://demo.example.com/", "sayGreeting");
    private final static QName _SayGreetingResponse_QNAME = new QName("http://demo.example.com/", "sayGreetingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link SayGreeting }
     * 
     */
    public SayGreeting createSayGreeting() {
        return new SayGreeting();
    }

    /**
     * Create an instance of {@link SayGreetingResponse }
     * 
     */
    public SayGreetingResponse createSayGreetingResponse() {
        return new SayGreetingResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://demo.example.com/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<GetStudent>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://demo.example.com/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<GetStudentResponse>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGreeting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayGreeting }{@code >}
     */
    @XmlElementDecl(namespace = "http://demo.example.com/", name = "sayGreeting")
    public JAXBElement<SayGreeting> createSayGreeting(SayGreeting value) {
        return new JAXBElement<SayGreeting>(_SayGreeting_QNAME, SayGreeting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGreetingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayGreetingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://demo.example.com/", name = "sayGreetingResponse")
    public JAXBElement<SayGreetingResponse> createSayGreetingResponse(SayGreetingResponse value) {
        return new JAXBElement<SayGreetingResponse>(_SayGreetingResponse_QNAME, SayGreetingResponse.class, null, value);
    }

}
