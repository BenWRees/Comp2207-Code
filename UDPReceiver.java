import java.io.*; 
import java.net.*;
class UDPReceiver{
	public static void main(String [] args){
    	try{
      		DatagramSocket socket = new DatagramSocket(4321);
      	byte[] buf = new byte[256];
      		for(int i=0;i<20;i++){
				DatagramPacket packet = new DatagramPacket(buf, buf.length); socket.receive(packet);
				System.out.println("receive DatagramPacket " 
				+ (new String(packet.getData())).trim() + " " 
				+ packet.getAddress() + ":" + packet.getPort());
				Thread.sleep(2000); //added for exercise 3
			}
		} 
		catch(Exception e) {
			System.out.println("error: "+e);
		}
	} 
}

/*
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
*/