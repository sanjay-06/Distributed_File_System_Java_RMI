import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;


public interface ReplicaServerClientInterface extends ReplicaInterface {

	public FileContent read(String fileName)
			throws FileNotFoundException, RemoteException, IOException;

	public ChunkAck write(long txnID, long msgSeqNum, FileContent data)
			throws RemoteException, IOException;

	public boolean commit(long txnID, long numOfMsgs)
			throws MessageNotFoundException, RemoteException, IOException;

	public boolean abort(long txnID) throws RemoteException;
}
