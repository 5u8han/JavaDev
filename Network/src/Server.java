import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Server {

    public static void main(String args[]) {
        try {

            // Create server Socket that listens/bonds to port/endpoint address 6666 (any port id of your choice, should be >=1024, as other port addresses are reserved for system use)
            // The default maximum number of queued incoming connections is 50 (the maximum number of clients to connect to this server)
            // There is another constructor that can be used to specify the maximum number of connections
            ServerSocket mySocket = new ServerSocket(6666);


            System.out.println("Startup the server side over port 6666 ....");

            // use the created ServerSocket and accept() to start listening for incoming client requests targeting this server and this port
            // accept() blocks the current thread (server application) waiting until a connection is requested by a client.
            // the created connection with a client is represented by the returned Socket object.
            Socket connectedClient = mySocket.accept();


            // reaching this point means that a client established a connection with your server and this particular port.
            System.out.println("Connection established");


            // to interact (read incoming data / send data) with the connected client, we need to create the following:

            // BufferReader object to read data coming from the client
            BufferedReader br = new BufferedReader(new InputStreamReader(connectedClient.getInputStream()));

            // PrintStream object to send data to the connected client
            PrintStream ps = new PrintStream(connectedClient.getOutputStream());


            // Let's keep reading data from the client, as long as the client does't send "exit".
            String inputData;
            ArrayList<Integer> data = new ArrayList();
            while (!(inputData = br.readLine()).equals("exit")) {
                if (inputData.contains("Add")) {
                    String[] values = inputData.split(":");
                    data.add(Integer.parseInt(values[1].trim()));
                    ps.println("Added Successfully");
                } else if (inputData.contains("Remove")) {
                    String[] values = inputData.split(":");
                    data.removeIf(t -> t == Integer.parseInt(values[1]));
                    ps.println("Removed Successfully");
                } else if (inputData.equalsIgnoreCase("Get_Summation")) {
                    int summation = 0;
                    for (Integer i : data)
                        summation += i;
                    ps.println("The summation is: " + summation);
                } else if(inputData.equalsIgnoreCase(("Get_Minimum"))){
                	ps.println("The Minimum is: "+ Collections.min(data));
				} else if(inputData.equalsIgnoreCase(("Get_Maximum"))){
					ps.println("The Maximum is: "+ Collections.max(data));
				}
                if (inputData.equalsIgnoreCase("Exit"))
                	break;
            }
			System.out.println();
            System.out.println("Closing the connection and the sockets");

            // close the input/output streams and the created client/server sockets
            ps.close();
            br.close();
            mySocket.close();
            connectedClient.close();

        } catch (Exception exc) {
            System.out.println("Error :" + exc.toString());
        }

    }
}