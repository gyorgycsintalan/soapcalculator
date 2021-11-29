package com.soap.calculatorservice.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.calculatorservice.schema.GetDivisionRequest;
import com.soap.calculatorservice.schema.GetDivisionResponse;
import com.soap.calculatorservice.service.ArithmeticOperationsService;

@Endpoint
public class DivisionEndpoint {
    private static final String NAMESPACE_URI = "http://www.soap.calculator.org/calculator_schema";	
	
	private ArithmeticOperationsService arithmeticOperationsService;

	public DivisionEndpoint(ArithmeticOperationsService arithmeticOperationsService) {
		this.arithmeticOperationsService = arithmeticOperationsService;
	}
	
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDivisionRequest")
    @ResponsePayload
    public GetDivisionResponse getCountry(@RequestPayload GetDivisionRequest request) {
    	GetDivisionResponse response = new GetDivisionResponse();
    	response.setResult(arithmeticOperationsService.division(request.getOperand1(), request.getOperand2()));
    	
        return response;
    }	
}
