# Questions

## **Exercise 1:** 
Compile and run the applications shown here. You will need to change the name of the machine in UDPSender to the one you are using to run UDPReceiver. 
You can run both applications on the same machine, but it is a little more exciting if you use two machines. You will have to start the receiver first. 
It will wait for messages to arrive. Observe the port numbers assigned to the messages. When sending, the port number has been assigned by the client machine and will vary from run to run.
If you move the DatagramSocket assignment inside the loop in UDPSender you will see that a different port is used for each send.

### **Answer** 
### UDPReceiver:
```
	MESSAGE | PACKET PAYLOAD | SOURCE IP ADDRESS | PORT NUMBER
	receive DatagramPacket 0 /10.14.129.203:62122
	receive DatagramPacket 1 /10.14.129.203:62122
	receive DatagramPacket 2 /10.14.129.203:62122
	receive DatagramPacket 3 /10.14.129.203:62122
	receive DatagramPacket 4 /10.14.129.203:62122
	receive DatagramPacket 5 /10.14.129.203:62122
	receive DatagramPacket 6 /10.14.129.203:62122
	receive DatagramPacket 7 /10.14.129.203:62122
	receive DatagramPacket 8 /10.14.129.203:62122
	receive DatagramPacket 9 /10.14.129.203:62122
```
### UDPSender: 
```
	MESSAGE | DATAGRAM PAYLOAD | DESTINATION ADDRESS | DESTINATION PORT NUMBER
	send DatagramPacket 0 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 1 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 2 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 3 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 4 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 5 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 6 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 7 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 8 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 9 Benjamins-MacBook-Pro.local/10.14.129.203:4321
```
### Moving the DatagramSocket into the for loop scope in the UDPSender
### UDPReceiver: 
```
	receive DatagramPacket 0 /10.14.129.203:49759
	receive DatagramPacket 1 /10.14.129.203:60333
	receive DatagramPacket 2 /10.14.129.203:60334
	receive DatagramPacket 3 /10.14.129.203:60335
	receive DatagramPacket 4 /10.14.129.203:60336
	receive DatagramPacket 5 /10.14.129.203:60337
	receive DatagramPacket 6 /10.14.129.203:60338
	receive DatagramPacket 7 /10.14.129.203:60339
	receive DatagramPacket 8 /10.14.129.203:60341
	receive DatagramPacket 9 /10.14.129.203:60343
```
## **Exercise 2:**
Let us try to show message loss. The simplest way to do this is to start the sender first. By the time you start the receiver you will probably have missed some of the earlier messages.

### **Answer**

### UDPSender:
```
	send DatagramPacket 0 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 1 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 2 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 3 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 4 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 5 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 6 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 7 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 8 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 9 Benjamins-MacBook-Pro.local/10.14.129.203:4321
```

### UDPReceiver: 
```
	receive DatagramPacket 1 /10.14.129.203:59243
	receive DatagramPacket 2 /10.14.129.203:59245
	receive DatagramPacket 3 /10.14.129.203:51868
	receive DatagramPacket 4 /10.14.129.203:51870
	receive DatagramPacket 5 /10.14.129.203:51872
	receive DatagramPacket 6 /10.14.129.203:51873
	receive DatagramPacket 7 /10.14.129.203:51874
	receive DatagramPacket 8 /10.14.129.203:51876
	receive DatagramPacket 9 /10.14.129.203:51877
```
	DATAGRAM PACKET 0 NOT RECEIVED
## **Exercise 3:** 
Let us try to show the kind of message loss which occurs when the receiver can’t keep up with the sender. This is not easy, because UDP maintains quite large buffers. 
The changes suggested here will require some ingenuity on your part, because the demonstration will depend upon the power of your machines and the load on the network.
First step is to speed up the sender and slow down the receiver. Remove the Thread.sleep call from the sender altogether, so the sender will operate as fast a possible. 
Now add a Thread.sleep call to the receiver so that is wastes time, in order to increase the likelyhood of missing something. Start the receiver first. With just 10 messages sent, 
the receiver won’t miss anything. The messages have been buffered on receipt. Message loss will only occur when this buffer overflows. If you increase the number of messages sent and 
received then you might be able to demonstrate this overflow. It will be difficult to observe by eye, so you may wish to add some code to detect the loss.

