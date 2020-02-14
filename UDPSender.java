import java.io.*; 
import java.net.*;
class UDPSender{
  public static void main(String [] args){
    try{
    	//init. of socket receiving/sending datagram and an IP address 
    	InetAddress address = InetAddress.getByName("Benjamins-MacBook-Pro.local"); 
		DatagramSocket socket = new DatagramSocket();
		// loop that creates a buffer space and datagram of current iteration value, 
		// sends datagram down the socket
		for(int i=0; i<10; i++){
			//Moving the socket into the for loop changes the recievers input socket every loop
			//DatagramSocket socket = new DatagramSocket(); //added for exercise 1
			byte[] buf = String.valueOf(i).getBytes(); 
			DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4321); 
			socket.send(packet);
			System.out.println("send DatagramPacket "
			+ new String(packet.getData()) + " " + packet.getAddress() + ":"
			+ packet.getPort());
			Thread.sleep(2000); //removed for exercise 3 
		}
	}catch(Exception e){System.out.println("error: " + e);} }
}
/*
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
*/