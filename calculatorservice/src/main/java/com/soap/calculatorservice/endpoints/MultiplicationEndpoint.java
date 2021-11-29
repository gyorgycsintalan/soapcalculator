package com.soap.calculatorservice.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.calculatorservice.schema.GetMultiplicationRequest;
import com.soap.calculatorservice.schema.GetMultiplicationResponse;
import com.soap.calculatorservice.service.ArithmeticOperationsService;

@Endpoint
public class MultiplicationEndpoint {
    private static final String NAMESPACE_URI = "http://www.soap.calculator.org/calculator_schema";	
	
	private ArithmeticOperationsService arithmeticOperationsService;

	public MultiplicationEndpoint(ArithmeticOperationsService arithmeticOperationsService) {
		this.arithmeticOperationsService = arithmeticOperationsService;
	}
	
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMultiplicationRequest")
    @ResponsePayload
    public GetMultiplicationResponse getCountry(@RequestPayload GetMultiplicationRequest request) {
    	GetMultiplicationResponse response = new GetMultiplicationResponse();
    	response.setResult(arithmeticOperationsService.multiplication(request.getOperand1(), request.getOperand2()));
    	
        return response;
    }
}