### **Answer** 


## **Exercise 4:**
Try running one copy of the receiver application and two copies of the sender. Use the slow sender, so that you have time to start the second one before the first has finished. Note how the receiver 
receives messages from both in an arbitrary interleaving

### **Answer**

### UDPSender 1:
```
	send DatagramPacket 0 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 1 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 2 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 3 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 4 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 5 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 6 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 7 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 8 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 9 Benjamins-MacBook-Pro.local/10.14.129.203:4321
```
### UDPSender 2:
```
	send DatagramPacket 0 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 1 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 2 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 3 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 4 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 5 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 6 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 7 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 8 Benjamins-MacBook-Pro.local/10.14.129.203:4321
	send DatagramPacket 9 Benjamins-MacBook-Pro.local/10.14.129.203:4321
```
### UDPReceiver:
```
	receive DatagramPacket 0 /10.14.129.203:56615
	receive DatagramPacket 0 /10.14.129.203:56616
	receive DatagramPacket 1 /10.14.129.203:56617
	receive DatagramPacket 1 /10.14.129.203:56618
	receive DatagramPacket 2 /10.14.129.203:56619
	receive DatagramPacket 2 /10.14.129.203:56620
	receive DatagramPacket 3 /10.14.129.203:56621
	receive DatagramPacket 3 /10.14.129.203:56622
	receive DatagramPacket 4 /10.14.129.203:56623
	receive DatagramPacket 4 /10.14.129.203:56624
	receive DatagramPacket 5 /10.14.129.203:56625
	receive DatagramPacket 5 /10.14.129.203:56626
	receive DatagramPacket 6 /10.14.129.203:56627
	receive DatagramPacket 6 /10.14.129.203:56628
	receive DatagramPacket 7 /10.14.129.203:56629
	receive DatagramPacket 7 /10.14.129.203:56630
	receive DatagramPacket 8 /10.14.129.203:56631
	receive DatagramPacket 8 /10.14.129.203:56632
	receive DatagramPacket 9 /10.14.129.203:56633
	receive DatagramPacket 9 /10.14.129.203:56634
```
We see the case when the Datagram Socket is initialised outside of the for loop in UDPSender, we get the following UDPReceiver packets, observe the port number at the end in this case 
```	
	receive DatagramPacket 0 /10.14.129.203:56635
	receive DatagramPacket 0 /10.14.129.203:56636
	receive DatagramPacket 1 /10.14.129.203:56635
	receive DatagramPacket 1 /10.14.129.203:56636
	receive DatagramPacket 2 /10.14.129.203:56635
	receive DatagramPacket 2 /10.14.129.203:56636
	receive DatagramPacket 3 /10.14.129.203:56635
	receive DatagramPacket 3 /10.14.129.203:56636
	receive DatagramPacket 4 /10.14.129.203:56635
	receive DatagramPacket 4 /10.14.129.203:56636
	receive DatagramPacket 5 /10.14.129.203:56635
	receive DatagramPacket 5 /10.14.129.203:56636
	receive DatagramPacket 6 /10.14.129.203:56635
	receive DatagramPacket 6 /10.14.129.203:56636
	receive DatagramPacket 7 /10.14.129.203:56635
	receive DatagramPacket 7 /10.14.129.203:56636
	receive DatagramPacket 8 /10.14.129.203:56635
	receive DatagramPacket 8 /10.14.129.203:56636
	receive DatagramPacket 9 /10.14.129.203:56635
	receive DatagramPacket 9 /10.14.129.203:56636
```
The Port number for the specific UDPSender datagram never changes like the one above, the first UDPSender client sends to 56635, and the second UDPSender client sends to 56636 


## **Exercise 5:**
Modify the sender and the receiver so that the receiver sends a reply to acknowledge the receipt of each message. Make sure that the sender waits for this acknowledgement before sending the next 
message. What effect does this have on the order in which the two applications can be started? Can you still run two senders and one receiver?

### **Answer**

