import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.List;
import java.rmi.Remote;

public interface MasterServerClientInterface extends Remote {

	public List<ReplicaLoc> read(String fileName) throws FileNotFoundException,
			IOException, RemoteException;

	public WriteAck write(String fileName) throws RemoteException, IOException;
	

	public ReplicaLoc locatePrimaryReplica(String fileName) throws RemoteException;
}
