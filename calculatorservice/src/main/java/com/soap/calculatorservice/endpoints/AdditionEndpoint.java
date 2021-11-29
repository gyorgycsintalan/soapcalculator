package com.soap.calculatorservice.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.calculatorservice.schema.GetAdditionRequest;
import com.soap.calculatorservice.schema.GetAdditionResponse;
import com.soap.calculatorservice.service.ArithmeticOperationsService;

@Endpoint
public class AdditionEndpoint {
    private static final String NAMESPACE_URI = "http://www.soap.calculator.org/calculator_schema";	
	
	private ArithmeticOperationsService arithmeticOperationsService;

	public AdditionEndpoint(ArithmeticOperationsService arithmeticOperationsService) {
		this.arithmeticOperationsService = arithmeticOperationsService;
	}
	
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAdditionRequest")
    @ResponsePayload
    public GetAdditionResponse getCountry(@RequestPayload GetAdditionRequest request) {
    	GetAdditionResponse response = new GetAdditionResponse();
    	response.setResult(arithmeticOperationsService.addition(request.getOperand1(), request.getOperand2()));
    	
        return response;
    }	
}
