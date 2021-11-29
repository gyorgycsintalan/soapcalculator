package com.soap.calculatorservice.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.calculatorservice.schema.GetSubstractionRequest;
import com.soap.calculatorservice.schema.GetSubstractionResponse;
import com.soap.calculatorservice.service.ArithmeticOperationsService;

@Endpoint
public class SubstractionEndpoint {
    private static final String NAMESPACE_URI = "http://www.soap.calculator.org/calculator_schema";	
	
	private ArithmeticOperationsService arithmeticOperationsService;

	public SubstractionEndpoint(ArithmeticOperationsService arithmeticOperationsService) {
		this.arithmeticOperationsService = arithmeticOperationsService;
	}
	
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSubstractionRequest")
    @ResponsePayload
    public GetSubstractionResponse getCountry(@RequestPayload GetSubstractionRequest request) {
    	GetSubstractionResponse response = new GetSubstractionResponse();
    	response.setResult(arithmeticOperationsService.substraction(request.getOperand1(), request.getOperand2()));
    	
        return response;
    }
}
