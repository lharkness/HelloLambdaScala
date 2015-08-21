package com.leeharkness.scala.greeter

import java.util.Map

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger
import com.amazonaws.services.lambda.runtime.RequestHandler

class Greeter extends RequestHandler[Map[String, String], String] {
	def handleRequest(request:Map[String, String], context:Context):String = {
		val logger:LambdaLogger = context.getLogger()
		logger.log("received : " + request.toString)
		"{ 'value': 'Hello " + request.get("value") + " '}"
	}
}