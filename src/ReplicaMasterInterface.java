import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;


public interface ReplicaMasterInterface extends ReplicaInterface{
	

	public void createFile(String fileName) throws RemoteException, IOException;
	

	public void takeCharge(String fileName, List<ReplicaLoc> slaveReplicas) throws RemoteException, NotBoundException ;

	public boolean isAlive() throws RemoteException;
	
}
