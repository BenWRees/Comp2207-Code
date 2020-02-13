# Questions

##**Exercise 1: ** 
Compile and run the applications shown here. You will need to change the name of the machine in UDPSender to the one you are using to run UDPReceiver. 
You can run both applications on the same machine, but it is a little more exciting if you use two machines. You will have to start the receiver first. 
It will wait for messages to arrive. Observe the port numbers assigned to the messages. When sending, the port number has been assigned by the client machine and will vary from run to run.
If you move the DatagramSocket assignment inside the loop in UDPSender you will see that a different port is used for each send.

### **Answer** 
###UDPReceiver:
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
###UDPSender: 
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

##**Exercise 2: **
Let us try to show message loss. The simplest way to do this is to start the sender first. By the time you start the receiver you will probably have missed some of the earlier messages.

### **Answer**

