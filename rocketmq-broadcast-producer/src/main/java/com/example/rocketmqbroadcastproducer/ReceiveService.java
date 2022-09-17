//package com.example.rocketmqbroadcastproducer;
//
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ReceiveService {
//
//	@StreamListener("input")
//	//@Primary
//	public void receiveInput1(String receiveMsg) {
//		System.out.println("input1 receive: " + receiveMsg);
//	}
///*
//	@StreamListener("input2")
//	public void receiveInput2(String receiveMsg) {
//		System.out.println("input2 receive: " + receiveMsg);
//	}
//*/
//}